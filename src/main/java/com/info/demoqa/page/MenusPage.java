package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenusPage {
    private final WebDriver driver;

    public MenusPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoadingAsExpected() {
        return driver.findElement(By.xpath("//h2[normalize-space(.)='Menus']")).isDisplayed();
    }
}
