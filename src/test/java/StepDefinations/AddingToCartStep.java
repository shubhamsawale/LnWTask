package StepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductPage;
import Pages.SearchResultsPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AddingToCartStep {


    WebDriver driver;

    @Given("I am on the Amazon homepage")
    public void i_am_on_the_Amazon_homepage() {
        // Initialize WebDriver and open Amazon homepage
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("I search for {string}")
    public void i_search_for(String item) {
        HomePage homePage = new HomePage(driver);
        homePage.searchForItem(item);
    }

    @And("I select the first item from the search results")
    public void i_select_the_first_item_from_the_search_results() {
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.selectFirstItem();
    }

    @And("I add the item to the cart")
    public void i_add_the_item_to_the_cart() {
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();
    }

    @And("I open the cart")
    public void i_open_the_cart() {
        CartPage cartPage = new CartPage(driver);
        cartPage.openCart();
        cartPage.Skip();

    }

    @Then("I verify that the price is identical to the product page")
    public void i_verify_that_the_price_is_identical_to_the_product_page() {
        CartPage cartPage = new CartPage(driver);
        cartPage.verifyPrice();
    }

    @And("I verify that the subtotal is identical to the product page")
    public void i_verify_that_the_subtotal_is_identical_to_the_product_page() {
        CartPage cartPage = new CartPage(driver);
        cartPage.verifySubtotal();
        driver.quit();
    }
}
