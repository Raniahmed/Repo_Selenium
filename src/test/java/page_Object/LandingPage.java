package page_Object;

import org.openqa.selenium.By;
import test_Scripts.DriverWrapper;
import test_Scripts.VerifyGenderError;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static test_Scripts.DriverWrapper.getDriver;

public class LandingPage extends BasePage {

    //Locators
    private By emailTextField = By.id("email");
    private By passTextField = By.id("pass");
    private By loginButton = By.id("u_0_b");
    private By firstName = By.xpath("//input[@id='u_0_m']");
    private By lastName = By.xpath("//input[@id='u_0_o']");
    private By mobileNum = By.xpath("//input[@id='u_0_r']");
    private By newPass = By.id("password_step_input");
    private By signUpButton = By.id("u_0_13");
    private By messengerLink = By.xpath("//a[contains(text(),'Messenger')]");
    private By aboutLink = By.xpath("//a[contains(text(),'About')]");
    private By maleLocator = By.id("u_0_7");
    private By monthLocator = By.id("month");
    private By emailError = By.xpath("//input[@id='email']");
    private By genderError = By.xpath("//div[@id='js_uz']");


    //Methods
    public void enterEmail(String value) {
        setValue(emailTextField, value);
    }

    public void enterPassword(String value) {
        setValue(passTextField, value);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    public void enterFirstName(String userFirstName) {
        setValue(firstName, userFirstName);
    }

    public void enterLastName(String userlastName) {
        setValue(lastName, userlastName);
    }

    public void enterMobileorEmail(String userMobileorEmail) {
        setValue(mobileNum, userMobileorEmail);
    }

    public void enterNewPassword(String userNewPassword) {
        setValue(newPass, userNewPassword);
    }

    public void clickSignUpButton() {
        clickOn(signUpButton);
    }

    public void clickMessengerLink() {
        clickOn(messengerLink);
    }

    public void clickAboutLink() {
        clickOn(aboutLink);
    }

    public boolean isLoginButtonDisplayed() {
        return IsElementDisplayed(loginButton);
    }

    public void selectMaleGender() {
        clickOn(maleLocator);
    }

    public boolean isMaleSelected() {
        return IsElementDisplayed(maleLocator);
    }

    public void selectMonth(String monthValue) {
        String month = monthValue;
        if (monthValue.equalsIgnoreCase("current")) {
            SimpleDateFormat monthFormate = new SimpleDateFormat("MMM");
            Date now = new Date();
            month = monthFormate.format(now);
        }
        selectByTextFromDropDown(monthLocator, month);
    }

    public boolean checkMonthContainsDuplicate() {
        Map<String, Integer> ifDuplicates = isDropDownHasDuplicates(monthLocator);
        boolean hasDuplicates = false;
        if (ifDuplicates.size() > 0) {
            System.out.println("Duplicates: " + ifDuplicates);
            return true;
        } else {
            return false;
        }

    }

    public boolean isInvalidErrorDisplayed() {
        return DriverWrapper.getDriver().findElement(emailError).isDisplayed();

    }

    public String getGenderErrorMsg() {
        return getValueFromElement(genderError);
    }


    public boolean IsMaleSelected() {
        return isElementSelected(maleLocator);
    }

    



}