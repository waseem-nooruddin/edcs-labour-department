package com.info.demoqa.test;

import com.info.demoqa.page.CompanyDetailsIntegrationPage;
import com.info.demoqa.page.NavBarPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompanyDetailsIntegrationTest extends BaseTest{
    @Test(description = "Verify all functionalities work as expected")
    @Category("Company Details Integration")
    public void TestCase_52() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickCompanyDetailsIntegration();

        CompanyDetailsIntegrationPage companyDetailsIntegrationPage = new CompanyDetailsIntegrationPage(driver);
        Assert.assertTrue(companyDetailsIntegrationPage.isPageLoadAsExpected());

    }
}
