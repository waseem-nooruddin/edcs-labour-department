package com.info.demoqa.test;

import com.info.demoqa.page.ForgotPasswordPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {
    @Test(description = "Verify navigation to Forgot Password page")
    @Category("Forgot Password")
    public void TestCase_21() {
        LoginPage();

        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
        forgotPasswordPage.ClickOnForgotPassword();
        Assert.assertTrue(forgotPasswordPage.isForgotPasswordPageLoadsAsExpected());

    }

    @Test(description = "Verify navigation to Forgot Password page")
    @Category("Forgot Password")
    public void TestCase_22() {
        LoginPage();

        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
        forgotPasswordPage.ClickOnForgotPassword();
        forgotPasswordPage.TypeUserId(PropertyFileReader.getPropertyValue("user_name"));
        forgotPasswordPage.ClickOnSubmitButton();
        Assert.assertTrue(forgotPasswordPage.isForgotPasswordPageLoadsAsExpected());
        Assert.assertTrue(forgotPasswordPage.isForgotPasswordOtpPageLoadsAsExpected());


    }
}
