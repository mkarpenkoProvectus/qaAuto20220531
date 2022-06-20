package com.provectus.oop;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class OopEx {
  public static void main(String[] args) {
    Dog myDog = new Dog(); //object1
    myDog.name = "Spike";
    myDog.color = "grey";
    myDog.age = 4;

    myDog.canBite();
    System.out.println(myDog.bow());


    Dog friendsDog = new Dog(); //object2
    friendsDog.name = "Tom";
    friendsDog.color = "black";
    friendsDog.age = 2;
    System.out.println(friendsDog.bow());

    //object1 != object2
  }
}
