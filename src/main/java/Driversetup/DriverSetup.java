package Driversetup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class DriverSetup {

    public static WebDriver driver;


    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser", "url"})
    public void setUp(String browser, String url) {
        {
            if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("ie")) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            }
            driver.manage().window().maximize();
            driver.get(url);
        }
    }

    @AfterSuite(alwaysRun = true)
    public void quit() {
        this.driver.quit();
    }

}