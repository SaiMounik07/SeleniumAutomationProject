package Actions;

import Pages.HomePage;
import Pages.TrainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TrainPageActions {
    public  TrainPage trainPage;
    public TrainPageActions(WebDriver driver) {
        trainPage = PageFactory.initElements(driver, TrainPage.class);
    }

    public void setTrainPage() {
        trainPage.setFilter();
    }
    public void setSleeper(){
        trainPage.setSleeper();
    }
}
