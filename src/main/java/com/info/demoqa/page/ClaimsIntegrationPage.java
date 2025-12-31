package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimsIntegrationPage {
    private final WebDriver driver;

    public ClaimsIntegrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void findInsertReferenceNumber(String InsertReferenceNumber) {
        searchInsertReferenceNumber(InsertReferenceNumber);
    }

    private void searchInsertReferenceNumber(String InsertReferenceNumber) {
        driver.findElement(By.xpath("//*[@placeholder=\"Insert Reference Number\"]")).click();
        driver.findElement(By.xpath("//*[@placeholder=\"Insert Reference Number\"]")).sendKeys(InsertReferenceNumber);
    }

    public boolean isPageLoadAsExpected() {
        return driver.findElement(By.xpath("//h2[normalize-space()='Claims (Integration)']")).isDisplayed();
    }
}
