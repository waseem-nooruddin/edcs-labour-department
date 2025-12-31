package com.info.demoqa.test;

import com.info.demoqa.page.ManageCompaniesPage;
import com.info.demoqa.page.NavBarPage;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.annotations.Test;

public class ManageCompaniesTest extends BaseTest {
    @Test(description = "Verify that Manage Companies page load Successfully")
    @Category("Manage Companies")
    public void TestCase_31() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickManageCompanies();
        ManageCompaniesPage manageCompaniesPage = new ManageCompaniesPage(driver);
        manageCompaniesPage.isManageCompaniesPageLoadSuccessfully();

    }

    /*@Test(description = "Verify successful submission of all company details.")
    @Category("Manage Companies")
    public void TestCase_32() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickManageCompanies();
        ManageCompaniesPage manageCompaniesPage = new ManageCompaniesPage(driver);
        InternalManageCompaniesPage internalManageCompaniesPage = new InternalManageCompaniesPage(driver);

        CompanyRegistrationPage companyRegistrationPage = new CompanyRegistrationPage(driver);

        manageCompaniesPage.EnterAddbutton();
        internalManageCompaniesPage.EnterSelectBusinessType(PropertyFileReader.getSignUpData("business.type"));
        internalManageCompaniesPage.EnterBusinessRegistrationNumber(PropertyFileReader.getSignUpData("business.regNumber"));
        internalManageCompaniesPage.EnterNameOfEstablishment(PropertyFileReader.getSignUpData("business.establishmentName"));
        internalManageCompaniesPage.EnterDateOfOwnership(PropertyFileReader.getSignUpData("business.ownershipDate"));
        internalManageCompaniesPage.EnterBusinessNature(PropertyFileReader.getSignUpData("business.nature"));
        internalManageCompaniesPage.EnterSubBusinessNature(PropertyFileReader.getSignUpData("business.subNature"));
        internalManageCompaniesPage.EnterNumberOfMale(PropertyFileReader.getSignUpData("business.males"));
        internalManageCompaniesPage.EnterNumberOfFemale(PropertyFileReader.getSignUpData("business.females"));
        internalManageCompaniesPage.EnterAddAddressNo(PropertyFileReader.getSignUpData("business.addressNo"));
        internalManageCompaniesPage.EnterStreetName(PropertyFileReader.getSignUpData("business.street"));
        internalManageCompaniesPage.ClickNextButton();

        internalManageCompaniesPage.EntercontactPerson(PropertyFileReader.getSignUpData("applicant.contactPerson"));
        internalManageCompaniesPage.EnterApplicantName(PropertyFileReader.getSignUpData("applicant.name"));
        internalManageCompaniesPage.EnterStartDate(PropertyFileReader.getSignUpData("applicant.startDate"));
        internalManageCompaniesPage.EnterGender(PropertyFileReader.getSignUpData("applicant.gender"));
        internalManageCompaniesPage.EnterApplicantIdentityNo(PropertyFileReader.getSignUpData("applicant.identityNo"));
        internalManageCompaniesPage.EnterContactNo(PropertyFileReader.getSignUpData("applicant.contactNo"));
        internalManageCompaniesPage.EnterEmail(PropertyFileReader.getSignUpData("applicant.email"));
        internalManageCompaniesPage.EnterLandLineNumber(PropertyFileReader.getSignUpData("applicant.landline"));
        internalManageCompaniesPage.EnterProvince(PropertyFileReader.getSignUpData("applicant.province"));
        internalManageCompaniesPage.EnterDistrict(PropertyFileReader.getSignUpData("applicant.district"));
        internalManageCompaniesPage.EnterPostalCode(PropertyFileReader.getSignUpData("applicant.postalCode"));
        internalManageCompaniesPage.EnterDivisionalSecretariatsId(PropertyFileReader.getSignUpData("applicant.divisionalSecretariat"));
        internalManageCompaniesPage.EnterWorkplaceAddress(PropertyFileReader.getSignUpData("applicant.workAddress"));
        internalManageCompaniesPage.EnterWorkplaceStreetName(PropertyFileReader.getSignUpData("applicant.workStreet"));
        internalManageCompaniesPage.EnterButton(PropertyFileReader.getSignUpData("applicant.enterButton"));

        internalManageCompaniesPage.EnterMaleCoveredEmployment(PropertyFileReader.getSignUpData("AnnexureDDetails.coveredMales"));
        internalManageCompaniesPage.EnterFemaleCoveredEmployment(PropertyFileReader.getSignUpData("AnnexureDDetails.coveredFemale"));
        internalManageCompaniesPage.EnterUnCoveredMaleEmployments(PropertyFileReader.getSignUpData("AnnexureDDetails.UncoveredMales"));
        internalManageCompaniesPage.EnterUnCoveredFemaleEmployments(PropertyFileReader.getSignUpData("AnnexureDDetails.UncoveredFemale"));
        internalManageCompaniesPage.EnterBOIRegistrationNumber(PropertyFileReader.getSignUpData("AnnexureDDetails.BOIRegistrationNumber"));
        internalManageCompaniesPage.EnterLiabilityStartDate(PropertyFileReader.getSignUpData("AnnexureDDetails.LiabilityStartDate"));
        internalManageCompaniesPage.EnterPreviouslyRegisteredEPF(PropertyFileReader.getSignUpData("AnnexureDDetails.PreviouslyRegisteredEPF"));
        internalManageCompaniesPage.EnterAppliedForApproval(PropertyFileReader.getSignUpData("AnnexureDDetails.AppliedForApproval"));
        internalManageCompaniesPage.EnterClickButton(PropertyFileReader.getSignUpData("AnnexureDDetails.EnterClickButton"));

    }*/
}
