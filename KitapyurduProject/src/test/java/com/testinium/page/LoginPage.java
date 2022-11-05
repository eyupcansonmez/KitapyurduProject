package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    Logger logger = LogManager.getLogger(LoginPage.class);
    public LoginPage(){
        methods = new Methods();
    }

    public void login(){
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-email"),"eyupcan.sonmez1@gmail.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"), "X1x2x3eyup");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//button[@role='button']"));
        methods.waitBySeconds(10);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".common-sprite>b")));
        logger.info("Kullanıcı başarılı giriş yaptı");

    }
}

