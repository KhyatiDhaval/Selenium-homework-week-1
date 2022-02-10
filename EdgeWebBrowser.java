package seleniumhomeworkweek1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeWebBrowser {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver" , "/Users/Khyati/Downloads/edgedriver_mac64/msedgedriver");

        WebDriver driver =  new EdgeDriver();

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.close();



    }
}
