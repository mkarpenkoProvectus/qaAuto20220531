package com.provectus.session2;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class TernaryOp {
  public static void main(String[] args) {
    int dayOfWeek = 6;

    String day;
    if (dayOfWeek > 5) {
      day = "holiday";
//      System.out.println("holiday !!!!");
    } else {
      day = "working day";
//      System.out.println("working day :(");
    }

    day = dayOfWeek > 5 ? "holiday" : "working day";



    System.out.println(day);
  }
}
