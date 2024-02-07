package com.fall23.demoqa.mouseInteractions;

import com.fall23.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



import static com.fall23.demoqa.WebDriverManager.openTheSite;
import static org.testng.Assert.assertEquals;


public class AdvancedMouseInteractions  extends BaseTest {

    @Test
    void doubleClickTest() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform();

        String actialDoubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();

        assertEquals(actialDoubleClickMessage,"You have done a double click");

        Thread.sleep(5000);
    }
    @Test
    void rightClickTest() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement rightClickbtn = driver.findElement(By.id("rightClickBtn"));

        actions.contextClick(rightClickbtn).perform();
        String actualContextClickMessage = driver.findElement(By.id("rightClickMessage")).getText();
        assertEquals(actualContextClickMessage,"You have done a right click");
        Thread.sleep(5000);
    }

    @Test
    void dynamicClickTest() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.click(clickBtn).perform();
        String actualDynamicClickMessage = driver.findElement(By.id("dynamicClickMessage")).getText();
        assertEquals(actualDynamicClickMessage,"You have done a dynamic click");
        Thread.sleep(5000);
    }
    }

