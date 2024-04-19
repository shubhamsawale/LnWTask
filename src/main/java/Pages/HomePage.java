package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchForItem(String item) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item + "\n");
    }
}
