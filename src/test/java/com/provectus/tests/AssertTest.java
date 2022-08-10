package com.provectus.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AssertTest {
  @Test
  public void assertTest() {
    System.out.println("before assert");

    String actualValue = "actual";
    SoftAssert softAssert = new SoftAssert();
//    Assert.assertEquals(actualValue, "actual", "Value is incorrect");
    softAssert.assertEquals(actualValue, "actual", "Value is incorrect");


    actualValue = "not actual";
//    Assert.assertEquals(actualValue, "actual", "Value is incorrect");
    softAssert.assertEquals(actualValue, "actual", "Value is incorrect");

    System.out.println("after assert");
//    softAssert.assertAll();
  }
}
