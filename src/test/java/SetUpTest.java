import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class SetUpTest {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("num of links: " + links.size());

        WebElement link = driver.findElement(By.partialLinkText("Inputs"));

        link.click();
        WebElement in = driver.findElement(By.xpath("//*[@class='example']//input"));
        in.sendKeys("69");
//        driver.quit();
    }

    public void countEle() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement link = driver.findElement(By.partialLinkText("Shifting Content"));
        link.click();

        WebElement link2 = driver.findElement(By.partialLinkText("Example 1"));
        link2.click();

        List<WebElement> links = driver.findElements(By.cssSelector("li > a"));
        System.out.println("Num of things: " + links.size());
    }

    public static void main(String[] args) {
        SetUpTest setUp = new SetUpTest();
        setUp.countEle();
    }
}
