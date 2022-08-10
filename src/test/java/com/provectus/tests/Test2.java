package com.provectus.tests;

import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Test2 {
  @Test
  public void test1() {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {}

    System.out.println("test passed");
  }
}
