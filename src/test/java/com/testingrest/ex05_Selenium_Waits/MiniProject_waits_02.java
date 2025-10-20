package com.testingrest.ex05_Selenium_Waits;

import com.testingrest.CommonAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MiniProject_waits_02 extends CommonAll {

    @Description("Verify  makemytrip opens with modal")
    @Test
    public void testCloseModal() {

        WebDriver driver1 = new EdgeDriver();
        driver1.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver1.getTitle());

        waitForVisibility(driver1, 5, "//span[@data-cy=\"closeModal\"]");

        WebElement closeModel = driver1.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeModel.click();


        CloseBrowser(driver1);
    }
}
