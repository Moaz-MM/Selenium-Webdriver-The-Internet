package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private final WebDriver driver;
    private final By inputField = By.id("target");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void sendText(String text) {
        driver.findElement(inputField).sendKeys(text);
    }

    public String getResult() {
        return driver.findElement(By.id("result")).getText();
    }

    public void enterPi() {
        sendText(Keys.chord(Keys.SHIFT, "k") + " is K ??");
    }

}
