import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class VerificationOfRegistration extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageAndRegisterSuccessfully() {
        WebElement registerLink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerLink.click();
        WebElement genderButton =driver.findElement(By.className("male"));
        genderButton.click();
        WebElement firstName = driver.findElement(By.xpath(" //input[@id='FirstName']"));
        firstName.sendKeys("Raj");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Kumar");
        //Select Date/Month/Year OF Birth from drop down boxes
        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        day.sendKeys("28");
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        month.sendKeys("February");
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        year.sendKeys("1985");

        Random randomGenerator = new Random();
        int randomInt= randomGenerator.nextInt(999);

        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("kriva@yahoo.com" + randomInt+"yahoo.com");
        WebElement companyField = driver.findElement(By.xpath("//input[@id='Company']"));
        companyField.sendKeys("RAJ LTD");
        WebElement newsLetter = driver.findElement(By.xpath("//input[@id='Newsletter']"));
        newsLetter.click();
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("123456");
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("123456");
        WebElement register = driver.findElement(By.xpath("//input[@id='register-button']"));
        register.click();


        String expectedMessage = "Your registration completed";
        WebElement message = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = message.getText();

        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @After
    public void tearDown(){

    }
}
