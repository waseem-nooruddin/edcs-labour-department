package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ExternalRequestsPage {
    private final WebDriver driver;

    public ExternalRequestsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterExternalRequestsButton() {
        ClickExternalRequestsButton();
    }

    public void EnterStaffDetails() {
        ClickStaffDetails();
    }

    public void EnterUserType(String userTypeId) {
        ClickUserType(userTypeId);
    }

    public void EnterEmployeeType(String EmployeeType) {
        ClickEmployeeType(EmployeeType);
    }

    public void EnterPersonalDetails() {
        SelectPersonalDetails();
    }

    public void EnterFirstName(String FirstName) {
        TypeFirstName(FirstName);
    }

    public void EnterLastName(String lastName) {
        TypeLastName(lastName);
    }

    public void EnterIdentityNo(String IdentityNo) {
        TypeIdentityNo(IdentityNo);
    }

    public void EnterMiddleName(String MiddleName) {
        TypeMiddleName(MiddleName);
    }

    public void EnterEmail(String Email) {
        TypeEmail(Email);

    }

    public void EnterContactNumber(String ContactNumber) {
        TypeContactNumber(ContactNumber);

    }

    public void EnterLabourOfficeDetails() {
        SelectLabourOfficeDetails();
    }

    public void EnterLabourOffice(String DistrictId) {
        SelectLabourOffice(DistrictId);
    }

    public void EnterRole(String Role) {
        SelectRole(Role);
    }

    public void RequestClaimsRequest() {
        SelectClaimsRequest();
    }

    private void ClickExternalRequestsButton() {
        driver.findElement(By.xpath("//a[contains(@href,'staffOpenUserIdRequest')]")).click();

    }

    private void ClickStaffDetails() {
        driver.findElement(By.id("panel2d-header")).click();
    }

    private void ClickUserType(String userTypeId) {
        driver.findElement(By.id("userTypeId")).sendKeys(userTypeId);
        driver.findElement(By.id("userTypeId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("userTypeId")).sendKeys(Keys.ENTER);

    }

    private void ClickEmployeeType(String EmployeeType) {
        driver.findElement(By.id("Employee Type")).sendKeys(EmployeeType);
        driver.findElement(By.id("Employee Type")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("Employee Type")).sendKeys(Keys.ENTER);

    }

    private void SelectPersonalDetails() {
        driver.findElement(By.xpath("//*[@id=\"panel3d-header\"]/div[1]")).click();
    }

    private void TypeFirstName(String FirstName) {
        driver.findElement(By.id("firstName")).sendKeys(FirstName);
    }

    private void TypeLastName(String lastName) {
        driver.findElement(By.id("lastName")).sendKeys(lastName);
    }

    private void TypeIdentityNo(String IdentityNo) {
        driver.findElement(By.id("identityNo")).sendKeys(IdentityNo);
    }

    private void TypeMiddleName(String MiddleName) {
        driver.findElement(By.id("middleName")).sendKeys(MiddleName);
    }

    private void TypeEmail(String Email) {
        driver.findElement(By.id("email")).sendKeys(Email);
    }

    private void TypeContactNumber(String ContactNumber) {
        driver.findElement(By.id("contactNumber")).sendKeys(ContactNumber);
    }

    private void SelectLabourOfficeDetails() {
        driver.findElement(By.xpath("//*[@id=\"panel5d-header\"]/div[1]/div/h6")).click();
    }

    private void SelectLabourOffice(String DistrictId) {
        driver.findElement(By.id("districtId")).sendKeys(DistrictId);
        driver.findElement(By.id("districtId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("districtId")).sendKeys(Keys.ENTER);
    }

    private void SelectRole(String Role) {
        driver.findElement(By.id("roleId")).sendKeys(Role);
        driver.findElement(By.id("roleId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("roleId")).sendKeys(Keys.ENTER);
    }


    private void SelectClaimsRequest() {
        driver.findElement(By.xpath("//a[contains(@href,'openClaimsRequest')]")).click();
    }

    public boolean isStaffUserIDRequestsDialogDisplayed() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div/h3")).isDisplayed();
    }

}
