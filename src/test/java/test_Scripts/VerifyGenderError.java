package test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_Object.LandingPage;

public class VerifyGenderError extends DriverWrapper {

    @Test
    public void verifyGenderError(){
        LandingPage landingPage = new LandingPage();


        landingPage.enterFirstName("firstname");
        landingPage.enterLastName("lastname");
        landingPage.enterMobileorEmail("1234534");
        landingPage.enterNewPassword("test12345");
        landingPage.clickSignUpButton();
        String expGenderError = "Please choose a gender.You can change who can see this later  ";
        //Assert.assertEquals(landingPage.getGenderErrorMsg(),expGenderError,"Gender error is not as expected");
    }
}
