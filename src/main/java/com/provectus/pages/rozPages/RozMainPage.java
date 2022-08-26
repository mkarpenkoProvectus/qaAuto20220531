package com.provectus.pages.rozPages;

import com.provectus.pages.BasePage;
import com.provectus.pages.components.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RozMainPage extends BasePage {
  public Header header;

  private final By byMenu = By.cssSelector(".menu");



  public RozMainPage() {
    super();
    header = new Header(driver);
  }

  public void selectItemInMenu(String item) {
    //
  }
}
