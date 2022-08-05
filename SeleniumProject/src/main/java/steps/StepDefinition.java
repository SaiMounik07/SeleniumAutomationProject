package steps;

import Actions.BookingPageActions;
import Actions.HomePageActions;
import Actions.TrainPageActions;
import baseclass.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
    public StepDefinition() {
    }

    @Before
    public void setup() {
        driver = super.getDriver();
    }
//    @After
//    public void cleanUp()
//    {
//        driver.close();
//    }

@Given("open makemyTrip website")
    public void openTheApp() throws InterruptedException {
Thread.sleep(3000);
    HomePageActions homePageActions=new HomePageActions(driver);
    homePageActions.onHome();


}

    @When("click on travel option")
    public void clickOnTravelOption() throws InterruptedException {
    HomePageActions homePageActions=new HomePageActions(driver);
    homePageActions.onTravel();
    }

    @Then("Display the travel option")
    public void displayTheTravelOption() throws InterruptedException {
        TrainPageActions trainPageActions=new TrainPageActions(driver);
        trainPageActions.setTrainPage();
        Thread.sleep(4000);
        trainPageActions.setSleeper();
    }

    @And("Click on train option and book")
    public void clickOnTrainOption() throws InterruptedException {
        BookingPageActions bookingPageActions=new BookingPageActions(driver);
        bookingPageActions.cancelAmount();
        Thread.sleep(2000);
        bookingPageActions.traveller();
        Thread.sleep(2000);
        bookingPageActions.userName();
        Thread.sleep(2000);
        bookingPageActions.details();
    }
}