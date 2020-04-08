package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverBase {
    public WebDriver driver;
    private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

    public static DriverBase get() {
        return new DriverBase();

    }

    public WebDriver getDriver(String browser) {
        if (driverThread.get() == null) {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    System.out.println("Property for chrome driver:" + System.getProperty("webdriver.chrome.driver"));
                    driver = new ChromeDriver();
                    driverThread.set(driver);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    System.out.println("Property for firefox driver:" + System.getProperty("webdriver.gecko.driver"));
                    driver = new FirefoxDriver();
                    driverThread.set(driver);
                    break;
            }
        }
        return driverThread.get();
    }

    public void quitDriver(WebDriver driver) {
        driverThread.get().quit();
        driverThread.remove();
    }
}
