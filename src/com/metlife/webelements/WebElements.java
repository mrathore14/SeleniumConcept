package com.metlife.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;
import java.time.Duration;
import java.util.List;

public class WebElements
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
       // driver.findElement(By.id("example_wrapper")).click();

       //List<WebElement> table=driver.findElements(By.xpath("//tr[@class='even']|//tr[@class='odd']"));
      // for (WebElement name:table)
       //{
       //    System.out.println(name.getText());
       //}
       //String name=driver.findElement(By.xpath("//td[@class='sorting_1']")).getText();
       //String Salary=driver.findElement(By.xpath("//td[text()='$162,700']")).getText();
        // System.out.println(name +" " +Salary);
        //to get count of row
        List<WebElement> rows = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody"))
                .findElements(By.tagName("tr"));
    //   System.out.println(row.stream().count());

        //to get name and salary of 10 coloumns
        for (WebElement row:rows)
        {
            List<WebElement> cols=row.findElements(By.tagName("td"));
            System.out.println(cols.get(1).getText()+ "\t" + cols.get(5).getText());

        // to get count of row
            //table[1]/tboody/tr/td[2]//all rows 2nd column
            //table[1]/tboody/tr[1]/td[2]// 1st row 2nd column



  //     int count=driver.findElement(By.xpath("//*[@id=\"example\"]/tbody")).findElements(By.tagName("tr")).size();
//        System.out.println(count);
//        //to get name and salary of 10 rows
//        for (int i=1;i<=count;i++) {
//            System.out.println(driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[" + i + "]/td[2]")).getText() +
//                    "\t" + driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[\" + i + \"]/td[6]")).getText());

        }


    }
}
