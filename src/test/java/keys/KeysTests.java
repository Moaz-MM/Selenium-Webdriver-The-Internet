package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoverPage;
import pages.KeyPressesPage;

public class KeysTests extends BaseTests {
    @Test
    public void testBackspace() {
        KeyPressesPage keysPage = homePage.clickKeyPresses();
        keysPage.sendText("A"  + Keys.BACK_SPACE);
        Assert.assertEquals(keysPage.getResult(), "You entered: BACK_SPACE", "ERRRRROR");
    }

    @Test
    public void testPi() {
        KeyPressesPage keysPage = homePage.clickKeyPresses();
        keysPage.enterPi();
        System.out.println(keysPage.getResult());
    }
}
