package Pakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyhomepage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/#/index");// summon  browser
        driver.findElement(By.xpath("/html/body/app-root/div/header/div[1]/div/div/div[2]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("JADDI1234@GMAIL.COM");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("JADDIPADIBHEEMBADDDI");
        driver.findElement(By.xpath("/html/body/main/div/form/div[4]/input")).click();



    }
}
