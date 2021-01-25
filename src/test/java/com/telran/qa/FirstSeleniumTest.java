package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Locale;

public class FirstSeleniumTest {
    WebDriver wd;

    //before -  setUp(){}
    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://www.google.com/");

    }

    //Test
    @Test
    public void openGoogleTest(){
        System.out.println("site opened!");

        wd.findElement(By.name("q")).click();

        // to wright word Selenium in a search field
        wd.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);

       String text = wd.findElement(By.tagName("h3")).getText();

       Assert.assertEquals(text.toLowerCase(), "seleniumhq browser automation");

    }

    //after - tearDown(){}
    @AfterMethod
    public void tearDown(){
        wd.quit();
        //wd.close();  - closed only the New tab in a browser
    }

}
