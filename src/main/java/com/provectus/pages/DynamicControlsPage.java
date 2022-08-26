package com.provectus.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DynamicControlsPage extends BasePage {
  @FindBy(css = "#checkbox-example button")
  private WebElement addCheckboxButton;

  @FindBy(css = "#checkbox")
  private WebElement checkbox;

  @FindBy(css = "#checkbox-example #loading")
  private WebElement loader;

  public DynamicControlsPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }

  public DynamicControlsPage removeCheckbox() {
    addCheckboxButton.click();
    wait.until(ExpectedConditions.visibilityOf(loader));
    wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(loader)));
    return this;
  }

  public boolean isCheckboxDisplayed() {
    try {
      return checkbox.isDisplayed();
    } catch (NoSuchElementException e) {
      return false;
    }
  }
}
