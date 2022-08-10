package com.provectus.methods;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MethodEx {
  public static void main(String[] args) {

  }

  //access_mod return_type method_name(Type1 var1, Type2 var2) {}

  public void methodWithoutReturnType() {}

  public int methodWithReturnType() {
    return 0;
  }

  public void someMethod() {}

  public void checkPageAvailability() {}

  public int getFirstEvenNum(int[] nums) {
    for (int i : nums) {
      if (i%2 == 0) {
        return i;
      }
    }
    return -1;
  }

  public void methodWithParams(String name, int age, boolean isActiveUser, String lastname) {

  }

  public void multiplyNum(int num) {
    num = num * 2;
  }

  public void multiplyNum(int num1, int num2) {

  }

  public void multiplyNum(double d) {
    d = d * 5;
  }

  public void multiplyNumsInArr(int[] arr) {
    for (int i = 0; i<arr.length; i++) {
      arr[i] = arr[i] * 2;
    }
  }

  public void methodWithVarArg(String... values) {
  }

  public void methodWithManyParams(int age, String isActive, String... names) {

  }



}
