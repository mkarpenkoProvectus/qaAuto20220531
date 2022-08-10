package com.provectus.webdrivertests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class GoogleTest {
  @Test
  public void googleTest() {
    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.google.com/");

    WebElement searchInput = driver.findElement(By.name("q"));
    searchInput.clear();
    searchInput.sendKeys("Selenium");

    driver.findElement(By.cssSelector("input[name='btnK']")).click();

    driver.quit();
  }
}
