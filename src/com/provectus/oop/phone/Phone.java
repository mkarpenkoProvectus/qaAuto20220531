package com.provectus.oop.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public abstract class Phone implements Filming, Audible{
  public abstract void makeCall(String number);

  public abstract void sendSms(String number, String text);

  public String getVersion() {
    return "";
  }
}
