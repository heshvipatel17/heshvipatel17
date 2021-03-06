package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultiBrowserTesting {

        static String browser = "firefox";
        static String baseURL = "https://demo.nopcommerce.com/";
        static WebDriver driver;

        public static void main(String[] args) {

            if(browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if(browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                driver = new FirefoxDriver();
            }else if(browser.equalsIgnoreCase("ie")){
                System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }else {
                System.out.println("Wrong browser selected");
            }
            driver.get(baseURL);
            driver.quit();
        }
    }


