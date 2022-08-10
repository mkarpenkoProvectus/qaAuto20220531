package com.provectus.libs;

import com.github.javafaker.Faker;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LibEx {
  public static void main(String[] args) {
    Faker faker = new Faker();
    System.out.println(faker.name().firstName() + " " + faker.name().lastName());
  }
}
