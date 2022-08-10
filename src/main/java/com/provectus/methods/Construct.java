package com.provectus.methods;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Construct {
  protected String value;

  public Construct(String value) {
    System.out.println("create Construct");
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}
