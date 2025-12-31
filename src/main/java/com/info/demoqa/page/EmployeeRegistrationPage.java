package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmployeeRegistrationPage {
    private final WebDriver driver;

    public EmployeeRegistrationPage(WebDriver driver) {
        this.driver = driver;

    }

    public void EnterEmployeeForm() {
        AddEmployeeForm();
    }

    public void SelectExistingEmployee(String option) {
        AddExistingEmployee(option);
    }

    public void SelectIdentityType(String IdType) {
        AddIdentityType(IdType);
    }

    public void EnterEnterNIC(String NIC) {
        EnterNIC(NIC);
    }

    public void addDateOfBirth(String DOB) {
        DateOfBirth(DOB);
    }

    public void ClickValidateButton() {
        EnterValidateButton();
    }

    public void AddMemberNumber(String MemberNumber) {
        EnterMemberNumber(MemberNumber);
    }

    public void AddNationalityDropDown() {
        NationalityDropDown();
    }

    public void AddGender(String gender) {
        selectGender(gender);
    }

    public void EnterFullNam(String Fname) {
        AddFullName(Fname);
    }

    public void EnterNameWithInitials(String nameWithInitials) {
        insertNameWithInitials(nameWithInitials);
    }

    public void EnterPlaceOfBirth(String DateOfBirth) {
        insertPlaceOfBirth(DateOfBirth);
    }

    public void EnterContactNumber(String ContactNumber) {
        insertContactNumber(ContactNumber);
    }

    public void EnterEmail(String Email) {
        insertEmail(Email);
    }

    public void EnterCivilStatus(String CivilStatus) {
        insertCivilStatus(CivilStatus);
    }

    public void EnterMotherName(String MotherName) {
        insertMotherName(MotherName);
    }

    public void EnterMotherBirthPlace(String MotherNameBirthPlace) {
        insertMotherBirthPlace(MotherNameBirthPlace);
    }

    public void EnterFathersName(String FathersName) {
        insertFathersName(FathersName);
    }

    public void EnterFatherBirthPlace(String FatherBirthPlace) {
        insertFatherBirthPlace(FatherBirthPlace);
    }

    public void EnterSpouseName(String SpouseName) {
        insertSpouseName(SpouseName);
    }

    public void EnterProvince(String Province) {
        insertProvince(Province);
    }

    public void EnterDistrictId(String DistrictId) {
        insertDistrict(DistrictId);
    }

    public void EnterCity(String City) {
        insertCity(City);
    }

    public void EnterAddressNo(String AddressNo) {
        insertAddressNo(AddressNo);
    }

    public void EnterStreetName(String StreetName) {
        insertStreetName(StreetName);
    }

    public void Enterdesignation(String designation) {
        insertDesignationId(designation);
    }

    public void EnterSalary(String Salary) {
        insertSalary(Salary);
    }

    public void EnterSalaryType(String type) {
        insertSalaryType(type);
    }

    public void EnterDateEmployed(String DateEmployed) {
        insertDateEmployed(DateEmployed);
    }

    public void SelectSubmitOrCancelButton(String buttonText) {
        ClickSubmitOrCancelButton(buttonText);
    }


    private void AddEmployeeForm() {
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
    }

    private void AddExistingEmployee(String option) {
        driver.findElement(By.xpath("//div[@role='radiogroup' and @aria-label='existingEmployee']//span[contains(text(),'" + option + "')]")).click();
    }

    public void AddIdentityType(String IdType) {
        driver.findElement(By.xpath("//div[@role='radiogroup' and @id='identityTypeId']//span[normalize-space()='" + IdType + "']")).click();
    }

    private void EnterNIC(String NIC) {
        driver.findElement(By.xpath("//input[@id='identityNo']")).sendKeys(NIC);
    }

    private void DateOfBirth(String DOB) {
        driver.findElement(By.id("dob")).sendKeys(DOB);
    }

    private void EnterValidateButton() {
        driver.findElement(By.xpath("//button[normalize-space()='Validate']")).click();
    }

    private void EnterMemberNumber(String MemberNumber) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement memberNumberField = wait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='memberCode']")));
        memberNumberField.sendKeys(MemberNumber);
    }

    private void NationalityDropDown() {
        driver.findElement(By.xpath("//input[@id='nationalityTypeId']")).sendKeys("muslim");
        driver.findElement(By.xpath("//input[@id='nationalityTypeId']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@id='nationalityTypeId']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//input[@id='nationalityTypeId']")).sendKeys(Keys.TAB);

    }

    private void selectGender(String gender) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the dropdown
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//label[contains(text(),'Gender')]/following-sibling::div//div[@role='button']")));
        dropdown.click();

        // Click the option
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li[@role='option' and normalize-space()='" + gender + "']")));
        option.click();
    }

    private void AddFullName(String Fname) {
        driver.findElement(By.name("fullName")).sendKeys(Fname);
    }

    private void insertNameWithInitials(String nameWithInitials) {
        driver.findElement(By.id("nameWithInitials")).sendKeys(nameWithInitials);
    }

    private void insertPlaceOfBirth(String DateOfBirth) {
        driver.findElement(By.id("placeOfBirth")).sendKeys(DateOfBirth);
    }

    private void insertContactNumber(String ContactNumber) {
        driver.findElement(By.id("contactNumber")).sendKeys(ContactNumber);
    }

    private void insertEmail(String Email) {
        driver.findElement(By.id("email")).sendKeys(Email);
        driver.findElement(By.id("email")).sendKeys(Keys.TAB);
    }

    private void insertCivilStatus(String civilStatus) {
        driver.findElement(By.id("civilStatusId")).sendKeys(civilStatus);
        driver.findElement(By.id("civilStatusId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("civilStatusId")).sendKeys(Keys.ENTER);
    }

    private void insertMotherName(String MotherName) {
        driver.findElement(By.id("motherName")).sendKeys(MotherName);
    }

    private void insertMotherBirthPlace(String MotherNameBirthPlace) {
        driver.findElement(By.id("motherPlaceOfBirth")).sendKeys(MotherNameBirthPlace);
    }

    private void insertFathersName(String FathersName) {
        driver.findElement(By.id("fathersName")).sendKeys(FathersName);
    }

    private void insertFatherBirthPlace(String FatherBirthPlace) {
        driver.findElement(By.id("fatherPlaceOfBirth")).sendKeys(FatherBirthPlace);
        driver.findElement(By.id("fatherPlaceOfBirth")).sendKeys(Keys.TAB);
    }

    private void insertSpouseName(String SpouseName) {
        driver.findElement(By.id("spouseName")).sendKeys(SpouseName);
    }

    private void insertProvince(String Province) {
        driver.findElement(By.id("provinceId")).sendKeys(Province);
        driver.findElement(By.id("provinceId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("provinceId")).sendKeys(Keys.ENTER);
    }

    private void insertDistrict(String DistrictId) {
        driver.findElement(By.id("districtId")).sendKeys(DistrictId);
        driver.findElement(By.id("districtId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("districtId")).sendKeys(Keys.ENTER);
    }

    private void insertCity(String City) {
        driver.findElement(By.id("CityId")).sendKeys(City);
        driver.findElement(By.id("CityId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("CityId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("CityId")).sendKeys(Keys.ENTER);
    }

    private void insertAddressNo(String AddressNo) {
        driver.findElement(By.id("AddressNo")).sendKeys(AddressNo);
    }

    private void insertStreetName(String StreetName) {
        driver.findElement(By.id("StreetName")).sendKeys(StreetName);
    }

    private void insertDesignationId(String designation) {
        driver.findElement(By.id("designationId")).sendKeys(designation);
        driver.findElement(By.id("designationId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("designationId")).sendKeys(Keys.ENTER);
    }

    private void insertSalary(String Salary) {
        driver.findElement(By.name("basicSalary")).sendKeys(Salary);
    }

    private void insertSalaryType(String type) {
        driver.findElement(By.xpath("//div[@role='radiogroup' and @aria-label='salary-type']//span[normalize-space()='" + type + "']")).click();
    }

    private void insertDateEmployed(String DateEmployed) {
        driver.findElement(By.id("dateOfJoin")).sendKeys(DateEmployed);
    }

    private void ClickSubmitOrCancelButton(String buttonText) {
        driver.findElement(By.xpath("//button[normalize-space()='" + buttonText + "']")).click();
    }


    public boolean isValidationSuccessful() {
        return driver.findElement(By.xpath("//button[normalize-space()='Validate']")).isDisplayed();
    }

    public boolean isValidationDateOfBirth() {
        return driver.findElement(By.id("dob")).isDisplayed();
    }

    public boolean isValidationNIC() {
        return driver.findElement(By.xpath("//input[@id='identityNo']")).isDisplayed();
    }

}
