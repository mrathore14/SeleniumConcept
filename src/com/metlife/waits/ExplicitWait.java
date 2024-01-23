package com.metlife.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait
{
    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver();
        //explicit wait sirf tab lagayenge jab kisi a[rticular element ko locate na kr paa rhe ho
        //it will not be for all elements
       // implicit by default sab elements ke liye hota hai
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        //fluent wait mai ham exception handle kr skte hai time limit deke
        FluentWait wait2=new FluentWait(driver).ignoring(WebDriverException.class).pollingEvery(Duration.ofSeconds(30)).withTimeout(Duration.ofSeconds(120));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.google.com/");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("efeww"))));


    }
}
