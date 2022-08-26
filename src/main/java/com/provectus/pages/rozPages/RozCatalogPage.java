package com.provectus.pages.rozPages;

import com.provectus.pages.BasePage;
import com.provectus.pages.components.ProductComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RozCatalogPage extends BasePage {
  private final By products = By.cssSelector("li[rzgridtilelayout]");

  public RozCatalogPage() {
    super();
  }

  public ProductComponent findProduct(int index) {
    return new ProductComponent(driver.findElements(products).get(index-1));
  }

  public String getProductName(int productNum) {
    WebElement item = driver.findElements(products).get(productNum-1);
    return new ProductComponent(item).getProductName();
  }

  public String getProductPrice(int productNum) {
    WebElement item = driver.findElements(products).get(productNum-1);
    return new ProductComponent(item).getProductPrice();
  }
}
