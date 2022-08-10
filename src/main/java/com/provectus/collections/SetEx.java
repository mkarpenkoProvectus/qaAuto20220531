package com.provectus.collections;

import java.util.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SetEx {
  public static void main(String[] args) {
    String[] arrayWithDups = {"one", "two", "one"};
    Set<String> setWithoutDups = new HashSet<>();
    setWithoutDups.addAll(Arrays.asList(arrayWithDups));


    Set<Integer> integerSet = new TreeSet<>();

    Random random = new Random();
    for (int i=0; i<50; i++) {
      integerSet.add(random.nextInt(100));
    }


//    for (String s : strings) {
//      System.out.println(s);
//    }



  }
}
