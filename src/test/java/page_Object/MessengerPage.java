package page_Object;

import org.openqa.selenium.By;


public class MessengerPage extends BasePage {

    private By signInButton = By.id("loginbutton");

    public void clickSignInButton(){
        clickOn(signInButton);

    }


    }

