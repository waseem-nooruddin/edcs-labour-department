package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageCompaniesPage {

    private final WebDriver driver;

    public ManageCompaniesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterAddbutton() {
        ClickAddbutton();
    }

    private void ClickAddbutton() {
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
    }

    public boolean isManageCompaniesPageLoadSuccessfully() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }


}
