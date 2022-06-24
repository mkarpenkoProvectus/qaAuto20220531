package com.provectus.oop;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Cat extends Animal{
  private String catVersion;

  public Cat() {
    super("CatAnimal");
    System.out.println("constructing CAT");
    this.catVersion = super.getVersion().toUpperCase() + " - CAT";
    System.out.println(this.catVersion);
  }
}
