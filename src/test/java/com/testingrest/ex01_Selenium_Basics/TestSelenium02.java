package com.testingrest.ex01_Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Test
    public void load_page(){

        EdgeDriver driver=new EdgeDriver();

        driver.get("https://app.vwo.com");

        driver.manage().window().maximize();

        Assert.assertEquals(driver.getTitle(), "Login - VWO");

        driver.quit();
    }
}
