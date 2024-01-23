package com.metlife.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class JavaScriptOptions
{
    public static void main(String[] args)
    {
        //to give chrome cammands like allow camera microphone download all the methods\
        //are already given in chromeoptions class

        ChromeOptions opt=new ChromeOptions();
        opt.setAcceptInsecureCerts(true);
        //insecurecert wo screen hoti hai jab dev ya stage site khole to take risk of site wali screen aati wo hai

        opt.addArguments("use-fake-ui-for-media-stream");


        WebDriver driver = new ChromeDriver(opt);
        //we passed opt as argument as we have given some default funtions for chrome in chromeoptions so once chrome is
        //loaded all functions we added in chromeopotions will be followed as we passed the argument

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.tutorialspoint.com/javascript/index.htm");
        //$x(//a[@title='login'])[]  to scroll window.scrollTo(50,500)
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(50,500)");
        jse.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//a[@title='Contact us']")));

        //to write or send keys is not working in jaa then
       // jse.executeScript("arguments[0].values='robert',driver.findElement(By.xpath("//a[@title='Contact us']")));

        //to click if it is not working in java then
        // jse.executeScript("arguments[0].click,driver.findElement(By.xpath("//a[@title='Contact us']")));








    }
}
