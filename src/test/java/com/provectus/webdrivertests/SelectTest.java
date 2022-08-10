package com.provectus.webdrivertests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.stream.Collectors;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SelectTest {
  @Test
  public void selectTest() {
    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/dropdown");

    Select select = new Select(driver.findElement(By.id("dropdown")));

    select.getOptions().stream().map(el -> el.getText()).collect(Collectors.toList());

    select.selectByVisibleText("Option 2");


    driver.quit();
  }

  @Test
  public void alertsTest() {
    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    driver.findElement(By.cssSelector("ul li:nth-of-type(1) button")).click();

    driver.switchTo().alert().accept();

    driver.findElement(By.cssSelector("ul li:nth-of-type(3) button")).click();
    Alert alert = driver.switchTo().alert();

    String alertText = alert.getText();
    alert.sendKeys("test alert");
    alert.accept();

    System.out.println(alertText);

    driver.quit();
  }


  @Test
  public void locators() {
    WebDriver driver = new ChromeDriver();

    driver.findElement(By.id("query"));
    driver.findElement(By.name("q"));
    driver.findElement(By.className("textfield"));
  }
}
