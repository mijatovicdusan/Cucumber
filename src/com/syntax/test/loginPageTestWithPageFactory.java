package com.syntax.test;

import com.syntax.pages.loginPageWithPageFactory;
import com.syntax.utils.CommonMethods;

public class loginPageTestWithPageFactory {
    public static void main(String[] args) throws InterruptedException {

        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        loginPageWithPageFactory login =new loginPageWithPageFactory();


        login.userName.sendKeys("Admin");


        login.password.sendKeys("Hum@nhrm123");


        login.loginBtn.click();
}}
