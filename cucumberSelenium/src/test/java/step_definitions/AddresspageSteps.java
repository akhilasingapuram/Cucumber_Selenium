package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Addresspage;
import pages.DriverBase;

public class AddresspageSteps {

    public WebDriver driver;
    Addresspage addresspage;

    @Then("I click on New Address")
    public void Click_Newaddress() {
        driver= DriverBase.get().getDriver("chrome");
        addresspage = new Addresspage(driver);
        addresspage.Click_Newaddress();
    }

    @Then("I enter fisrtname (.*)")
    public void String_firstname(String firstname) {
        addresspage.String_firstname(firstname);
    }

    @Then("I enter lastname (.*)")
    public void String_lastname(String lastname) {
        addresspage.String_lastname(lastname);
    }

    @Then("I enter Address1 details (.*)")
    public void String_Address1(String Address1) {
        addresspage.String_Address1(Address1);
    }

    @When("I entered Address2 details (.*)")
    public void String_Address2(String Address2) {
        addresspage.String_Address2(Address2);
    }

    @When("I have entered the city name(.*)")
    public void String_city(String city) {
        addresspage.String_city(city);
    }

    @Then("I will select state from the dropdown (.*)")
    public void Select_address_state(String state) {
        addresspage.Select_address_state(state);
    }

    @Then("I will enter the postal zipcode(.*)")
    public void address_zipcode(String zipcode) {
        addresspage.address_zipcode(zipcode);
    }

    @Then("I will select United States")
    public void address_country_us() {
        addresspage.click_addressUs();
    }

    @Then("I will select Canada")
    public void address_country_canada() {
        addresspage.click_addressCanada();
    }

    @Then("I will enter the date in textbox(.*)")
    public void address_date(String address_Date) {
        addresspage.address_date(address_Date);
    }

    @Then("I will enter the age in textbox(.*)")
    public void address_age(String address_Age) {
        addresspage.Address_age(address_Age);
    }

    @Then("I will enter the website details(.*)")
    public void address_website(String address_Website) {
        addresspage.address_website(address_Website);
    }

    @Then("I will enter the Phone number(.*)")
    public void address_phone(String address_Phone) {
        addresspage.address_phone(address_Phone);
    }

    @Then("I choose interests (.*)")
    public void choose_interest(String interest) {
        String[] interests = interest.split(",");
        for (String name : interests
        ) {
            addresspage.choose_interest(name);

        }

    }
    @Then("I will enter in the note textbox(.*)")
    public void address_note(String address_Note){
        addresspage.address_note(address_Note);
    }
    @Then("I will click on (create|update) address")
    public void click_submit(){
        addresspage.click_submit();
    }
    @Then("I will click on edit")
    public void click_edit(){
        addresspage.click_edit();
    }
    @Then("I will click on signout")
    public void click_signout(){
        addresspage.click__signout();
    }


}
