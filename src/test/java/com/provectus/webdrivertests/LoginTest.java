package com.provectus.webdrivertests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginTest {
  @Test
  public void loginTest() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");

    driver.findElement(By.linkText("Form Authentication")).click();

    driver.findElement(By.id("username")).sendKeys("tomsmith");
    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    driver.findElement(By.cssSelector("button[type='submit']")).click();

    WebElement alert = new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".flash.success")));
    System.out.println(alert.getText());
    Assert.assertTrue(alert.getText()
                          .contains("You logged into a secure area!"),
                      "User should be logged in");

    driver.quit();
  }
}
