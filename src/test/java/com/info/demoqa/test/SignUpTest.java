package com.info.demoqa.test;

import com.info.demoqa.page.CompanyRegistrationPage;
import com.info.demoqa.page.SignUpPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    @Test(description = "Verify that the user is able to sign in as an existing company or New Company")
    @Category("Sign Up")
    public void TestCase_4() {

        SignUp();
        SignUpPage signUpPage = new SignUpPage(driver);

        Assert.assertTrue(signUpPage.isSignUpDisplayed());

    }

    @Test(description = "Verify Existing Company Form Loading")
    @Category("Sign Up")
    public void TestCase_5() {

        SignUp();
        SignUpPage signUpPage = new SignUpPage(driver);
        CompanyRegistrationPage companyRegistrationPage = new CompanyRegistrationPage(driver);
        companyRegistrationPage.EnterSignUpCompanyButton("Existing Company");


        Assert.assertTrue(signUpPage.isBusinessDetailsDisplayed());

    }

    @Test(description = "Verify New Company Form Loading")
    @Category("Sign Up")
    public void TestCase_6() {

        SignUp();
        SignUpPage signUpPage = new SignUpPage(driver);
        CompanyRegistrationPage companyRegistrationPage = new CompanyRegistrationPage(driver);
        companyRegistrationPage.EnterSignUpCompanyButton("New Company");

        Assert.assertTrue(signUpPage.isBusinessDetailsDisplayed());

    }


    /*@Test(description = "Verify that the Existing Company page loads successfully.")
    @Category("Sign Up")
    public void TestCase_7() {

        SignUp();
        SignUpPage signUpPage = new SignUpPage(driver);
        CompanyRegistrationPage companyRegistrationPage = new CompanyRegistrationPage(driver);
        companyRegistrationPage.EnterSignUpCompanyButton("Existing Company");
        companyRegistrationPage.EnterCompanyNo(PropertyFileReader.getSignUpData("business.EnterCompanyNo"));
        companyRegistrationPage.ClickOnValidateCompany();
        companyRegistrationPage.EnterSelectBusinessType(PropertyFileReader.getSignUpData("business.type"));
        companyRegistrationPage.EnterBusinessRegistrationNumber(PropertyFileReader.getSignUpData("business.regNumber"));
        companyRegistrationPage.EnterNameOfEstablishment(PropertyFileReader.getSignUpData("business.establishmentName"));
        companyRegistrationPage.EnterDateOfOwnership(PropertyFileReader.getSignUpData("business.ownershipDate"));
        companyRegistrationPage.EnterBusinessNature(PropertyFileReader.getSignUpData("business.nature"));
        companyRegistrationPage.EnterSubBusinessNature(PropertyFileReader.getSignUpData("business.subNature"));
        companyRegistrationPage.EnterNumberOfMale(PropertyFileReader.getSignUpData("business.males"));
        companyRegistrationPage.EnterNumberOfFemale(PropertyFileReader.getSignUpData("business.females"));
        companyRegistrationPage.EnterAddAddressNo(PropertyFileReader.getSignUpData("business.addressNo"));
        companyRegistrationPage.EnterStreetName(PropertyFileReader.getSignUpData("business.street"));
        companyRegistrationPage.ClickNextButton();

        companyRegistrationPage.EntercontactPerson(PropertyFileReader.getSignUpData("applicant.contactPerson"));
        companyRegistrationPage.EnterApplicantName(PropertyFileReader.getSignUpData("applicant.name"));
        companyRegistrationPage.EnterStartDate(PropertyFileReader.getSignUpData("applicant.startDate"));
        companyRegistrationPage.EnterGender(PropertyFileReader.getSignUpData("applicant.gender"));
        companyRegistrationPage.EnterApplicantIdentityNo(PropertyFileReader.getSignUpData("applicant.identityNo"));
        companyRegistrationPage.EnterContactNo(PropertyFileReader.getSignUpData("applicant.contactNo"));
        companyRegistrationPage.EnterEmail(PropertyFileReader.getSignUpData("applicant.email"));
        companyRegistrationPage.EnterLandLineNumber(PropertyFileReader.getSignUpData("applicant.landline"));
        companyRegistrationPage.EnterProvince(PropertyFileReader.getSignUpData("applicant.province"));
        companyRegistrationPage.EnterDistrict(PropertyFileReader.getSignUpData("applicant.district"));
        companyRegistrationPage.EnterPostalCode(PropertyFileReader.getSignUpData("applicant.postalCode"));
        companyRegistrationPage.EnterDivisionalSecretariatsId(PropertyFileReader.getSignUpData("applicant.divisionalSecretariat"));
        companyRegistrationPage.EnterWorkplaceAddress(PropertyFileReader.getSignUpData("applicant.workAddress"));
        companyRegistrationPage.EnterWorkplaceStreetName(PropertyFileReader.getSignUpData("applicant.workStreet"));
        companyRegistrationPage.EnterButton(PropertyFileReader.getSignUpData("applicant.enterButton"));

        companyRegistrationPage.EnterMaleCoveredEmployment(PropertyFileReader.getSignUpData("AnnexureDDetails.coveredMales"));
        companyRegistrationPage.EnterFemaleCoveredEmployment(PropertyFileReader.getSignUpData("AnnexureDDetails.coveredFemale"));
        companyRegistrationPage.EnterUnCoveredMaleEmployments(PropertyFileReader.getSignUpData("AnnexureDDetails.UncoveredMales"));
        companyRegistrationPage.EnterUnCoveredFemaleEmployments(PropertyFileReader.getSignUpData("AnnexureDDetails.UncoveredFemale"));
        companyRegistrationPage.EnterBOIRegistrationNumber(PropertyFileReader.getSignUpData("AnnexureDDetails.BOIRegistrationNumber"));
        companyRegistrationPage.EnterLiabilityStartDate(PropertyFileReader.getSignUpData("AnnexureDDetails.LiabilityStartDate"));
        companyRegistrationPage.EnterPreviouslyRegisteredEPF(PropertyFileReader.getSignUpData("AnnexureDDetails.PreviouslyRegisteredEPF"));
        companyRegistrationPage.EnterAppliedForApproval(PropertyFileReader.getSignUpData("AnnexureDDetails.AppliedForApproval"));
        companyRegistrationPage.EnterClickButton(PropertyFileReader.getSignUpData("AnnexureDDetails.EnterClickButton"));

        Assert.assertTrue(signUpPage.isBusinessDetailsDisplayed());
        Assert.assertTrue(signUpPage.isEOwnersProprietorsDetailsDisplayed());

    }*/

    @Test(description = "Verify that the New Company page loads successfully")
    @Category("Sign Up")
    public void TestCase_8() {

        SignUp();
        SignUpPage signUpPage = new SignUpPage(driver);
        CompanyRegistrationPage companyRegistrationPage = new CompanyRegistrationPage(driver);
        companyRegistrationPage.EnterSignUpCompanyButton("New Company");
        companyRegistrationPage.EnterSelectBusinessType(PropertyFileReader.getSignUpData("new.business.type"));
        companyRegistrationPage.EnterBusinessRegistrationNumber(PropertyFileReader.getSignUpData("new.business.regNumber"));
        companyRegistrationPage.EnterNameOfEstablishment(PropertyFileReader.getSignUpData("new.business.establishmentName"));
        companyRegistrationPage.EnterDateOfOwnership(PropertyFileReader.getSignUpData("new.business.ownershipDate"));
        companyRegistrationPage.EnterBusinessNature(PropertyFileReader.getSignUpData("new.business.nature"));
        companyRegistrationPage.EnterSubBusinessNature(PropertyFileReader.getSignUpData("new.business.subNature"));
        companyRegistrationPage.EnterNumberOfMale(PropertyFileReader.getSignUpData("new.business.males"));
        companyRegistrationPage.EnterNumberOfFemale(PropertyFileReader.getSignUpData("new.business.females"));
        companyRegistrationPage.EnterAddAddressNo(PropertyFileReader.getSignUpData("new.business.addressNo"));
        companyRegistrationPage.EnterStreetName(PropertyFileReader.getSignUpData("new.business.street"));
        companyRegistrationPage.ClickNextButton();

        companyRegistrationPage.EntercontactPerson(PropertyFileReader.getSignUpData("new.applicant.contactPerson"));
        companyRegistrationPage.EnterApplicantName(PropertyFileReader.getSignUpData("new.applicant.name"));
        companyRegistrationPage.EnterStartDate(PropertyFileReader.getSignUpData("new.applicant.startDate"));
        companyRegistrationPage.EnterGender(PropertyFileReader.getSignUpData("new.applicant.gender"));
        companyRegistrationPage.EnterApplicantIdentityNo(PropertyFileReader.getSignUpData("new.applicant.identityNo"));
        companyRegistrationPage.EnterContactNo(PropertyFileReader.getSignUpData("new.applicant.contactNo"));
        companyRegistrationPage.EnterEmail(PropertyFileReader.getSignUpData("new.applicant.email"));
        companyRegistrationPage.EnterLandLineNumber(PropertyFileReader.getSignUpData("new.applicant.landline"));
        companyRegistrationPage.EnterProvince(PropertyFileReader.getSignUpData("new.applicant.province"));
        companyRegistrationPage.EnterDistrict(PropertyFileReader.getSignUpData("new.applicant.district"));
        companyRegistrationPage.EnterPostalCode(PropertyFileReader.getSignUpData("new.applicant.postalCode"));
        companyRegistrationPage.EnterDivisionalSecretariatsId(PropertyFileReader.getSignUpData("new.applicant.divisionalSecretariat"));
        companyRegistrationPage.EnterWorkplaceAddress(PropertyFileReader.getSignUpData("new.applicant.workAddress"));
        companyRegistrationPage.EnterWorkplaceStreetName(PropertyFileReader.getSignUpData("new.applicant.workStreet"));
        companyRegistrationPage.EnterButton(PropertyFileReader.getSignUpData("new.applicant.enterButton"));

        companyRegistrationPage.EnterMaleCoveredEmployment(PropertyFileReader.getSignUpData("new.AnnexureDDetails.coveredMales"));
        companyRegistrationPage.EnterFemaleCoveredEmployment(PropertyFileReader.getSignUpData("new.AnnexureDDetails.coveredFemale"));
        companyRegistrationPage.EnterUnCoveredMaleEmployments(PropertyFileReader.getSignUpData("new.AnnexureDDetails.UncoveredMales"));
        companyRegistrationPage.EnterUnCoveredFemaleEmployments(PropertyFileReader.getSignUpData("new.AnnexureDDetails.UncoveredFemale"));
        companyRegistrationPage.EnterBOIRegistrationNumber(PropertyFileReader.getSignUpData("new.AnnexureDDetails.BOIRegistrationNumber"));
        companyRegistrationPage.EnterLiabilityStartDate(PropertyFileReader.getSignUpData("new.AnnexureDDetails.LiabilityStartDate"));
        companyRegistrationPage.EnterPreviouslyRegisteredEPF(PropertyFileReader.getSignUpData("new.AnnexureDDetails.PreviouslyRegisteredEPF"));
        companyRegistrationPage.EnterAppliedForApproval(PropertyFileReader.getSignUpData("new.AnnexureDDetails.AppliedForApproval"));
        companyRegistrationPage.EnterClickButton(PropertyFileReader.getSignUpData("new.AnnexureDDetails.EnterClickButton"));

        Assert.assertTrue(signUpPage.isBusinessDetailsDisplayed());
        Assert.assertTrue(signUpPage.isEOwnersProprietorsDetailsDisplayed());

    }
}