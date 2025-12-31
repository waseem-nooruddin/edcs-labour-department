package com.info.demoqa.test;

import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.page.RoleRestrictionsPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.annotations.Test;

public class RoleRestrictionsTest extends BaseTest {
    @Test(description = "Verify Role Restrictions page loads successfully")
    @Category("Role Restrictions")
    public void TestCase_27() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickgetUserManagement();
        navBarPage.clickRoleRestrictions();

    }

    @Test(description = "Verify all functionalities work as expected")
    @Category("Role Restrictions")
    public void TestCase_28() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickgetUserManagement();
        navBarPage.clickRoleRestrictions();

        RoleRestrictionsPage roleRestrictionsPage = new RoleRestrictionsPage(driver);
        roleRestrictionsPage.EnterUserRoles("ITS - IT Staff");
        roleRestrictionsPage.ClickOnCheckBox();
        roleRestrictionsPage.EnterSubmit("Submit");
    }
}
