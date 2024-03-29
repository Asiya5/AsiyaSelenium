package com.fall23.demoqa.ui.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeWebDriver {
    public static WebDriver loadChromeDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver-win64/chromedriver.exe");
      WebDriver  driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
}
