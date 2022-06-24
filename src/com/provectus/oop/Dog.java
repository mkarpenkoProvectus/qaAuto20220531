package com.provectus.oop;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Dog extends Animal {
  private String version;

  public Dog() {
    super("Animal");
    System.out.println("constructing Dog");
    this.version = super.getVersion().toUpperCase() + " - DOG";
    System.out.println(this.version);
  }
}
