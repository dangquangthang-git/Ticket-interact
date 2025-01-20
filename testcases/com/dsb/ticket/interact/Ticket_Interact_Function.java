package com.dsb.ticket.interact;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;
import reportConfigs.ExtentManager;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Random;

public class Ticket_Interact_Function extends BaseTest {
    public WebDriver driver;
    String browserName, userName, password, fullName, phone, gender, attributeName, interactIdCode, interactTypeOption, channelList, ticketType, requestType, processStatus;
    String historyTicketId, historyTicketRequestType;

    @Parameters("browser")
    @BeforeClass
    public void before(String browserName) {
        driver = getBrowserDriver(browserName);
        userName = "ipa\\a.servicedesk";
        password = "Dsb@2024";
        fullName = "Thang";
        phone = randomGenerate();
        gender = "Nam";
        attributeName = "value";
        channelList = "Call";
        ticketType = "Tìm hiểu SP/DV";
        requestType = "None";
        processStatus = "Đang xử lý";
        interactTypeOption = "Inbound";
        historyTicketRequestType = "Tìm hiểu SP/DV";
        this.browserName = browserName;

    }

    @Description("Step 01: Login to DSB")
    @Test
    public void User_01_Login(Method method) {
        ExtentManager.startTest(method.getName() + "-" + browserName, "TC_01_NewCustomer");
        ExtentManager.getTest().log(Status.INFO, "User_01_Login to DSB - STEP01: Log in DSB");
        loginPage = new LoginPageObject(driver);
        ExtentManager.getTest().log(Status.INFO, "enter username");
        loginPage.enterToUserName(userName);
        ExtentManager.getTest().log(Status.INFO, "enter Password");
        loginPage.enterToPassword(password);
    }

    @Description("Step 02: Make ticket interact")
    @Test
    public void User_02_Make_Ticket_Interact(Method method) {
        ExtentManager.startTest(method.getName() + "-" + browserName, "TC_02_Make_Ticket_Interact");
        ExtentManager.getTest().log(Status.INFO, "STEP01: Click to Login button");
        taskManage = loginPage.clickToLoginButton();
        taskManage.sleepInSecond(2);
        ExtentManager.getTest().log(Status.INFO, "STEP02: Move to make interact");
        makeTicket = taskManage.moveToMakeInteract();
        ExtentManager.getTest().log(Status.INFO, "STEP03: Click to make lead button");
        makeTicket.clickToMakeLeadButton();
        ExtentManager.getTest().log(Status.INFO, "STEP04: Enter fullname");
        makeTicket.enterFullName(fullName);
        ExtentManager.getTest().log(Status.INFO, "STEP05: Select gender");
        makeTicket.selectGender(gender);
        ExtentManager.getTest().log(Status.INFO, "STEP06: Enter phone");
        makeTicket.enterPhone(phone);
        makeTicket.submitLeadRequest();
        this.interactIdCode = makeTicket.getInteractId(attributeName);
        System.out.println(interactIdCode);
        makeTicket.selectInteractType(interactTypeOption);
        makeTicket.selectChannelList(channelList);
        makeTicket.selectTicketTypeList(ticketType);
        makeTicket.selectRequestType(requestType);
        makeTicket.selectProcessStatus(processStatus);
        makeTicket.clickToSaveForm();
        this.historyTicketId = makeTicket.getTicketId();
        System.out.println(this.historyTicketId);
        Assert.assertEquals(makeTicket.getProcessStatusValue(), processStatus);
        makeTicket.closeMakeTicketPopUp();
    }

    @Description("Step 03: Search interact by interactId")
    @Test
    public void User_03_Search_Interact(Method method) {
        ExtentManager.startTest(method.getName() + "-" + browserName, "TC_03_Search_Interact");
        ExtentManager.getTest().log(Status.INFO, "STEP01: Move to search interact");
        searchInteract = makeTicket.moveToSearchInteract();
        System.out.println(this.interactIdCode);
        searchInteract.sleepInSecond(2);
        searchInteract.enterToSearchInteractId(this.interactIdCode);
        searchInteract.clickToSearch();
        Assert.assertEquals(searchInteract.getSearchInteractIdResult(), interactIdCode);
        Assert.assertEquals(searchInteract.getSearchTicketType(), ticketType);
        Assert.assertEquals(searchInteract.getSearchChannelList(), channelList.toUpperCase());
    }

    @Description("Step 04: Search ticket by ticketId")
    @Test
    public void User_04_Search_Ticket(Method method) {
        ExtentManager.startTest(method.getName() + "-" + browserName, "TC_03_Search_Interact");
        searchTicket = searchInteract.moveToSearchTicket();
        searchTicket = new SearchTicketObject(driver);
        searchTicket.sleepInSecond(2);
        searchTicket.enterToSearchTicketId(this.historyTicketId);
        searchTicket.clickToSearchByTicketId();
        System.out.println(this.historyTicketId);
        System.out.println(searchTicket.getTicketResult());
        Assert.assertEquals(searchTicket.getTicketResult(), this.historyTicketId);

    }

    private LoginPageObject loginPage;
    private TaskManageObject taskManage;
    private MakeTicketObject makeTicket;
    private SearchInteractObject searchInteract;
    private SearchTicketObject searchTicket;

//    @AfterClass
//    public void afterClass() throws InterruptedException {
//        Thread.sleep(4000);
//        driver.close();
//    }

    public String randomGenerate() {
        Random random = new Random();
        int randomNum = random.nextInt(1000000); // Tạo số ngẫu nhiên từ 0 đến 999.999
        return "0969" + String.format("%06d", randomNum); // Chuỗi có thêm 6 chữ số
    }

}
