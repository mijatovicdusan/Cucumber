package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {

    public static void main(String[] args) {

 System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();

//go to smart bear.com
        driver.get("https://secure.smartbearsoftware.com/login.asp?returnUrl=/index.asp");

        driver.manage().window().maximize();

//enter username
        driver.findElement(By.id("email")).sendKeys("Tester");



}}
