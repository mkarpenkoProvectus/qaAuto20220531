package com.provectus.oop;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RegisterTest {
  public static void main(String[] args) {
    RegisterPage registerPage = new RegisterPage();
    registerPage.registerUser("user1", "pass1", "user1@mail.com", "USD");



    User user = new User();//object1
    user.setUsername("user");
    user.setPassword("pass");

    User user1 = new User();
    user1.setUsername("user");
    user1.setPassword("pass");

//    System.out.println(user.equals(user1));

    System.out.println(user);
    user.setCurrency("UAH");

    System.out.println(user);


//    registerPage.registerUser(user);
  }
}
