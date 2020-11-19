import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginVerification extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("kriva@yahoo.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("123456");
        WebElement loginButton = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/input[1]"));
        loginButton.click();

        String expectedMessage ="No customer account found";
        WebElement message = driver.findElement(By.xpath("//li[contains(text(),'No customer account found')]"));
        String actualMessage = message.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @After
    public void tearDown(){

    }
}
