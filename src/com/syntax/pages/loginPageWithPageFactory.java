package com.syntax.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageWithPageFactory extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement userName;

    @FindBy(id="txtPassword")
    public WebElement password;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    //call the constructor to initialize all elements

    public loginPageWithPageFactory(){
        PageFactory.initElements(driver,this);
    }
}
