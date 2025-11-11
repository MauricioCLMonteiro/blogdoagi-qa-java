package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private By searchIcon = By.cssSelector("a.search-toggle, a.search-icon, .search-toggle");
    private By searchInput = By.cssSelector("input.search-field, input[type='search']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://blogdoagi.com.br/");
    }

    public void clickSearchIcon() {
        WebElement icon = driver.findElement(searchIcon);
        icon.click();
    }

    public void search(String term) {
        clickSearchIcon();
        WebElement input = driver.findElement(searchInput);
        input.clear();
        input.sendKeys(term);
        input.submit();
    }
}
