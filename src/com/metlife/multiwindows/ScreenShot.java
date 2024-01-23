package com.metlife.multiwindows;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class ScreenShot
{
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_grid");
        //opening a new window or tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://google.com");
        Set<String> windows=driver.getWindowHandles();
        //getting back to main tab w3school
        driver.switchTo().window(windows.toArray()[0].toString());

        //screenshot
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // FileUtils.copyFile(scrFile, new File("./image.png"));
        FileHandler.copy(scrFile,new File("./image.png"));
        //getting back to main tab Google
        driver.switchTo().window(windows.toArray()[1].toString());
        //taking ss of particular thing in page
        File searchBarFile=driver.findElement(By.id("APjFqb")).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(searchBarFile,new File("./SearchBar.png"));

        driver.quit();


    }
}
