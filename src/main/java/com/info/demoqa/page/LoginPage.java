package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        inputUsername(username);
        inputPassword(password);
        clickLoginButton();
    }

    public void remember_me() {
        clickRememberMe();

    }

    public void NewSessionButton() {
        useNewSessionButton();

    }

    private void inputUsername(String username) {
        driver.findElement(By.name("userName")).sendKeys(username);
    }

    private void inputPassword(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    private void clickRememberMe() {
        driver.findElement(By.name("checked")).click();
    }

    private void clickLoginButton() {
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
    }

    public boolean isConcurrentLoginDialogDisplayed() {
        return driver.findElement(By.xpath("//h2[contains(text(),'Concurrent Login Detected')]")).isDisplayed();
    }

    private void useNewSessionButton() {
        driver.findElement(By.xpath("//button[contains(text(),'Use New Session')]")).click();
    }
}

