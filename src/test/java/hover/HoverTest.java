package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoverPage;

public class HoverTest extends BaseTests {

    @Test
    public void testHoverOver() {
        HoverPage hoverPage = homePage.clickHover();
        HoverPage.FigureCaption caption = hoverPage.hoverOverFigure(1);
        Assert.assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        Assert.assertEquals(caption.getCaptionText(), "name: user1", "Wrong caption");
        System.out.println("link: " + caption.getLink());
        System.out.println("link text: " + caption.getLinkText());
    }
}
