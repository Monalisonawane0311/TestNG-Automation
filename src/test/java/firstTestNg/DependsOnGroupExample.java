package firstTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    @Test(groups = {"smoke"})
    public void verifyLogin() {
        System.out.println("Verify Login Page");
        Assert.assertFalse(true);
    }

    @Test
    public void verifyHomePage() {
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifySendRequest() {
        System.out.println("Verify Send Request");
    }

    @Test(dependsOnGroups = {"smoke"})
    //verifyLogin TC failed due to all depends test cases on verify login are skipped
    public void verifyViewProfile() {
        System.out.println("Verify View Profile");
    }

    @Test  (groups = {"smoke"})                                                    //this test case run independendly
    public void uploadPhoto() {
        System.out.println("Uploading photo");
    }
}
