package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {

    WebDriver driver;
    WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack() {
        navigate.back();
    }

    public void goForward() {
        navigate.forward();
    }

    public void refresh() {
        navigate.refresh();
    }

    public void goTo(String url) {
        navigate.to(url);
    }

    public void switchToTab(String tabTitle) {
        Set<String> windows = driver.getWindowHandles();
        for(String window : windows) {
            driver.switchTo().window(window);
            System.out.println("Switching to: " + window);
            System.out.println("window title: " + driver.getTitle());
            if(driver.getTitle().equals(tabTitle))
            {
                break;
            }
        }
    }
}
