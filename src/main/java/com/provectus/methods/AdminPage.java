package com.provectus.methods;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AdminPage extends UserPage {
  @Override
  public String getUserInfo() {
    String s = super.getUserInfo();
    return s + " and admin info";
  }
}
