package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {

    public static void main(String[] args) {
        // set path to the driver to link with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        // use get() function to open up required website
        driver.get("https://www.google.com/");

        String url=driver.getCurrentUrl();
        //print the url
        System.out.println(url);
        //get the title
       String title=driver.getTitle();
        System.out.println(title);
        // close the Chrome
        driver.quit();

    }
}
