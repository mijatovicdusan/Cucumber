package com.syntax.class02.class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //task:go to sign up and get window handle
        driver.get("http://accounts.google.com/signup");

        String gmailHandle =driver.getWindowHandle();

        System.out.println(gmailHandle);







    }
}
