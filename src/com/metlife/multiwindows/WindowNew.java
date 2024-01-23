package com.metlife.multiwindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class WindowNew
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_grid");
        //opening a new window or tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://google.com");
        Set<String> windows=driver.getWindowHandles();
        //getting back to main tab
        driver.switchTo().window(windows.toArray()[0].toString());



    }
}
