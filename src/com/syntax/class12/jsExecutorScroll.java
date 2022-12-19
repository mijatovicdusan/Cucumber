package com.syntax.class12;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jsExecutorScroll {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;
//scroll down
        js.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(3000);

//scroll up
        js.executeScript("window.scrollBy(0,-1000)");










    }
}
