package firstTestNg;


import org.testng.annotations.Test;

public class DescriptionExample {
    @Test(description = "This is a car")             //describes the method using Description
    public void nexonCar(){
        System.out.println("This is Electric Car");
    }
}
