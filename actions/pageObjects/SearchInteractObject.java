package pageObjects;

import commons.BasePage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageUIs.SearchInteractUI;
import pageUIs.TaskManageUI;

public class SearchInteractObject extends BasePage {
    private WebDriver driver;

    public SearchInteractObject(WebDriver driver) {
        this.driver = driver;
    }

    public void enterToSearchInteractId(String interactId) {
        waitForElementClickable(driver, SearchInteractUI.SEARCH_INTERACT_ID);
        sendkeyToElement(driver, SearchInteractUI.SEARCH_INTERACT_ID, interactId);
    }
//    @Step("Get search interactId result")
    public String getSearchInteractIdResult() {
        waitForElementVisible(driver, SearchInteractUI.SEARCH_INTERACT_ID_RESULT);
        sleepInSecond(2);
        return getElementText(driver, SearchInteractUI.SEARCH_INTERACT_ID_RESULT);
    }
//    @Step("Get search ticket type")
    public String getSearchTicketType() {
        waitForElementVisible(driver, SearchInteractUI.SEARCH_TICKET_TYPE_RESULT);
        return getElementText(driver, SearchInteractUI.SEARCH_TICKET_TYPE_RESULT);
    }
//    @Step("Get search channel list")
    public String getSearchChannelList() {
        waitForElementVisible(driver, SearchInteractUI.SEARCH_CHANNEL_LIST_RESULT);
        return getElementText(driver, SearchInteractUI.SEARCH_CHANNEL_LIST_RESULT);
    }
//    @Step("Click to search")
    public void clickToSearch() {
        waitForElementClickable(driver, SearchInteractUI.SEARCH_SUBMIT);
        clickToElement(driver, SearchInteractUI.SEARCH_SUBMIT);
        sleepInSecond(3);
    }
//    @Step("Move to search ticket")
    public SearchTicketObject moveToSearchTicket() {
        waitForElementClickable(driver, TaskManageUI.PARENT_TASK_MANAGE);
        hoverToElement(driver, TaskManageUI.PARENT_TASK_MANAGE);
        waitForElementClickable(driver, TaskManageUI.TASK_MANAGE);
        hoverToElement(driver, TaskManageUI.TASK_MANAGE);
        waitForElementClickable(driver, TaskManageUI.TASK_LIST);
        hoverToElement(driver, TaskManageUI.TASK_LIST);
        waitForElementClickable(driver, TaskManageUI.TICKET_INTERACT);
        hoverToElement(driver, TaskManageUI.TICKET_INTERACT);
        waitForElementClickable(driver, TaskManageUI.SEARCH_TICKET);
        hoverToElement(driver, TaskManageUI.SEARCH_TICKET);
        clickToElement(driver, TaskManageUI.SEARCH_TICKET);
        return PageGenerator.getSearchTicket(driver);
    }
}
