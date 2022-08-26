package com.provectus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MainPage extends BasePage {

  public MainPage() {
     super();
  }

  public LoginPage goToAuthPage() {
    driver.findElement(By.linkText("Form Authentication")).click();
    return new LoginPage();
  }

  public DynamicControlsPage goToDynControls() {
    driver.findElement(By.linkText("Dynamic Controls")).click();
    return new DynamicControlsPage(driver);
  }

}
