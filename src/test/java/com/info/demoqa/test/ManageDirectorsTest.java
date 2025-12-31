package com.info.demoqa.test;

import com.info.demoqa.page.ManageDirectorsPage;
import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageDirectorsTest extends BaseTest {
    @Test(description = "Verify page loads as expected")
    @Category("Manage Directors")
    public void TestCase_38() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickManageDirectors();
        ManageDirectorsPage manageDirectorsPage = new ManageDirectorsPage(driver);

        Assert.assertTrue(manageDirectorsPage.isPageLoadsAsExpected());

    }

    @Test(description = "Verify all functionalities work as expected")
    @Category("Manage Directors")
    public void TestCase_39() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickManageDirectors();
        ManageDirectorsPage manageDirectorsPage = new ManageDirectorsPage(driver);
        manageDirectorsPage.clickOnAddButton();
        manageDirectorsPage.EnterNic(PropertyFileReader.getUserData("User.TypeNic"));
        manageDirectorsPage.EnterExpireDateOfNIC(PropertyFileReader.getUserData("ExpireDateOfNIC"));
        manageDirectorsPage.EnterDateOfBirth(PropertyFileReader.getUserData("date_of_birth"));
        manageDirectorsPage.EnterNameWithInitials(PropertyFileReader.getUserData("NameWithInitials"));
        manageDirectorsPage.EnterFullName(PropertyFileReader.getUserData("FullName"));
        manageDirectorsPage.EnterContactNo(PropertyFileReader.getUserData("contact_number"));
        manageDirectorsPage.EnterEmail(PropertyFileReader.getUserData("Email"));
        manageDirectorsPage.EnterJoinDate(PropertyFileReader.getUserData("date_employed"));
        manageDirectorsPage.EnterAppointedDate(PropertyFileReader.getUserData("date_employed"));
        manageDirectorsPage.EnterAddressNo(PropertyFileReader.getUserData("address_no"));
        manageDirectorsPage.EnterStreetName(PropertyFileReader.getUserData("street_name"));
        ;
        manageDirectorsPage.clickOnSubmit();

        Assert.assertTrue(manageDirectorsPage.isPageLoadsAsExpected());

    }
}
