package com.provectus.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ArrayListEx {
  public static void main(String[] args) {
    List<String> stringList = new LinkedList<>();
    stringList.add("one");
    stringList.add("two");
    stringList.add("one");

    System.out.println(stringList);

    stringList.get(1);




    List<Double> doubleList = new ArrayList<>();
    double d = doubleList.get(0);

    for (int i = 0; i<stringList.size(); i++) {
      System.out.println(stringList.get(i));
    }

    for (String s : stringList) {
      System.out.println(s);
    }
  }
}
