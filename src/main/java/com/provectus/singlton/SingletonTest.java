package com.provectus.singlton;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SingletonTest {
  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getObject();

    Singleton singleton2 = Singleton.getObject();

    Singleton singleton3 = Singleton.getObject();

    System.out.println(singleton1==singleton2);
    System.out.println(singleton1==singleton3);
    System.out.println(singleton2==singleton3);
  }
}
