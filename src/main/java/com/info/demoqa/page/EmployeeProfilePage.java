package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeProfilePage {
    private final WebDriver driver;

    public EmployeeProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isEmployeeProfilePageLoadsAsExpected() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/form/div/div/div[1]/div/span")).isDisplayed();
    }
}
