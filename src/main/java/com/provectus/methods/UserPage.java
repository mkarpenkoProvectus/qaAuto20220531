package com.provectus.methods;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UserPage {
  public void registerUser(String username) {
    registerUser(username, true);

  }

  public void registerUser(String username, boolean acceptPolicy) {
    //old implementation
    //set policy
    /*
    if(acceptPolicy) {
    }
     */
  }

  public String getUserInfo() {
    return "user info";
  }
}
