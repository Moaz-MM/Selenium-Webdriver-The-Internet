package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    By paragraphElement = By.className("jscroll-added");

    private final WebDriver driver;

    InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToParagraph(int idx) {
        JavascriptExecutor jsExecuter = (JavascriptExecutor)driver;
        String script = "window.scrollTo(0, document.body.scrollHeight)";

        while(getNumOfParagraphsShowing() < idx) {
            jsExecuter.executeScript(script);
        }
    }

    private int getNumOfParagraphsShowing() {
        return driver.findElements(paragraphElement).size();
    }
}
