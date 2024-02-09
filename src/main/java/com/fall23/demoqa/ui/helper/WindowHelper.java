package com.fall23.demoqa.ui.helper;

import com.fall23.demoqa.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.Set;

public class WindowHelper {

    private WebDriver driver;

    public WindowHelper(WebDriver driver){
        this.driver = driver;
    }


    public Set<String>getWindowHandles(){
        return driver.getWindowHandles();
    }

    public void switchToWindow(int index){
        LinkedList<String> windowsId = new LinkedList<>(
                getWindowHandles());
        if(index < 0 || index > windowsId.size()){
            throw new IllegalArgumentException("You provide wrong Index");
        }
        Driver.getDriver().switchTo().window(windowsId.get(index));
    }





    }

