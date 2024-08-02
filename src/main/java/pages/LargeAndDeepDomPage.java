package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {

    private final WebDriver driver;
    private final By table = By.id("large-table");

    LargeAndDeepDomPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToTable() {
        WebElement tableElement = driver.findElement(table);
        JavascriptExecutor jsExecuter = (JavascriptExecutor)driver;
        String script = "arguments[0].scrollIntoView();";
        jsExecuter.executeScript(script, tableElement);
    }
}
