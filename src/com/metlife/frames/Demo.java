package com.metlife.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo
{
    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("john123");



    }
}
