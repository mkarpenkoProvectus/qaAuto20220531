package com.provectus.session3;

import java.util.Arrays;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ArrayEx {
  public static void main(String[] args) {
    int[] intarrays; // this is our way


    intarrays = new int[10];

//    System.out.println(Arrays.toString(intarrays));

    float[] fArray = { 1f, 3f, 5f, 2f, 4f };
//    System.out.println(Arrays.toString(fArray));


    String[] sArray = new String[5];
//    System.out.println(Arrays.toString(sArray));

    for (int i=0; i< intarrays.length; i++) {
      intarrays[i] = i*2;
    }

    for (int i=0; i<intarrays.length; i++) {
//      System.out.println(intarrays[i]);
    }

    //[0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
    for (int item : intarrays) {
      System.out.println(item); //item = 2;
      item += 5; //item = 5; intar[1] = 2
      System.out.println(item);
    }

    System.out.println(Arrays.toString(intarrays));
  }
}
