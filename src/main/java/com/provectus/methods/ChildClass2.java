package com.provectus.methods;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ChildClass2 extends ChildClass {
  private String childValue2;
  public ChildClass2(String childValue2) {
    super(childValue2);
    this.childValue2 = childValue + childValue2;
    System.out.println("create ChildClass2");
  }
}
