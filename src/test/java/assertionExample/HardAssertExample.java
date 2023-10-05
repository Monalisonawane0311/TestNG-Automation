package assertionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertExample {
    public static  WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();

    }
    @Test
    public void testCase1(){
        String actualTitle = driver.getTitle();
        String expectedTitle = ("Google");
        Assert.assertEquals(actualTitle,expectedTitle,"Title should be matched");

      //  WebElement element = driver.findElement(By.id("APjFqb"));
       // element.sendKeys("Manual Testing");
    }
    @Test
    public void testCase2(){
        WebElement element1 = driver.findElement(By.xpath("//input[@class='gNO89b']"));     //display google search
        Assert.assertFalse(element1.isDisplayed(), "Display the Search Button");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
