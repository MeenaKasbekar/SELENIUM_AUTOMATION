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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MiniProject_02_Corrected extends CommonAll {

    @Description("Project_02")
    @Owner("Meena Kasbekar")
    @Severity(SeverityLevel.MINOR)
    @Test
    public void login() throws InterruptedException {

        WebDriver driver1 = new EdgeDriver();

        // Step 1: Open homepage, not direct login URL
        OpenBrowser(driver1, "https://katalon-demo-cura.herokuapp.com");

        driver1.manage().window().maximize();


        // Step 2: Click "Make Appointment" button using XPath
        WebElement makeAppointmentButton = driver1.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        makeAppointmentButton.click();

        // Step 3: Enter Username using XPath
        WebElement input_username = driver1.findElement(By.xpath("//input[@placeholder='Username']"));
        input_username.sendKeys("John Doe");

        // Step 4: Enter Password using XPath
        WebElement input_password = driver1.findElement(By.xpath("//input[@placeholder='Password']"));
        input_password.sendKeys("ThisIsNotAPassword");

        // Step 5: Click Login button using XPath
        WebElement login_button = driver1.findElement(By.xpath("//button[text()='Login']"));
        login_button.click();

        // Step 6: Wait for and verify "Make Appointment" heading using XPath
        WebElement verify_text = driver1.findElement(By.xpath("//h2[text()='Make Appointment']"));
        Assert.assertEquals(verify_text.getText(), "Make Appointment");

        CloseBrowser(driver1);
    }
}

