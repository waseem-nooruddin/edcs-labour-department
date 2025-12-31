package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    private final WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterSignUpButton() {
        singUpButton();
    }


    private void singUpButton() {
        driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
    }

    public boolean isBusinessDetailsDisplayed() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/span/span[2]")).isDisplayed();
    }

    public boolean isEOwnersProprietorsDetailsDisplayed() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div/div[3]/span/span[2]/span")).isDisplayed();
    }

    public boolean isSignUpDisplayed() {
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/h3")).isDisplayed();
    }
}
