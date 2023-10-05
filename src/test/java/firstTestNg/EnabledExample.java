package firstTestNg;

import org.testng.annotations.Test;

public class EnabledExample {
    @Test
    public void userName(){
        System.out.println("Enter the User Name");
    }

    @Test(enabled = false)
    public void password() {
        System.out.println("Enter The Password: ");
    }

    @Test
    public void login(){
        System.out.println("Click on the login");
    }
}

