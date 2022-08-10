package com.provectus.webdrivertests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.animation.model.KeyframeStyle;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

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

    driver.switchTo().frame(1);
    //search inside of frame
    driver.switchTo().defaultContent();
    //search on the main page

    driver.manage().window().maximize();

    driver.findElement(By.id("id"));
    driver.findElement(By.name("name"));

    driver.findElement(By.className("button"));

    driver.findElement(By.id("section")).findElement(By.className("form")).findElement(By.tagName("button"));
    driver.findElement(By.cssSelector("#section .form button"));






    driver.findElement(By.cssSelector(".example div.row a.button"));

    WebElement element = driver.findElement(By.cssSelector("[class=\"textfield\"]"));

    element.clear();
    element.sendKeys("value to set in input" + Keys.TAB);

    element.click();

    element.isEnabled();

    driver.quit();
  }
}
