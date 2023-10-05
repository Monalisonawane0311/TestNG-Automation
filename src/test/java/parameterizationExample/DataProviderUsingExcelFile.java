package parameterizationExample;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderUsingExcelFile {
    public static WebDriver driver;

    @DataProvider(name = "Data")
    public Object[][] dataProviderFunction() throws IOException {
        Object[][] arrObj = getExcelData("C:\\Users\\khair\\OneDrive\\Desktop\\testData.xlsx", "testCase1");
        return arrObj;
    }
    public String[][] getExcelData(String fileName, String sheetName) throws IOException {
        String[][] data = null;
        FileInputStream fileInputStream = new FileInputStream(fileName);        // access the file
        XSSFWorkbook WB = new XSSFWorkbook(fileInputStream);                    //access the Excel file
        XSSFSheet sheet = WB.getSheet(sheetName);                               // access the sheet name
        XSSFRow row = sheet.getRow(0);                                  // get the index 0 of row
        int noOfRows = sheet.getPhysicalNumberOfRows();                         // get the physical row= 5
        int noOfColumn = row.getLastCellNum();                                  // get the column= 2

        Cell cell;
        data = new String[noOfRows-1][noOfColumn];

        for(int i =1; i<noOfRows; i++ ){
            for(int j=0; j<noOfColumn; j++){
                row =sheet.getRow(i);
                cell = row.getCell(j);
                data[i-1][j]= cell.getStringCellValue();
            }
        }
        return  data;
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
