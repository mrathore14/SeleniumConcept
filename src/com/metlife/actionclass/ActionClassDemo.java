package com.metlife.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class ActionClassDemo
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("http://www.amazon.in/");
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.partialLinkText("Hello, sign in"))).perform();
        act.click(driver.findElement(By.id("jushdjksdh")));
        //if voice button to drag is there then
        act.moveToElement(driver.findElement(By.xpath(""))).pause(50)
                .clickAndHold().pause(50).moveToElement(driver.findElement(By.xpath("")))
                .pause(50).release().perform();

        act.contextClick(driver.findElement(By.xpath(""))).perform();

        act.doubleClick(driver.findElement(By.xpath(""))).perform();



        }



}
