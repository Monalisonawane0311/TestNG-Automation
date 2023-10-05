package failedTestCasesExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCases {

    @Test
    public void testA(){
        Assert.assertTrue(true);
    }
    @Test
    public void testB(){
        Assert.assertTrue(true);

    }
    @Test
    public void testC(){
        Assert.assertTrue(true);

    }
    @Test
    public void testD(){
        Assert.assertTrue(false);

    }
    @Test                                                                                                //(retryAnalyzer = ReRunFailedTestCases.class) //*used for setRetryAnalyser
    public void testE(){
        Assert.assertTrue(false);

    }

}
