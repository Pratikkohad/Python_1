//package stepDefination;
//
//import cucumber.api.java.en.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//import java.util.concurrent.TimeUnit;
//
//public class Contact_stepDe
//{
//    WebDriver driver;
//    Actions action;
//     @When("^user mouse to new contact page$")
//    public void user_mouse_to_new_contact_page() throws Throwable
//    {
//        System.out.println("Contact Page Step1");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.switchTo().frame("mainpanel");
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//        driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//    }
//
//
//    @Then("^user enters (.*) and (.*) and (.*)$")
//    public void user_enters_firstname_and_lastname_and_position(String Firstname, String Lastname , String position)
//    {
//        System.out.println("Contact Page Step2");
//        System.out.println( Firstname +" --->  "+ Lastname+" --->  "+ position);
//    }
//}
