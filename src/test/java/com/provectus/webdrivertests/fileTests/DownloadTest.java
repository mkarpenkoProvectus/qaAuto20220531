package com.provectus.webdrivertests.fileTests;


import com.provectus.singlton.DriverHolder;
import com.provectus.webdrivertests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DownloadTest extends BaseTest {
  @Test
  public void downloadTest() {
    WebDriver driver = DriverHolder.getDriver();

    driver.get("https://the-internet.herokuapp.com/download");
    driver.findElement(By.linkText("LambdaTest.txt")).click();

    System.out.println("done");

  }
}
