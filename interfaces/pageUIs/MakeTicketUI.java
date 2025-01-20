package pageUIs;

public class MakeTicketUI {
    public static final String MAKE_LEAD = "xpath=//button[contains(.,'Tạo lead')]";
    public static final String FULLNAME = "xpath=//input[@placeholder='Họ tên']";
    public static final String GENDER = "xpath=//input[@id='gender']";
    public static final String GENDER_OPTION = "xpath=//div[contains(@class, 'ivnd-select-item ivnd-select-item-option')]";
    public static final String PHONE = "xpath=//input[@placeholder='Số điện thoại']";
    public static final String MAKE_LEAD_POPUP = "xpath=//button[@type='submit'][contains(.,'Tạo lead')]";
    public static final String INTERACT_ID = "xpath=//input[@id='id']";
    public static final String INTERACT_TYPE = "xpath=//input[@id='interactType']";
    public static final String INTERACT_TYPE_OPTION = "xpath=//div[@class='ivnd-select-item-option-content']";
    public static final String CHANNEL_LIST = "xpath=//input[@id='channel']";
    public static final String CHANNEL_LIST_OPTION = "xpath=//div[contains(@class, 'ivnd-select-item ivnd-select-item-option') and (contains(@title, 'Call') or contains(@title, 'Email') or contains(@title, 'Chat') or contains(@title, 'POS'))]";
    public static final String TICKET_TYPE = "xpath=//input[contains(@id,'ticketType')]";
    public static final String TICKET_TYPE_OPTION = "xpath=//div[text()='Tìm hiểu SP/DV']";
    public static final String REQUEST_TYPE = "xpath=//input[contains(@id,'requestType')]";
    public static final String REQUEST_TYPE_OPTION = "xpath=//div[@class='ivnd-select-item-option-content'][contains(.,'None')]";
    public static final String PROCESS_STATUS = "xpath=//input[contains(@id,'processStatus')]";
    public static final String PROCESS_STATUS_OPTION = "xpath=//div[text()='Đang xử lý']";
    public static final String TICKET_SAVE_BUTTON = "xpath=//button[contains(.,'Lưu')]";
    public static final String HISTORY_TICKET_ID = "xpath=//td[@class='ivnd-table-cell ivnd-table-cell-fix-left ivnd-table-cell-fix-left-last']";
    public static final String HISTORY_TICKET_REQUEST_TYPE = "xpath=(//td[@class='ivnd-table-cell'])[3]";
    public static final String HISTORY_PROCESS_STATUS = "xpath=(//td[@class='ivnd-table-cell'])[6]";
    public static final String CLOSE_MAKE_TICKET_POPUP = "xpath=//span[@aria-label='close']";
    public static final String PAGE_INDEX = "xpath=//a[@rel='nofollow']";
}
