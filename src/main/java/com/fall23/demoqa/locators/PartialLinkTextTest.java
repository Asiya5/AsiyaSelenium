package com.fall23.demoqa.locators;

import com.fall23.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.demoqa.WebDriverManager.openTheSite;


public class PartialLinkTextTest extends BaseTest {
    @Test
    void demo() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");

        WebElement home = driver.findElement(By.partialLinkText("Unauth"));
        home.click();
        Thread.sleep(5000);

    }




}


