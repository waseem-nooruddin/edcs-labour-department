package com.info.demoqa.test;

import com.info.demoqa.page.AssignMultipleBranchesPage;
import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignMultipleBranchesTest extends BaseTest{
    @Test(description = "Verify page loads as expected")
    @Category("Assign Multiple Branches")
    public void TestCase_29() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickgetUserManagement();
        navBarPage.clickAssignMultipleBranches();
        AssignMultipleBranchesPage assignMultipleBranchesPage = new AssignMultipleBranchesPage(driver);

        Assert.assertTrue(assignMultipleBranchesPage.isPageLoadsAsExpected());

    }

    @Test(description = "Verify all functionalities work as expected")
    @Category("Assign Multiple Branches")
    public void TestCase_30() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickgetUserManagement();
        navBarPage.clickAssignMultipleBranches();
        AssignMultipleBranchesPage assignMultipleBranchesPage = new AssignMultipleBranchesPage(driver);
        assignMultipleBranchesPage.enterUserId(PropertyFileReader.getPropertyValue("user_name"));
        assignMultipleBranchesPage.selectCheckboxBranch();

        Assert.assertTrue(assignMultipleBranchesPage.isPageLoadsAsExpected());

    }
}
