package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private final WebDriver driver;
    private Select dropdown;

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
        findDropdown();
    }

    public void selectFromDropdown(String option) {
        dropdown.selectByVisibleText(option);
    }

    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements = dropdown.getAllSelectedOptions();
        return selectedElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    private void findDropdown() {
        dropdown = new Select(driver.findElement(By.id("dropdown")));
    }
}
