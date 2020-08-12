package test_Scripts;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page_Object.LandingPage;

import java.util.ArrayList;
import java.util.List;

public class VerifyWindow extends DriverWrapper{



    @Test
    public void testWindow() throws InterruptedException {
        LandingPage landingPage = new LandingPage();

        getDriver().findElement(By.cssSelector("#privacy_link")).click();
        Thread.sleep(2000);
        landingPage.switchToWindow(1);
        Thread.sleep(2000);
        getDriver().findElement(By.linkText("Sign Up")).click();
        Thread.sleep(2000);
        landingPage.switchToRootWindow ();

    }
}