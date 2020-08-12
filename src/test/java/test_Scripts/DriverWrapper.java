package test_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverWrapper {
    private static WebDriver driver;
    private static String url = "https://www.facebook.com/";
   // private static String alurtUrl = "https://www.w3schools.com/JAVA/default.asp";

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","/Users/raniahmed/Resources/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to(url);
    }


    @AfterClass
    public void afterClass(){
        driver.quit();
    }
    public static WebDriver getDriver(){
        return driver;
    }
     public static String geturl(){
        return geturl();
    }

    public static void syncwait(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
