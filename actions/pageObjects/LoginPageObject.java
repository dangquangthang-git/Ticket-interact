package pageObjects;

import commons.BasePage;

import org.openqa.selenium.WebDriver;
import pageUIs.BasePageUI;
import pageUIs.LoginPageUI;


public class LoginPageObject extends BasePage {
    private WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void enterToUserName(String userName, String attribute) {
        waitForElementClickable(driver, BasePageUI.USERNAME_TEXTBOX,attribute);
        sendkeyToElement(driver, BasePageUI.USERNAME_TEXTBOX, userName, attribute);
    }

    public TaskManageObject clickToLoginButton() {
        waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
        return PageGenerator.getTaskManage(driver);
    }


}
