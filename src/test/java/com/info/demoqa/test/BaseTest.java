package com.info.demoqa.test;

import com.info.demoqa.page.LoginPage;
import com.info.demoqa.page.SignUpPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.DriverHolder;
import com.maxsoft.testngtestresultsanalyzer.TestAnalyzeReportListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.time.Duration;

@Listeners(TestAnalyzeReportListener.class)
public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        setUpDriver(false);
        DriverHolder.setDriver(driver);
        driver = DriverHolder.getDriver();

        driver.get(PropertyFileReader.getPropertyValue("base_url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    }

    public void fullLogin() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.remember_me();
        loginPage.login(PropertyFileReader.getPropertyValue("user_name"),
                PropertyFileReader.getPropertyValue("password"));
        loginPage.NewSessionButton();
    }

    public void Login() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(PropertyFileReader.getPropertyValue("user_name"),
                PropertyFileReader.getPropertyValue("password"));
        loginPage.NewSessionButton();

    }

    public void LoginPage() {


    }

    public void SignUp() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.EnterSignUpButton();


    }

    private void setUpDriver(boolean headless) {
        if (headless) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless"); // Run Chrome in headless mode
            options.addArguments("--disable-gpu"); // Recommended for headless
            options.addArguments("--window-size=1920,1080"); // Optional but recommended
            options.addArguments("--remote-allow-origins=*"); // Keep your existing options
            driver = new ChromeDriver(options);
        } else {
            driver = new ChromeDriver();
            DriverHolder.setDriver(driver);
            driver = DriverHolder.getDriver();
            driver.get(PropertyFileReader.getPropertyValue("base_url"));
            driver.manage().window().maximize();
        }
    }

   /* @AfterMethod
    public void tearDown() {
        driver.quit();
    }*/
}