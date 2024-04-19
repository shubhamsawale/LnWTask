package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class CartPage {

    WebDriver driver;
public int price;
  public  int Subtotal;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCart() {
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    }


    public void Skip() {
        driver.findElement(By.cssSelector("input[aria-labelledby='attachSiNoCoverage-announce']")).click();

    }

    public void verifyPrice() {
        // Implement logic to verify price
     price = Integer.parseInt(driver.findElement(By.xpath("//span[@class='a-price sw-subtotal-amount']//span[@class='a-price-whole']")).getText());
        System.out.println(price);
    }

    public void verifySubtotal() {
        // Implement logic to verify subtotal
         Subtotal = Integer.parseInt(driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-buybox']//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")).getText());
System.out.println(Subtotal);

        assertEquals(price, Subtotal);
    }
}
