package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployerAmendmentsPage {
    private final WebDriver driver;

    public EmployerAmendmentsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchInEmployerAmendments(String searchEmployerAmendments) {
        searchEmployerAmendments(searchEmployerAmendments);
    }

    public void clickOnAddEmployerAmendments(String buttonText) {
        clickAddEmployerAmendments(buttonText);
    }

    private void searchEmployerAmendments(String searchEmployerAmendments) {
        driver.findElement(By.id("start-adornment-email")).sendKeys(searchEmployerAmendments);
    }

    private void clickAddEmployerAmendments(String buttonText) {
        driver.findElement(By.xpath("(//button[normalize-space()='" + buttonText + "'])[1]")).click();
    }

    public boolean isEmployerAmendmentsPageLoadsAsExpected() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }
}
