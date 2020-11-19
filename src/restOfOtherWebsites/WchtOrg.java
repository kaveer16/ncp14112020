package restOfOtherWebsites;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class WchtOrg extends BaseTest {
    String baseUrl = "https://www.wcht.org.uk/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToYourAccountPageSuccessfully() {
        clickOnElement((By.xpath("//span[contains(text(),'Your account')]")));
        String expectedMessage = "It's easy to manage your tenancy with an online account.";
        String actualMessage = getTextFromElement(By.xpath("//span[contains(text(),\"It's easy to manage your tenancy with an online ac\")]"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
