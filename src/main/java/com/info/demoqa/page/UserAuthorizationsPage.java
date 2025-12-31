package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserAuthorizationsPage {
    private final WebDriver driver;

    public UserAuthorizationsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterApproveRejectButton() {
        ApproveRejectButton();
    }

    private void ApproveRejectButton() {
        driver.findElement(By.xpath("//tr[1]//button[@aria-label='Approve']")).click();
    }

    public boolean isUserAuthorizationsPageLoadSuccessfully() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/h2")).isDisplayed();
    }


}
