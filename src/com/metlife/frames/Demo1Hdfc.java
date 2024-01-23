package com.metlife.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo1Hdfc
{
    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        //driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
        driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("john123");

        driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
        driver.switchTo().defaultContent();


    }
}
