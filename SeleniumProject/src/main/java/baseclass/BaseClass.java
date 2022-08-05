package baseclass;

import org.openqa.selenium.WebDriver;
public class BaseClass {
    protected WebDriver driver;
    DriverClass driverClass;
    public BaseClass(){
        driverClass = DriverClass.getInstanceOfDriverClass();
    }
    public WebDriver getDriver(){
        return driverClass.getDriver();
    }
}
