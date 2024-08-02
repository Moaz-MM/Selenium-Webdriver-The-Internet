package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private final WebDriver driver;
    private final By example1Link = By.partialLinkText("Example 1");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1DynamicLoadingPage clickExample1() {
        driver.findElement(example1Link).click();
        return new Example1DynamicLoadingPage(driver);
    }
}
