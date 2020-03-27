package j_unit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUNITIntroduction {
    @BeforeClass
    public void openBrowser() {
        System.out.println("Open Browser");
    }

    @Test
    public void veryfyIShouldNavigateToLoginPage() {
        System.out.println("Navigate to Login Page");


    }

    @Test
    public void doLogin() {
        System.out.println("Login App");
    }


    @AfterClass
    public void closeBrowser() {
        System.out.println("Close browser");
    }
}

