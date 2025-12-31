package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompanyDetailsIntegrationPage {
    private final WebDriver driver;

    public CompanyDetailsIntegrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoadAsExpected() {
        return driver.findElement(By.xpath("//h2[normalize-space()='Company Details (Integration)']")).isDisplayed();
    }
}
