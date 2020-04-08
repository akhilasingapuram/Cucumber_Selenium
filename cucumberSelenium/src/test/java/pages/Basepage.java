package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
    public WebDriver driver;
    private WebDriverWait wait;

    public Basepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }
    public Basepage(){

    }
    public void launch(String url) {
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
    public void closewindow(){
        driver.close();

    }
    public void waitForElement_Clickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void set_value(WebElement element, String inputvalue){
        waitForElement_Clickable(element);
        element.clear();
        element.sendKeys(inputvalue);
    }
    public void click(WebElement element){
        waitForElement_Clickable(element);
        element.click();
        waitforPagetoLoad();
    }
    public void waitforPagetoLoad() {

        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        wait.until(pageLoadCondition);
    }
    public void action_Click(WebElement element){
        Actions actions=new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }
    public void SelectByValue(WebElement element, String listvalue){
        Select select= new Select(element);
        select.selectByValue(listvalue);
    }
    public void selectByVisibleText(WebElement element, String listvalue){
        Select select=new Select(element);
        select.selectByVisibleText(listvalue);
    }
}