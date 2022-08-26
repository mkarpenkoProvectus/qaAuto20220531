package com.provectus.webdrivertests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.animation.model.KeyframeStyle;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class WDTest {
  @Test
  public void wdTest() {

//    WebDriverManager.chromedriver().setup();
    WebDriverManager.firefoxdriver().setup();

    WebDriver driver = new FirefoxDriver();
    driver.get("https://google.com");
//    SoftAssert softAssert = new SoftAssert();
//
//    driver.switchTo().frame(1);
//    //if failed -> continue
//    softAssert.assertEquals(driver.getTitle(), "Page title");
//
//    //if failed -> STOP
//    Assert.assertEquals(driver.getTitle(), "Page title");
//    //search inside of frame
//    driver.switchTo().defaultContent();
//    //search on the main page
//
//    driver.manage().window().maximize();
//    softAssert.assertEquals(driver.findElement(By.tagName("a")).getText(),
//                            "Link text");
//
//    driver.findElement(By.id("id"));
//    driver.findElement(By.name("name"));
//
//    driver.findElement(By.className("button"));
//
//    driver.findElement(By.id("section")).findElement(By.className("form")).findElement(By.tagName("button"));
//    driver.findElement(By.cssSelector("#section .form button"));
//
//    softAssert.assertEquals(driver.findElement(By.tagName("h2")).getText(),
//                            "Element text", "Element text is wrong");
//
//
//
//
//    driver.findElement(By.cssSelector(".example div.row a.button"));
//
//    WebElement element = driver.findElement(By.cssSelector("[class=\"textfield\"]"));
//
//    element.clear();
//    element.sendKeys("value to set in input" + Keys.TAB);
//
//    element.click();
//
//    element.isEnabled();
//    softAssert.assertAll();
//
//    driver.quit();
//

    WebElement element = null;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    wait.until(ExpectedConditions.visibilityOf(element)).click();







  }
}
