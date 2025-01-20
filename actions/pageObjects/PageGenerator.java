package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGenerator {
    public static LoginPageObject getLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }

    public static MakeTicketObject getMakeTicket(WebDriver driver) {
        return new MakeTicketObject(driver);
    }

    public static SearchInteractObject getSearchInteract(WebDriver driver) {
        return new SearchInteractObject(driver);
    }

    public static SearchTicketObject getSearchTicket(WebDriver driver) {
        return new SearchTicketObject(driver);
    }

    public static TaskManageObject getTaskManage(WebDriver driver) {
        return new TaskManageObject(driver);
    }
}
