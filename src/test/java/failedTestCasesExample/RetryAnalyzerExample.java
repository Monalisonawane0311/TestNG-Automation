package failedTestCasesExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RetryAnalyzerExample
{
    @Test(retryAnalyzer = FailedRetryAnalyzerExample.class)
    public  void Test1(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false);
        softAssert.assertAll();

    }
    @Test(retryAnalyzer = FailedRetryAnalyzerExample.class)
    public void Test2(){
        Assert.assertEquals(false, true);
    }


}
