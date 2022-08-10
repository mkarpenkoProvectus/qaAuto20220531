package com.provectus.methods;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UserRegistrationWithPolicyTest {
  public void userRegisterWithPolicyAcceptedTest() {
    UserPage userPage = new UserPage();
    userPage.registerUser("user", true);
  }


  public void userRegisterWithoutPolicyAcceptedTest() {
    UserPage userPage = new UserPage();
    userPage.registerUser("user", false);
  }
}
