package com.testingrest.ex02_Selenium_Basics;

import com.testingrest.CommonAll;
import io.qameta.allure.AllureId;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.testng.TestInstanceParameter;

public class TestSelenium_ProjectNo1 extends CommonAll {

    @Test
    public void verify_text() throws InterruptedException {

        WebDriver driver=new EdgeDriver();

        OpenBrowser(driver,"https://katalon-demo-cura.herokuapp.com");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test case Passed");
            Assert.assertTrue(true);

        }else {
            System.out.println("Test case Failed");
            Assert.assertTrue(false);
        }

        CloseBrowser(driver);

    }
}
