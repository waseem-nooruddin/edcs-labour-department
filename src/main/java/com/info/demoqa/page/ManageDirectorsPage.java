package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageDirectorsPage {
    private final WebDriver driver;

    public ManageDirectorsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAddButton() {
        clickAddButton();
    }

    public void EnterNic(String NIC) {
        addNic(NIC);
    }

    public void EnterExpireDateOfNIC(String ExDate) {
        addExpireDateOfNIC(ExDate);
    }

    public void EnterDateOfBirth(String Dob) {
        addDateOfBirth(Dob);
    }

    public void EnterNameWithInitials(String nameWithInitials) {
        addNameWithInitials(nameWithInitials);
    }

    public void EnterFullName(String fullName) {
        addFullName(fullName);
    }

    public void EnterContactNo(String contactNo) {
        addContactNo(contactNo);
    }

    public void EnterEmail(String email) {
        addEmail(email);
    }

    public void EnterJoinDate(String joinDate) {
        addJoinDate(joinDate);
    }

    public void EnterAppointedDate(String appointedDate) {
        addAppointedDate(appointedDate);
    }

    public void EnterAddressNo(String AddressNo) {
        addAddressNo(AddressNo);
    }

    public void EnterStreetName(String StreetName) {
        addStreetName(StreetName);
    }


    public void clickOnSubmit() {
        clickSubmit();
    }

    private void clickAddButton() {
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
    }

    private void addNic(String NIC) {
        driver.findElement(By.id("identityNo")).sendKeys(NIC);
    }

    private void addExpireDateOfNIC(String ExDate) {
        driver.findElement(By.id("expireDate")).sendKeys(ExDate);
    }

    private void addDateOfBirth(String Dob) {
        driver.findElement(By.id("dob")).sendKeys(Dob);
    }

    private void addNameWithInitials(String nameWithInitials) {
        driver.findElement(By.id("nameWithInitials")).sendKeys(nameWithInitials);
    }

    private void addFullName(String fullName) {
        driver.findElement(By.id("fullName")).sendKeys(fullName);
    }

    private void addContactNo(String contactNo) {
        driver.findElement(By.id("contactNo")).sendKeys(contactNo);
    }

    private void addEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    private void addJoinDate(String joinDate) {
        driver.findElement(By.id("joinDate")).sendKeys(joinDate);
    }

    private void addAppointedDate(String appointedDate) {
        driver.findElement(By.id("appointedDate")).sendKeys(appointedDate);
    }

    private void addAddressNo(String AddressNo) {
        driver.findElement(By.id("AddressNo")).sendKeys(AddressNo);
    }

    private void addStreetName(String StreetName) {
        driver.findElement(By.id("Street Name")).sendKeys(StreetName);
    }

    private void clickSubmit() {
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Submit']")).click();
    }

    public boolean isPageLoadsAsExpected() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }
}
