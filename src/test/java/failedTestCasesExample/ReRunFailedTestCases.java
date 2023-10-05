package failedTestCasesExample;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailedTestCases implements IRetryAnalyzer {

    public static  int maxRetryCount = 3;
    public static int minRetryCount =0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(minRetryCount<maxRetryCount)
        {
            minRetryCount++;
            return true;
        }
        return false;
    }
}
