package seleniumhomeworkweek1;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowser {

    public static void main(String[] args) throws InterruptedException, SessionNotCreatedException {

        System.setProperty("webdriver.safari.driver" ,"/usr/bin/safaridriver");

        WebDriver driver = new SafariDriver(); // created instance by using child class.

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.close();
    }
}
