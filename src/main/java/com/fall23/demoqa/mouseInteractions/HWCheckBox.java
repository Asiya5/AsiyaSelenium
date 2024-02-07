package com.fall23.demoqa.mouseInteractions;

import com.fall23.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.demoqa.WebDriverManager.openTheSite;
import static com.fall23.demoqa.WebElementManager.scrollDownWithActions;
import static org.testng.Assert.assertEquals;

public class HWCheckBox extends BaseTest {

    @Test
    void homeClick() throws InterruptedException {
        openTheSite("https://demoqa.com/checkbox");

        WebElement clickBtnHome = driver.findElement(By.cssSelector(".rct-collapse-btn"));
        clickBtnHome.click();
        Thread.sleep(3000);
        WebElement[] che = driver.findElements(By.xpath("//div[@id=\"tree-node\"]/ol/li/ol/li/span/button[@title=\"Toggle\"]"))
                .toArray(new WebElement[0]);
        scrollDownWithActions(0,500);



        for(WebElement chekBtn: che){
           chekBtn.click();
       }






    }
}
