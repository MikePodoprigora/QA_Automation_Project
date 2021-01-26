package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SuperPharm {
    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://shop.super-pharm.co.il/");
    }

    @Test
    public void testNavMenu(){


        WebElement nav = wd.findElement(By.xpath("//nav[@id='navbar-header-top']"));
         nav.findElement(By.xpath(".//*[@title=\"מדיניות משלוחים\"]")).click();



    }



    @AfterMethod(enabled = false)
    public void tearDown(){
        wd.quit();
        //wd.close();  - closed only the New tab in a browser
    }

}
