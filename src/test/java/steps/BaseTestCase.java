package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import util.Utils;

public class BaseTestCase {

    protected static WebDriver driver;

    @Before
    public static void startDrive(){
        ChromeOptions chrOptions = new ChromeOptions();
        chrOptions.addArguments("start-maximized");
        Utils.selecionaDirverOs();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
