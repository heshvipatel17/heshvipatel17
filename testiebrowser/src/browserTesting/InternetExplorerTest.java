package browserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer 3.141.59.exe");
        WebDriver driver = new InternetExplorerDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        String Title = driver.getTitle();
        System.out.println(Title);
        driver.quit();
    }

}
