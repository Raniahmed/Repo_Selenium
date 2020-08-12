package test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class VerifyBirthDay extends DriverWrapper {

    @Test
    public void verifyBirthday() throws InterruptedException {

        WebElement month = getDriver().findElement(By.id("month"));
        Select monthDroppdown = new Select(month);
//        monthDroppdown.selectByVisibleText("Jan");
//        Thread.sleep(3000);
//        monthDroppdown.selectByIndex(5);
          Thread.sleep(3000);

        List<WebElement> options = monthDroppdown.getOptions();
        boolean isFound = false;
        for (WebElement option : options){
            if (option.getText().equals("Jan")){
                isFound = true;
                break;
            }
        }
        Assert.assertTrue(isFound, "Error: value is not found");

    }
}
