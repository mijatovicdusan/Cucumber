package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");

        //TASK 1: select baby cat from drop down

        //step 1 switch to the frame using by index

        driver.switchTo().frame(1);
        WebElement animalText=driver.findElement(By.xpath("//b[text()='Animals :']"));
        String text= animalText.getText();
        System.out.println(text);



        //check the check box
        //switch focus to main page

        driver.switchTo().defaultContent();

        //switch to the frame that contains subframe that which has check box

        driver.switchTo().frame("frame1");
        WebElement inputTxt = driver.findElement(By.xpath("//input"));
        inputTxt.sendKeys("abracadbra");

        // finding the frame through xpath and switching using BY Webelement method

        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        // find the checkbox

        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

















    }
}
