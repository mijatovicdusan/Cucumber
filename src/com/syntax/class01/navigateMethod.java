package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
    public static void main(String[] args) throws InterruptedException {
        //TASK
       //go to google.com then go to fb.com then go back to google.com than go to fb.com


        //step 1 always
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //step 2 always
        WebDriver driver=new ChromeDriver();

        //task beginning
        //step1
        driver.get("https://www.google.com/");
        //step2
        driver.navigate().to("https://www.facebook.com/");
        // introduce sleep which is wait
        //wait or pause for 2000 mill seconds
        Thread.sleep(2000);
        //step 3
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();

// refresh the page
        Thread.sleep(2000);
        driver.navigate().refresh();

        driver.quit();



    }
}
