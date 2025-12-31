package com.info.demoqa.test;

import com.info.demoqa.page.ManageNomineesPage;
import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageNomineesTest extends BaseTest {
    @Test(description = "Verify page loads as expected")
    @Category("Manage Nominees")
    public void TestCase_44() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickManageNominees();

        ManageNomineesPage manageNomineesPage = new ManageNomineesPage(driver);
        Assert.assertTrue(manageNomineesPage.isManageNominees());
    }

    @Test(description = "Verify all functionalities work as expected")
    @Category("Manage Nominees")
    public void TestCase_45() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickManageNominees();

        ManageNomineesPage manageNomineesPage = new ManageNomineesPage(driver);
        manageNomineesPage.enterManageCompanies(PropertyFileReader.getUserData("nic"));
        manageNomineesPage.clickAddManageCompanies();
        //manageNomineesPage.selectIdType("Passport");
        manageNomineesPage.enterDob(PropertyFileReader.getUserData("date_of_birth"));
        manageNomineesPage.enterIdNumber(PropertyFileReader.getUserData("nic"));
        manageNomineesPage.enterBotton("Validate");

        Assert.assertTrue(manageNomineesPage.isManageNominees());
    }
}
