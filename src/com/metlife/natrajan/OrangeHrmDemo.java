package com.metlife.natrajan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class OrangeHrmDemo
{
    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
        driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']")).click();
        //driver.findElement(By.xpath("(//*[text()='Admin'])[3]")).click();
        driver.findElement(By.xpath("//div[@class='oxd-select-text-input']/following::*[text()='Admin']")).click();
        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
        driver.findElement(By.xpath("(//*[text()='Enabled'])")).click();
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("abc abcd");
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("testuser");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Welcome@123");
        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Welcome@123");
         driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.quit();


    }
}
