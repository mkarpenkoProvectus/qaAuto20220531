package com.provectus.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DataProvEx {
//  @Test
  public void testCollection() {
    Map<String, String> users = new HashMap<>();
    users.put("user1", "user");
    users.put("user2", "admin");
    users.put("user3", "guest");

    for (Map.Entry<String, String> entry : users.entrySet()) {
      System.out.println(entry.getKey());
      if (entry.getValue().equals("admin")) {
        throw new RuntimeException("admin is not ready yet");
      }
    }
  }


  @Test(dataProvider = "userProvider")
  public void testData(String username, String role) {
    System.out.println(username + " " + role);
    if (role.equals("admin")) {
//      throw new RuntimeException("admin is not ready yet");
      Assert.assertEquals(role, "user", "User role is incorrect");
      System.out.println("test completed");
    }
  }

  @DataProvider(name = "userProvider")
  public Object[][] userProvider() {
    Object[][] result = {
        {"user1", "user"},
        {"user2", "admin"},
        {"user3", "guest"}
    };

    return result;
  }
}
