package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

public class DropdownTests extends BaseTests {

    @Test
    public void testDropdown() {
        String option = "Option 1";
        DropdownPage dropdownPage = homePage.clickDropdown();
        dropdownPage.selectFromDropdown(option);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(), 1, "More than one option selected");
        Assert.assertTrue(selectedOptions.contains(option), "Wrong option selected");
    }
}
