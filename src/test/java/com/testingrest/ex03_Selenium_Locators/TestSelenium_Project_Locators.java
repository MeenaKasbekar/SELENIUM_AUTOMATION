package com.testingrest.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_Project_Locators {

    @Description("TC01")
    @Owner("Meena Kasbekar")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_vwo_login_invalid_login() {

        ChromeDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com");


        driver.manage().window().maximize();

        WebElement email_input_box= driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

        WebElement password_input_box=driver.findElement(By.id("login-password"));
        password_input_box.sendKeys("Password123");

        WebElement signin_button =driver.findElement(By.id("js-login-btn"));
        signin_button.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_message=driver.findElement(By.className("notification-box-description"));
        error_message.equals("Your email, password, IP address or location did not match");
        System.out.println(error_message);


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
