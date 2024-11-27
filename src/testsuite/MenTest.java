package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class MenTest extends Utility {

    String baseUrl = "https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        mouseHoverAndClick(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/button[1]"));
        //* Mouse Hover on the ‘Men’ Menu
        mouseHoverAndClick(By.xpath(" //span[normalize-space()='Men']"));
        //* Mouse Hover on the ‘Bottoms’
        mouseHoverAndClick(By.xpath("//a[contains(text(),'Bottoms')]"));
        //* Click on the ‘Pants’
        mouseHoverAndClick(By.xpath("//div[normalize-space()='Category']"));
        //selectByIndexFromDropDown(By.xpath("//div[@aria-hidden='false']//a[contains(text(),'Pants')]") , 0);
        mouseHoverAndClick(By.xpath("//div[@aria-hidden='false']//a[contains(text(),'Pants')]"));
        //* Mouse Hover on the product name  ‘Cronus Yoga Pant’ and click on the size 32.
        mouseHoverAndClick(By.xpath("//a[normalize-space()='Cronus Yoga Pant']"));
        mouseHoverAndClick(By.xpath("//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]"));
        //* Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the Color Black.
        mouseHoverAndClick(By.xpath("//div[@id='option-label-color-93-item-49']"));
        //* Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on th ‘Add To Cart’ Button.
        mouseHoverAndClick(By.xpath("//span[normalize-space()='Add to Cart']"));
        //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        // Assert.assertTrue(driver.findElement(By.xpath("//div[@class='message-success']")).isDisplayed());
        //driver.findElement(By.linkText("shopping cart")).click();
        //* Click on the ‘shopping cart’ Link into message
        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Shopping Cart']")).isDisplayed());
        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(driver.findElement(By.xpath("//td[@class='col item']//a")).getText(), "Cronus Yoga Pant");
        //* Verify the product size ‘32’
        Assert.assertEquals(driver.findElement(By.xpath("//dd[contains(text(), '32')]")).getText(), "32");
        //* Verify the product color ‘Black’
        Assert.assertEquals(driver.findElement(By.xpath("//dd[contains(text(), 'Black')]")).getText(), "Black");


    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
