package firstTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunExample {
    //Depends On Group
    @Test(groups = {"smoke"})
    public void verifyLogin(){
        System.out.println("Verify Login Page");
        Assert.assertFalse(true);
    }
    @Test
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }
    @Test
    public void verifySendRequest(){
        System.out.println("Verify Send Request");
    }
    @Test(dependsOnGroups = {"smoke"}, alwaysRun = true)     //verifyLogin TC failed due to all depends test cases on verify login are skipped
    public void verifyViewProfile(){                       // this tc failed due to dependsOnGroup Parameter but alwaysRun parameter run(pass) that Test case
        System.out.println("Verify View Profile");
    }
    @Test                                                          //this test case run independently
    public void uploadPhoto(){
        System.out.println("Uploading photo");
    }
}
