package com.testingrest.ex03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_Project_verify_message {

    @Test
    public void error_message_verify(){

        ChromeDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com");

        driver.manage().window().maximize();

        WebElement link= driver.findElement(By.linkText("Start a free trial"));
        link.click();

        WebElement email_input_box= driver.findElement(By.id("page-v1-step1-email"));
        email_input_box.sendKeys("abc@wingified.com");

        WebElement checkbox=driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        WebElement create_acc=driver.findElement(By.tagName("button"));
        create_acc.click();
        

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
