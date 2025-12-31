package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CompanyRegistrationPage {
    private final WebDriver driver;

    public CompanyRegistrationPage(WebDriver driver) {
        this.driver = driver;

    }

    public void EnterCompanyNo(String CompanyNo) {
        AddCompanyNo(CompanyNo);
    }

    public void ClickOnValidateCompany() {
        ClickValidateCompany();
    }

    public void EnterSignUpCompanyButton(String companyType) {
        singUpNewCompanyButton(companyType);
    }

    public void EnterSelectBusinessType(String BusinessType) {
        SelectBusinessType(BusinessType);
    }

    public void EnterBusinessRegistrationNumber(String RegistrationNumber) {
        SelectBusinessRegistrationNumber(RegistrationNumber);
    }

    public void EnterNameOfEstablishment(String NameOfEstablishment) {
        NameOfEstablishment(NameOfEstablishment);
    }

    public void EnterDateOfOwnership(String DateOfOwnership) {
        DateOfOwnershipOfEstablishment(DateOfOwnership);
    }

    public void EnterBusinessNature(String BusinessNature) {
        SelectBusinessNature(BusinessNature);
    }

    public void EnterSubBusinessNature(String SubNatureType) {
        SelectSubBusinessNature(SubNatureType);
    }

    public void EnterNumberOfMale(String NumberOfMale) {
        AddNumberOfMale(NumberOfMale);
    }

    public void EnterNumberOfFemale(String NumberOfFemale) {
        AddNumberOfFemale(NumberOfFemale);
    }

    public void EnterAddAddressNo(String addAddressNo) {
        AddAddressNo(addAddressNo);
    }

    public void EnterStreetName(String StreetName) {
        AddStreetName(StreetName);
    }


    public void ClickNextButton() {
        EnterNextButton();
    }

    public void EntercontactPerson(String ContactPerson) {
        AddContactPerson(ContactPerson);
    }

    public void EnterApplicantName(String ApplicantName) {
        AddApplicantName(ApplicantName);
    }

    public void EnterStartDate(String startDate) {
        AddStartDate(startDate);
    }

    public void EnterGender(String Gender) {
        AddGender(Gender);
    }

    public void EnterApplicantIdentityNo(String applicantIdentityNo) {
        AddApplicantIdentityNo(applicantIdentityNo);
    }

    public void EnterContactNo(String contactNo) {
        AddContactNo(contactNo);
    }

    public void EnterEmail(String email) {
        AddEmail(email);
    }

    public void EnterLandLineNumber(String landLineNumber) {
        AddLandLineNumber(landLineNumber);
    }

    public void EnterProvince(String province) {
        AddProvince(province);
    }

    public void EnterDistrict(String district) {
        AddDistrict(district);
    }

    public void EnterPostalCode(String PostalCode) {
        AddPostalCode(PostalCode);
    }

    public void EnterDivisionalSecretariatsId(String divisionalSecretariats) {
        AddDivisionalSecretariatsId(divisionalSecretariats);
    }

    public void EnterWorkplaceAddress(String AddWorkplaceAddress) {
        AddWorkplaceAddress(AddWorkplaceAddress);
    }

    public void EnterWorkplaceStreetName(String WorkplaceStreetName) {
        AddWorkplaceStreetName(WorkplaceStreetName);
    }

    public void EnterButton(String buttonText) {
        clickButton(buttonText);
    }

    public void EnterMaleCoveredEmployment(String CoveredEmployment) {
        maleEmployeeInCoveredEmployment(CoveredEmployment);
    }

    public void EnterFemaleCoveredEmployment(String CoveredEmployment) {
        femaleEmployeeInCoveredEmployment(CoveredEmployment);
    }

    public void EnterUnCoveredMaleEmployments(String unCoveredMale) {
        unCoveredMaleEmployments(unCoveredMale);
    }

    public void EnterUnCoveredFemaleEmployments(String unCoveredFemale) {
        unCoveredFemaleEmployments(unCoveredFemale);
    }

    public void EnterBOIRegistrationNumber(String boiRegNo) {
        bOIRegistrationNumber(boiRegNo);
    }

    public void EnterLiabilityStartDate(String liabilityStartDate) {
        liabilityStartDate(liabilityStartDate);
    }

    public void EnterPreviouslyRegisteredEPF(String currentText) {
        selectPreviouslyRegisteredEPF(currentText);
    }

    public void EnterAppliedForApproval(String value) {
        selectAppliedForApproval(value);
    }

    public void EnterClickButton(String partialText) {
        clickButtonAction(partialText);
    }

    private void singUpNewCompanyButton(String companyType) {
        driver.findElement(By.xpath("//button[normalize-space()='" + companyType + "']")).click();
    }

    private void AddCompanyNo(String CompanyNo) {
        driver.findElement(By.id("companyCode")).sendKeys(CompanyNo);

    }

    private void ClickValidateCompany() {
        driver.findElement(By.xpath("//*[@id=\"validation-forms\"]/div[1]/div[1]/div[2]/div/div/button")).click();
    }

    private void SelectBusinessType(String BusinessType) {
        driver.findElement(By.id("bu")).sendKeys(BusinessType);
        driver.findElement(By.id("bu")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("bu")).sendKeys(Keys.ENTER);

    }

    private void SelectBusinessRegistrationNumber(String RegistrationNumber) {
        driver.findElement(By.id("businessRegNo")).sendKeys(RegistrationNumber);

    }

    private void NameOfEstablishment(String NameOfEstablishment) {
        driver.findElement(By.id("nameOfEstablishment")).sendKeys(NameOfEstablishment);
    }

    private void DateOfOwnershipOfEstablishment(String DateOfOwnership) {
        driver.findElement(By.id("registrationDate")).sendKeys(DateOfOwnership);
    }

    private void SelectBusinessNature(String BusinessNature) {
        driver.findElement(By.id("natureTypeId")).sendKeys(BusinessNature);
        driver.findElement(By.id("natureTypeId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("natureTypeId")).sendKeys(Keys.ENTER);
    }

    private void SelectSubBusinessNature(String SubNatureType) {
        driver.findElement(By.id("subNatureTypeId")).sendKeys(SubNatureType);
        driver.findElement(By.id("subNatureTypeId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("subNatureTypeId")).sendKeys(Keys.ENTER);
    }

    private void AddNumberOfMale(String NumberOfMale) {
        driver.findElement(By.id("numberOfMale")).sendKeys(NumberOfMale);
    }

    private void AddNumberOfFemale(String NumberOfFemale) {
        driver.findElement(By.id("numberOfFemale")).sendKeys(NumberOfFemale);
        driver.findElement(By.id("numberOfFemale")).sendKeys(Keys.TAB);
    }

    private void AddAddressNo(String addressNo) {
        driver.findElement(By.id("AddressNo")).sendKeys(addressNo);
    }

    private void AddStreetName(String StreetName) {
        driver.findElement(By.id("Street Name")).sendKeys(StreetName);
    }

    private void EnterNextButton() {
        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
    }

// Business Details //

    private void AddContactPerson(String ContactPerson) {
        driver.findElement(By.id("contactPerson")).sendKeys(ContactPerson);
    }

    private void AddApplicantName(String ApplicantName) {
        driver.findElement(By.id("contactPerson")).sendKeys(ApplicantName);

    }

    private void AddStartDate(String startDate) {
        driver.findElement(By.id("startDate")).sendKeys(startDate);
    }

    private void AddGender(String Gender) {
        driver.findElement(By.id("gender")).click();
        driver.findElement(By.xpath("//li[@data-value='" + Gender + "']")).click();
    }

    private void AddApplicantIdentityNo(String applicantIdentityNo) {
        driver.findElement(By.id("applicantIdentityNo")).sendKeys(applicantIdentityNo);
    }

    private void AddContactNo(String contactNo) {
        driver.findElement(By.id("contactNo")).sendKeys(contactNo);
    }

    private void AddEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    private void AddLandLineNumber(String landLineNumber) {
        driver.findElement(By.id("landLineNumber")).sendKeys(landLineNumber);
    }

    private void AddProvince(String province) {
        driver.findElement(By.id("provinceId")).click();
        driver.findElement(By.id("provinceId")).sendKeys(province);
        driver.findElement(By.id("provinceId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("provinceId")).sendKeys(Keys.ENTER);

    }

    private void AddDistrict(String district) {
        driver.findElement(By.id("districtId")).click();
        driver.findElement(By.id("districtId")).sendKeys(district);
        driver.findElement(By.id("districtId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("districtId")).sendKeys(Keys.ENTER);

    }

    private void AddPostalCode(String PostalCode) {
        driver.findElement(By.id("postalCodeId")).click();
        driver.findElement(By.id("postalCodeId")).sendKeys(PostalCode);
        driver.findElement(By.id("postalCodeId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("postalCodeId")).sendKeys(Keys.ENTER);

    }

    private void AddDivisionalSecretariatsId(String divisionalSecretariats) {
        driver.findElement(By.id("divisionalSecretariatsId")).click();
        driver.findElement(By.id("divisionalSecretariatsId")).sendKeys(divisionalSecretariats);
        driver.findElement(By.id("divisionalSecretariatsId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("divisionalSecretariatsId")).sendKeys(Keys.ENTER);

    }

    private void AddWorkplaceAddress(String AddWorkplaceAddress) {
        driver.findElement(By.id("AddressNo")).sendKeys(AddWorkplaceAddress);
    }

    private void AddWorkplaceStreetName(String WorkplaceStreetName) {
        driver.findElement(By.id("StreetName")).sendKeys(WorkplaceStreetName);
    }

    private void clickButton(String buttonText) {
        driver.findElement(By.xpath("//button[normalize-space()='" + buttonText + "']")).click();
    }

    // Annexure D Details //

    private void maleEmployeeInCoveredEmployment(String CoveredEmployment) {
        driver.findElement(By.id("coveredMale")).sendKeys(CoveredEmployment);
    }

    private void femaleEmployeeInCoveredEmployment(String CoveredEmployment) {
        driver.findElement(By.id("coveredFemale")).sendKeys(CoveredEmployment);
    }

    private void unCoveredMaleEmployments(String unCoveredMale) {
        driver.findElement(By.id("unCoveredMale")).sendKeys(unCoveredMale);
    }

    private void unCoveredFemaleEmployments(String unCoveredFemale) {
        driver.findElement(By.id("unCoveredFemale")).sendKeys(unCoveredFemale);
    }

    private void bOIRegistrationNumber(String boiRegNo) {
        driver.findElement(By.id("boiRegNo")).sendKeys(boiRegNo);
        driver.findElement(By.id("boiRegNo")).sendKeys(Keys.TAB);
    }

    private void liabilityStartDate(String liabilityStartDate) {
        driver.findElement(By.id("liabilityStartDate")).sendKeys(liabilityStartDate);
    }

    private void selectPreviouslyRegisteredEPF(String currentText) {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/form/div[1]/div/div/div/div[1]/div[2]/div[3]/div[3]/div/div")).click();
        driver.findElement(By.xpath("//li[@role='option' and normalize-space()='" + currentText + "']")).click();
    }

    private void selectAppliedForApproval(String value) {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/form/div[1]/div/div/div/div[1]/div[2]/div[3]/div[4]/div/div")).click();
        driver.findElement(By.xpath("//li[@role='option' and normalize-space()='" + value + "']")).click();
    }

    private void clickButtonAction(String partialText) {
        driver.findElement(By.xpath("//button[contains(normalize-space(),'" + partialText + "')]")).click();
    }
}
