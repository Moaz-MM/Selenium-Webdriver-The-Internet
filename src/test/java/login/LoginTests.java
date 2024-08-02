package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;
import pages.SecureAreaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    @Test
    public void testLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String actualResult = secureAreaPage.getAlertMessage();
        String expectedResult = "You logged into a secure area!";
        Assert.assertTrue(actualResult.contains(expectedResult), "Login message didn't appear");
    }

    /*
    @Test
    public void fbLogin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");

        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passField = driver.findElement(By.id("pass"));
        WebElement loginBut = driver.findElement(By.xpath("//*[@name='login']"));

        emailField.sendKeys("01013482721");
        passField.sendKeys("Moapache22");
        loginBut.click();

        WebElement messEle = driver.findElement(By.xpath("//div[@aria-label='Messenger' and @role='button' and not (@aria-hidden)]"));
        messEle.click();

        WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Messenger']"));
        search.sendKeys("omar s. el-abd");
    }
    */

}
