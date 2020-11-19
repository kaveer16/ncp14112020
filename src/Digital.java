import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Digital extends BaseTest{
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);

    }
    @Test
    public void verifyUserShouldNavigateToDigitalDownloadPageSuccessfully(){
        WebElement digitalDownloadLink = driver.findElement(By.partialLinkText("Digital downloa"));
        digitalDownloadLink.click();

        String expectedHeading = "Computers";
        WebElement heading = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualHeading = heading.getText();

        Assert.assertEquals(expectedHeading,actualHeading);

    }
}
