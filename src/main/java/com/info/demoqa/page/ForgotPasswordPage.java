package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private final WebDriver driver;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickOnForgotPassword() {
        ClickForgotPassword();
    }

    public void TypeUserId(String UserId) {
        EnterUserId(UserId);
    }

    public void ClickOnSubmitButton() {
        ClickSubmitButton();
    }

    private void ClickForgotPassword() {
        driver.findElement(By.xpath("//a[contains(@href,'forgot-password') and contains(text(),'Forgot Password')]")).click();
    }

    private void EnterUserId(String UserId) {
        driver.findElement(By.id("userId-forgot")).sendKeys(UserId);
    }

    private void ClickSubmitButton() {
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Submit']")).click();
    }

    public boolean isForgotPasswordPageLoadsAsExpected() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/h3")).isDisplayed();
    }

    public boolean isForgotPasswordOtpPageLoadsAsExpected() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div[1]/label")).isDisplayed();
    }
}
