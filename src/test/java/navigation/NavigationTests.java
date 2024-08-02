package navigation;

import base.BaseTests;
import org.checkerframework.dataflow.qual.TerminatesExecution;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WindowManager;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigation() {
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://x.com");
    }

    @Test
    public void testSwitchWindows() {
        homePage.clickMultipleWindow().clickHere();
        WindowManager windowManager = getWindowManager();
        windowManager.switchToTab("New Window");
        Assert.assertTrue(false, "keda");
    }
}
