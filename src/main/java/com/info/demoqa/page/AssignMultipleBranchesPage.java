package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AssignMultipleBranchesPage {
    private final WebDriver driver;

    public AssignMultipleBranchesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserId(String userId) {
        selectUserId (userId);
    }

    public void selectCheckboxBranch() {
        selectBranch();
    }

    private void selectUserId (String userId) {
        driver.findElement(By.id("userId")).click();
        driver.findElement(By.id("userId")).sendKeys(userId);
        driver.findElement(By.id("userId")).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.id("userId")).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.id("userId")).sendKeys(Keys.ENTER);
    }

    private void selectBranch() {
        driver.findElement(By.xpath("//table//tbody/tr[1]//input[@type='checkbox']/ancestor::span")).click();
    }

    public boolean isPageLoadsAsExpected() {
        return driver.findElement(By.xpath("//h2[contains(@class,'MuiTypography-h2')]")).isDisplayed();
    }

}
