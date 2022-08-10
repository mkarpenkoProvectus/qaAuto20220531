package com.provectus.exceptions;

import com.provectus.logger.MethodLogger;

import java.io.FileNotFoundException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ExeptionsEx {

  static MethodLogger logger = new MethodLogger();

  public static void main(String[] args) {
    CheckedEx checkedEx = new CheckedEx();
    try {
      checkedEx.getFileContent();
    } catch (Exception e) {
//      logger.error("some error happened");
      e.printStackTrace();
    }finally {
      System.out.println("INSIDE FINALLY");
    }


//    checkedEx.getValueFromArray(5);


    if (false) {
      throw new ButtonNotFoundException("Cannot find button New Item");
    }

    System.out.println("done");
  }
}
