package restOfOtherWebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utility {

    public WebDriver driver;

    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
}