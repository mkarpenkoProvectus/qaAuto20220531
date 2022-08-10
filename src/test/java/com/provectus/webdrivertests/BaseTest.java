package com.provectus.webdrivertests;

import com.provectus.pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class BaseTest {
  protected WebDriver driver;

  @BeforeClass
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
  }

  @AfterClass
  public void tearDown() {
    driver.quit();
  }

  public MainPage openApp() {
    driver.get("https://the-internet.herokuapp.com/");
    return new MainPage(driver);
  }
}
