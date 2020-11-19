import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);

    }
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        WebElement registerLink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerLink.click();
        String expectedMessage ="Register";
        WebElement message= driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualMessage = message.getText();
        Assert.assertEquals(expectedMessage,actualMessage);



    }

    @After
    public void tearDown(){
        //closeBrowser();

    }


}
