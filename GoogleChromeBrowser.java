package seleniumhomeworkweek1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleChromeBrowser {


    public static void main(String[] args) throws IllegalStateException, InterruptedException {


        System.setProperty("webdriver.chrome.driver" ,"/Users/Khyati/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver(); // created instance by using child class.

        Thread.sleep(3000);

        driver.manage().window().maximize();

        driver.close();


    }

}
