package com.provectus.exceptions;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ButtonNotFoundException extends RuntimeException {
  public ButtonNotFoundException(String message) {
    super(message);
  }
}
