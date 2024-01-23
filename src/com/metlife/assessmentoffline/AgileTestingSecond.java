package com.metlife.assessmentoffline;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class AgileTestingSecond
{
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://mockexam1cpsat.agiletestingalliance.org/");
        driver.findElement(By.xpath("(//a[@href='#'])[2]")).click();
        driver.findElement(By.id("menu-item-207")).click();
        driver.findElement(By.id("para1-tamil")).click();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scrFile,new File("./tamil.png"));
        System.out.println(driver.findElement(By.id("elementor-tab-content-2171")).getText());
        driver.findElement(By.id("para2-hindi")).click();
        FileHandler.copy(scrFile,new File("./hindi.png"));
        System.out.println(driver.findElement(By.id("elementor-tab-content-2172")).getText());
        driver.findElement(By.id("para3-kannada")).click();
        FileHandler.copy(scrFile,new File("./kannad.png"));
        System.out.println(driver.findElement(By.id("elementor-tab-content-2173")).getText());
        driver.findElement(By.id("para-4-gujarati")).click();
        FileHandler.copy(scrFile,new File("./gujarati.png"));
        System.out.println(driver.findElement(By.id("elementor-tab-content-2174")).getText());

        String beforeClickColor=driver.findElement(By.xpath("//div[@class='elementor-tab-title eael-accordion-header']")).getCssValue("background-image");
        System.out.println(beforeClickColor.substring(7,33));
        driver.findElement(By.id("para-5-french")).click();
        FileHandler.copy(scrFile,new File("./french.png"));
        System.out.println(driver.findElement(By.id("elementor-tab-content-2175")).getText());

        String afterClickColor=driver.findElement(By.xpath("//div[@class='elementor-tab-title eael-accordion-header show active']")).getCssValue("background-image");
        System.out.println(afterClickColor.substring(7,33));

        driver.get("https://mockexam1cpsat.agiletestingalliance.org/index.php/challenge-2/");

        List<WebElement> Speakers=driver.findElements(By.xpath("//div[@data-widget_type='heading.default']"));
        for (WebElement name:Speakers)
        {
            System.out.println(name.getText());
        }
        driver.get("https://mockexam1cpsat.agiletestingalliance.org/index.php/challenge-4/");
        driver.quit();

    }
}
