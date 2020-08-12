package test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_Object.LandingPage;
import page_Object.LoginPage;

public class VerifyInvelidLogin extends DriverWrapper {

    @Test
    public void VerifyInvelidLogin (){
        LoginPage loginPage = new LoginPage();
        LandingPage landingPage = new LandingPage();

        landingPage.enterEmail("doorattttr@yahoo.com");
        landingPage.enterPassword("rani1998");
        landingPage.clickLoginButton();

        loginPage.getErrorMessage();
        Assert.assertEquals("Recover your account",loginPage.getErrorMessage());
    }
}
