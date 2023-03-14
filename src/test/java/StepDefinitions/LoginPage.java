package StepDefinitions;

import DemoP.PageClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {

    @Given("we are on login page of google")
    public void we_are_on_login_page_of_google() {
        System.out.println("Calling login function from PageClas");
        PageClass.login();

    }
    @When("search IBM jobs")
    public void search_ibm_jobs() throws InterruptedException {
        PageClass.search();
        Thread.sleep(5000);
        System.out.println("Search in google");


    }
    @Then("list out available jobs as a result")
    public void list_out_available_jobs_as_a_result() {
        System.out.println("All IBM jobs");

    }
}
