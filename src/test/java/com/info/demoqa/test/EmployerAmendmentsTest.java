package com.info.demoqa.test;

import com.info.demoqa.page.EmployerAmendmentsPage;
import com.info.demoqa.page.NavBarPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployerAmendmentsTest extends BaseTest {
    @Test(description = "Verify page loads as expected")
    @Category("Employer Amendments")
    public void TestCase_48() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickEmployerAmendments();

        EmployerAmendmentsPage employerAmendmentsPage = new EmployerAmendmentsPage(driver);
        Assert.assertTrue(employerAmendmentsPage.isEmployerAmendmentsPageLoadsAsExpected());
    }

    @Test(description = "Verify all functionalities work as expected")
    @Category("Employer Amendments")
    public void TestCase_49() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickEmployerAmendments();

        EmployerAmendmentsPage employerAmendmentsPage = new EmployerAmendmentsPage(driver);
        employerAmendmentsPage.enterSearchInEmployerAmendments("");
        employerAmendmentsPage.clickOnAddEmployerAmendments("Add");

        Assert.assertTrue(employerAmendmentsPage.isEmployerAmendmentsPageLoadsAsExpected());
    }
}
