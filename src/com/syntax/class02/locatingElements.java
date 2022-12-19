package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {

    public static void main(String[] args) throws InterruptedException {

        //1.go to fb.com
        //2.enter username(locate the element and send the keys)
        //3.enter passwords
        //4.click login
        //seth path to the driver to link with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
            //1.
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
        Thread.sleep(2000);
            //2.
            driver.findElement(By.id("email")).sendKeys("abracadabra");
        Thread.sleep(2000);
            //3.
            driver.findElement(By.name("pass")).sendKeys("abracadabra");
        Thread.sleep(2000);
            //4.
            driver.findElement(By.name("login")).click();
        Thread.sleep(2000);



        //task2
        //click forgot password
       // driver.findElement(By.linkText("Forgot password?")).click();

       // task3
//click on forgot password using partial linkText locator

      //  driver.findElement(By.partialLinkText("Forgot")).click();









    }
}
