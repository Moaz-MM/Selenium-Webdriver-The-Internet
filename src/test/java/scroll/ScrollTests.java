package scroll;

import base.BaseTests;
import org.testng.annotations.Test;

public class ScrollTests extends BaseTests {

    @Test()
    public void testScrollTableToView() {
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test()
    public void testInfiniteScroll() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
