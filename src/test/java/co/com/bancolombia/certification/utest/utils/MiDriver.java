package co.com.bancolombia.certification.utest.utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MiDriver {
    private static WebDriver driver;

    public static MiDriver chrome() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(
                "--start-maximized", "--test-type", "--ignore-certificate-errors",
                "--disable-popup-blocking", "--disable-download-notification", "--disable-infobars",
                "--allow-running-insecure-content");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        return new MiDriver();
    }

    public static MiDriver internetExplorer() {
        System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
        InternetExplorerOptions ieOptions = new InternetExplorerOptions();
        ieOptions.setCapability("ignoreZoomSetting", true);
        ieOptions.setCapability("ignoreProtectedModeSettings", true);
        ieOptions.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
        ieOptions.setPageLoadStrategy(PageLoadStrategy.NONE);

        driver = new InternetExplorerDriver(ieOptions);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return new MiDriver();
    }

    public static WebDriver closeWindow() {
        driver.close();
        return driver;
    }

    public WebDriver onPage(String url) {
        driver.get(url);
        return driver;
    }
}

