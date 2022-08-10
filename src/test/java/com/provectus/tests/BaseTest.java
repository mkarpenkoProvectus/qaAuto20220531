package com.provectus.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class BaseTest {
  @Parameters({"url"})
  @BeforeClass
  public void setUp(String url) {
    System.out.println("start browser");
    System.out.println("begin UI test");
    System.out.println("open " + url);
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    System.out.println("UI test completed");
    System.out.println("kill browser");
  }
}
