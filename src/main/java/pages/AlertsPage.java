package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    WebDriver driver;
    By jsAlertBtn = By.xpath("//button[text()='Click for JS Alert']");
    By jsAcceptBtn = By.xpath("//button[text()='Click for JS Confirm']");
    By jsPromptBtn = By.xpath("//button[text()='Click for JS Prompt']");
    By alertResult = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(jsAlertBtn).click();
    }

    public void triggerAccept() {
        driver.findElement(jsAcceptBtn).click();
    }
    public void triggerPrompt() {
        driver.findElement(jsPromptBtn).click();
    }

    public void alert_clickAccept() {
        driver.switchTo().alert().accept();
    }

    public void alert_clickDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public void prompt_sendText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResultText() {
        return driver.findElement(alertResult).getText();
    }
}
