package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class GearTest extends Utility {

    String baseUrl = "https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        mouseHoverAndClick(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/button[1]"));
        //* Mouse Hover on the ‘Gear’ Menu
        mouseHoverAndClick(By.xpath("//span[normalize-space()='Gear']"));
        //* Click on the ‘Bags’
        // mouseHoverAndClick(By.xpath("//ol[@class='items']//a[normalize-space()='Bags']"));
        mouseHoverAndClick(By.linkText("Bags"));
        // driver.findElement(By.xpath("//*[@id=\"narrow-by-list2\"]/dd/ol/li[1]/a"));

        //* Click on Product Name ‘Overnight Duffle’
        //mouseHoverAndClick(By.xpath("//a[normalize-space()='Overnight Duffle']"));
        //mouseHoverAndClick(By.linkText(" Overnight Duffle "));
        // driver.findElement(By.linkText("Overnight Duffle")).click();
        clickOnElement(By.linkText("Overnight Duffle"));
        //clickOnElement(By.className("product-item-link"));
        // driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[4]/ol/li[2]/div/div/strong/a"));
        //  mouseHoverAndClick(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/div/strong/a"));

        //* Verify the text ‘Overnight Duffle’
        // assertMethod("You added Overnight Duffle to your shopping cart.", By.xpath("//a[contains(text(),'shopping cart')]"));


        //* Change the Qty 3
        sendTextToElement(By.xpath("//input[@id='qty']"), "3");
        //* Click on the ‘Add to Cart’ Button.
        mouseHoverAndClick(By.xpath("//span[normalize-space()='Add to Cart']"));
        //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
        assertMethod("You added Overnight Duffle to your shopping cart.", By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
        //* Click on the ‘shopping cart’ Link into message
        clickOnElement(By.xpath("//a[normalize-space()='shopping cart']"));

        //* Verify the product name ‘Overnight Duffle’

        //Assert.assertEquals(getText(driver, By.cssSelector("td.product-name")), "Overnight Duffle");
        assertMethod("Overnight Duffle", By.id("td.product-name"));
        //* Verify the Qty is ‘3’
        Assert.assertEquals(driver.findElement(By.id("qty")).getAttribute("value"), "3");
        //* Verify the product price ‘$135.00’
        Assert.assertEquals("$135.00", driver, By.cssSelector("td.product-price"));
        //* Change the Qty to ‘5’
        driver.findElement(By.id("qty")).clear();
        driver.findElement(By.id("qty")).sendKeys("5");
        //* Click on the ‘Update Shopping Cart’ button
        clickOnElement(By.id("update-cart"));
        //* Verify the product price ‘$225.00’
        //   Assert.assertEquals(driver, By.cssSelector("td.product-price")), "$225.00";
    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
