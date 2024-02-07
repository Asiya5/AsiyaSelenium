package com.fall23.demoqa.mouseInteractions;

import com.fall23.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static com.fall23.demoqa.WebDriverManager.openTheSite;
import static org.testng.Assert.assertEquals;

public class HWRadioButton extends BaseTest {

    @Test
    void RadioBtnYes() throws InterruptedException {
        openTheSite("https://demoqa.com/radio-button");
        WebElement RadioBtnYes = driver.findElement(By.cssSelector(".custom-control-label"));
        Actions actions = new Actions(driver);
        actions.click(RadioBtnYes).perform();
        Thread.sleep(5000);
    }

    @Test
    void RadioBtnImpressive() throws InterruptedException {
        openTheSite("https://demoqa.com/radio-button");
        WebElement RadioBtnImpressive = driver.findElement(By.cssSelector(".custom-control-label"));
        Actions actions = new Actions(driver);
        actions.click(RadioBtnImpressive).perform();
        Thread.sleep(5000);
    }

}
// actions.click(findElementById("yesRadio")).perform();
//         String actualYesMessage = findElementByXPath("//span[text()='Yes']").getText();
//         assertEquals(actualYesMessage, "Yes");
//         }
//@Test(description = "On the site click Impressive btn", dependsOnMethods = {"YesBtnClickTest"})
//    void ImpressiveBtnClickTest() {
//            actions.click(findElementById("impressiveRadio")).perform();
//            String actualImpressiveMessage = findElementByXPath("//span[text()='Impressive']").getText();
//            assertEquals(actualImpressiveMessage, "Impressive");
//            }