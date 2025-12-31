package com.info.demoqa.test;

import com.info.demoqa.page.DocumentTypePage;
import com.info.demoqa.page.NavBarPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DocumentTypeTest extends BaseTest {
    @Test(description = "Verify page loads as expected")
    @Category("Doc Management")
    public void TestCase_60() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickDocumentType();

        DocumentTypePage documentTypePage = new DocumentTypePage(driver);
        Assert.assertTrue(documentTypePage.isPageLoadsAsExpected());
    }

    @Test(description = "Verify all functionalities work as expected")
    @Category("Doc Management")
    public void TestCase_61() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickDocumentType();

        DocumentTypePage documentTypePage = new DocumentTypePage(driver);
        Assert.assertTrue(documentTypePage.isPageLoadsAsExpected());
    }
}
