package com.provectus.session3;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class StringArrayEx {
  public static void main(String[] args) {
    String categories = "phone,laptop,tablet,tv";
    String[] cats = categories.split(",");
    for (String category : cats) {
      System.out.println("navigate to category " + category);
    }

    for (int i=0; i< cats.length; i++) {
      System.out.println("navigate to category " + cats[i]);
    }
  }
}
