package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) {


//set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//it waits page to load up to 20 seconds maximum
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//go to https://syntaxprojects.com/dynamic-elements-loading.php
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

//click on start button
       WebElement startBtn= driver.findElement(By.id("startButton"));
       startBtn.click();

 //find text
        WebElement welcomeText= driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text=welcomeText.getText();
        System.out.println("Text is: "+text);














    }
}
