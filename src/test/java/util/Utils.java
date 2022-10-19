package util;

public class Utils {

    public static void selecionaDirverOs() {
        String driverPath = "src/test/resources/drivers/";
        if (System.getProperty("os.name").contains("Windows")) {
            driverPath = driverPath + "windows/chromedriver.exe";
        } else {
            driverPath = driverPath + "mac/chromedriver";
        }
        System.setProperty("webdriver.chrome.driver", driverPath);
        {
     }
    }
}
