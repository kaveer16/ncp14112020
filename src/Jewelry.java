import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Jewelry extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);

    }
    @Test
    public void verifyUserShouldNavigateToJewelryPageSuccessfully(){
        WebElement jewelryLink = driver.findElement(By.partialLinkText("Jewel"));
        jewelryLink.click();

        String expectedHeading = "Jewelry";
        WebElement heading = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualHeading = heading.getText();

        Assert.assertEquals(expectedHeading,actualHeading);

    }
}
