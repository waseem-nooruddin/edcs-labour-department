package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocumentUploadTypesPage {
    private final WebDriver driver;

    public DocumentUploadTypesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterAddButton() {
        clickAddButton();
    }

     public void enterCode(String code) {
         typeCode(code);
     }

    public void enterDescription(String description) {
        typeDescription(description);
    }

    public void enterSubmitAddButton() {
        clickSubmitAddButton();
    }

    public void clickOnSearch(String startAdornmentEmail) {
        clickSearch(startAdornmentEmail);
    }

    public void clickOnEdit() {
        clickEdit();
    }

    public void editTheCode(String code) {
        editCode(code);
    }

    public void enterEditButton() {
        submitEdit();
    }

    private void clickAddButton() {
        driver.findElement(By.xpath("//button[@type='button' and normalize-space()='Add']")).click();
    }

    private void typeCode(String code) {
        driver.findElement(By.id("code")).sendKeys(code);
    }

    private void typeDescription(String description) {
        driver.findElement(By.id("description")).sendKeys(description);
    }

    private void clickSubmitAddButton() {
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Add']")).click();
    }

    private void clickSearch(String startAdornmentEmail) {
        driver.findElement(By.id("start-adornment-email")).sendKeys(startAdornmentEmail);
    }

    private void clickEdit() {
        driver.findElement(By.xpath("//*[@class=\"anticon anticon-edit\"]")).click();
    }

    private void editCode(String code) {
        driver.findElement(By.id("code")).sendKeys(code);
    }

    private void submitEdit() {
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Edit']")).click();
    }

    public boolean isPageLoadsAsExpected() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }
}
