import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Apparel extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);

    }
    @Test
    public void verifyUserShouldNavigateToApparelPageSuccessfully(){
        WebElement apparelLink = driver.findElement(By.partialLinkText("Appar"));
        apparelLink.click();

        String expectedHeading = "Apparel";
        WebElement heading = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualHeading = heading.getText();

        Assert.assertEquals(expectedHeading,actualHeading);

    }
}
