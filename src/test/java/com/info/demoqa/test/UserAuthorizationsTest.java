package com.info.demoqa.test;

import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.page.UserAuthorizationsPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserAuthorizationsTest extends BaseTest {

    @Test(description = "Verify navigation to User Authorizations page")
    @Category("User Authorizations")
    public void TestCase_19() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickgetUserManagement();
        navBarPage.clickUserAuthorizations();

        UserAuthorizationsPage userAuthorizationsPage = new UserAuthorizationsPage(driver);
        Assert.assertTrue(userAuthorizationsPage.isUserAuthorizationsPageLoadSuccessfully());

    }

    @Test(description = "verify that the user is able to acsept or reject the request.")
    @Category("User Authorizations")
    public void TestCase_20() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickgetUserManagement();
        navBarPage.clickUserAuthorizations();
        UserAuthorizationsPage userAuthorizationsPage = new UserAuthorizationsPage(driver);
        userAuthorizationsPage.EnterApproveRejectButton();

        Assert.assertTrue(userAuthorizationsPage.isUserAuthorizationsPageLoadSuccessfully());

    }
}
