package com.provectus.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class HashMapEx {
  public static void main(String[] args) {
    User user = new User();
    user.setUsername("Jon");
    user.setAge(18);
    user.setEmail("jon@thewall.com");


    System.out.println(user.hashCode());

    Map<User, String> userMap = new HashMap<>();
    userMap.put(user, "asdasd");


//
//    System.out.println(user.hashCode());
//    System.out.println(userMap.get(user));
//    System.out.println(userMap);

    System.out.println("a".compareTo("b"));
    System.out.println("a".compareTo("a"));
    System.out.println("b".compareTo("a"));
  }
}
