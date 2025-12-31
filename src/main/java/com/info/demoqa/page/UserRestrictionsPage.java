package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRestrictionsPage {

    private final WebDriver driver;

    public UserRestrictionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterLoginID(String LoginID) {
        selectLoginID(LoginID);
    }

    public void EnterBranchID(String BranchID) {
        selectBranchID(BranchID);
    }

    private void selectLoginID(String LoginID) {
        driver.findElement(By.id("userId")).sendKeys(LoginID);
    }

    private void selectBranchID(String BranchID) {
        driver.findElement(By.id("branchId")).sendKeys(BranchID);
    }

    public boolean isUserRestrictionsPageLoadSuccessfully() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }

}
