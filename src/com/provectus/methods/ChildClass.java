package com.provectus.methods;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ChildClass extends Construct {
  protected String childValue;
  public ChildClass(String childValue) {
    super(childValue);
    this.childValue = super.value.toLowerCase() + " " + childValue;
    System.out.println("create ChildClass");
  }

  public String getChildValue() {
    return this.childValue;
  }

}
