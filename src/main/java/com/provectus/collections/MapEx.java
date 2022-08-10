package com.provectus.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MapEx {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("one", 1);
    map.put("one", 2);
    map.put("two", 2);

    System.out.println(map.size());

    System.out.println(map);

    System.out.println(map.get("two"));
    System.out.println(map.get("four"));

    for (int value : map.values()) {
      System.out.println(value);
    }

    for (String key : map.keySet()) {
      System.out.println(key);
    }

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      entry.getKey();
      entry.getValue();
    }
  }
}
