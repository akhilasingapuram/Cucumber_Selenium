package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.rmi.CORBA.Util;

public class Homepage extends Basepage {
    @FindBy(css = "a[id='sign-in']")
    WebElement signin_Link;

    @FindBy(css = "input[id='session_email']")
        WebElement Email_textbox;
    WebDriver driver;

    @FindBy(css = "input[id='session_password']")
    WebElement password_textbox;

    @FindBy(css = "input[name='commit']")
    WebElement click_signin;

    @FindBy(css = "a[data-test='addresses']")
    WebElement click_Addresses;

    //Util util=new Util();
    public Homepage(WebDriver driver) {
        super(driver);
        //This intiElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public void launch_url() {
        launch("http://a.testaddressbook.com/");

//        driver.get("http://a.testaddressbook.com/");
    }

    public void click_Header(String name) {
        switch (name) {
            case "signin_Link":
                click(signin_Link);
                break;
            default:
                System.out.println("Enter a valid link name");
                break;
        }
        waitforPagetoLoad();
    }
    public void enter_Email(String Email){
      set_value(Email_textbox, Email);

    }
    public void enter_password(String password){
        set_value(password_textbox, password);
    }
    public void Click_signin(){
        click(click_signin);
        waitforPagetoLoad();
    }
    public void Click_Addresses(){
        click(click_Addresses);
        waitforPagetoLoad();
    }
}
