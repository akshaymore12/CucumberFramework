package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPageSteps 
{

@Given("user is at login page")
public void user_is_at_login_page() {
System.out.println("user is at the login page.");
}

@When("user enter the username")
public void user_enter_the_username() {
   System.out.println("user enter the username.");
}

@When("user enter the password")
public void user_enter_the_password() {
    System.out.println("user enter the pass");
}

@When("user click on the login button")
public void user_click_on_the_login_button() {
    System.out.println("user click on the button.");
}

@Then("home page should get displayed")
public void home_page_should_get_displayed() {
 System.out.println("home page get displayed.");
}		

}
