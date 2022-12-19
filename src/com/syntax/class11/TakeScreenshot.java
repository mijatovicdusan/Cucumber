package com.syntax.class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakeScreenshot {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement userName= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));

        userName.sendKeys("Tester", Keys.TAB);

        WebElement pass= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));

        pass.sendKeys("test", Keys.ENTER);

        //take screenshot
        TakesScreenshot ss=(TakesScreenshot)driver;

        File sourceFile=ss.getScreenshotAs(OutputType.FILE);

        //save file from variable to the location in your computer
        FileUtils.copyFile(sourceFile,new File("ss/myscreenshots/blabla.png"));


    }
}
