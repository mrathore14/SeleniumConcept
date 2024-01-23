package com.metlife.assessmentoffline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AgileTesting
{
    public static void main(String[] args)
    {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://mockexam1cpsat.agiletestingalliance.org/");
        driver.findElement(By.xpath("(//a[@href='#'])[2]")).click();
        List<WebElement> menu=driver.findElement(By.id("menu-slideout-spacious")).findElements(By.tagName("li"));
        for (WebElement name:menu)
        {
            System.out.println(name.getText());
        }
        List<WebElement>  urls = driver.findElements(By.xpath("//a[@rel='nofollow']"));
        for (WebElement url : urls)
        {
            System.out.println(url.getAttribute("href"));
        }
        driver.quit();
    }
}
