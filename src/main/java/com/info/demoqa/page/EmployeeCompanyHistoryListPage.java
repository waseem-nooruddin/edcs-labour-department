package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeCompanyHistoryListPage {
    private final WebDriver driver;

    public EmployeeCompanyHistoryListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterNic(String InsertNIC) {
        insertNic(InsertNIC);
    }

    public void EnterButton() {
        clickOnSearchButton();
    }

    private void insertNic(String InsertNIC) {
        driver.findElement(By.id(":r1:")).sendKeys(InsertNIC);
    }

    private void clickOnSearchButton() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div/div/div[2]/button")).click();
    }

    public boolean isEmployeeCompanyHistoryListPageLoadsAsExpected() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }
}
