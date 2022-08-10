package com.provectus.nestedClasses.nonstaticClass;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class InnerClassEx {
  public void innerClassEx() {
    OuterClass outerClass = new OuterClass();
    OuterClass.InnerClass innerClass = outerClass.new InnerClass();

  }
}
