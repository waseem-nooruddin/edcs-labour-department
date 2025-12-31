package com.info.demoqa.test;

import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.page.RolesPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RolesTest extends BaseTest {
    @Test(description = "Verify Roles page loads")
    @Category("Roles")
    public void TestCase_25() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickgetUserManagement();
        navBarPage.clickRoles();

        RolesPage rolesPage = new RolesPage(driver);
        Assert.assertTrue(rolesPage.isRolesPageLoadSuccessfully());
    }

    @Test(description = "Verify Add Roles page loads successfully")
    @Category("Roles")
    public void TestCase_26() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickgetUserManagement();
        navBarPage.clickRoles();

        RolesPage rolesPage = new RolesPage(driver);
        rolesPage.EnterAdd();

        Assert.assertTrue(rolesPage.isRolesPageLoadSuccessfully());
    }
}

