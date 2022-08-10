package com.provectus.nestedClasses.anonClasses;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AnonClassEx {
  public static void main(String[] args) {
    Iface iface = new IfaceImpl();
    iface.doSmth();


    Iface anonIface = new Iface() {
      @Override
      public void doSmth() {
        System.out.println("anon - done");
      }
    };


//    Iface anonIface = () -> System.out.println("anon - done");

    anonIface.doSmth();
  }
}
