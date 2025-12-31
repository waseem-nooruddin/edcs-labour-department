package com.info.demoqa.test;

import com.info.demoqa.page.EmployeeCompanyHistoryListPage;
import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeCompanyHistoryListTest extends BaseTest {

    @Test(description = "Verify page loads as expected")
    @Category("Employee Company History List")
    public void TestCase_42() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.employeeCompanyHistoryList();

        EmployeeCompanyHistoryListPage employeeCompanyHistoryListPage = new EmployeeCompanyHistoryListPage(driver);
        Assert.assertTrue(employeeCompanyHistoryListPage.isEmployeeCompanyHistoryListPageLoadsAsExpected());


    }

    @Test(description = "Verify page loads as expected")
    @Category("Employee Company History List")
    public void TestCase_43() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.employeeCompanyHistoryList();

        EmployeeCompanyHistoryListPage employeeCompanyHistoryListPage = new EmployeeCompanyHistoryListPage(driver);
        employeeCompanyHistoryListPage.EnterNic(PropertyFileReader.getUserData("nic"));
        employeeCompanyHistoryListPage.EnterButton();

        Assert.assertTrue(employeeCompanyHistoryListPage.isEmployeeCompanyHistoryListPageLoadsAsExpected());


    }
}
