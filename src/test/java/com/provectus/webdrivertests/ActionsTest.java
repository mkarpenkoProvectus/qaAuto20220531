package com.provectus.webdrivertests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ActionsTest {
  @Test
  public void actionsTest() {
    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();


    driver.get("https://rozetka.com.ua/ua/");

    Actions actions = new Actions(driver);

    driver.findElement(By.id("fat-menu")).click();

    actions.moveToElement(driver.findElement(By.cssSelector(".menu-categories__item:nth-of-type(1)")))
        .pause(Duration.ofSeconds(2))
        .moveToElement(driver.findElement(By.cssSelector(".menu-categories__item:nth-of-type(2)")))
        .pause(Duration.ofSeconds(2))
        .moveToElement(driver.findElement(By.cssSelector(".menu-categories__item:nth-of-type(3)")))
        .perform();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".header__button")))).click();
    WebElement headerButton = driver.findElement(By.cssSelector(".header__button"));

    wait.until(isLoaderDisplayed());

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click()", headerButton);

    try {
      js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.partialLinkText(" Оренда приміщень ")));
      Thread.sleep(10000);
    } catch (InterruptedException e) {}


    driver.quit();
  }

  private ExpectedCondition<Boolean> isLoaderDisplayed() {
//    return el -> element.findElement(By.cssSelector("sub-el")).isDisplayed();

    ExpectedCondition<Boolean> expectedCondition = new ExpectedCondition<Boolean>() {
      @Override
      public Boolean apply(WebDriver webDriver) {
        return !webDriver.findElement(By.cssSelector("loader")).isDisplayed();
      }
    };
    return expectedCondition;
  }
}
