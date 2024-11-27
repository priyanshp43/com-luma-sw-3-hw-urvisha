package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class WomenTest extends Utility {

    String baseUrl = "https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyTheSortByProductNameFilter() {
        mouseHoverAndClick(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/button[1]"));
        //* Mouse Hover on the ‘Women’ Menu
        mouseHoverAndClick(By.xpath("//span[normalize-space()='Women']"));
        //* Mouse Hover on the ‘Tops’
        mouseHoverAndClick(By.xpath(" //strong[@class='title']//span[contains(text(),'Tops')]"));
        //* Click on the ‘Jackets’
        mouseHoverAndClick(By.xpath("//a[contains(text(),'Jackets')]"));

        //* Select Sort By filter “Product Name”
        // selectByVisibleTextFromDropDown(By.cssSelector("body > div:nth-child(7) > main:nth-child(4) > div:nth-child(4) > div:nth-child(1) > div:nth-child(3) > div:nth-child(4) > select:nth-child(2) > option:nth-child(2)") , "Product Name");

        //* Verify the product name displayed in alphabetical order


    }

    @Test
    public void verifyTheSortByPriceFilter() {
        //mouseHoverAndClick(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/button[1]"));
        //* Mouse Hover on the ‘Women’ Menu
        mouseHoverAndClick(By.xpath("//span[normalize-space()='Women']"));
        //* Mouse Hover on the ‘Tops’
        mouseHoverAndClick(By.xpath(" //strong[@class='title']//span[contains(text(),'Tops')]"));
        //* Click on the ‘Jackets’
        mouseHoverAndClick(By.xpath("//a[contains(text(),'Jackets')]"));

        //* Select Sort By filter “Price”
        selectByVisibleTextFromDropDown(By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]"), "Price");
        // selectByVisibleTextFromDropDown(By.id("sorter"), "Price");
        //selectByVisibleTextFromDropDown(By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]") , "Price");

        //* Verify the product price displayed in Low to High

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
