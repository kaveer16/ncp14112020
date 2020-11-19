import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Electronics extends BaseTest {

        String baseUrl = "https://demo.nopcommerce.com/";
        @Before
        public void setUp(){
            openBrowser(baseUrl);

        }
        @Test
        public void verifyUserShouldNavigateToElectronicsPageSuccessfully(){
            WebElement computerLink = driver.findElement(By.partialLinkText("Electroni"));
            computerLink.click();

            String expectedHeading = "Electronics";
            WebElement heading = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
            String actualHeading = heading.getText();

            Assert.assertEquals(expectedHeading,actualHeading);

        }
    }

