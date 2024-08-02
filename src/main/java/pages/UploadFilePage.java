package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage {

    WebDriver driver;
    By inputField = By.id("file-upload");
    By uploadBtn = By.id("file-submit");
    By uploadedFiles = By.id("uploaded-files");

    UploadFilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String path) {
        driver.findElement(inputField).sendKeys(path);
        clickUploadBtn();
    }

    private void clickUploadBtn() {
        driver.findElement(uploadBtn).click();
    }

    public String getUploadedFile() {
        return driver.findElement(uploadedFiles).getText();
    }

}
