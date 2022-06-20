package com.provectus.session2;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SwitchClass {
  public static void main(String[] args) {
    String dayOfWeek = "MONTUEWED";

    switch (dayOfWeek) {
      case "MON":
        System.out.println("Oh, it's monday");
        break;

      case "TUE":
        System.out.println("hmm, it's tuesday");
        break;

      case "WED":
//        System.out.println("wow, it's mid-week wednesday");
//        break;

      case "FRI":
//        System.out.println("woohoo, it's friday");
        System.out.println("working day");
        break;

      case "SAT" :
      case "SUN":
        System.out.println("holiday");

      default:
        System.out.println("wrong day value");
    }

    System.out.println("AFTER SWITCH");
  }
}
