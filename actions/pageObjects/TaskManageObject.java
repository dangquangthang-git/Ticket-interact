package pageObjects;

import commons.BasePage;
//import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.TaskManageUI;

public class TaskManageObject extends BasePage {
    private WebDriver driver;

    public TaskManageObject(WebDriver driver) {
        this.driver = driver;
    }
//    @Step("Move to make interact screen")
    public MakeTicketObject moveToMakeInteract() {
        waitForElementClickable(driver, TaskManageUI.PARENT_TASK_MANAGE);
        hoverToElement(driver, TaskManageUI.PARENT_TASK_MANAGE);
        waitForElementClickable(driver, TaskManageUI.TASK_MANAGE);
        hoverToElement(driver, TaskManageUI.TASK_MANAGE);
        waitForElementClickable(driver, TaskManageUI.TASK_LIST);
        hoverToElement(driver, TaskManageUI.TASK_LIST);
        waitForElementClickable(driver, TaskManageUI.TICKET_INTERACT);
        hoverToElement(driver, TaskManageUI.TICKET_INTERACT);
        waitForElementClickable(driver, TaskManageUI.MAKE_TICKET_INTERACT);
        hoverToElement(driver, TaskManageUI.MAKE_TICKET_INTERACT);
        waitForElementClickable(driver, TaskManageUI.MAKE_TICKET_INTERACT);
        clickToElement(driver, TaskManageUI.MAKE_TICKET_INTERACT);
        return PageGenerator.getMakeTicket(driver);
    }


}
