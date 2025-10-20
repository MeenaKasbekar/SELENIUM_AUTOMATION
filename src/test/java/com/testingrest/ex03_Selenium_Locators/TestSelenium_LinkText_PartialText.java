package com.testingrest.ex03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_LinkText_PartialText {

    @Test
    public void linkText(){

        ChromeDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");

        driver.manage().window().maximize();

        WebElement link= driver.findElement(By.linkText("Start a free trial"));
        link.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
