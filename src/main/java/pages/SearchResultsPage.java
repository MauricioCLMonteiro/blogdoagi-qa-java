package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;
    private By articleTitles = By.cssSelector("h2.entry-title, .post-title, .entry-title a");
    private By noResultsMessage = By.cssSelector(".no-results, .no-results-title, h1.page-title");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getResultsCount() {
        List<WebElement> articles = driver.findElements(articleTitles);
        return articles.size();
    }

    public boolean isNoResultsMessageDisplayed() {
        List<WebElement> elems = driver.findElements(noResultsMessage);
        if (elems.isEmpty()) return false;
        String text = elems.get(0).getText().toLowerCase();
        return text.contains("nada encontrado") || text.contains("nenhum resultado") || text.contains("nenhum resultado encontrado");
    }
}
