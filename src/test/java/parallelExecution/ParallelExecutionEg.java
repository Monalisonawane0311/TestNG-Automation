package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelExecutionEg {

    @Test
    public void testCase1(){
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void testCase2(){
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void testCase3(){
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void testCase4(){
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.ajio.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void testCase5(){
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.myntra.com/");
        driver.manage().window().maximize();
        driver.close();
    }



}
