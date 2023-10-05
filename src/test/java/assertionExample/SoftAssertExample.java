package assertionExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void testCase1() {
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();

        SoftAssert softAssert = new SoftAssert();

        String actualTitle = driver.getTitle();
        String expectedTitle = ("Google");
        softAssert.assertEquals(actualTitle, expectedTitle, "Title should be matched");
        softAssert.assertAll();


    }
}