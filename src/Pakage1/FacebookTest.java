package Pakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https:facebook.com");// summon  browser
        //   driver.findElement(By.id("email")).sendKeys("hr");
        //   driver.findElement(By.id("pass")).sendKeys("h");
//driver.findElement(By.xpath("//input[@value='Log In']")).click();

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("SOURCECODE");
        driver.findElement(By.name("login")).click();
    }
}
