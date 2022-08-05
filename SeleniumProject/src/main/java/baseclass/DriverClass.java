package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class DriverClass {
    static DriverClass driverClass;
    public WebDriver driver;
    private DriverClass(){
        System.setProperty("webdriver.chrome.driver", "/Users/saimounik/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static DriverClass getInstanceOfDriverClass(){

        driverClass = new DriverClass();

        return driverClass;
    }
    public WebDriver getDriver(){
        return driver;
    }
}
