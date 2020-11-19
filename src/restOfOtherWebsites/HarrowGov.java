package restOfOtherWebsites;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class HarrowGov extends BaseTest {

    String baseUrl = "https://www.harrow.gov.uk/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        clickOnElement((By.xpath("//span[contains(text(),'Log in / Register')]")));

        String expectedMessage = "Welcome Guest!";
        String actualMessage = getTextFromElement(By.xpath("//li[contains(text(),'Welcome Guest!')]"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
