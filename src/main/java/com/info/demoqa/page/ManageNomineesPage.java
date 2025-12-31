package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageNomineesPage {
    private final WebDriver driver;
    public ManageNomineesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterManageCompanies(String searchNominees) {
        searchManageCompanies(searchNominees);
    }

    public void clickAddManageCompanies() {
        addManageCompanies();
    }

    public void selectIdType(String labelText) {
        idType(labelText);
    }

    public void enterDob(String dob) {
        selectDob(dob);
    }

    public void enterIdNumber(String identityNo) {
        typeIdNumber(identityNo);
    }

    public void enterBotton(String buttonText) {
        clickBotton(buttonText);
    }

    private void searchManageCompanies(String searchNominees) {
        driver.findElement(By.id("start-adornment-email")).sendKeys(searchNominees);
    }

    private void addManageCompanies() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div/div[2]/button")).click();
    }

    private void idType(String labelText) {
        driver.findElement(By.xpath(
                "//label[.//span[normalize-space()='" + labelText + "']]//input[@type='radio']")).click();
    }

    private void selectDob(String dob) {
        driver.findElement(By.id("dob")).sendKeys(dob);
    }

    private void typeIdNumber(String identityNo) {
        driver.findElement(By.id("identityNo")).sendKeys(identityNo);
    }

    private void clickBotton(String buttonText) {
        driver.findElement(By.xpath("//button[normalize-space()='" + buttonText + "']")).click();
    }

    public boolean isManageNominees() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }

}
