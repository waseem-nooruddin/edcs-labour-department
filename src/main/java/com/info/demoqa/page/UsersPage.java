package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class UsersPage {

    private final WebDriver driver;

    public UsersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterUserAdd() {
        UsersAdd();
    }

    public void EnterUserType(String UserType) {
        SelectUserType(UserType);
    }

    public void TypeEmployeeNo(String referenceNo) {
        EnterEmployeeNo(referenceNo);
    }

    public void TypeCompanyId(String ComId) {
        EnterCompanyId(ComId);
    }

    public void TypeEmail(String email) {
        EnterEmail(email);
    }

    public void TypeNic(String NIC) {
        EnterNic(NIC);
    }

    public void TypeMobileNumber(String MobileNumber) {
        EnterMobileNumber(MobileNumber);
    }

    public void TypeFirstName(String FirstName) {
        EnterFirstName(FirstName);
    }

    public void TypeLastName(String LastName) {
        EnterLastName(LastName);
    }

    public void TypeUserRoleId(String UserRoleId) {
        EnterUserRoleId(UserRoleId);
    }

    public void TypeBranch(String branchId) {
        EnterBranch(branchId);
    }

    public void ClickOnAdd() {
        ClickAdd();
    }

    private void UsersAdd() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div/div[2]/button")).click();
    }

    private void SelectUserType(String UserType) {
        driver.findElement(By.id("userTypeId")).sendKeys(UserType);
        driver.findElement(By.id("userTypeId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("userTypeId")).sendKeys(Keys.ENTER);
    }

    private void EnterEmployeeNo(String referenceNo) {
        driver.findElement(By.id("referenceNo")).sendKeys(referenceNo);
    }

    private void EnterCompanyId(String ComId) {
        driver.findElement(By.id("comId")).sendKeys(ComId);
    }

    private void EnterEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    private void EnterNic(String NIC) {
        driver.findElement(By.id("nic")).sendKeys(NIC);
    }

    private void EnterMobileNumber(String MobileNumber) {
        driver.findElement(By.id("mobileNo")).sendKeys(MobileNumber);
    }

    private void EnterFirstName(String FirstName) {
        driver.findElement(By.id("firstName")).sendKeys(FirstName);
    }

    private void EnterLastName(String LastName) {
        driver.findElement(By.id("lastName")).sendKeys(LastName);
    }

    private void EnterUserRoleId(String UserRoleId) {
        driver.findElement(By.id("userRoleId")).sendKeys(UserRoleId);
        driver.findElement(By.id("userRoleId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("userRoleId")).sendKeys(Keys.ENTER);
    }

    private void EnterBranch(String branchId) {
        driver.findElement(By.id("branchId")).sendKeys(branchId);
        driver.findElement(By.id("branchId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("branchId")).sendKeys(Keys.ENTER);
    }

    private void ClickAdd() {
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/form/div[2]/div/div[2]/div/button[2]")).click();
    }

    public boolean isUserPageVisible() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }

}
