package firstTestNg;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;


public class SecondProgramExample {
    public static WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        System.getProperty("WebDriver.chrome.driver", "C:\\Users\\khair\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testCase1(){
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();
    }

    @Test
    public void testCase2(){
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }

}
