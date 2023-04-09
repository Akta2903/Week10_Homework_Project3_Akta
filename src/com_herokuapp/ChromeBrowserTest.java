package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest
{
    static String baseUrl ="http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args)
    {
        driver = new ChromeDriver(); // Launch the browser
        driver.get(baseUrl); // Open the Url
        System.out.println("Page Title : " + driver.getTitle());
        System.out.println("Current Url : " + driver.getCurrentUrl());
        System.out.println("Page Source : " + driver.getPageSource());
        driver.findElement(By.id("username")).sendKeys("Prime101"); //Enter the Username into username field
        driver.findElement(By.id("password")).sendKeys("Prime@123"); //Enter the password into password field
        driver.close(); // closing the browser
    }
}
