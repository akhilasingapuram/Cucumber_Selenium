package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DriverBase;
import pages.Homepage;

public class HomepageSteps {
    public WebDriver driver;
    Homepage homepage;

    @Given("Launch the browser")
    public void launch_browser(){
        WebDriverManager.chromedriver().setup();
        System.out.println("property for chrome driver:" + System.getProperty("webdriver.chrome.driver"));
//        driver = new ChromeDriver();
        driver= DriverBase.get().getDriver("chrome");
        homepage =new Homepage(driver);
        homepage.launch_url();
    }
    @When("I click link (.*)")
    public void click_Header(String headername){
        homepage.click_Header(headername);

    }

    @When("I enter email (.*)")
    public void enter_Email(String Email){
        homepage.enter_Email(Email);
    }
    @When("I enter password (.*)")
    public void enter_password(String password){
        homepage.enter_password(password);
    }
    @Then("I click on signin")
    public void Click_signin(){
        homepage.Click_signin();
    }
    @Then("I click on Addresses")
    public void Click_Addresses(){
        homepage.Click_Addresses();
    }
}
