package Pakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightLetsBook {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");// summon  browser
        WebElement staticDropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown=new Select(staticDropdown);
        //   dropdown.selectByIndex(3);
        //   System.out.println(  dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("USD");
        System.out.println(  dropdown.getFirstSelectedOption().getText());
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000L);

        driver.findElement(By.id("hrefIncAdt")).click();
        Thread.sleep(1000L);

        driver.findElement(By.id("hrefIncChd")).click();
        Thread.sleep(1000L);

        driver.findElement(By.id("hrefIncChd")).click();
        Thread.sleep(1000L);

        driver.findElement(By.id("btnclosepaxoption")).click();

       Thread.sleep(1000L);
       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       Thread.sleep(1000l);
       driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[6]/a")).click();
Thread.sleep(1000L);
driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTNR")).click();
Thread.sleep(1000L);
driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[1]/a")).click();
Thread.sleep(1000L);
driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date1\"]")).click();
Thread.sleep(1000L);
driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[2]/td[3]/a")).click();
Thread.sleep(1000L);
driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date1\"]")).click();
Thread.sleep(1000L);
driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[7]/a")).click();


    }
}
