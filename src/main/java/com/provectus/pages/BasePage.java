package com.provectus.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public abstract class BasePage {
  protected WebDriver driver;
  protected WebDriverWait wait;
  protected Actions actions;
  protected JavascriptExecutor jsExecutor;

  public BasePage(WebDriver driver) {
    this.driver = driver;
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    this.actions = new Actions(driver);
    this.jsExecutor = (JavascriptExecutor)driver;
  }
}
