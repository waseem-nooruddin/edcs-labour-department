package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BankAccountDetailsPage {

    private final WebDriver driver;
    public BankAccountDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterAddBankAccountDetails() {
        AddBankAccountDetails();
    }

    public void EnterAccountNo(String accountNo) {
        AddAccountNo(accountNo);
    }

    public void EnterAccountDescription(String description) {
        AddAccountDescription(description);

    }

    public void EnterBank(String bankDetailsId) {
        AddBank(bankDetailsId);
    }

    public void EnterBranchDetailsId(String branchDetailsId) {
        AddBranchDetailsId(branchDetailsId);
    }

    public void EnterSave() {
        ClickSave();
    }

    private void AddBankAccountDetails() {
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
    }

    private void AddAccountNo(String accountNo) {
        driver.findElement(By.id("accountNo")).sendKeys(accountNo);
    }

    private void AddAccountDescription(String description) {
        driver.findElement(By.id("description")).sendKeys(description);
    }

    private void AddBank(String bankDetailsId) {
        driver.findElement(By.id("bankDetailsId")).sendKeys(bankDetailsId);
        driver.findElement(By.id("bankDetailsId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("bankDetailsId")).sendKeys(Keys.ENTER);
    }

    private void AddBranchDetailsId(String branchDetailsId) {
        driver.findElement(By.id("branchDetailsId")).sendKeys(branchDetailsId);
        driver.findElement(By.id("branchDetailsId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("branchDetailsId")).sendKeys(Keys.ENTER);
    }

    private void ClickSave() {
        driver.findElement(By.xpath("//form//button[normalize-space()='Save']")).click();
    }

    public boolean isBankAccountDetailsPageLoadsAsExpected() {
        return driver.findElement(By.xpath("//h2[normalize-space()='Bank Account Details']")).isDisplayed();
    }
}
