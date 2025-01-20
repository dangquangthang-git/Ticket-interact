package commons;

public class GlobalConstants {
    // System Infor
    public static final String PROJECT_PATH = System.getProperty("user.dir");
    public static final String OS_NAME = System.getProperty("os.name");
    public static final String JAVA_VERSION = System.getProperty("java.version");
    // Retry Case Failed
    public static final int RETRY_NUMBER = 3;
    // HTML Report Folder
    public static final String SEPARATOR = System.getProperty("file.separator");
    public static final String EXTENT_PATH = PROJECT_PATH + SEPARATOR + "htmlExtent" + SEPARATOR;
}
