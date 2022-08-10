package com.provectus.lambdas;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LamEx {
  public static void main(String[] args) {
    //      @Override
    //      public String method2(int num) {
    //        return String.valueOf(num);
    //      }
    Iface iface = (s, s2) -> {
      String params = s + "; " + s2;
      return params;
    };

//    iface.method1("param1", "param2");

    Predicate<String> predicate = s -> s.contains("test");
    System.out.println(predicate.test("java"));
    System.out.println(predicate.test("java test"));
    System.out.println(predicate.test("java auto"));

    Supplier<Integer> supplier = () -> new Random().nextInt(1000);

    System.out.println(supplier.get());
    System.out.println(supplier.get());

    Consumer<String> consumer = p -> System.out.println(p.toUpperCase());
    consumer.accept("java");
    consumer.accept("test");

    Function<String, Integer> function = (s) -> Integer.valueOf(s);

    TextUtil textUtil = new TextUtil();
    Function<String, Integer> function1 = s -> TextUtil.convertTextToInt(s);

    System.out.println(function.apply("1"));
    System.out.println(function.apply("11"));
    System.out.println(function.apply("111"));
  }
}
