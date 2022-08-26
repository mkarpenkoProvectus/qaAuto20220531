package com.provectus.webdrivertests;

import com.provectus.pages.MainPage;
import com.provectus.singlton.DriverHolder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class BaseTest {


  @BeforeClass
  public void setUp() {
    WebDriverManager.chromedriver().setup();

    ChromeOptions options = new ChromeOptions();
    Map<String, Object> prefs = new HashMap<>();
    prefs.put("download.default_directory", new File("target/downloads").getAbsolutePath());
    options.setExperimentalOption("prefs", prefs);

    WebDriver driver = new ChromeDriver(options);
    driver.get("https://the-internet.herokuapp.com/");
    DriverHolder.setDriver(driver);
  }

  @AfterClass
  public void tearDown() {
    DriverHolder.getDriver().quit();
  }

  public MainPage openApp() {
    DriverHolder.getDriver().get("https://the-internet.herokuapp.com/");
    return new MainPage();
  }
}
