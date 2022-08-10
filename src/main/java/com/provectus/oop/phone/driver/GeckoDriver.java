package com.provectus.oop.phone.driver;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class GeckoDriver implements WebDriver {
  @Override
  public void open() {
    System.out.println("Open Firefox browser");
  }


  public void navigate(String url) {
    System.out.println("Navigate in Firefox browser to " + url);
  }

  @Override
  public void close() {
    System.out.println("Closing Firefox driver");
  }
}
