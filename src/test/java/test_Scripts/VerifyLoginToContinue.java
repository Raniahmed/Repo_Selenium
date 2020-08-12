package test_Scripts;

import page_Object.LandingPage;
import org.testng.annotations.Test;

public class VerifyLoginToContinue extends DriverWrapper {

    @Test
    public void testVerifyLoginToContinue(){

        LandingPage landingPage = new LandingPage();

        landingPage.clickAboutLink();


    }
}
