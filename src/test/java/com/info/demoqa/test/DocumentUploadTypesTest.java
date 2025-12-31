package com.info.demoqa.test;

import com.info.demoqa.page.DocumentUploadTypesPage;
import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DocumentUploadTypesTest extends BaseTest {
    @Test(description = "Verify page loads as expected")
    @Category("Document Upload Mapping")
    public void TestCase_68() {
        fullLogin();
        NavBarPage navBarPage =new NavBarPage(driver);
        navBarPage.clickDocumentUploadTypes();

        DocumentUploadTypesPage documentUploadTypesPage = new DocumentUploadTypesPage(driver);
        Assert.assertTrue(documentUploadTypesPage.isPageLoadsAsExpected());
    }

    @Test(description = "Verify all functionalities work as expected")
    @Category("Document Upload Mapping")
    public void TestCase_69() {
        fullLogin();
        NavBarPage navBarPage =new NavBarPage(driver);
        navBarPage.clickDocumentUploadTypes();

        DocumentUploadTypesPage documentUploadTypesPage = new DocumentUploadTypesPage(driver);
        documentUploadTypesPage.enterAddButton();
        documentUploadTypesPage.enterCode(PropertyFileReader.getUserData("enterCode"));
        documentUploadTypesPage.enterDescription(PropertyFileReader.getUserData("enterDescription"));
        documentUploadTypesPage.enterSubmitAddButton();
        documentUploadTypesPage.clickOnSearch(PropertyFileReader.getUserData("enterCode"));
        documentUploadTypesPage.clickOnEdit();
        documentUploadTypesPage.editTheCode(PropertyFileReader.getUserData("enterCode"));
        documentUploadTypesPage.enterEditButton();
        Assert.assertTrue(documentUploadTypesPage.isPageLoadsAsExpected());
    }

}
