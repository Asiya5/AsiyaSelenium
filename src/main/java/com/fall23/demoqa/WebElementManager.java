package com.fall23.demoqa;

import com.fall23.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebElementManager extends BaseTest {

    public static WebElement findById(String Element) {
        return driver.findElement(By.id(Element));
    }

    public static WebElement findByEmail(String Element){
        return driver.findElement(By.id(Element));
    }

    public static WebElement findByCurrentAddress(String Element){
        return driver.findElement(By.id(Element));
    }

    public static WebElement findByPermanentAddress(String Element){
        return driver.findElement(By.id(Element));
    }

    public static WebElement findBySubmitBtn(String Element){
        return driver.findElement(By.id(Element));
    }


        //Actions аналог JavaScript ex
        public static void scrollDownWithActions(int y,int pixels) {
            Actions actions = new Actions(driver);
            actions.scrollByAmount(y,pixels);
        }

       // public static void (String[] args) {
           // scrollDownWithActions(driver, 2);

        }






