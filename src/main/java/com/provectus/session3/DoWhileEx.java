package com.provectus.session3;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DoWhileEx {
  public static void main(String[] args) {
    String user1 = getUserFromConfig();
    String user2;

    do {
      user2 = getUserFromConfig();
    } while (user2.equals(user1));

  }

  public static String getUserFromConfig() {
    return "";//user1; user2; user3
  }
}
