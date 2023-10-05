package firstTestNg;
import org.testng.annotations.*;

public class FirstProgram {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }
    @Test
    public void testCase1(){
        System.out.println("Test case 1");
    }
    @Test
    public void testCase2(){
        System.out.println("Test case 2");
    }

 @Test
    public void testCase4(){
        System.out.println("Test case 4");
    }
    @AfterMethod
    public void test1() {
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }
 	  @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }


}

