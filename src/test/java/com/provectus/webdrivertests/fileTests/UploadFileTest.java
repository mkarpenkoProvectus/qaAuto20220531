package com.provectus.webdrivertests.fileTests;

import com.provectus.singlton.DriverHolder;
import com.provectus.webdrivertests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UploadFileTest extends BaseTest {
  @Test
  public void fileUploadTest() {
    WebDriver driver = DriverHolder.getDriver();

    driver.get("https://the-internet.herokuapp.com/upload");

    File file = new File("src/test/resources/testFile.txt");
//    File linuxFile = new File("/home/user/projects/ProjName/src/test/resources/testFile.txt");
//    File absFile = new File("C:\\Users\\mkarpenko.PROVECTUS\\IdeaProjects\\qaAuto20220531\\src\\test\\resources\\testFile.txt");

    driver.findElement(By.cssSelector("input[name='file']")).sendKeys(file.getAbsolutePath());
    driver.findElement(By.id("file-submit")).click();

    System.out.println("done");
  }
}
