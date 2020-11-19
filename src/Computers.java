import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Computers extends BaseTest{
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);

    }
    @Test
    public void verifyUserShouldNavigateToComputersPageSuccessfully(){
        WebElement computerLink = driver.findElement(By.partialLinkText("Compute"));
        computerLink.click();

        String expectedHeading = "Digital downloads";
        WebElement heading = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualHeading = heading.getText();

        Assert.assertEquals(expectedHeading,actualHeading);

}
}
