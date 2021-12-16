package Pakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Salesforcelogintest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.next.co.uk/search?w=shoes&isort=score&af=#1_543.2000122070312");
        driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"sli_search_1\"]")).sendKeys("SHOES");
        //Double click the button to launch an alertbox
      /*  Actions action = new Actions(driver);
        WebElement btn = driver.findElement(By.id("dblClkBtn"));
        action.doubleClick(btn).perform();*/

        //Thread.sleep just for user to notice the event
        Thread.sleep(3000);

        //Closing the driver instance
        driver.quit();
    }
}
