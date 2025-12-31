package com.info.demoqa.test;

import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.page.RefundPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RefundTest extends BaseTest {
    @Test(description = "Verify page loads as expected")
    @Category("Refund")
    public void TestCase_46() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickRefunds();

        RefundPage refundPage = new RefundPage(driver);
        Assert.assertTrue(refundPage.isRefundPageLoadsAsExpected());
    }
}
