package com.provectus.oop.phone.driver;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ChromeDriver implements WebDriver {
  @Override
  public void open() {
    System.out.println("Open Chrome browser");
  }

  @Override
  public void navigate(String url) {
    System.out.println("Navigate in Chrome browser to " + url);
  }

  @Override
  public void close() {
    System.out.println("Closing Chrome driver");
  }
}
