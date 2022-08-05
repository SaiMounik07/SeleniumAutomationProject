package Actions;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageActions {

    public HomePage homePage;

    public HomePageActions(WebDriver driver) {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    public void onHome() throws InterruptedException {
        homePage.navigateToHomePage();
        }

        public void onTravel() throws InterruptedException {
        homePage.travelPage();
        }


}
