package com.provectus.oop;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Animal {
  private String version;

  public Animal(String version) {
    System.out.println("constructing Animal");
    this.version = version;
  }

  public void setVersion(String  version) {
    this.version = version;
  }

  public String getVersion() {
    return version;
  }
}
