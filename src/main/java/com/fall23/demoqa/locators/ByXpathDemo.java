package com.fall23.demoqa.locators;

import com.fall23.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.demoqa.WebDriverManager.openTheSite;

public class ByXpathDemo extends BaseTest {

    @Test
    void demo() throws InterruptedException {
        openTheSite("https://demoqa.com/text-box");
        WebElement fullNameInput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
        fullNameInput.sendKeys("John Doe");
        Thread.sleep(5000);
    }
//    @Test
//    void demo2() throws InterruptedException {
//        openTheSite("https://nambafood.kg/?language=en");
//        WebElement fullNameInput2 = driver.findElement(By.xpath("(//input[@id=' sda_user_registration_form_firstname'])[1]"));
//        fullNameInput2.sendKeys("Asiya");
//        Thread.sleep(5000);
//    }

   public class Test1NambaFoodLoginPage extends BaseTest {

        @Test
        void nambaRegistation(){
            openTheSite("https://nambafood.kg/");
            WebElement logibtn = driver.findElement(By.xpath("(//button[@class='btn menu-link'])[2]"));
            logibtn.click();
            WebElement userName =driver.findElement(By.xpath("//input[@id='username']"));
            WebElement userPassword = driver.findElement(By.xpath("//input[@id='password']"));
            userName.sendKeys("temirkanovaasiya@gmail.com");
            userPassword.sendKeys(".LHzx8Gek9KM3Cv");
        }
    }


}
