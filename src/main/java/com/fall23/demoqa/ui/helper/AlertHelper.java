package com.fall23.demoqa.ui.helper;

import com.fall23.demoqa.ui.drivers.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    private WebDriver driver;

    public Alert getAlert() {
        return driver.switchTo().alert();
    }

    public AlertHelper acceptAlert() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        getAlert().accept();
        return this;
    }

    public AlertHelper dismissAlert() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        getAlert().dismiss();
        return this;


    }

    public AlertHelper dendKeysAlert(String txt){
        getAlert().sendKeys(txt);
        acceptAlert();
        return this;
    }
}
