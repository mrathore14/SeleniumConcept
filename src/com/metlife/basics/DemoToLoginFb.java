package com.metlife.basics;

import com.sun.tools.javac.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoToLoginFb
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("jhfuwfuwfh@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("welcome@123");
        driver.findElement(By.name("login")).click();
        driver.quit();
    }
}
