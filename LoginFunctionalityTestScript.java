package seleniumhomeworkweek1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionalityTestScript {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" ,"/Users/Khyati/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("Email")). sendKeys("patelkhyati2009@yahoo.com");
        Thread.sleep(3000);

        driver.findElement(By.id("Password")). sendKeys("Dhaval86");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")) . click();
        Thread.sleep(2000);

        driver.close();



    }
}
