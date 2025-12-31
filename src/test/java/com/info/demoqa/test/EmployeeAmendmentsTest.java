package com.info.demoqa.test;

import com.info.demoqa.page.EmployeeAmendmentsPage;
import com.info.demoqa.page.NavBarPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeAmendmentsTest extends BaseTest{
    @Test(description = "Verify page loads as expected")
    @Category("Employee Amendments")
    public void TestCase_50() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickEmployeeAmendments();
        EmployeeAmendmentsPage employeeAmendmentsPage = new EmployeeAmendmentsPage(driver);
        Assert.assertTrue(employeeAmendmentsPage.isEmployeeAmendmentsPageLoadsAsExpected());
    }

    @Test(description = "Verify page loads as expected")
    @Category("Employee Amendments")
    public void TestCase_51() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickEmployeeAmendments();
        EmployeeAmendmentsPage employeeAmendmentsPage = new EmployeeAmendmentsPage(driver);
        employeeAmendmentsPage.AddOnNewRequestAmendment();
        employeeAmendmentsPage.enterAmendmentType("Member Identity No Change");
        employeeAmendmentsPage.EnterIdentityNo("199629810093");
        employeeAmendmentsPage.EnterUploadDocuments();

        Assert.assertTrue(employeeAmendmentsPage.isEmployeeAmendmentsPageLoadsAsExpected());
    }
}