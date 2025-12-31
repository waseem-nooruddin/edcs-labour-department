package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePasswordPage {
    private final WebDriver driver;

    public ChangePasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterOldPassword(String OldPassword) {
        TypeOldPassword(OldPassword);
    }

    public void EnterNewPassword(String NewPassword) {
        TypeNewPassword(NewPassword);
    }

    public void EnterConfirmPassword(String ConfirmPassword) {
        TypeConfirmPassword(ConfirmPassword);
    }

    public void ClickOnButton() {
        ClickButton();
    }

    private void TypeOldPassword(String OldPassword) {
        driver.findElement(By.id("password-old")).sendKeys(OldPassword);
    }

    private void TypeNewPassword(String NewPassword) {
        driver.findElement(By.id("password-password")).sendKeys(NewPassword);
    }

    private void TypeConfirmPassword(String ConfirmPassword) {
        driver.findElement(By.id("password-confirm")).sendKeys(ConfirmPassword);
    }

    private void ClickButton() {
        driver.findElement(By.xpath("//button[normalize-space()='Update Password']")).click();
    }

    public boolean isPageLoadAsExpected() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/nav/ol/li[3]/h6")).isDisplayed();
    }
}
