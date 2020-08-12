package test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_Object.LandingPage;

public class VerifyGenderSelected extends DriverWrapper {

    @Test

    public void verifyGenderSelected(){
        LandingPage landingPage = new LandingPage();
        landingPage.enterFirstName("wertyu");
        landingPage.enterLastName("sdghj");
        landingPage.enterMobileorEmail("123456789");
        landingPage.enterNewPassword("qwertyui");
        if(landingPage.IsMaleSelected() == false){
            landingPage.selectMaleGender();

        }
        Assert.assertTrue(landingPage.IsMaleSelected(),"Male radio button is not selected");
    }
}
