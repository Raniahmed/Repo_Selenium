package page_Object;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static test_Scripts.DriverWrapper.getDriver;

public class BasePage {

    public void clickOn(By locator) {
        getDriver().findElement(locator).click();

    }

    public void setValue(By locator, String value) {
        getDriver().findElement(locator).sendKeys(value);

    }

    public String getValueFromElement(By locator) {
        return getDriver().findElement(locator).getText();

    }

    public boolean IsElementDisplayed(By locator) {


        boolean IsDisplayed;

        try {
            IsDisplayed = getDriver().findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            IsDisplayed = false;

        }
        return IsDisplayed;

    }

    public boolean isElementSelected(By locator) {
        return getDriver().findElement(locator).isSelected();
    }

    public boolean isElementEnabled(By locator) {
        return getDriver().findElement(locator).isEnabled();
    }

    public void selectByTextFromDropDown(By locator, String text) {
        WebElement dropDownElement = getDriver().findElement(locator);
        Select dropDown = new Select(dropDownElement);
        dropDown.selectByVisibleText(text);
    }

    public void selectByValueFromDropDown(By locator, String value) {
        WebElement dropDwonElement = getDriver().findElement(locator);
        Select dropDown = new Select(dropDwonElement);
        dropDown.selectByValue(value);
    }

    public void selectByIndexFromDromDown(By locator, int index) {
        WebElement dropDownElement = getDriver().findElement(locator);
        Select dropDown = new Select(dropDownElement);
        dropDown.selectByIndex(index);
    }

    public Map<String, Integer> isDropDownHasDuplicates(By locator) {
        WebElement dropDownElement = getDriver().findElement(locator);
        Select dropDown = new Select(dropDownElement);
        List<WebElement> allOptionsElements = dropDown.getOptions();

        List<String> allValues = new ArrayList<>();
        for (WebElement option : allOptionsElements) {
            allValues.add(option.getText());
        }
        Map<String, Integer> duplicates = new HashMap<>();
        for (int i = 0; i < allValues.size() - 1; i++) {
            int count = 1;
            String val = allValues.get(i);
            if (!duplicates.containsKey(val)) {
                for (int j = i + 1; j <= allValues.size() - 1; j++) {
                    if (val.equalsIgnoreCase(allValues.get(j))) {
                        count++;
                    }
                }
            }
            if (count > 1) {
                duplicates.put(val, count);
            }
        }
        return duplicates;
    }

    public boolean isDropDownContainsValue(By locator,String valueToCheck){
        Map<String,Integer> duplicates = new HashMap<>();
        List<String> allValues = new ArrayList<>();
        WebElement dropDownElement = getDriver().findElement(locator);
        Select dropDown = new Select(dropDownElement);
        List<WebElement> allOptionsElements = dropDown.getOptions();

        for(WebElement option : allOptionsElements){
            allValues.add(option.getText().toLowerCase());

        }
        return allValues.contains(valueToCheck.toLowerCase());


    }

    public WebElement getElements(By locator){
        return getDriver().findElement(locator);
    }



    public void switchToWindow(int index) {
        List<String> windows = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windows.get(index));
    }

    public void switchToRootWindow() {
        List<String> windows = new ArrayList<>(getDriver().getWindowHandles());

        for (int i = 1; i < windows.size(); i++) {
            getDriver().switchTo().window(windows.get(i));
            getDriver().close();

        }

    }





        }















