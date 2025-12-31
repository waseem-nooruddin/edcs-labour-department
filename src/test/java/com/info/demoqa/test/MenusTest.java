package com.info.demoqa.test;

import com.info.demoqa.page.MenusPage;
import com.info.demoqa.page.NavBarPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenusTest extends BaseTest{

    @Test(description = "Verify all functionalities work as expected")
    @Category("Member Details")
    public void TestCase_71() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickApplicationManagement();
        navBarPage.clickMenus();

        MenusPage menusPage = new MenusPage(driver);
        Assert.assertTrue(menusPage.isPageLoadingAsExpected());

    }
}
