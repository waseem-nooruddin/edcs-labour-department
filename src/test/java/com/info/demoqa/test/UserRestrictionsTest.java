package com.info.demoqa.test;

import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.page.UserRestrictionsPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRestrictionsTest extends BaseTest {
    @Test(description = "verify that the User Restrictions page load successfully.")
    @Category("User Restrictions")
    public void TestCase_23() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickgetUserManagement();
        navBarPage.clickUserRestrictions();

        UserRestrictionsPage userRestrictionsPage = new UserRestrictionsPage(driver);
        Assert.assertTrue(userRestrictionsPage.isUserRestrictionsPageLoadSuccessfully());

    }

    @Test(description = "Verify all fields on User Restrictions page work.")
    @Category("User Restrictions")
    public void TestCase_24() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickgetUserManagement();
        navBarPage.clickUserRestrictions();

        UserRestrictionsPage userRestrictionsPage = new UserRestrictionsPage(driver);
        userRestrictionsPage.EnterLoginID(PropertyFileReader.getPropertyValue("user_name"));
        userRestrictionsPage.EnterBranchID("BAD");

        Assert.assertTrue(userRestrictionsPage.isUserRestrictionsPageLoadSuccessfully());

    }

}
