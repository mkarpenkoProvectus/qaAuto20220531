package com.provectus.tests;

import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */


public class TestEx {
  @Test(enabled = false, groups = {"login", "critical"}, description = "My first test", priority = 30)
  public void testExample() {
    System.out.println("I'm TEST");

    System.out.println("Running test on " + System.getProperty("url"));
  }

  @Test(priority = 11)
  public void newMethod() {}

  @Test(groups = {"cart", "major"}, priority = 10)
  public void test2() {

  }

  @Test(priority = 20)
  private void test3() {

  }
}
