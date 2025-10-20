package com.testingrest.ex04_Selenium_XPath;

import com.testingrest.CommonAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class MiniProject_01 extends CommonAll {


    @Description("Project_01")
    @Owner("Meena Kasbekar")
    @Severity(SeverityLevel.BLOCKER)
    @Test

    public void hrm_login() throws InterruptedException {

        WebDriver driver1=new EdgeDriver();
        OpenBrowser(driver1,"https://awesomeqa.com/hr/web/index.php/auth/login");
        driver1.manage().window().maximize();

        WebElement input_username=driver1.findElement(By.xpath("//input[@name=\"username\"]"));
        input_username.sendKeys("admin");

        WebElement input_password= driver1.findElement(By.xpath("//input[@name=\"password\"]"));
        input_password.sendKeys("Hacker@4321");

        WebElement button= driver1.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));
        button.click();

        Thread.sleep(5000);

        WebElement text_verify= driver1.findElement(By.xpath("//h6[text()=\"PIM\"]"));
        Assert.assertEquals(text_verify.getText(),"PIM");

        Thread.sleep(5000);

        CloseBrowser(driver1);

    }
}
