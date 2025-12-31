package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EmployeeAmendmentsPage {
    private final WebDriver driver;

    public EmployeeAmendmentsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void AddOnNewRequestAmendment() {
        AddNewRequestAmendment ();
    }

    public void enterAmendmentType(String amendmentsTypeId) {
        SelectAmendmentType(amendmentsTypeId);
    }

    public void EnterIdentityNo(String identityNo) {
        AddIdentityNo(identityNo);
    }

    public void EnterUploadDocuments() {
        clickUploadDocuments();
    }

    private void AddNewRequestAmendment () {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div/div[2]/button")).click();
    }

    private void SelectAmendmentType(String amendmentsTypeId) {
        driver.findElement(By.id("amendmentsTypeId")).sendKeys(amendmentsTypeId);
        driver.findElement(By.id("amendmentsTypeId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("amendmentsTypeId")).sendKeys(Keys.ENTER);
    }

    private void AddIdentityNo(String identityNo) {
        driver.findElement(By.id("identityNo")).sendKeys(identityNo);
    }

    private void clickUploadDocuments() {
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/form/div[1]/div/div[2]/div/div[3]/div/button")).click();
    }

    public boolean isEmployeeAmendmentsPageLoadsAsExpected() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }
}
