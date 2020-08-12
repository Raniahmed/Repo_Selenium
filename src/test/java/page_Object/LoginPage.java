package page_Object;

import org.openqa.selenium.By;

    public class LoginPage extends BasePage {

        //Locators
        private By loginError = By.xpath("//input[@id='email']");

        //Methods
        public String getErrorMessage() {
            return getValueFromElement(loginError);
        }


    }

