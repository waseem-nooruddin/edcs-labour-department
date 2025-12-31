package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GlobalConfigurationsPage {
    private final WebDriver driver;

    public GlobalConfigurationsPage(WebDriver driver) {
        this.driver = driver;
    }



    private void GlobalConfigurations() {
        driver.findElement(By.xpath("//a[@href='/labour-depf-fe/app/application-management/global']")).click();
    }

    public boolean isPageLoadingAsExpected() {
        return driver.findElement(By.xpath("//h2[normalize-space(.)='Global Configurations']")).isDisplayed();
    }
}
