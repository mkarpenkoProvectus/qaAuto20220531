package com.provectus.oop.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Iphone extends Phone  {
  @Override
  public void makeCall(String number) {
    System.out.println("Calling from Iphone to " + number);
  }

  @Override
  public void sendSms(String number, String text) {
    System.out.println("Sending text " + text + " to number " + number + " from Iphone");
  }

  @Override
  public void takePhoto() {
    System.out.println("Making photo from Iphone");
  }

  @Override
  public void makeClip() {
    System.out.println("Making clip from Iphone");
  }

  @Override
  public void playTrack(String track) {
    System.out.println("Playing track " + track + " on Iphone");
  }

  @Override public void playPodcast() {
    System.out.println("Playing podcast " + " on Iphone");
  }
}
