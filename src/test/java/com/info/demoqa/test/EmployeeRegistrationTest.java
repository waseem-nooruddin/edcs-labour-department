package com.info.demoqa.test;

import com.info.demoqa.page.EmployeeRegistrationPage;
import com.info.demoqa.page.NavBarPage;
import com.info.demoqa.util.PropertyFileReader;
import com.maxsoft.testngtestresultsanalyzer.annotations.Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeRegistrationTest extends BaseTest {

    @Test(description = "Verify navigation to Employee Registration page")
    @Category("Employee Registration")
    public void TestCase_9() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        navBarPage.clickEmployeeRegistration();

        Assert.assertTrue(driver.getCurrentUrl().contains("/employee/employeereg"),
                "Should navigate to Employee Registration page");
        System.out.println("✓ Successfully navigated to Employee Registration page!");
    }

    @Test(description = "Verify that an unmarried employee’s information can be entered correctly in the Employee Registration form")
    @Category("Employee Registration")
    public void TestCase_10() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        EmployeeRegistrationPage employeeRegistrationPage = new EmployeeRegistrationPage(driver);
        navBarPage.clickEmployeeRegistration();

        Assert.assertTrue(driver.getCurrentUrl().contains("/employee/employeereg"),
                "Should navigate to Employee Registration page");
        System.out.println("✓ Successfully navigated to Employee Registration page!");

        employeeRegistrationPage.EnterEmployeeForm();
        // employeeRegistrationPage.SelectExistingEmployee("No");
        // employeeRegistrationPage.SelectIdentityType("NIC");
        employeeRegistrationPage.EnterEnterNIC(PropertyFileReader.getUserData("nic"));
        System.out.println("✓ EnterEnterNIC!");
        employeeRegistrationPage.addDateOfBirth(PropertyFileReader.getUserData("date_of_birth"));
        System.out.println("✓ addDateOfBirth!");
        employeeRegistrationPage.ClickValidateButton();
        System.out.println("✓ ClickValidateButton!");
        employeeRegistrationPage.AddMemberNumber(PropertyFileReader.getUserData("member_number"));
        System.out.println("✓ Member Number entered!");
        employeeRegistrationPage.AddNationalityDropDown();
        System.out.println("✓ Nationality selected!");
        employeeRegistrationPage.AddGender(PropertyFileReader.getUserData("Gender"));
        System.out.println("✓ Gender selected!");
        employeeRegistrationPage.EnterFullNam(PropertyFileReader.getUserData("full_name"));
        System.out.println("✓ Full name entered!");
        employeeRegistrationPage.EnterNameWithInitials(PropertyFileReader.getUserData("name_with_initials"));
        System.out.println("✓ Name With Initials entered!");
        employeeRegistrationPage.EnterPlaceOfBirth(PropertyFileReader.getUserData("place_of_birth"));
        System.out.println("✓ Date Of Birth entered!");
        employeeRegistrationPage.EnterContactNumber(PropertyFileReader.getUserData("contact_number"));
        System.out.println("✓ Enter Contact Number selected!");
        employeeRegistrationPage.EnterEmail(PropertyFileReader.getUserData("Email"));
        System.out.println("✓ EnterEmail!");
        employeeRegistrationPage.EnterCivilStatus(PropertyFileReader.getUserData("civil_status"));
        System.out.println("✓ Civil Status selected!");
        employeeRegistrationPage.EnterMotherName(PropertyFileReader.getUserData("mother_name"));
        System.out.println("✓ EnterMotherName!");
        employeeRegistrationPage.EnterMotherBirthPlace(PropertyFileReader.getUserData("mother_birth_place"));
        System.out.println("✓ EnterMotherBirthPlace!");
        employeeRegistrationPage.EnterFathersName(PropertyFileReader.getUserData("father_name"));
        System.out.println("✓ EnterFathersName!");
        employeeRegistrationPage.EnterFatherBirthPlace(PropertyFileReader.getUserData("father_birth_place"));
        System.out.println("✓ EnterFatherBirthPlace!");
        //employeeRegistrationPage.EnterSpouseName(PropertyFileReader.getUserData("spouse_name"));
        System.out.println("✓ EnterSpouseName!");
        employeeRegistrationPage.EnterProvince(PropertyFileReader.getUserData("province"));
        System.out.println("✓ EnterProvince!");
        employeeRegistrationPage.EnterDistrictId(PropertyFileReader.getUserData("district"));
        System.out.println("✓ EnterDistrictId!");
        employeeRegistrationPage.EnterCity(PropertyFileReader.getUserData("city"));
        System.out.println("✓ EnterCity!");
        employeeRegistrationPage.EnterAddressNo(PropertyFileReader.getUserData("address_no"));
        System.out.println("✓ EnterAddressNo!");
        employeeRegistrationPage.EnterStreetName(PropertyFileReader.getUserData("street_name"));
        System.out.println("✓ EnterStreetName!");
        employeeRegistrationPage.Enterdesignation(PropertyFileReader.getUserData("designation"));
        System.out.println("✓ Enterdesignation!");
        employeeRegistrationPage.EnterSalary(PropertyFileReader.getUserData("salary"));
        System.out.println("✓ EnterSalary!");
        employeeRegistrationPage.EnterSalaryType(PropertyFileReader.getUserData("salary_type"));
        System.out.println("✓ EnterSalaryType!");
        employeeRegistrationPage.EnterDateEmployed(PropertyFileReader.getUserData("date_employed"));
        System.out.println("✓ EnterDateEmployed");
        employeeRegistrationPage.SelectSubmitOrCancelButton("Submit");
        System.out.println("✓ SelectSubmitOrCancelButton!");

        Assert.assertTrue(employeeRegistrationPage.isValidationSuccessful());
        Assert.assertTrue(employeeRegistrationPage.isValidationDateOfBirth());
        Assert.assertTrue(employeeRegistrationPage.isValidationNIC());
    }

    @Test(description = "Verify that a married employee’s information can be entered correctly in the Employee Registration form.")
    @Category("Employee Registration")
    public void TestCase_11() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        EmployeeRegistrationPage employeeRegistrationPage = new EmployeeRegistrationPage(driver);
        navBarPage.clickEmployeeRegistration();

        Assert.assertTrue(driver.getCurrentUrl().contains("/employee/employeereg"),
                "Should navigate to Employee Registration page");
        System.out.println("✓ Successfully navigated to Employee Registration page!");

        employeeRegistrationPage.EnterEmployeeForm();
        // employeeRegistrationPage.SelectExistingEmployee("No");
        // employeeRegistrationPage.SelectIdentityType("NIC");
        employeeRegistrationPage.EnterEnterNIC(PropertyFileReader.getUserData("nic"));
        System.out.println("✓ EnterEnterNIC!");
        employeeRegistrationPage.addDateOfBirth(PropertyFileReader.getUserData("date_of_birth"));
        System.out.println("✓ addDateOfBirth!");
        employeeRegistrationPage.ClickValidateButton();
        System.out.println("✓ ClickValidateButton!");
        employeeRegistrationPage.AddMemberNumber(PropertyFileReader.getUserData("member_number"));
        System.out.println("✓ Member Number entered!");
        employeeRegistrationPage.AddNationalityDropDown();
        System.out.println("✓ Nationality selected!");
        employeeRegistrationPage.AddGender(PropertyFileReader.getUserData("Gender"));
        System.out.println("✓ Gender selected!");
        employeeRegistrationPage.EnterFullNam(PropertyFileReader.getUserData("full_name"));
        System.out.println("✓ Full name entered!");
        employeeRegistrationPage.EnterNameWithInitials(PropertyFileReader.getUserData("name_with_initials"));
        System.out.println("✓ Name With Initials entered!");
        employeeRegistrationPage.EnterPlaceOfBirth(PropertyFileReader.getUserData("place_of_birth"));
        System.out.println("✓ Date Of Birth entered!");
        employeeRegistrationPage.EnterContactNumber(PropertyFileReader.getUserData("contact_number"));
        System.out.println("✓ Enter Contact Number selected!");
        employeeRegistrationPage.EnterEmail(PropertyFileReader.getUserData("Email"));
        System.out.println("✓ EnterEmail!");
        employeeRegistrationPage.EnterCivilStatus(PropertyFileReader.getUserData("civil_status_married"));
        System.out.println("✓ Civil Status selected!");
        employeeRegistrationPage.EnterMotherName(PropertyFileReader.getUserData("mother_name"));
        System.out.println("✓ EnterMotherName!");
        employeeRegistrationPage.EnterMotherBirthPlace(PropertyFileReader.getUserData("mother_birth_place"));
        System.out.println("✓ EnterMotherBirthPlace!");
        employeeRegistrationPage.EnterFathersName(PropertyFileReader.getUserData("father_name"));
        System.out.println("✓ EnterFathersName!");
        employeeRegistrationPage.EnterFatherBirthPlace(PropertyFileReader.getUserData("father_birth_place"));
        System.out.println("✓ EnterFatherBirthPlace!");
        employeeRegistrationPage.EnterSpouseName(PropertyFileReader.getUserData("spouse_name"));
        System.out.println("✓ EnterSpouseName!");
        employeeRegistrationPage.EnterProvince(PropertyFileReader.getUserData("province"));
        System.out.println("✓ EnterProvince!");
        employeeRegistrationPage.EnterDistrictId(PropertyFileReader.getUserData("district"));
        System.out.println("✓ EnterDistrictId!");
        employeeRegistrationPage.EnterCity(PropertyFileReader.getUserData("city"));
        System.out.println("✓ EnterCity!");
        employeeRegistrationPage.EnterAddressNo(PropertyFileReader.getUserData("address_no"));
        System.out.println("✓ EnterAddressNo!");
        employeeRegistrationPage.EnterStreetName(PropertyFileReader.getUserData("street_name"));
        System.out.println("✓ EnterStreetName!");
        employeeRegistrationPage.Enterdesignation(PropertyFileReader.getUserData("designation"));
        System.out.println("✓ Enterdesignation!");
        employeeRegistrationPage.EnterSalary(PropertyFileReader.getUserData("salary"));
        System.out.println("✓ EnterSalary!");
        employeeRegistrationPage.EnterSalaryType(PropertyFileReader.getUserData("salary_type"));
        System.out.println("✓ EnterSalaryType!");
        employeeRegistrationPage.EnterDateEmployed(PropertyFileReader.getUserData("date_employed"));
        System.out.println("✓ EnterDateEmployed");
        employeeRegistrationPage.SelectSubmitOrCancelButton("Submit");
        System.out.println("✓ SelectSubmitOrCancelButton!");

        Assert.assertTrue(employeeRegistrationPage.isValidationSuccessful());
        Assert.assertTrue(employeeRegistrationPage.isValidationDateOfBirth());
        Assert.assertTrue(employeeRegistrationPage.isValidationNIC());

    }

    /*@Test(description = "Verify that a existing employee registration can be completed successfully.")
    @Category("Employee Registration")
    public void TestCase_12() {
        fullLogin();
        NavBarPage navBarPage = new NavBarPage(driver);
        EmployeeRegistrationPage employeeRegistrationPage = new EmployeeRegistrationPage(driver);
        navBarPage.clickEmployeeRegistration();

        Assert.assertTrue(driver.getCurrentUrl().contains("/employee/employeereg"),
                "Should navigate to Employee Registration page");
        System.out.println("✓ Successfully navigated to Employee Registration page!");

        employeeRegistrationPage.EnterEmployeeForm();
        employeeRegistrationPage.SelectExistingEmployee("Yes");
        // employeeRegistrationPage.SelectIdentityType("NIC");
        employeeRegistrationPage.EnterEnterNIC(PropertyFileReader.getUserData("nic"));
        System.out.println("✓ EnterEnterNIC!");
        employeeRegistrationPage.addDateOfBirth(PropertyFileReader.getUserData("date_of_birth"));
        System.out.println("✓ addDateOfBirth!");
        employeeRegistrationPage.ClickValidateButton();
        System.out.println("✓ ClickValidateButton!");
        employeeRegistrationPage.AddMemberNumber(PropertyFileReader.getUserData("member_number"));
        System.out.println("✓ Member Number entered!");
        employeeRegistrationPage.AddNationalityDropDown();
        System.out.println("✓ Nationality selected!");
        employeeRegistrationPage.AddGender(PropertyFileReader.getUserData("Gender"));
        System.out.println("✓ Gender selected!");
        employeeRegistrationPage.EnterFullNam(PropertyFileReader.getUserData("full_name"));
        System.out.println("✓ Full name entered!");
        employeeRegistrationPage.EnterNameWithInitials(PropertyFileReader.getUserData("name_with_initials"));
        System.out.println("✓ Name With Initials entered!");
        employeeRegistrationPage.EnterPlaceOfBirth(PropertyFileReader.getUserData("place_of_birth"));
        System.out.println("✓ Date Of Birth entered!");
        employeeRegistrationPage.EnterContactNumber(PropertyFileReader.getUserData("contact_number"));
        System.out.println("✓ Enter Contact Number selected!");
        employeeRegistrationPage.EnterEmail(PropertyFileReader.getUserData("Email"));
        System.out.println("✓ EnterEmail!");
        employeeRegistrationPage.EnterCivilStatus(PropertyFileReader.getUserData("civil_status_married"));
        System.out.println("✓ Civil Status selected!");
        employeeRegistrationPage.EnterMotherName(PropertyFileReader.getUserData("mother_name"));
        System.out.println("✓ EnterMotherName!");
        employeeRegistrationPage.EnterMotherBirthPlace(PropertyFileReader.getUserData("mother_birth_place"));
        System.out.println("✓ EnterMotherBirthPlace!");
        employeeRegistrationPage.EnterFathersName(PropertyFileReader.getUserData("father_name"));
        System.out.println("✓ EnterFathersName!");
        employeeRegistrationPage.EnterFatherBirthPlace(PropertyFileReader.getUserData("father_birth_place"));
        System.out.println("✓ EnterFatherBirthPlace!");
        employeeRegistrationPage.EnterSpouseName(PropertyFileReader.getUserData("spouse_name"));
        System.out.println("✓ EnterSpouseName!");
        employeeRegistrationPage.EnterProvince(PropertyFileReader.getUserData("province"));
        System.out.println("✓ EnterProvince!");
        employeeRegistrationPage.EnterDistrictId(PropertyFileReader.getUserData("district"));
        System.out.println("✓ EnterDistrictId!");
        employeeRegistrationPage.EnterCity(PropertyFileReader.getUserData("city"));
        System.out.println("✓ EnterCity!");
        employeeRegistrationPage.EnterAddressNo(PropertyFileReader.getUserData("address_no"));
        System.out.println("✓ EnterAddressNo!");
        employeeRegistrationPage.EnterStreetName(PropertyFileReader.getUserData("street_name"));
        System.out.println("✓ EnterStreetName!");
        employeeRegistrationPage.Enterdesignation(PropertyFileReader.getUserData("designation"));
        System.out.println("✓ Enterdesignation!");
        employeeRegistrationPage.EnterSalary(PropertyFileReader.getUserData("salary"));
        System.out.println("✓ EnterSalary!");
        employeeRegistrationPage.EnterSalaryType(PropertyFileReader.getUserData("salary_type"));
        System.out.println("✓ EnterSalaryType!");
        employeeRegistrationPage.EnterDateEmployed(PropertyFileReader.getUserData("date_employed"));
        System.out.println("✓ EnterDateEmployed");
        employeeRegistrationPage.SelectSubmitOrCancelButton("Submit");
        System.out.println("✓ SelectSubmitOrCancelButton!");

        Assert.assertTrue(employeeRegistrationPage.isValidationSuccessful());
        Assert.assertTrue(employeeRegistrationPage.isValidationDateOfBirth());
        Assert.assertTrue(employeeRegistrationPage.isValidationNIC());

    }*/
}