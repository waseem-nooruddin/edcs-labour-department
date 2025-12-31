package com.info.demoqa.test;

import com.info.demoqa.page.ClaimsIntegrationPage;
import com.info.demoqa.page.NavBarPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClaimsIntegrationTest extends BaseTest {
    @Test(description = "The page loads successfully without errors, displaying the page title and all primary UI components.")
    @Category("Claims Integration")
    public void TestCase_58() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickClaimsIntegration();

        ClaimsIntegrationPage claimsIntegrationPage = new ClaimsIntegrationPage(driver);
        Assert.assertTrue(claimsIntegrationPage.isPageLoadAsExpected());

    }

    @Test(description = "The page loads successfully without errors, displaying the page title and all primary UI components.")
    @Category("Claims Integration")
    public void TestCase_59() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickClaimsIntegration();

        ClaimsIntegrationPage claimsIntegrationPage = new ClaimsIntegrationPage(driver);
        claimsIntegrationPage.findInsertReferenceNumber("1000");
        Assert.assertTrue(claimsIntegrationPage.isPageLoadAsExpected());

    }
}
