package com.provectus.tests;

import org.testng.annotations.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Before2 {
  @BeforeSuite
  public void beforeSuite() {
    System.out.println("before suite");
  }

  @BeforeTest
  public void beforeTest() {
    System.out.println("before test");
  }

  @BeforeClass
  public void beforeClass() {
    System.out.println("before class");
  }

  @BeforeMethod
  public void beforeMethod() {
    System.out.println("before method");
  }

  @Test
  public void test1() {
    System.out.println("test 1");
  }

  @Test
  public void test2() {
    System.out.println("test 2");
  }

  @AfterMethod
  public void afterMethod() {
    System.out.println("after method");
  }

  @AfterClass
  public void afterClass() {
    System.out.println("after class");
  }

  @AfterTest
  public void afterTest() {
    System.out.println("after test");
  }

  @AfterSuite
  public void afterSuite() {
    System.out.println("after suite");
  }
}
