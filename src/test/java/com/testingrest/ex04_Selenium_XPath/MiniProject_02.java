package com.testingrest.ex04_Selenium_XPath;

import com.testingrest.CommonAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class MiniProject_02 extends CommonAll {

    @Description("Project_02")
    @Owner("Meena Kasbekar")
    @Severity(SeverityLevel.MINOR)
    @Test

    public void login() throws InterruptedException {

        WebDriver driver1 = new EdgeDriver();
        OpenBrowser(driver1, "https://katalon-demo-cura.herokuapp.com"); // Step 1: Start from homepage

        driver1.manage().window().maximize();

        // Step 2: Click "Make Appointment" button on home page
        WebElement makeAppointmentButton = driver1.findElement(By.id("btn-make-appointment"));
        makeAppointmentButton.click();

        // Step 3: Now do login
        WebElement input_username= driver1.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
        input_username.sendKeys("John Doe");

        WebElement input_password= driver1.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        input_password.sendKeys("ThisIsNotAPassword");

        WebElement login_button= driver1.findElement(By.xpath("//button[text()=\"Login\"]"));
        login_button.click();

        Thread.sleep(3000); // Small wait to let page load

        // Step 4: Now verify "Make Appointment" text
        WebElement verify_text = driver1.findElement(By.xpath("//h2[text()='Make Appointment']"));
        Assert.assertEquals(verify_text.getText(), "Make Appointment");

        CloseBrowser(driver1);
    }

}
