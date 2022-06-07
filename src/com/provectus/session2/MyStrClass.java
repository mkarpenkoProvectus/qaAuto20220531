package com.provectus.session2;

import java.util.Locale;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MyStrClass {
  public static void main(String[] args) {
    int intVar = 4;

    String strVar = "String Value";
    String strVar2 = null;

    String result1 = strVar.toUpperCase();
    String result2 = strVar.toLowerCase();

    System.out.println("result value of " + result2 + " and value of " + result2);
    System.out.println(result2);
    System.out.println(strVar);

//    String resultFormatted = String.format("result of %s and %s", result1, result2);
    String resultFormatted = String.format("result of %s and %d and %f", result1, 5, 5.6);

  }
}
