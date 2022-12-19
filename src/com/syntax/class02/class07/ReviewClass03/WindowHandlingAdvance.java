package com.syntax.class02.class07.ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAdvance {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//open gmail sign up page
        driver.get("http://accounts.google.com/signup");
// click on help button
        WebElement helpBtn=driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
//click on privacy button
        WebElement privacyBtn= driver.findElement(By.xpath("//a[text()='Privacy']"));





    }
}
