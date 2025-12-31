package com.info.demoqa.test;

import com.info.demoqa.page.DocumentOperationsPage;
import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DocumentOperationsTest extends BaseTest {
    @Test(description = "Verify page loads as expected")
    @Category("Document Operations")
    public void TestCase_62() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickDocumentOperations();

        DocumentOperationsPage documentOperationsPage = new DocumentOperationsPage(driver);
        Assert.assertTrue(documentOperationsPage.isPageLoadsAsExpected());

    }

    @Test(description = "Verify all functionalities work as expected")
    @Category("Document Operations")
    public void TestCase_63() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickDocumentOperations();

        DocumentOperationsPage documentOperationsPage = new DocumentOperationsPage(driver);
        documentOperationsPage.enterAddButton();
        documentOperationsPage.enterDocumentOperationCode(PropertyFileReader.getUserData("DocumentOperationCode"));
        documentOperationsPage.enterDescription(PropertyFileReader.getUserData("Description"));
        documentOperationsPage.clickOnSubmit();
        documentOperationsPage.searchOnOperationId(PropertyFileReader.getUserData("DocumentOperationCode"));
        documentOperationsPage.clickOnEdit();
        documentOperationsPage.clickEditOperationCode(PropertyFileReader.getUserData("EditDocumentOperationCode"));
        documentOperationsPage.submitTheEdit();
        Assert.assertTrue(documentOperationsPage.isPageLoadsAsExpected());

    }
}
