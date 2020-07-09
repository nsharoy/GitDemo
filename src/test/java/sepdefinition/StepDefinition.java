package sepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class StepDefinition  extends base {

    @Given("^Login as admin go to academy$")
    public void login_as_admin_go_to_academy() throws Throwable {
    	System.out.println("login to academy");
    	
        
    }
    @When("^enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void enter_username_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("login with credential");
    	System.out.println(arg1);
    	System.out.println(arg2);
    	LandingPage l=new LandingPage(driver);
		LoginPage lp=l.getLogin(); //driver.findElement(By.css()
		lp.getEmail().sendKeys(arg1);
		lp.getPassword().sendKeys(arg2);
		lp.getLogin().click();
    	
      
    	
    }
    @Given("^Go to \"([^\"]*)\"$")
    public void go_to(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	driver = initializeDriver();
    	driver.get(prop.getProperty("url"));
        
    }
   
  /*  @Given("^check home page link$")
    public void check_home_page_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
*/

    @When("^enter username and password$")
    public void enter_username_and_password() throws Throwable {
    	System.out.println("enter username and password"); 
    }

    @Then("^Navigate to homepage$")
    public void navigate_to_homepage() throws Throwable {
    	System.out.println("Navigate to homepage");   
    }
    

}