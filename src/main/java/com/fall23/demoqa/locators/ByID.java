package com.fall23.demoqa.locators;

import com.fall23.demoqa.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static com.fall23.demoqa.WebDriverManager.openTheSite;
import static com.fall23.demoqa.WebElementManager.*;

public class ByID extends BaseTest {

    @Test
    void byIdTest() throws InterruptedException {
       openTheSite("https://demoqa.com/text-box");

        findById("userName").sendKeys("Asiya");
        findByEmail("userEmail").sendKeys("temirkanovaasiya@gmail.com");
        findByCurrentAddress("currentAddress").sendKeys("Razzakov str 1");
        findByPermanentAddress("permanentAddress").sendKeys("Ogonbaev str 107");
        findBySubmitBtn("submit").sendKeys("click");
        Thread.sleep(5000);


       // WebElement usernameInput = driver.findElement(By.id("userName"));
       // WebElement emailInput = driver.findElement(By.id("userEmail"));
       // WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        //WebElement submitBtn = driver.findElement(By.id("submit"));
       // WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));

       // usernameInput.sendKeys("John");
       // emailInput.sendKeys("john@gmail.com");
       // currentAddressInput.sendKeys("WallStreet 555");
       // permanentAddressInput.sendKeys("Sovet 123 ");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");





       // submitBtn.click();


    }

}
