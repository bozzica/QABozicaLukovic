package tests;

import common.Browsers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.PropertyManager;

public class BaseTest extends Browsers {

    //public WebDriver driver;
    @Parameters ({"username", "browser"})
    @BeforeMethod
    public void setup(@Optional("no username provided") String username, String browser) {
        //
        /*if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(new FirefoxOptions().addArguments("--start-maximized"));
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }*/

        switch (browser.toLowerCase()){
            case "chrome":
                startChrome();
                break;
            case "firefox":
                startFirefox();
                break;
            case "edge":
                startEdge();
                break;
            default:
                startChrome();
        }
        //driver.manage().window().maximize();
        driver.get(PropertyManager.getInstance().getUrl());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    public WebDriver getDriver(){
        return driver;
    }
}
