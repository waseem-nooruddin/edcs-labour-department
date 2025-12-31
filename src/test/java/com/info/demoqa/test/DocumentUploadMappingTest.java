package com.info.demoqa.test;

import com.info.demoqa.page.DocumentUploadMappingPage;
import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DocumentUploadMappingTest extends BaseTest{
    @Test(description = "Verify page loads as expected")
    @Category("Document Upload Mapping")
    public void TestCase_66() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickDocumentUploadMapping();

        DocumentUploadMappingPage documentUploadMappingPage = new DocumentUploadMappingPage(driver);
        Assert.assertTrue(documentUploadMappingPage.isPageLoadAsExpected());

    }

    @Test(description = "Verify all functionalities work as expected")
    @Category("Document Upload Mapping")
    public void TestCase_6() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickDocumentUploadMapping();

        DocumentUploadMappingPage documentUploadMappingPage = new DocumentUploadMappingPage(driver);
        documentUploadMappingPage.ClickAddButton();
        documentUploadMappingPage.SelectDocumentUploadTypeID(PropertyFileReader.getUserData("SelectDocumentUploadTypeID"));
        documentUploadMappingPage.selectMenuId(PropertyFileReader.getUserData("selectMenuId"));
        documentUploadMappingPage.selectOperationId(PropertyFileReader.getUserData("selectOperationId"));
        documentUploadMappingPage.enterAddButton();

        Assert.assertTrue(documentUploadMappingPage.isPageLoadAsExpected());

    }
}
