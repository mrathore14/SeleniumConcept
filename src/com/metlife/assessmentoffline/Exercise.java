package com.metlife.assessmentoffline;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Exercise
{


        public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://mockexam1cpsat.agiletestingalliance.org/");


        driver.findElement(By.xpath("//li[@class='slideout-toggle menu-item-align-right ']")).click();
        driver.findElement(By.linkText("Challenge 1")).click();

        List<WebElement> a =   driver.findElements(By.xpath("//div[@class='eael-adv-accordion']/div"));

        for(int i = 0 ; i<a.size() ; i++){

            a.get(i).click();
            Thread.sleep(2000);

            File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(scr, new File("./language" + i + ".png"));

            System.out.println(a.get(i).getText());

            a.get(i).click();


        }



    }

}
