package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.EventListeners;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BaseTests {

//    protected WebDriver driver;
    private WebDriver driver;
    private final WebDriverListener listener = new EventListeners();
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.out.println("SET UPPPPPPPPP");
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        ChromeOptions options = getChromeOptions();
        options.addArguments("--start-maximized");
        driver = new EventFiringDecorator<>(listener).decorate(new ChromeDriver(options));
        goHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void recordFailures(ITestResult result) {
        TakesScreenshot camera = (TakesScreenshot)driver;
        if(result.getStatus() == ITestResult.FAILURE){
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(Paths.get(screenshot.getAbsolutePath()), Paths.get("resources/screenshots/"+result.getName()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

//    @AfterMethod
    public void screenShot() {
        TakesScreenshot camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(Paths.get(screenshot.getAbsolutePath()), Paths.get("resources/screenshots/test2.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEAR DOWWWWWWWWWWN");
        driver.quit();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");       //disable info bar
//        options.addArguments("--headless=new");         //run test without opening chrome
        return options;
    }

    private void setCookie() {
        Cookie cookie = new Cookie.Builder("cookieName", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }
}
