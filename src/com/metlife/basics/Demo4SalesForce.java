package com.metlife.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo4SalesForce
{
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://login.salesforce.com/?locale=in");

        //click try for free
        driver.findElement(By.id("signup_link")).click();

        //enter firstname as john
        driver.findElement(By.name("UserFirstName")).sendKeys("john");
        //enter emailaddress as john@CCCS.COM
        driver.findElement(By.name("UserEmail")).sendKeys("john@cccs.com");
        //select jobtitle as "IT Manager"
        Select jobTitle=new Select(driver.findElement(By.name("UserTitle")));
        jobTitle.selectByVisibleText("IT Manager");
        //select employees to '101-200 emplpoyees'
        Select emp=new Select(driver.findElement(By.name("CompanyEmployees")));
        emp.selectByVisibleText("101 - 200 employees");
        //click on checkbox of agreement
        driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();

    }
}
