package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrainPage {
    WebDriver driver;

    public TrainPage(WebDriver webDriver){
        driver=webDriver;

    }

    @FindBy(id="quickFilter-departureAfter6")
    WebElement filter;

    @FindBy(xpath = "//div[text()='SL']")
    WebElement sleeper;


    public void setFilter(){
        filter.click();
    }
    public void setSleeper(){
        sleeper.click();
    }
}
