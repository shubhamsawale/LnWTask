package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {

    WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFirstItem() {
        driver.findElement(By.cssSelector("[data-index='0']")).click();
    }
}