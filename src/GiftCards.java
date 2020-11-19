import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GiftCards extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);

    }
    @Test
    public void verifyUserShouldNavigateToGiftCardsPageSuccessfully(){
        WebElement giftCardsLink = driver.findElement(By.partialLinkText("Gift Car"));
        giftCardsLink.click();

        String expectedHeading = "Gift Cards";
        WebElement heading = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualHeading = heading.getText();

        Assert.assertEquals(expectedHeading,actualHeading);

    }
}
