package com.provectus.pages.components;

import com.provectus.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ProductComponent {
  private WebElement parent;

//  private final By prodName = By.cssSelector(".goods-tile__title");
  @FindBy(css = ".goods-tile__title")
  private WebElement prodName;

  @FindBy(css = ".goods-tile__price")
  private WebElement prodPrice;

  public ProductComponent(WebElement parent) {
    this.parent = parent;
    PageFactory.initElements(parent, this);
  }

  public String getProductName() {
    return prodName.getText();
  }

  public String getProductPrice() {
    return prodPrice.getText();
  }
}
