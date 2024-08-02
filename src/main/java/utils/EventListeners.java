package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class EventListeners implements WebDriverListener {
    @Override
    public void beforeClick(WebElement element) {
//        WebDriverListener.super.beforeClick(element);
        System.out.println("clicking: " + element.getText());
    }
}
