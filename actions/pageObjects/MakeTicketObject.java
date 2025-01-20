package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.MakeTicketUI;
import pageUIs.TaskManageUI;

public class MakeTicketObject extends BasePage {
    private WebDriver driver;

    public MakeTicketObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToMakeLeadButton() {
        waitForElementClickable(driver, MakeTicketUI.MAKE_LEAD);
        clickToElement(driver, MakeTicketUI.MAKE_LEAD);
    }

    public void enterFullName(String fullName) {
        waitForElementClickable(driver, MakeTicketUI.FULLNAME);
        sendkeyToElement(driver, MakeTicketUI.FULLNAME, fullName);
    }

    public void selectGender(String gender) {
        selectItemInCustomDropdown(driver, MakeTicketUI.GENDER, MakeTicketUI.GENDER_OPTION, gender);
    }

    public void enterPhone(String phone) {
        waitForElementClickable(driver, MakeTicketUI.PHONE);
        sendkeyToElement(driver, MakeTicketUI.PHONE, phone);
    }

    public void submitLeadRequest() {
        scrollToElementByJS(driver, MakeTicketUI.MAKE_LEAD_POPUP);
        waitForElementClickable(driver, MakeTicketUI.MAKE_LEAD_POPUP);
        clickToElement(driver, MakeTicketUI.MAKE_LEAD_POPUP);
    }

    public String getInteractId(String attributeName) {
        scrollToElementByJS(driver, MakeTicketUI.INTERACT_ID);
        waitForElementVisible(driver, MakeTicketUI.INTERACT_ID);
        return getElementAttribute(driver, MakeTicketUI.INTERACT_ID, attributeName);
    }

    public void selectInteractType(String interactTypeOption) {
        selectItemInCustomDropdown(driver, MakeTicketUI.INTERACT_TYPE, MakeTicketUI.INTERACT_TYPE_OPTION, interactTypeOption);
    }

    public void selectChannelList(String channelListOption) {
        selectItemInCustomDropdown(driver, MakeTicketUI.CHANNEL_LIST, MakeTicketUI.CHANNEL_LIST_OPTION, channelListOption);
    }

    public void selectTicketTypeList(String ticketType) {
        selectItemInCustomDropdown(driver, MakeTicketUI.TICKET_TYPE, MakeTicketUI.TICKET_TYPE_OPTION, ticketType);
    }

    public void selectRequestType(String requestType) {
        selectItemInCustomDropdown(driver, MakeTicketUI.REQUEST_TYPE, MakeTicketUI.REQUEST_TYPE_OPTION, requestType);
    }

    public void selectProcessStatus(String processStatus) {
        selectItemInCustomDropdown(driver, MakeTicketUI.PROCESS_STATUS, MakeTicketUI.PROCESS_STATUS_OPTION, processStatus);
    }

    public void clickToSaveForm() {
        scrollToElement(driver, MakeTicketUI.TICKET_SAVE_BUTTON);
        waitForElementClickable(driver, MakeTicketUI.TICKET_SAVE_BUTTON);
        clickToElement(driver, MakeTicketUI.TICKET_SAVE_BUTTON);
    }

    public String getProcessStatusValue() {
        scrollToElementByJS(driver, MakeTicketUI.PAGE_INDEX);
        return getElementText(driver, MakeTicketUI.HISTORY_PROCESS_STATUS);
    }

    public String getTicketId() {
        waitForElementVisible(driver, MakeTicketUI.HISTORY_TICKET_ID);
        return getElementText(driver, MakeTicketUI.HISTORY_TICKET_ID);
    }

    public String getTicketRequestType() {
        return getElementText(driver, MakeTicketUI.TICKET_TYPE_OPTION);
    }

    public void closeMakeTicketPopUp() {
        waitForElementClickable(driver, MakeTicketUI.CLOSE_MAKE_TICKET_POPUP);
        clickToElement(driver, MakeTicketUI.CLOSE_MAKE_TICKET_POPUP);
    }

    public SearchInteractObject moveToSearchInteract() {
        waitForElementClickable(driver, TaskManageUI.PARENT_TASK_MANAGE);
        hoverToElement(driver, TaskManageUI.PARENT_TASK_MANAGE);
        waitForElementClickable(driver, TaskManageUI.TASK_MANAGE);
        hoverToElement(driver, TaskManageUI.TASK_MANAGE);
        waitForElementClickable(driver, TaskManageUI.TASK_LIST);
        hoverToElement(driver, TaskManageUI.TASK_LIST);
        waitForElementClickable(driver, TaskManageUI.TICKET_INTERACT);
        hoverToElement(driver, TaskManageUI.TICKET_INTERACT);
        waitForElementClickable(driver, TaskManageUI.SEARCH_INTERACT);
        hoverToElement(driver, TaskManageUI.SEARCH_INTERACT);
        clickToElement(driver, TaskManageUI.SEARCH_INTERACT);
        return PageGenerator.getSearchInteract(driver);
    }


}
