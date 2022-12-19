package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //go to ebay
        driver.get("https://www.ebay.com/");

        //get all links i.e anchor tags from website
       List<WebElement> ebayLinks=driver.findElements(By.tagName("a"));
       //print size of the list
        System.out.println("size of the list is: "+ebayLinks.size());
        //implementing a for loop to traverse through list of elements
        for(WebElement ebayLink:ebayLinks){
            //extracting value of attribute href because it contains link embedded in the Webelement
           String link= ebayLink.getAttribute("href");
            //print link
            System.out.println(link);


        }



    }


}
