package j_unit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    private WebDriver driver;

    @Before
    public void openBrowser() {
        String baseURL = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);

    }

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        WebElement welcomeText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String expectedText = "Welcome, Please Sign In!";
        String actualText = welcomeText.getText();
        Assert.assertEquals(expectedText, actualText);

    }
    @Test
    public void varifyErrorMessageWhenWrongUser(){
        WebElement sendEmail = driver.findElement(By.id("Email"));
        sendEmail.sendKeys("bjrpatel17@yahoo.com");

        WebElement sendPassword = driver.findElement(By.name("Password"));
        sendPassword.sendKeys("123456");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginBtn.click();

        WebElement errorMsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String expectedErrorMessage= errorMsg.getText();
        String actualErrorMessage = errorMsg.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

//        WebElement rememberClick = driver.findElement(By.name("RememberMe"));
//        rememberClick.click();

    }

    @After
    public void closeBrowser() {
        driver.quit();

    }
}
