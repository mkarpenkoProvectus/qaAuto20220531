package com.provectus.staticFinal;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class StaticRunner {
  public static void main(String[] args) {
    StaticEx staticEx = new StaticEx();

    StaticEx staticEx1 = new StaticEx();

    staticEx.increaseCounter();

    staticEx1.increaseCounter();

    staticEx.decreaseCounter();
    staticEx.decreaseCounter();

    System.out.println(StaticEx.counter);

//    StaticEx.staticVar;
    StaticEx.getCounter();

    TextUtil.getCountFromString("123");


  }
}
