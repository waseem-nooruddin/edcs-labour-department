package com.info.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavBarPage {
    private final WebDriver driver;

    public NavBarPage(WebDriver driver) {
        this.driver = driver;
    }

    // Navbar Locators - All menu items from the Digital EPF sidebar
    private final By employeeRegistration = By.xpath("//a[@href='/labour-depf-fe/employee/employeereg']");
    private final By changePassword = By.xpath("//a[@href='/labour-depf-fe/hr/user-management/password-change']");
    private final By employeeApprovalCompany = By.xpath("//a[@href='/labour-depf-fe/home/employeeapproval']");
    private final By dashboardCompany = By.xpath("//a[@href='/labour-depf-fe/home/employer']");
    private final By editProfile = By.xpath("//a[@href='/labour-depf-fe/hr/user-management/edit-profile']");
    private final By dashboardMember = By.xpath("//a[@href='/labour-depf-fe/home/employee']");
    private final By dashboardBranch = By.xpath("//a[@href='/labour-depf-fe/home/superadmin']");
    private final By adminApproval = By.xpath("//a[@href='/labour-depf-fe/home/adminapproval']");
    private final By companyVerifyApprove = By.xpath("//a[@href='/labour-depf-fe/home/companyapproval']");
    private final By employeeApprovalComp = By.xpath("//a[@href='/labour-depf-fe/home/employeeapprovalcomp']");
    private final By employerAmendmentsApproval = By.xpath("//a[@href='/labour-depf-fe/home/employerAmendmentApproval']");
    private final By employeeAmendmentsApproval = By.xpath("//a[@href='/labour-depf-fe/home/employeeAmendmentApproval']");
    private final By employeeManageCompanies = By.xpath("//a[.//h6[normalize-space()='Manage Companies']]");
    private final By UserManagement = By.xpath("//*[@id=\"root\"]/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul[2]/div[2]");
    private final By User = By.xpath("//a[@href=\"/labour-depf-fe/hr/user-management/users\"]");
    private final By UserRestrictions = By.xpath("//a[@href='/labour-depf-fe/hr/user-management/user-restriction']");
    private final By Roles = By.xpath("//a[@href='/labour-depf-fe/hr/user-management/role-creation']");
    private final By RoleRestrictions = By.xpath("//a[contains(@href,'role-restriction')]");
    private final By ManageDirectors = By.xpath("//a[@href='/labour-depf-fe/employer/managedirectors']");
    private final By AssignMultipleBranches = By.xpath("//a[@href='/labour-depf-fe/hr/user-management/multiple-branches']");
    private final By UserAuthorizations = By.xpath("//a[normalize-space()='User Authorizations']");
    private final By employeeProfile = By.xpath("//a[.//h6[normalize-space()='Employee Profile']]");
    private final By employeeCompanyHistoryList = By.xpath("//a[@href='/labour-depf-fe/employee/employeeHistory']");
    private final By bankAccountDetails = By.xpath("//a[@href='/labour-depf-fe/employee/BankAccDetails']");
    private final By ManageNominees = By.xpath("//a[@href='/labour-depf-fe/employee/Addnominees']");
    private final By Refunds = By.xpath("//a[@href='/labour-depf-fe/transaction/AddRefund']");
    private final By EmployerAmendments = By.xpath("//a[@href='/labour-depf-fe/amendment/request-amendments']");
    private final By EmployeeAmendments = By.xpath("//a[@href='/labour-depf-fe/amendment/employeeRequestAmendments'][1]");
    private final By Integration_CompanyDetails = By.xpath(" //a[@href='/labour-depf-fe/oracleSystem/companyList']");
    private final By Integration_MemberDetails = By.xpath("//*[@href='/labour-depf-fe/oracleSystem/memberDetails']");
    private final By Integration_MemberHistory = By.xpath("//*[@href='/labour-depf-fe/oracleSystem/memberHistory']");
    private final By ClaimsIntegration = By.xpath("//*[@href='/labour-depf-fe/oracleSystem/claims']");
    private final By DocumentType = By.xpath("//*[@href='/labour-depf-fe/documents/documentType']");
    private final By DocumentOperations = By.xpath("//*[@href='/labour-depf-fe/documents/DocumentOperationList']");
    private final By DocumentMapping = By.xpath("//*[@href='/labour-depf-fe/documents/DocumentMappingList']");
    private final By DocumentUploadMapping = By.xpath("//*[@href='/labour-depf-fe/documents/DocumentUploadMapping']");
    private final By DocumentUploadTypes = By.xpath("//*[@href='/labour-depf-fe/documents/DocumentUploadTypes']");

    private final By ApplicationManagement = By.xpath("//div[@role='button' and .//h6[normalize-space()='Application Management']]");
    private final By GlobalConfigurations = By.xpath("//a[@href='/labour-depf-fe/app/application-management/global']");
    private final By Menus = By.xpath("//a[@href='/labour-depf-fe/app/application-management/menu-action-list']");

    // Getter methods for all navbar elements
    public WebElement getEmployeeRegistration() {
        return driver.findElement(employeeRegistration);
    }

    public WebElement getChangePassword() {
        return driver.findElement(changePassword);
    }

    public WebElement getEmployeeApprovalCompany() {
        return driver.findElement(employeeApprovalCompany);
    }

    public WebElement getDashboardCompany() {
        return driver.findElement(dashboardCompany);
    }

    public WebElement getEditProfile() {
        return driver.findElement(editProfile);
    }

    public WebElement getDashboardMember() {
        return driver.findElement(dashboardMember);
    }

    public WebElement getDashboardBranch() {
        return driver.findElement(dashboardBranch);
    }

    public WebElement getAdminApproval() {
        return driver.findElement(adminApproval);
    }

    public WebElement getCompanyVerifyApprove() {
        return driver.findElement(companyVerifyApprove);
    }

    public WebElement getEmployeeApprovalComp() {
        return driver.findElement(employeeApprovalComp);
    }

    public WebElement getEmployerAmendmentsApproval() {
        return driver.findElement(employerAmendmentsApproval);
    }

    public WebElement getEmployeeAmendmentsApproval() {
        return driver.findElement(employeeAmendmentsApproval);
    }

    public WebElement getManageCompanies() {
        return driver.findElement(employeeManageCompanies);
    }

    public WebElement getUserManagement() {
        return driver.findElement(UserManagement);
    }

    public WebElement getUser() {
        return driver.findElement(User);
    }

    public WebElement getUserRestrictions() {
        return driver.findElement(UserRestrictions);
    }

    public WebElement getRoles() {
        return driver.findElement(Roles);
    }

    public WebElement getRoleRestrictions() {
        return driver.findElement(RoleRestrictions);
    }

    public WebElement getManageDirectors() {
        return driver.findElement(ManageDirectors);
    }

    public WebElement getAssignMultipleBranches() {
        return driver.findElement(AssignMultipleBranches);
    }

    public WebElement getUserAuthorizations() {
        return driver.findElement(UserAuthorizations);
    }

    public WebElement getEmployeeProfile() {
        return driver.findElement(employeeProfile);
    }

    public WebElement getEmployeeCompanyHistoryList() {
        return driver.findElement(employeeCompanyHistoryList);
    }

    public WebElement getBankAccountDetails() {
        return driver.findElement(bankAccountDetails);
    }

    public WebElement getManageNominees() {
        return driver.findElement(ManageNominees);
    }

    public WebElement getRefunds() {
        return driver.findElement(Refunds);
    }

    //Amendments
    public WebElement getEmployerAmendments() {
        return driver.findElement(EmployerAmendments);
    }

    public WebElement getEmployeeAmendments() {
        return driver.findElement(EmployeeAmendments);
    }


    //Integration
    public WebElement getIntegration_CompanyDetails() {
        return driver.findElement(Integration_CompanyDetails);
    }

    public WebElement getMemberDetails() {
        return driver.findElement(Integration_MemberDetails);
    }

    public WebElement getMemberHistory() {
        return driver.findElement(Integration_MemberHistory);
    }

    public WebElement getClaimsIntegration() {
        return driver.findElement(ClaimsIntegration);
    }

    //Document Management
    public WebElement getDocumentType() {
        return driver.findElement(DocumentType);
    }

    public WebElement getDocumentOperations() {
        return driver.findElement(DocumentOperations);
    }

    public WebElement getDocumentMapping() {
        return driver.findElement(DocumentMapping);
    }

    public WebElement getDocumentUploadMapping() {
        return driver.findElement(DocumentUploadMapping);
    }

    public WebElement getDocumentUploadTypes() {
        return driver.findElement(DocumentUploadTypes);
    }
//Application Management

    public WebElement getApplicationManagement() {
        return driver.findElement(ApplicationManagement);
    }

    public WebElement getGlobalConfigurations() {
        return driver.findElement(GlobalConfigurations);
    }

    public WebElement getMenus() {
        return driver.findElement(Menus);
    }


    // Click methods for easy navigation
    public void clickEmployeeRegistration() {
        getEmployeeRegistration().click();
    }

    public void clickChangePassword() {
        getChangePassword().click();
    }

    public void clickEmployeeApprovalCompany() {
        getEmployeeApprovalCompany().click();
    }

    public void clickDashboardCompany() {
        getDashboardCompany().click();
    }

    public void clickEditProfile() {
        getEditProfile().click();
    }

    public void clickDashboardMember() {
        getDashboardMember().click();
    }

    public void clickDashboardBranch() {
        getDashboardBranch().click();
    }

    public void clickAdminApproval() {
        getAdminApproval().click();
    }

    public void clickCompanyVerifyApprove() {
        getCompanyVerifyApprove().click();
    }

    public void clickEmployeeApprovalComp() {
        getEmployeeApprovalComp().click();
    }

    public void clickEmployerAmendmentsApproval() {
        getEmployerAmendmentsApproval().click();
    }

    public void clickEmployeeAmendmentsApproval() {
        getEmployeeAmendmentsApproval().click();
    }

    public void clickRefunds() {
        getRefunds().click();
    }

    public void clickManageCompanies() {
        getManageCompanies().click();
    }

    public void clickgetUserManagement() {
        getUserManagement().click();
    }

    public void clickUser() {
        getUser().click();
    }

    public void clickUserAuthorizations() {
        getUserAuthorizations().click();
    }

    public void clickUserRestrictions() {
        getUserRestrictions().click();
    }

    public void clickRoles() {
        getRoles().click();
    }

    public void clickRoleRestrictions() {
        getRoleRestrictions().click();
    }

    public void clickManageDirectors() {
        getManageDirectors().click();
    }

    public void clickAssignMultipleBranches() {
        getAssignMultipleBranches().click();
    }

    public void clickEmployeeProfile() {
        getEmployeeProfile().click();
    }

    public void employeeCompanyHistoryList() {
        getEmployeeCompanyHistoryList().click();
    }

    public void clickBankAccountDetails() {
        getBankAccountDetails().click();
    }

    public void clickManageNominees() {
        getManageNominees().click();
    }

    public void clickEmployerAmendments() {
        getEmployerAmendments().click();
    }

    public void clickEmployeeAmendments() {
        getEmployeeAmendments().click();
    }

    //Integration
    public void clickCompanyDetailsIntegration() {
        getIntegration_CompanyDetails().click();
    }

    public void clickMemberDetails() {
        getMemberDetails().click();
    }

    public void clickMemberHistory() {
        getMemberHistory().click();
    }

    public void clickClaimsIntegration() {
        getClaimsIntegration().click();
    }

    //Document Management
    public void clickDocumentType() {
        getDocumentType().click();
    }

    public void clickDocumentOperations() {
        getDocumentOperations().click();
    }

    public void clickDocumentMapping() {
        getDocumentMapping().click();
    }

    public void clickDocumentUploadMapping() {
        getDocumentUploadMapping().click();
    }

    public void clickDocumentUploadTypes() {
        getDocumentUploadTypes().click();
    }

    //Application Management
    public void clickApplicationManagement() {
        getApplicationManagement().click();
    }

    public void clickGlobalConfigurations() {
        getGlobalConfigurations().click();
    }

    public void clickMenus() {
        getMenus().click();
    }



    // Dynamic locator method for scalability
    // Use this method to navigate to any menu item by its visible text
    public void navigateToMenu(String menuName) {
        String xpath = "//h6[text()='" + menuName + "']/ancestor::a";
        driver.findElement(By.xpath(xpath)).click();
    }

    // Alternative dynamic method using contains for partial text matching
    public void navigateToMenuContains(String partialMenuName) {
        String xpath = "//h6[contains(text(),'" + partialMenuName + "')]/ancestor::a";
        driver.findElement(By.xpath(xpath)).click();
    }
}
