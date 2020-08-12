package test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_Object.LandingPage;

public class VerifyLoginButtonDisplayed extends DriverWrapper {

    @Test
    public void testLoginButton() {

        LandingPage landingPage = new LandingPage();
        Assert.assertTrue(landingPage.isLoginButtonDisplayed());


        }
    }
