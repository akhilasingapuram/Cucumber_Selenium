package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresspage extends Basepage {
    @FindBy(css = "a[data-test='create']")
    WebElement click_Newaddress;
    @FindBy(css = "input[id='address_first_name']")
    WebElement firstname_textbox;
    @FindBy(css = "input[id='address_last_name']")
    WebElement lastname_textbox;
    @FindBy(css = "input[id='address_street_address']")
    WebElement Address1_textbox;
    @FindBy(css = "input[id='address_secondary_address']")
    WebElement Address2_textbox;
    @FindBy(css = "input[id='address_city']")
    WebElement city_textbox;
    @FindBy(css = "select[id='address_state']")
    WebElement address_state;
    @FindBy(css = "input[id='address_zip_code']")
    WebElement address_zipcode;
    @FindBy(css = "input[id='address_country_us']")
    WebElement address_country_us;
    @FindBy(css = "input[id='address_country_canada']")
    WebElement address_country_canada;
    @FindBy(css = "input[id='address_birthday']")
    WebElement address_birthday;
    @FindBy(css = "input[type='date']")
    WebElement address_date;
    @FindBy(css = "input[id='address_age']")
    WebElement address_age;
    @FindBy(css = "input[id='address_website']")
    WebElement address_website;
    @FindBy(css = "input[id='address_phone']")
    WebElement address_phone;
    @FindBy(css = "input[id='address_interest_climb']")
    WebElement address_climb;
    @FindBy(css = "input[id='address_interest_dance']")
    WebElement address_dance;
    @FindBy(css = "input[id='address_interest_read']")
    WebElement address_read;
    @FindBy(css = "textarea[id='address_note']")
    WebElement address_note;
    @FindBy(css = "input[data-test='submit']")
    WebElement click_submit;
    @FindBy(css = "a[data-test='edit']")
    WebElement click_edit;
    @FindBy(css = "a[data-test='sign-out']")
    WebElement click__signout;

    public Addresspage(WebDriver driver) {
        super(driver);
        //This intiElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public void Click_Newaddress() {
        click(click_Newaddress);
    }

    public void String_firstname(String firstname) {
        set_value(firstname_textbox, firstname);
    }

    public void String_lastname(String lastname) {
        set_value(lastname_textbox, lastname);
    }

    public void String_Address1(String Address1) {
        set_value(Address1_textbox, Address1);
    }

    public void String_Address2(String Address2) {
        set_value(Address2_textbox, Address2);
    }

    public void String_city(String city) {
        set_value(city_textbox, city);
    }

    public void Select_address_state(String state) {
        selectByVisibleText(address_state, state);
    }

    public void address_zipcode(String zipcode) {
        set_value(address_zipcode, zipcode);
    }

    public void click_addressUs() {
        click(address_country_us);
    }

    public void click_addressCanada() {
        click(address_country_canada);
    }

    public void enter_address_birthday(String address_birthday1) {
        set_value(address_birthday, address_birthday1);
    }

    public void address_date(String address_Date) {
        set_value(address_date, address_Date);

    }

    public void Address_age(String address_Age) {
        set_value(address_age, address_Age);
    }

    public void address_website(String address_Website) {
        set_value(address_website, address_Website);
    }

    public void address_phone(String address_Phone) {
        set_value(address_phone, address_Phone);
    }

    public void choose_interest(String interest) {
        if (interest.equals("reading")) {
            click(address_climb);
        } else if (interest.equals("climbing")) {
            click(address_dance);
        } else if (interest.equals("dancing")) {
            click(address_read);
        }
    }

    public void address_note(String address_Note) {
        set_value(address_note, address_Note);
    }

    public void click_submit() {
        click(click_submit);
    }
    public void click_edit(){
        click(click_edit);
    }
    public void click__signout(){
        click(click__signout);
    }



}
