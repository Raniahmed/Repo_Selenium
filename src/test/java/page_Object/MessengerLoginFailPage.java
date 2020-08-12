package page_Object;

import org.openqa.selenium.By;


public class MessengerLoginFailPage extends BasePage {
    private By blankSignInError = By.xpath("//div[contains(text(),'The email or phone number you')]')]");

    public String getBlankSignInError(){
        return getValueFromElement(blankSignInError);

    }





        }


