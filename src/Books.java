import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Books extends BaseTest{
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);

    }
    @Test
    public void verifyUserShouldNavigateToBooksPageSuccessfully(){
        WebElement booksLink = driver.findElement(By.partialLinkText("Books"));
        booksLink.click();

        String expectedHeading = "Books";
        WebElement heading = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualHeading = heading.getText();

        Assert.assertEquals(expectedHeading,actualHeading);

    }
}
