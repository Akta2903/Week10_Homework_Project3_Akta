package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest
{
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;
    static String browser = "Firefox";

    public static void main(String[] args)
    {
        if(browser.equalsIgnoreCase("Chrome"))

        driver = new ChromeDriver(); // Launch the Browser
        else if(browser.equalsIgnoreCase("Firefox"))
            driver = new FirefoxDriver(); // Launch the Firefox Browser
        else if(browser.equalsIgnoreCase("Edge"))
            driver = new EdgeDriver(); // Launch the EdgeBrowser
        else
            System.out.println("Give the browser name between Chrome , FireFox or Edge");
        driver.get(baseUrl); // Open the url
        System.out.println("Page Title : " + driver.getTitle()); // Print the Page Title
        System.out.println("Current Url : " + driver.getCurrentUrl()); //Print the Current Url
        System.out.println("Page Source : " + driver.getPageSource()); //Print the Page Source
        driver.findElement(By.id("username")).sendKeys("Prime101"); //Enter the Username into username field
        driver.findElement(By.id("password")).sendKeys("Prime@123"); //Enter the password into password field
        driver.close(); // closing the browser

    }

}
