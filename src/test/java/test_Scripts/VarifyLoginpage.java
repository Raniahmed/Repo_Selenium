package test_Scripts;

import org.testng.Assert;
import page_Object.LandingPage;
import org.testng.annotations.Test;
import page_Object.LoginPage;

public class VarifyLoginpage extends DriverWrapper {


    @Test
    public void VerifyLoginpage() {
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();

        landingPage.enterEmail("raniferdoussr@gmail.com");
        landingPage.enterPassword("test12345");
        landingPage.enterFirstName("Ferdous");
        landingPage.enterLastName("Nargis");
        landingPage.enterMobileorEmail("9738654398");
        landingPage.enterNewPassword("rani1234");
        landingPage.clickSignUpButton();
        landingPage.clickLoginButton();
        Assert.assertEquals("Recover your account", loginPage.getErrorMessage());


    }


}