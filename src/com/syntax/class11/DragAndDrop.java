package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/droppable/");

        //switch focus to the frame to be able to perform drag and drop
        driver.switchTo().frame(0);

        WebElement draggableElement=driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement dropLocation=driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action=new Actions(driver);

       //1st method (one of the ways of doing it)
       // action.dragAndDrop(draggableElement,dropLocation).perform();

       //2nd way of doing it
        action.clickAndHold(draggableElement).moveToElement(dropLocation).release().build().perform();




    }
}
