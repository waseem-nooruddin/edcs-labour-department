package com.info.demoqa.test;

import com.info.demoqa.page.BankAccountDetailsPage;
import com.info.demoqa.page.NavBarPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankAccountDetailsTest extends BaseTest {
    @Test(description = "Verify page loads as expected")
    @Category("Assign Multiple Branches")
    public void TestCase_40() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickBankAccountDetails();

        BankAccountDetailsPage bankAccountDetailsPage = new BankAccountDetailsPage(driver);
        Assert.assertTrue(bankAccountDetailsPage.isBankAccountDetailsPageLoadsAsExpected());
    }

    @Test(description = "Verify page loads as expected")
    @Category("Assign Multiple Branches")
    public void TestCase_41() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickBankAccountDetails();

        BankAccountDetailsPage bankAccountDetailsPage = new BankAccountDetailsPage(driver);
        bankAccountDetailsPage.EnterAddBankAccountDetails();
        bankAccountDetailsPage.EnterAccountNo("");
        bankAccountDetailsPage.EnterAccountDescription("");
        bankAccountDetailsPage.EnterBank("");
        bankAccountDetailsPage.EnterBranchDetailsId("");
        bankAccountDetailsPage.EnterSave();
        Assert.assertTrue(bankAccountDetailsPage.isBankAccountDetailsPageLoadsAsExpected());
    }
}
