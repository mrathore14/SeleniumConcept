package com.metlife.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunchBrowser
{
    public static void main(String[] args)
    {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com");

      String actTitle=  driver.getTitle();
      System.out.println(actTitle);
     String actUrl= driver.getCurrentUrl();
      System.out.println(actUrl);

      String pageSource=driver.getPageSource();
      System.out.println(pageSource);
      driver.quit();

    }
}
