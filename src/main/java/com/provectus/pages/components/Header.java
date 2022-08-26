package com.provectus.pages.components;

import com.provectus.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Header extends BasePage {
//  private final By logo = By.cssSelector(".logo");
  @FindBy(css = ".logo")
  private WebElement logo;

//  private final By searchInput = By.cssSelector(".search-input");
  @FindBy(css = ".search-input")
  private WebElement searchInput;

  public Header(WebDriver driver) {
    super();
    PageFactory.initElements(driver, this);
  }

  public void goToMainPage() {
    logo.click();
  }

  public void searchProduct(String product) {
    searchInput.sendKeys(product + Keys.ENTER);
  }
}
