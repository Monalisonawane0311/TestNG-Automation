package parameterizationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderWithParameterization {
       public static WebDriver driver;

       @DataProvider(name = "Data")
       public Object[][] dataProviderFunction(){
           return  new Object[][]{{"Selenium","Pune"}, {"Java", "Nashik"}};
       }
        @Parameters({"browserName"})
        @BeforeMethod
        public void beforeMethodExample(String browserName){
            if(browserName.equalsIgnoreCase("chrome")) {
                System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
                driver = new ChromeDriver();
            }
            else if (browserName.equalsIgnoreCase("firefox")) {
                System.getProperty("WebDriver.gecko.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
                //  driver = new GeckoDriver();
            }
            else if (browserName.equalsIgnoreCase("edge")) {
                System.getProperty("WebDriver.edge.driver", "\"C:\\Users\\Public\\Desktop\\Microsoft Edge.lnk\"");
                driver = new EdgeDriver();
            }
            else {
                throw new RuntimeException("Please Select The Correct Browser");
            }
            driver.navigate().to("https://www.google.co.in/");
            driver.manage().window().maximize();
        }

        @Test(dataProvider = "Data")
        public void verifyGoogleWebsite(String courseName, String cityName) throws InterruptedException {
            WebElement nameElement = driver.findElement(By.name("q"));
            nameElement.sendKeys(courseName+cityName);
            nameElement.sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            driver.close();
        }
}
