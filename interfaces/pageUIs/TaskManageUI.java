package pageUIs;

public class TaskManageUI {
    public static final String PARENT_TASK_MANAGE = "xpath=//li[contains(@class, 'ivnd-menu-overflow-item')]//span[text()='Quản lý công việc']";
    public static final String TASK_MANAGE = "xpath=//li[not(contains(@class, 'ivnd-menu-overflow-item'))]//span[text()='Quản lý công việc']";
    public static final String TICKET_INTERACT = "xpath=//span[text()='Ticket - interact']";
    public static final String MAKE_TICKET_INTERACT = "xpath=//span[text()='Tạo tương tác ticket']";
    public static final String SEARCH_INTERACT = "xpath=//span[text()='Tra cứu tương tác']";
    public static final String SEARCH_TICKET = "xpath=//span[text()='Tra cứu ticket']";
    public static final String TASK_LIST = "xpath=//span[text()='Danh sách công việc']";
}
