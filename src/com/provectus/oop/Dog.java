package com.provectus.oop;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Dog {
  String name;
  String breed;
  String color;
  int age;

  public String bow() {
    return name + " says BOW-WOW";
  }

  public boolean canBite() {
    return true;
  }
}
