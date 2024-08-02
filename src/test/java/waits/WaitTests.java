package waits;

import base.BaseTests;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.Example1DynamicLoadingPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitTests extends BaseTests {

    @Test
    public void implicitWaitTest() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
        Example1DynamicLoadingPage example1DynamicLoadingPage = dynamicLoadingPage.clickExample1();
        example1DynamicLoadingPage.clickStartBtn();
        Assert.assertEquals(example1DynamicLoadingPage.getResult(), "Hello World!", "Message is wrong");
    }

    @Test
    public void explicitWaitTest() {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
        Example1DynamicLoadingPage example1DynamicLoadingPage = dynamicLoadingPage.clickExample1();
        example1DynamicLoadingPage.clickStartBtn();
        Assert.assertEquals(example1DynamicLoadingPage.getResult(), "Hello World!", "Message is wrong");
    }
}
