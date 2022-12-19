package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    public static void main(String[] args) throws InterruptedException {

        //TASK
        //go to google then maximize your window


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");
        //maximize
        Thread.sleep(2000);
        driver.manage().window().maximize();
        //full screen
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.quit();
    }
}
