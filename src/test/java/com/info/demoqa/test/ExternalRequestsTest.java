package com.info.demoqa.test;

import com.info.demoqa.page.ExternalRequestsPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExternalRequestsTest extends BaseTest {
    @Test(description = "Verify that a standard user can login to External Requests Page")
    @Category("External Requests")
    public void TestCase_13() {
        LoginPage();

        ExternalRequestsPage externalRequestsPage = new ExternalRequestsPage(driver);
        externalRequestsPage.EnterExternalRequestsButton();

        Assert.assertTrue(externalRequestsPage.isStaffUserIDRequestsDialogDisplayed());

    }

    @Test(description = "Verify that a standard user can login to External Requests Page")
    @Category("External Requests")
    public void TestCase_14() {
        LoginPage();

        ExternalRequestsPage externalRequestsPage = new ExternalRequestsPage(driver);
        externalRequestsPage.EnterExternalRequestsButton();
        externalRequestsPage.EnterStaffDetails();

        Assert.assertTrue(externalRequestsPage.isStaffUserIDRequestsDialogDisplayed());

    }

    @Test(description = "verify is the External Requests Management Is able to fill the form successfully")
    @Category("External Requests")
    public void TestCase_15() {
        LoginPage();

        ExternalRequestsPage externalRequestsPage = new ExternalRequestsPage(driver);
        externalRequestsPage.EnterExternalRequestsButton();
        externalRequestsPage.EnterStaffDetails();
        externalRequestsPage.EnterUserType(PropertyFileReader.getUserData("ExternalRequests.UserType"));
        externalRequestsPage.EnterEmployeeType(PropertyFileReader.getUserData("ExternalRequests.EmployeeType"));

        externalRequestsPage.EnterPersonalDetails();
        externalRequestsPage.EnterFirstName(PropertyFileReader.getUserData("ExternalRequests.FirstName"));
        externalRequestsPage.EnterLastName(PropertyFileReader.getUserData("ExternalRequests.LastName"));
        externalRequestsPage.EnterIdentityNo(PropertyFileReader.getUserData("ExternalRequests.IdentityNo"));
        externalRequestsPage.EnterMiddleName(PropertyFileReader.getUserData("ExternalRequests.MiddleName"));
        externalRequestsPage.EnterEmail(PropertyFileReader.getUserData("ExternalRequests.Email"));
        externalRequestsPage.EnterContactNumber(PropertyFileReader.getUserData("ExternalRequests.ContactNumber"));

        externalRequestsPage.EnterLabourOfficeDetails();
        externalRequestsPage.EnterLabourOffice(PropertyFileReader.getUserData("ExternalRequests.LabourOffice"));
        externalRequestsPage.EnterRole(PropertyFileReader.getUserData("ExternalRequests.Role"));

        Assert.assertTrue(externalRequestsPage.isStaffUserIDRequestsDialogDisplayed());

    }

    @Test(description = "verify is the Request to Claims Request page load successfully")
    @Category("External Requests")
    public void TestCase_16() {
        LoginPage();

        ExternalRequestsPage externalRequestsPage = new ExternalRequestsPage(driver);
        externalRequestsPage.EnterExternalRequestsButton();
        externalRequestsPage.RequestClaimsRequest();
    }
}
