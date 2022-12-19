package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

//go to syntax project/checkbox demo
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        //maximize
        driver.manage().window().maximize();
        //find checkbox
        WebElement checkBox =driver.findElement(By.id("isAgeSelected"));
        //click on it
        checkBox.click();







    }
}
