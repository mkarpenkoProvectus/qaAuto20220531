package com.provectus.staticFinal;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FinalEx {
  private final String VERSION = "s1";
  private String nonFinalVar = "s2";
  private final String MINOR_VERSION;


  FinalEx() {
    this.MINOR_VERSION = "w2";
  }


  public void method1() {

  }
}
