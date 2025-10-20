package com.testingrest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CommonAll {

    public EdgeDriver driver1;

    public void OpenBrowser(WebDriver driver, String url){
        driver.get(url);

    }

    public void CloseBrowser(WebDriver driver){

        driver.quit();
    }
}
