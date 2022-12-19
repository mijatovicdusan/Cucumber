package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {

//set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();

//it waits page to load up to 20 seconds maximum
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//open gmail.com sigup page
        driver.get("https://www.facebook.com/");

//click on create new account
        WebElement CreateNewAccount= driver.findElement(By.xpath("//a[text()='Create new account']"));
        CreateNewAccount.click();

//send first name
        WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        FirstName.sendKeys("Abrakadabra");











    }
}
