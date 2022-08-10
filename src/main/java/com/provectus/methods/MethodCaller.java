package com.provectus.methods;

import java.util.Arrays;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MethodCaller {
  public static void main(String[] args) {
    MethodEx m = new MethodEx();

    m.someMethod();
    m.checkPageAvailability();


    m.methodWithParams("name", 20, true, "20");


    int a = 2;
    int[] array = {1,2,3};

    m.multiplyNum(a);
    m.multiplyNum(5.0);
    m.multiplyNumsInArr(array);

//    System.out.println(a);
//    System.out.println(Arrays.toString(array));


    m.methodWithVarArg();
    m.methodWithVarArg("one");
    m.methodWithVarArg("one", "two", "three");



    UserPage userPage = new UserPage();
//    System.out.println(userPage.getUserInfo());


    AdminPage adminPage = new AdminPage();
//    System.out.println(adminPage.getUserInfo());


//    Construct construct = new Construct("value1");
//    System.out.println(construct.getValue());
//
//    Construct construct2 = new Construct("value2");
//    System.out.println(construct2.getValue());

    ChildClass2 childClass = new ChildClass2("some value");
    childClass.getChildValue();
  }
}
