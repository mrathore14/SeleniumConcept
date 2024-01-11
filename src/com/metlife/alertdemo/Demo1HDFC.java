package com.metlife.alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Demo1HDFC
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");

       driver.findElement(By.xpath("//img[@alt='Go']")).click();
       //getting the
       String alertMsg=driver.switchTo().alert().getText();
       System.out.println(alertMsg);
       //accepting the alert
       driver.switchTo().alert().accept();

       driver.close();



    }
}
