package pageObjects;

import commons.BasePage;
//import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.MakeTicketUI;
import pageUIs.SearchTicketUI;

public class SearchTicketObject extends BasePage {
    private WebDriver driver;

    public SearchTicketObject(WebDriver driver) {
        this.driver = driver;
    }
//    @Step("Enter to search ticketId with value: {0}")
    public void enterToSearchTicketId(String ticketId) {
        waitForElementClickable(driver, SearchTicketUI.SEARCH_TICKET_BOX);
        sendkeyToElement(driver, SearchTicketUI.SEARCH_TICKET_BOX, ticketId);
    }
//    @Step("Get ticket result")
    public String getTicketResult() {
        waitForElementVisible(driver, SearchTicketUI.TICKET_ID_RESULT);
        return getElementText(driver, SearchTicketUI.TICKET_ID_RESULT);
    }
//    @Step("Click to search ticket by ticketId")
    public void clickToSearchByTicketId() {
        waitForElementClickable(driver, SearchTicketUI.TICKET_SEARCH_BUTTON);
        clickToElement(driver, SearchTicketUI.TICKET_SEARCH_BUTTON);
    }

}
