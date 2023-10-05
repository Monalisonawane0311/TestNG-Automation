package firstTestNg;

import org.testng.annotations.Test;

public class InvocationCountExample {
    @Test(invocationCount = 10)                                         // can give the count any positive value like 10000 also
    public  void invocationCount(){
        System.out.println("This is TestNG");
    }
    @Test(invocationCount = 100,invocationTimeOut = 10)                 //invocation time out define in seconds
    public void invocationTimeOut(){
        System.out.println("Hi, This is Selenium With TestNG");
    }
}
