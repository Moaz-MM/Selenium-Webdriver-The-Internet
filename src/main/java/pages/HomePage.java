package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoverPage clickHover() {
        clickLink("Hovers");
        return new HoverPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public UploadFilePage clickUploadFile() {
        clickLink("File Upload");
        return new UploadFilePage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading() {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom() {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll() {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindow() {
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
}
