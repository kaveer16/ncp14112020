package restOfOtherWebsites;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


public class Barclays extends BaseTest {
    String baseUrl = "https://www.barclays.co.uk/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        clickOnElement((By.linkText("Register")));

        String expectedMessage = "You can register if you";
        String actualMessage = getTextFromElement(By.xpath("//h4[contains(text(),'You can register if you')]"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}