package restOfOtherWebsites;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class Xcart extends BaseTest{
    String baseUrl = "https://www.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToGetStartPageSuccessfully() {
        clickOnElement((By.xpath("//a[contains(text(),'Get Started')]")));
        String expectedMessage = "Built to be the last website platform you’ll ever need.";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Built to be the last website platform you’ll ever ')]"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
