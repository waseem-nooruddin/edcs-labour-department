package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DocumentOperationsPage {
    private final WebDriver driver;

    public DocumentOperationsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterAddButton() {
        clickAddButton();
    }

    public void enterDocumentOperationCode(String operationCode) {typeDocumentOperationCode(operationCode);}

    public void enterDescription(String description){typeDescription(description);}

    public void clickOnSubmit(){clickSubmit();}

    public void searchOnOperationId(String OperationId) {
        searchOperationId(OperationId);
    }

    public void clickOnEdit() {
        clickEdit();
    }

    public void clickEditOperationCode(String operationCode) {
        editOperationCode(operationCode);
    }

    public void submitTheEdit() {
        submitEdit();
    }

    private void clickAddButton() {
        driver.findElement(By.xpath("//button[@type='button' and .//span and normalize-space()='Add']")).click();
    }

    private void typeDocumentOperationCode(String operationCode) {
        driver.findElement(By.id("operationCode")).click();
        driver.findElement(By.id("operationCode")).sendKeys(operationCode);
    }

    private void typeDescription(String description) {
        driver.findElement(By.id("description")).click();
        driver.findElement(By.id("description")).sendKeys(description);
        driver.findElement(By.id("description")).sendKeys(Keys.TAB);
    }

    private void clickSubmit() {
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Add']")).click();
    }
    private void searchOperationId(String OperationId) {
        driver.findElement(By.id("start-adornment-email")).sendKeys(OperationId);
    }
    private void clickEdit() {
        driver.findElement(By.xpath("//button[@aria-label='Edit']")).click();
    }

    private void editOperationCode(String operationCode) {
        driver.findElement(By.id("operationCode")).sendKeys(operationCode);
    }

    private void submitEdit() {
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Edit']")).click();
    }

    public boolean isPageLoadsAsExpected() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }

}

