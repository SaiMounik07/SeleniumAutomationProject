package Actions;

import Pages.BookingPages;
import Pages.TrainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BookingPageActions {

    public BookingPages bookingPages;
    public BookingPageActions(WebDriver driver) {
        bookingPages = PageFactory.initElements(driver, BookingPages.class);
    }
public void cancelAmount(){
        bookingPages.setCancel();
}
public void traveller() throws InterruptedException {
        bookingPages.addTraveller();
}
public void userName() throws InterruptedException {
        bookingPages.setUsername1();
}
public void details() throws InterruptedException {
        bookingPages.details();
}


}
