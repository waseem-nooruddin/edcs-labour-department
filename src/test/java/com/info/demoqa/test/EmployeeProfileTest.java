package com.info.demoqa.test;

import com.info.demoqa.page.EmployeeProfilePage;
import com.info.demoqa.page.NavBarPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeProfileTest extends BaseTest {
    @Test(description = "Verify page loads as expected")
    @Category("Employee Profile")
    public void TestCase_35() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickEmployeeProfile();

        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(driver);
        Assert.assertTrue(employeeProfilePage.isEmployeeProfilePageLoadsAsExpected());
    }
}
