package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver webDriver){
        driver=webDriver;

    }
    @FindBy(xpath="//a[contains(@href,'https://www.makemytrip.com/railways/')]")
    WebElement train;

    @FindBy(id="fromCity")
    WebElement from;


    @FindBy(xpath = "//span[text()='Chennai']" )
    WebElement sourceCity;



    @FindBy(id="toCity")
    WebElement to;


    @FindBy(xpath = "//span[text()='Mumbai']" )
    WebElement toCity;

    @FindBy(id="travelDate")
    WebElement date;

    @FindBy(xpath="//div[text()='29']")
    WebElement selectDate;

    @FindBy(xpath = "//a[text()='Search']")
    WebElement search;

    @FindBy(xpath = "//li[text()='Sleeper Class']")
    WebElement clas;





    public void navigateToHomePage() throws InterruptedException {

        driver.get("https://www.makemytrip.com/");
        Thread.sleep(3000);

        train.click();
        Thread.sleep(2000);


    }
    public void travelPage() throws InterruptedException {
        from.click();
        Thread.sleep(2000);

        sourceCity.click();
        Thread.sleep(2000);

        toCity.click();
        Thread.sleep(2000);

        selectDate.click();
        Thread.sleep(2000);

        clas.click();
        Thread.sleep(3000);

        search.click();
        Thread.sleep(2000);

    }
}
