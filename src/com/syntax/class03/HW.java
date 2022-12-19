package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

/*Navigate to http://syntaxprojects.com/
        Click on start practicing
        click on simple form demo
        enter any text on first text box
        click on show message
        quit the browser*/

        driver.get("http://syntaxprojects.com/");

        driver.manage().window().maximize();
        Thread.sleep(3000);

       driver.findElement(By.xpath("//a[@ id='btn_basic_example']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[contains(@class, 'list-group-item')]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[contains(@class, 'form-control')]")).sendKeys("ABVGD");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[contains(@type, 'button')]")).click();
        Thread.sleep(3000);

        driver.quit();













    }
}
