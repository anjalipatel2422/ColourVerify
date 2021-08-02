package org.example;

import org.openqa.selenium.By;

public class Utils extends BasePage
{
    // method for Store the URL value in String
    public static String getURL(){return driver.getCurrentUrl();}

    // method for Clicking action
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    // method for store the text value in string
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    // method for enter the text in the box
    public static void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    // this explicitly wait method to allow some extra time before action
}
