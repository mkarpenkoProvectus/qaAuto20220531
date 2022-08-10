package com.provectus.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CollectionSortEx {
  public static void main(String[] args) {
    Random random = new Random();
    List<Integer> list = new ArrayList<>();
    for (int i=0; i<10; i++) {
      list.add(random.nextInt(20));
    }

    System.out.println(list);

    MyComparator comparator = new MyComparator();
    list.sort(comparator);
    System.out.println(list);
  }
}
