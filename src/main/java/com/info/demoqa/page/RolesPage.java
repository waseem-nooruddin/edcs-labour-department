package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RolesPage {
    private final WebDriver driver;

    public RolesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterAdd() {
        ClickAdd();
    }

    private void ClickAdd() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div/div/div[2]/button")).click();
    }

    public boolean isRolesPageLoadSuccessfully() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }
}
