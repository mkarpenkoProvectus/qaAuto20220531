package com.provectus.tests;

import org.testng.annotations.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Before1 extends BaseTest {

  @Parameters({"testParam", "testParam2", "testParam3"})
  @Test
  public void test1(String p1, String p2, int param3) {
    System.out.println("test 1 with ");
  }
}
