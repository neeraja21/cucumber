package Demo;



import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("^User must be on login page$")
	public void user_must_be_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^Login using below credentials$")
	public void login_using_below_credentials(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
		List<Map<String,String>> credential = arg1.asMaps(String.class, String.class);
		for(int i=0;i<credential.size();i++)
		{
			System.out.println(credential.get(i).get("username")+"\t"+credential.get(i).get("password"));
		}

	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
	}

	@Then("^User enters Home page$")
	public void user_enters_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}





}



	

	


