package com.fall23.demoqa.locators;

import com.fall23.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.demoqa.WebDriverManager.openTheSite;

public class ByClassNameDemo  extends BaseTest {
@Test
    void demo1(){
    openTheSite("https://demoqa.com/webtables");

    WebElement usernameInput = driver.findElement(By.id("userName"));
    WebElement emailInput = driver.findElement(By.id("userEmail"));
    WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
    WebElement submitBtn = driver.findElement(By.id("submit"));
    WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));

    usernameInput.sendKeys("John");
    emailInput.sendKeys("john@gmail.com");
    currentAddressInput.sendKeys("WallStreet 555");
    permanentAddressInput.sendKeys("Sovet 123 ");

    submitBtn.click();


}



}
