package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {


    // This method will click on element

    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();

    }

    /**
     * This Method will get text from element
     */

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * this method will send text on element
     */

    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void sendTextToElement(By by, int num) {
        driver.findElement(by).sendKeys("num");
    }

    // selectByVisibleTextFromDropDown(By by , String text)
    public static void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);
    }

    // selectByIndexFromDropDown(By by , int index)
    public void selectByIndexFromDropDown(By by, int index) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByIndex(index);

    }


    //mouseHoverToELementAndClick(By by){}
    public void mouseHoverAndClick(By by) {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(by);
        actions.moveToElement(element).click().perform();

    }

    public void assertMethod(String expected, By by) {
        String actualText = driver.findElement(by).getText();
        Assert.assertEquals(expected, actualText);
    }
}
