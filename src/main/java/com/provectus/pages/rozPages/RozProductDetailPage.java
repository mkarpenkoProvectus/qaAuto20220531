package com.provectus.pages.rozPages;

import com.provectus.pages.BasePage;
import com.provectus.pages.components.Header;
import org.openqa.selenium.WebDriver;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RozProductDetailPage extends BasePage {
  public Header header;

  public RozProductDetailPage() {
    super();
    header = new Header(driver);
  }

  public String getPrice() {
    //
    return "";
  }

  public void addToCard() {
    //
  }
}
