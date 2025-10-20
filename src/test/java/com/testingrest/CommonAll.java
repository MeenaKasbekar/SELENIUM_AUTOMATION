package com.testingrest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonAll {

    public EdgeDriver driver1;

    public void OpenBrowser(WebDriver driver, String url){
        driver.get(url);

    }

    public void CloseBrowser(WebDriver driver){

        driver.quit();
    }

    public void waitForVisibility(WebDriver driver,int timeInSeconds, String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
}
