package com.metlife.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DemoOpenErr
{
    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("http://demo.openemr.io/b/openemr/");
       // Update username as admin
        driver.findElement(By.id("authUser")).sendKeys("admin");
       // 3.  Update password as pass
        driver.findElement(By.id("clearPass")).sendKeys("pass");
       // 4.  Select language as English (Indian)
        //Select language=new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
        //language.selectByVisibleText("English (Indian))");
        driver.findElement(By.xpath("//select[@class='form-control']")).click();
        driver.findElement(By.xpath("//option[text()='English (Indian)']")).click();
           // 5.  Click on the login button
        driver.findElement(By.id("login-button")).click();
       // 6.  Click on Patient  Click New Search
        driver.findElement(By.xpath("//div[text()='Patient']")).click();
        driver.findElement(By.xpath("//div[text()='New/Search']")).click();
      //  7.  Add the first name, last name
        driver.switchTo().frame(3);
       //driver.switchTo().frame(driver.findElement(""))
        driver.findElement(By.id("form_fname")).sendKeys("mahipal");
        driver.findElement(By.id("form_lname")).sendKeys("Rathore");
       // 8.  Update DOB as today's date


    }
}
