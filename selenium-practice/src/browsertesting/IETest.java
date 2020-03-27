package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IETest {

    public static void main(String[] args) {

        String baseURL = "https://www.google.co.uk/maps?hl=en&tab=rl1";
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
        String Title = driver.getTitle();
        System.out.println(Title);
        driver.quit();
    }
}


