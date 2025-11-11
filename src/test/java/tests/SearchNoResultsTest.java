package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.SearchResultsPage;
import utils.DriverFactory;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchNoResultsTest {
    private WebDriver driver;
    private HomePage homePage;
    private SearchResultsPage resultsPage;

    @BeforeEach
    public void setUp() {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        resultsPage = new SearchResultsPage(driver);
    }

    @Test
    public void searchInvalidArticle_ShouldShowNoResultsMessage() {
        homePage.open();
        homePage.search("asdfghjklzxcv");
        assertTrue(resultsPage.isNoResultsMessageDisplayed(), "Mensagem de 'nada encontrado' não exibida");
    }

    @AfterEach
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
