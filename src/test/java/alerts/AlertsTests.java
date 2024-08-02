package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTests extends BaseTests {

    @Test
    public void testAlerts() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickAccept();
        Assert.assertEquals(alertsPage.getResultText(), "You successfully clicked an alert", "Accept alert fail");
    }

    @Test
    public void testAcceptAlerts() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAccept();
        alertsPage.alert_clickAccept();
        alertsPage.triggerAccept();
        alertsPage.alert_clickDismiss();
        Assert.assertEquals(alertsPage.getResultText(), "You clicked: Cancel", "Accept alert fail");
    }

    @Test
    public void testPrompt() {
        String text = "moxo";
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        alertsPage.prompt_sendText(text);
        alertsPage.alert_clickAccept();
        Assert.assertEquals(alertsPage.getResultText(), "You entered: " + text, "Accept alert fail");
    }
}
