package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DocumentMappingPage {
    private final WebDriver driver;

    public DocumentMappingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAdd() {
        clickAdd();
    }

    public void SelectTheDocumentOperations(String operationId) {
        SelectDocumentOperations(operationId);
    }

    public void SelectTheDocumentType(String SelectDocumentType) {
        SelectDocumentType(SelectDocumentType);
    }

    public void ClickMandatoryCheckBox(){
        MandatoryCheckBox();
    }

    public void AddToDocumentType() {
        AddDocumentType();
    }

    public void SelectTheAddMoreDocumentType(String SelectAddMoreDocumentType) {
        SelectAddMoreDocumentType(SelectAddMoreDocumentType);
    }

    public void EnterSubmitToAdd() {
        clickSubmitToAdd();
    }

    public void searchForStartAdornmentEmail(String startAdornmentEmail) {
        searchStartAdornmentEmail(startAdornmentEmail);
    }

    public void editTheStartAdornmentEmail() {
        editStartAdornmentEmail();
    }

    private void clickAdd() {
        driver.findElement(By.xpath("//button[.//span[contains(@class,'anticon-plus')] and normalize-space()='Add']")).click();
    }

    private void SelectDocumentOperations(String operationId) {
        driver.findElement(By.id("operationId")).click();
        driver.findElement(By.id("operationId")).sendKeys(operationId);
        driver.findElement(By.id("operationId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("operationId")).sendKeys(Keys.ENTER);
    }

    private void SelectDocumentType(String SelectDocumentType) {
        driver.findElement(By.id("list.0.docTypeId")).click();
        driver.findElement(By.id("list.0.docTypeId")).sendKeys(SelectDocumentType);
        driver.findElement(By.id("list.0.docTypeId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("list.0.docTypeId")).sendKeys(Keys.ENTER);
    }

    private void MandatoryCheckBox() {
        driver.findElement(By.xpath("//input[@type='checkbox' and @name='list.0.mandatory']")).click();
    }

    private void AddDocumentType() {
        driver.findElement(By.xpath("//button[@type='button' and normalize-space()='Add Document Type']")).click();
    }

    private void SelectAddMoreDocumentType(String SelectAddMoreDocumentType) {
        driver.findElement(By.id("list.1.docTypeId")).click();
        driver.findElement(By.id("list.1.docTypeId")).sendKeys(SelectAddMoreDocumentType);
        driver.findElement(By.id("list.1.docTypeId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("list.1.docTypeId")).sendKeys(Keys.ENTER);
    }

    private void clickSubmitToAdd() {
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Add']")).click();
    }

    private void searchStartAdornmentEmail(String startAdornmentEmail) {
        driver.findElement(By.id("start-adornment-email")).sendKeys(startAdornmentEmail);
    }

    private void editStartAdornmentEmail() {
        driver.findElement(By.xpath("//span[@role='img' and @aria-label='edit']")).click();
    }

    public boolean isPageLoadsAsExpected() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }

}
