package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocumentTypePage {
    private final WebDriver driver;

    public DocumentTypePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoadsAsExpected() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }
}
