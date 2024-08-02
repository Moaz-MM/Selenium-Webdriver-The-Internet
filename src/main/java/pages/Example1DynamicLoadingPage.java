package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example1DynamicLoadingPage {
    private final WebDriver driver;
    private final By startBtn = By.cssSelector("#start > button");
    private final By messageHeader = By.cssSelector("#finish > h4");
    private final By progressBar = By.cssSelector("#loading");

    public Example1DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartBtn() {
        driver.findElement(startBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(progressBar)));
    }

    public String getResult() {
        return driver.findElement(messageHeader).getText();
    }

}
