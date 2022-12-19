package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("http://syntaxprojects.com/javascript-alert-box-demo.php");

    //find button click me for alert and click on it

      WebElement simpleAlert= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
      simpleAlert.click();
      Thread.sleep(2000);
      //Handling the alert
       Alert simpleAlert1= driver.switchTo().alert();

       simpleAlert1.accept();

       //find button for confirmation alert and click on it

        WebElement confirmationAlert=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();

       Alert confirmationAlert1=driver.switchTo().alert();
        Thread.sleep(2000);
       confirmationAlert1.dismiss();

       // find prompt alert and send some text then accept it
        WebElement promptAlert=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptAlert.click();

        //switch focus to alert
        Alert prompt1=driver.switchTo().alert();

        prompt1.sendKeys("ldnsnfsd");
        Thread.sleep(2000);


        prompt1.accept();







}}
