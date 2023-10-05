package firstTestNg;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 1)
    public void loginTest(){
        System.out.println("Login successfully");
    }
    @Test(priority = -1)
    public void registerTest(){
        System.out.println("Register Successfully");
    }
    @Test(priority = 0,groups = {"smoke"})
    public void sendEmailTest(){
        System.out.println("Send Email");
    }
    @Test
    public void composeEmail(){
        System.out.println("Compose Email");
    }
    @Test(priority = 4)
    public void closeBrowserTest(){
        System.out.println("Close the Browser");
    }
    @Test(priority = 'c',groups = {"smoke"})
    public void forgotPassword(){
        System.out.println("Forgot Password");
    }

}
