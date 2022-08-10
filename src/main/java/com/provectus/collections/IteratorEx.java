package com.provectus.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class IteratorEx {
  public static void main(String[] args) {
    List<String> list = new LinkedList<>();
    list.add("one");
    list.add("");
    list.add("two");
    list.add("");
    list.add("three");

//    for (String s : list) {
//      if (s.isEmpty()) {
//        list.remove(s);
//      }
//    }

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      String s = iterator.next();
      if (s.isEmpty()) {
        iterator.remove();
      }
    }



    System.out.println(list);
  }
}
