package com.info.demoqa.test;

import com.info.demoqa.page.ChangePasswordPage;
import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePasswordTest extends BaseTest {

    @Test(description = "Verify navigation to Change Password page")
    @Category("Change Password")
    public void TestCase_36() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickChangePassword();

        ChangePasswordPage changePasswordPage = new ChangePasswordPage(driver);
        Assert.assertTrue(changePasswordPage.isPageLoadAsExpected());

    }

    @Test(description = "Verify navigation to Change Password page")
    @Category("Change Password")
    public void TestCase_37() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        ChangePasswordPage changePasswordPage = new ChangePasswordPage(driver);
        navBarPage.clickChangePassword();
        changePasswordPage.EnterOldPassword(PropertyFileReader.getPropertyValue("Auto_password"));
        changePasswordPage.EnterNewPassword(PropertyFileReader.getPropertyValue("New_password"));
        changePasswordPage.EnterConfirmPassword(PropertyFileReader.getPropertyValue("Confirm_Password"));
        changePasswordPage.ClickOnButton();

        Assert.assertTrue(changePasswordPage.isPageLoadAsExpected());

    }
}
