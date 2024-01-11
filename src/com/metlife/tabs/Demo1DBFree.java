package com.metlife.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Demo1DBFree
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.db4free.net/");

        driver.findElement(By.xpath("//b[contains(text(),'phpMyAdmin')]")).click();

        String parentWindowHandle = driver.getWindowHandle();
        driver.findElement(By.linkText("phpMyAdmin")).click();


        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String windowHandle : allWindowHandles)
         {
          if (!windowHandle.equals(parentWindowHandle))
          {
            driver.switchTo().window(windowHandle);
          break;
          }
        }
        driver.findElement(By.id("input_username")).sendKeys("Mahipal");
        driver.findElement(By.id("input_password")).sendKeys("rathore");
        driver.findElement(By.id("input_go")).click();

    }
}
