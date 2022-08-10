package com.provectus.exceptions;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CheckButton {
  private boolean isButtonDisplayed() {
    String button = "button";
    try {
      if (button.contains("test")) {
        return true;
      }
    } catch (Exception e) {
      return false;
    }
   return false;
  }
}
