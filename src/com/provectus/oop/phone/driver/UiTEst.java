package com.provectus.oop.phone.driver;

import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UiTEst {
  public static void main(String[] args) {
    WebDriver driver = getDriver();
    driver.open();
//    driver.navigate("site.url");
    //
    driver.close();
  }

  private static WebDriver getDriver() {
    int random = new Random().nextInt(6);
    WebDriver driver = random%2 == 0 ? new ChromeDriver() : new GeckoDriver();
    return driver;
  }
}
