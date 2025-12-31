package com.info.demoqa.test;

import com.info.demoqa.page.DocumentMappingPage;
import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DocumentMappingTest extends BaseTest{
    @Test(description = "Verify page loads as expected")
    @Category("Document Mapping")
    public void TestCase_64() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickDocumentMapping();

        DocumentMappingPage documentMappingPage = new DocumentMappingPage(driver);
        Assert.assertTrue(documentMappingPage.isPageLoadsAsExpected());

    }
    @Test(description = "Verify all functionalities work as expected")
    @Category("Document Mapping")
    public void TestCase_65() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickDocumentMapping();

        DocumentMappingPage documentMappingPage = new DocumentMappingPage(driver);
        documentMappingPage.clickOnAdd();
        documentMappingPage.SelectTheDocumentOperations(PropertyFileReader.getUserData("SelectDocumentOperations"));
        documentMappingPage.SelectTheDocumentType(PropertyFileReader.getUserData("SelectTheDocumentType"));
        documentMappingPage.ClickMandatoryCheckBox();
        documentMappingPage.AddToDocumentType();
        documentMappingPage.SelectTheAddMoreDocumentType(PropertyFileReader.getUserData("SelectTheDocumentType"));
        documentMappingPage.EnterSubmitToAdd();
        documentMappingPage.searchForStartAdornmentEmail(PropertyFileReader.getUserData("SelectDocumentOperations"));
        documentMappingPage.editTheStartAdornmentEmail();
        Assert.assertTrue(documentMappingPage.isPageLoadsAsExpected());

    }
}
