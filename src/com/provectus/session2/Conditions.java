package com.provectus.session2;

import java.util.Scanner;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Conditions {
  public static void main(String[] args) {
    int cond = 1;
    int cond2 = 1;
    int cond3 = 1;
    int cond4 = 1;

    boolean b1 = true;
    boolean b2 = false;

    String str = null;
    String str2 = "";

//    if (cond < 0) {
//      System.out.println("TRUE");
//      System.out.println("INSIDE IF");
//    } else {
//      System.out.println("INSIDE ELSE");
//    }

//    String outer = "";
//
//    if (cond > 0) {
//      String innerVar = "inner";
//      outer = "1";
//      System.out.println("INSIDE IF-1");
//      System.out.print("line");
//      System.out.println(5 + 7);
//    } else if (cond2 < 0) {
//      outer = "2";
//      System.out.println("INSIDE IF-2");
//    } else if (cond3 < 0) {
//      System.out.println("INSIDE IF-3");
//    } else {
//      System.out.println("INSIDE FINAL IF");
//    }
//
//    System.out.println(outer);

    Scanner scanner = new Scanner(System.in);


    int a = Math.abs(scanner.nextInt());
    int b = 5;


    if (Math.abs(a) > Math.abs(b)) {
      System.out.println("INSIDE IF-1");
      if (!b2) {
        System.out.println("INSIDE IF-2");
      } else {
        System.out.println("INSIDE ELSE-2");
      }
    } else {
      System.out.println("INSIDE ELSE-1");
    }


    System.out.println("AFTER IF");
  }
}
