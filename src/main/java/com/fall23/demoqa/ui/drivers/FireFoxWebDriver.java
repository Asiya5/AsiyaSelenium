package com.fall23.demoqa.ui.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxWebDriver {
    //создать метод который будет загружать файрфокс и эдж

    public static WebDriver loadFireFoxWebDriver(){
        System.setProperty("webdriver.firefox.driver","src/main/java/com/fall23/demoqa/ui/drivers/FireFoxWebDriver.java");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
}
