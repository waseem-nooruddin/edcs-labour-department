package com.info.demoqa.test;

import com.info.demoqa.page.MemberDetailsPage;
import com.info.demoqa.page.NavBarPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MemberDetailsTest extends BaseTest{
    @Test(description = "Verify page loads as expected")
    @Category("Member Details")
    public void TestCase_54() {
        fullLogin();

        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickMemberDetails();

        MemberDetailsPage memberDetailsPage = new MemberDetailsPage(driver);
        Assert.assertTrue(memberDetailsPage.isPageLoadAsExpected());
    }
}
