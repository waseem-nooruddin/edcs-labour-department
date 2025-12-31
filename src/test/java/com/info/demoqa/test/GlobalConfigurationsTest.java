package com.info.demoqa.test;

import com.info.demoqa.page.GlobalConfigurationsPage;
import com.info.demoqa.page.NavBarPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlobalConfigurationsTest extends BaseTest{
    @Test(description = "Verify all functionalities work as expected")
    @Category("Assign Multiple Branches")
    public void TestCase_70() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickApplicationManagement();
        navBarPage.clickGlobalConfigurations();

        GlobalConfigurationsPage globalConfigurationsPage = new GlobalConfigurationsPage(driver);
        Assert.assertTrue(globalConfigurationsPage.isPageLoadingAsExpected());
    }
}
