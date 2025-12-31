package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DocumentUploadMappingPage {
    private final WebDriver driver;

    public DocumentUploadMappingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickAddButton() {
        selectAddButton();
    }

    public void SelectDocumentUploadTypeID(String docUploadTypeId) {
        DocumentUploadTypeID(docUploadTypeId);
    }

    public void selectMenuId(String menuId) {
        MenuId(menuId);
    }

    public void selectOperationId(String operationId) {
        operationId(operationId);
    }

    public void enterAddButton() {
        AddButton();
    }

    private void selectAddButton() {
        driver.findElement(By.xpath("//button[@type='button' and normalize-space()='Add']")).click();
    }

    private void DocumentUploadTypeID(String docUploadTypeId) {
        driver.findElement(By.id("docUploadTypeId")).sendKeys(docUploadTypeId);
        driver.findElement(By.id("docUploadTypeId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("docUploadTypeId")).sendKeys(Keys.ENTER);

    }

    private void MenuId(String menuId) {
        driver.findElement(By.id("menuId")).sendKeys(menuId);
        driver.findElement(By.id("menuId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("menuId")).sendKeys(Keys.ENTER);
    }

    private void operationId(String operationId) {
        driver.findElement(By.id("operationId")).sendKeys(operationId);
        driver.findElement(By.id("operationId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("operationId")).sendKeys(Keys.ENTER);
    }

    private void AddButton() {
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Add']")).click();
    }

    public boolean isPageLoadAsExpected() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }
}
