package com.info.demoqa.test;

import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.page.UsersPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {
    @Test(description = "Verify page loads as expected")
    @Category("User")
    public void TestCase_17() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickgetUserManagement();
        navBarPage.clickUser();

        UsersPage usersPage = new UsersPage(driver);
        Assert.assertTrue(usersPage.isUserPageVisible());
    }

    @Test(description = "Verify all functionalities work as expected")
    @Category("User")
    public void TestCase_18() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickgetUserManagement();
        navBarPage.clickUser();

        UsersPage usersPage = new UsersPage(driver);
        usersPage.EnterUserAdd();
        usersPage.EnterUserType(PropertyFileReader.getUserData("User.UserType"));
        usersPage.TypeEmployeeNo(PropertyFileReader.getUserData("User.TypeEmployeeNo"));
        usersPage.TypeCompanyId(PropertyFileReader.getUserData("User.TypeCompanyId"));
        usersPage.TypeEmail(PropertyFileReader.getUserData("User.TypeEmail"));
        usersPage.TypeNic(PropertyFileReader.getUserData("User.TypeNic"));
        usersPage.TypeMobileNumber(PropertyFileReader.getUserData("User.TypeMobileNumber"));
        usersPage.TypeFirstName(PropertyFileReader.getUserData("User.TypeFirstName"));
        usersPage.TypeLastName(PropertyFileReader.getUserData("User.TypeLastName"));
        usersPage.TypeUserRoleId(PropertyFileReader.getUserData("User.TypeUserRoleId"));
        usersPage.TypeBranch(PropertyFileReader.getUserData("User.TypeBranch"));
        usersPage.ClickOnAdd();

        Assert.assertTrue(usersPage.isUserPageVisible());

    }
}
