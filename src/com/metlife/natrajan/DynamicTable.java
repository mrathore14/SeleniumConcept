package com.metlife.natrajan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicTable
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_grid");
        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        List<WebElement> cells=driver.findElements(By.xpath("//div[@class='grid-item']"));
        System.out.println(cells.size());
        for(int i=0;i< cells.size();i++)
        {
            System.out.println(cells.get(i).getText() +"\t" + cells.get(i+2).getText());
        }
        driver.switchTo().defaultContent();
        driver.quit();








    }
}
