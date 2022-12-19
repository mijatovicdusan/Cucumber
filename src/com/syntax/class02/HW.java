package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {

    /*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

     /* driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        Thread.sleep(1000);

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.id("customer.firstName")).sendKeys("Dusan");
        Thread.sleep(1000);

        driver.findElement(By.id("customer.lastName")).sendKeys("Mijat");
        Thread.sleep(1000);

        driver.findElement(By.id("customer.address.street")).sendKeys("Wonderland");
        Thread.sleep(1000);

        driver.findElement(By.id("customer.address.city")).sendKeys("Novi Sad");
        Thread.sleep(1000);

        driver.findElement(By.id("customer.address.state")).sendKeys("Srbija");
        Thread.sleep(1000);

        driver.findElement(By.id("customer.address.zipCode")).sendKeys("123456");
        Thread.sleep(1000);

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567890");
        Thread.sleep(1000);

        driver.findElement(By.id("customer.ssn")).sendKeys("0123456");
        Thread.sleep(1000);

        driver.findElement(By.id("customer.username")).sendKeys("Dusan");
        Thread.sleep(1000);

        driver.findElement(By.id("customer.password")).sendKeys("Dusan");
        Thread.sleep(1000);

        driver.findElement(By.id("repeatedPassword")).sendKeys("Dusan");
        Thread.sleep(1000);

        driver.findElement(By.className("button")).click();
        Thread.sleep(1000);
       driver.quit();
*/


//navigate to fb.com
//click on create new account
//fill up all the textboxes
//close the pop up
//close the browser

    driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

    driver.manage().window().maximize();
        Thread.sleep(3000);

    driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[contains(@name, 'firstname')]")).sendKeys("Dusan");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[contains(@name, 'lastname')]")).sendKeys("Dusan");
        Thread.sleep(3000);


        driver.findElement(By.xpath("//input[contains(@name, 'reg_email__')]")).sendKeys("123456");
        Thread.sleep(3000);

        driver.findElement(By.id("password_step_input")).sendKeys("123456");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//img[contains(@class, '_8idr img')]")).click();
        Thread.sleep(3000);

        driver.quit();

    }




}
