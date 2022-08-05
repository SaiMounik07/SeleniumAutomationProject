package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPages {
    WebDriver driver;

    public BookingPages(WebDriver webDriver) {
        driver = webDriver;
    }
    @FindBy(id="1_key")
    WebElement cancel;

    @FindBy(xpath="//span[text()='Add Traveller']")
    WebElement traveller;

    @FindBy(xpath = "//input[contains(@name,'name')]")
    WebElement name;

    @FindBy(xpath = "//input[contains(@name,'age')]")
    WebElement age;

    @FindBy(xpath = "//span[text()='Not Specified']")
    WebElement notSpec;

    @FindBy(xpath = "//span[text()='Male']")
    WebElement male;

    @FindBy(xpath="//span[text()='No Berth Preference']")
    WebElement berth;

    @FindBy(xpath = "//span[text()='Lower']")
    WebElement lower;

    @FindBy(xpath="//a[text()='Add']")
    WebElement add;

    @FindBy(xpath = "//span[@class='checkBox  appendRight20']")
    WebElement checkBox;

    @FindBy(id="irctcUserName")
    WebElement username1;

    @FindBy(xpath = "//input[@name='IRCTCUserName']")
    WebElement getUsername2;

    @FindBy(xpath = "//span[text()='Submit']")
    WebElement submit;

    @FindBy(xpath = "//span[@class='modalClose railSprite crossIcon']")
    WebElement cross;

    @FindBy(xpath = "//input[@name='email id']")
    WebElement mail;

    @FindBy(xpath = "//input[@name='Mobile Number']")
    WebElement num;

    @FindBy(xpath = "//span[text()='Pay & Book Now']")
    WebElement pay;

    public void setCancel(){
        cancel.click();
    }
    public void addTraveller() throws InterruptedException {
        traveller.click();
        Thread.sleep(4000);
        name.click();
        Thread.sleep(2000);
        name.sendKeys("sai mounik");
        Thread.sleep(2000);
        age.click();
        Thread.sleep(2000);
        age.sendKeys("21");
        Thread.sleep(2000);
        notSpec.click();
        Thread.sleep(2000);
        male.click();
        Thread.sleep(2000);
        berth.click();
        Thread.sleep(2000);
        lower.click();
        Thread.sleep(2000);
        add.click();
        Thread.sleep(2000);
        checkBox.click();
        Thread.sleep(2000);
    }

    public void setUsername1() throws InterruptedException {
        username1.click();
        Thread.sleep(3000);
        getUsername2.sendKeys("saimounic3");
        Thread.sleep(2000);
        submit.click();
        Thread.sleep(2000);
       // cross.click();


    }
    public void details() throws InterruptedException {
        mail.click();
        mail.sendKeys("asaimounik@gmail.com");
        Thread.sleep(2000);
        num.click();
        num.sendKeys("9360485339");
        Thread.sleep(2000);

        pay.click();

    }


}