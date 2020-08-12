package test_Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifyAlert extends DriverWrapper {

    @Test

    public void verifyAlert(){

        syncwait(2000);
        getDriver().findElement(By.xpath("")).click();



    }
}
