package com.metlife.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Set;

public class Demo3FBSignUp
{
    public static void main(String[] args) throws InterruptedException
    {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

      //  String parentWindowHandle = driver.getWindowHandle();
        //driver.findElement(By.linkText("Sign Up")).click();


        //Set<String> allWindowHandles = driver.getWindowHandles();
        //for (String windowHandle : allWindowHandles) {
          //  if (!windowHandle.equals(parentWindowHandle)) {
            //    driver.switchTo().window(windowHandle);
              //  break;
          //  }
        //}
       //Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("john");
        driver.findElement(By.name("lastname")).sendKeys("Parker");
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8398498343");
        driver.findElement(By.id("password_step_input")).sendKeys("Mahipal@123");

        Select s=new Select(driver.findElement(By.id("day")));
        s.selectByVisibleText("14");
        Select s1=new Select(driver.findElement(By.id("month")));
        s1.selectByVisibleText("Feb");
        Select s2=new Select(driver.findElement(By.id("year")));
        s2.selectByVisibleText("1996");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.quit();

    }
}
