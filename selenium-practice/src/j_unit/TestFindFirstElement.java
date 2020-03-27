package j_unit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestFindFirstElement {

    public static void main(String[] args) throws InterruptedException {

        String baseURL = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);

        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        Thread.sleep(2000);

        WebElement sendEmail = driver.findElement(By.id("Email"));
        sendEmail.sendKeys("bjrpatel17@yahoo.com");

        WebElement sendPassword = driver.findElement(By.name("Password"));
        sendPassword.sendKeys("123456");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginBtn.click();

        WebElement errorMsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        System.out.println(errorMsg.getText());

        WebElement rememberClick = driver.findElement(By.name("RememberMe"));
        rememberClick.click();

    }
}
