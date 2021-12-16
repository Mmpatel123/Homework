package Pakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootsWebsiteTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.boots.com/LoginRequestDispatcher");// summon  browser

        driver.findElement(By.xpath("//*[@id=\"gigya-loginID-126189670420823710\"]")).sendKeys("sweetmegs2604@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"gigya-password-21094567555302330\"]")).sendKeys("hello");

    }
}
