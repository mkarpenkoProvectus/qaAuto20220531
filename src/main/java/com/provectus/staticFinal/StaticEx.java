package com.provectus.staticFinal;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class StaticEx {
  public String nonStaticVar = "non_static";
  public static String staticVar = "static_var";

  static final Logger LOGGER = Logger.getLogger(StaticEx.class.getName());


  public static int counter = 0;

  public void increaseCounter() {
    LOGGER.log(Level.INFO, "Increase counter");
    counter++;
  }

  public void decreaseCounter() {
    LOGGER.log(Level.WARNING, "Increase counter");
    counter--;
  }

  public static int getCounter() {

    return counter;
  }
}
