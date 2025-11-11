package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.SearchResultsPage;
import utils.DriverFactory;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchWithResultsTest {
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
    public void searchExistingArticle_ShouldReturnResults() {
        homePage.open();
        homePage.search("cartão");
        assertTrue(resultsPage.getResultsCount() > 0, "Nenhum resultado encontrado para 'cartão'");
    }

    @AfterEach
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
