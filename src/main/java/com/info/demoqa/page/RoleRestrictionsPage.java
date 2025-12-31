package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RoleRestrictionsPage {
    private final WebDriver driver;

    public RoleRestrictionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterUserRoles(String userRoleId) {
        SelectUserRoles(userRoleId);
    }

    public void ClickOnCheckBox() {
        ClickCheckBox();
    }

    public void EnterSubmit(String buttonText) {
        ClickSubmit(buttonText);
    }

    private void SelectUserRoles(String userRoleId) {
        driver.findElement(By.id("userRoleId")).sendKeys(userRoleId);
    }

    private void ClickCheckBox() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[1]")).click();
    }

    private void ClickSubmit(String buttonText) {
        driver.findElement(By.xpath("//button[normalize-space()='" + buttonText + "']")).click();
    }


}
