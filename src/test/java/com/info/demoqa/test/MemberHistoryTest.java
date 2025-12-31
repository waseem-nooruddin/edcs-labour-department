package com.info.demoqa.test;

import com.info.demoqa.page.MemberHistoryPage;
import com.info.demoqa.page.NavBarPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MemberHistoryTest extends BaseTest {
    @Test(description = "Verify page loads as expected")
    @Category("Member Details")
    public void TestCase_56() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickMemberHistory();

        MemberHistoryPage memberHistoryPage = new MemberHistoryPage(driver);
        Assert.assertTrue(memberHistoryPage.isPageLoadAsExpected());
    }
}
