package com.metlife.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class CityBankDemo
{
    public static void main(String[] args)
    {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");

        //5. Choose Credit Card
        driver.findElement(By.xpath("//a[text()='select your product type']")).click();
        driver.findElement(By.xpath("//a[text()='Credit Card']")).click();
        //6.  Enter credit card number as 4545 5656 8887 9998

        driver.findElement(By.id("citiCard1")).sendKeys("4545");
        driver.findElement(By.id("citiCard2")).sendKeys("5656");
        driver.findElement(By.id("citiCard3")).sendKeys("8887");
        driver.findElement(By.id("citiCard4")).sendKeys("9998");
        //7.  Enter cvv number
        driver.findElement(By.name("CCVNO")).sendKeys("578");
        //8.  Enter date as “14/04/2022”
        driver.findElement(By.id("bill-date-long")).click();

        Select year=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        year.selectByVisibleText("2022");

        Select month=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        month.selectByVisibleText("Apr");

        driver.findElement(By.xpath("//a[text()='14']")).click();


        //9.  Click on Proceed
        driver.findElement(By.id("agree")).click();
        //10.  Get the text and print it “Please accept Terms and Conditions”

    }
}
