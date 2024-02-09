import com.fall23.demoqa.ui.config.ConfigReader;
import com.fall23.demoqa.ui.drivers.Driver;
import com.fall23.demoqa.ui.helper.WindowHelper;
import com.fall23.demoqa.ui.pages.TextBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextBoxTest  {

    WebDriver driver;
    TextBoxPage textBoxPage;

    @BeforeClass
    void setUpDriver(){
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();

    }

    @Test
    void fillUpTheFormPositiveTest(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage
                .fillUpFullName("John Doe")
                .fillUpEmail("John@gmail.com")
                .fillUpCurrentAddress("Mira 123")
                .fillUpPermanentAddress("Sovet str 321")
                .clickSubmitBtn();

    }
    @Test
    void test123(){

            WebDriver driver = Driver.getDriver();
            driver.get("https://demoqa.com/browser-windows");
            WebElement newTab = Driver.getDriver().findElement(By.id("tabButton"));
            for(int i = 0; i <3; i++){
                newTab.click();
            }
           // WindowHelper windowHelper = new WindowHelper(driver);
           // windowHelper.switchToWindow(1);


        }
}
