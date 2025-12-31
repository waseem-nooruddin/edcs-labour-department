package com.info.demoqa.test;

import com.info.demoqa.page.LoginPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(description = "Verify login with Remember Me enabled")
    @Category("Login")
    public void TestCase_1() {
        fullLogin();
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(loginPage.isConcurrentLoginDialogDisplayed());

    }

    @Test(description = "Verify standard user login")
    @Category("Login")
    public void TestCase_2() {
        Login();

    }

    @Test(description = "Verify user can view the Login page")
    @Category("Login")
    public void TestCase_3() {
        LoginPage();


    }
}