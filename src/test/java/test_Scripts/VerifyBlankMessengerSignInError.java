package test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_Object.LandingPage;
import page_Object.MessengerLoginFailPage;
import page_Object.MessengerPage;

public class VerifyBlankMessengerSignInError extends DriverWrapper {

    @Test
    public void verifyInvalidMessengerError(){
        LandingPage landingPage = new LandingPage();
        MessengerPage messengerPage = new MessengerPage();
        MessengerLoginFailPage mLginFail = new MessengerLoginFailPage();

        landingPage.clickMessengerLink();
        messengerPage.clickSignInButton();
        String expErrorMsg = "Incorrect email address or phone number ";
        Assert.assertEquals(expErrorMsg,mLginFail.getBlankSignInError(),"Error message is not as expected");
    }
}
