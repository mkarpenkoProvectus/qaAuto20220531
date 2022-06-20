package com.provectus.oop.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AndroidPhone extends Phone {
  @Override
  public void makeCall(String number) {
    System.out.println("Calling from Android to " + number);
  }

  @Override
  public void sendSms(String number, String text) {
    System.out.println("Sending text " + text + " to number " + number + " from Android");
  }

  @Override
  public void takePhoto() {
    System.out.println("Making photo from Android");
  }

  @Override
  public void makeClip() {
    System.out.println("Making clip from Android");
  }

  @Override
  public void playTrack(String track) {
    System.out.println("Playing track " + track + " on Android");
  }

  @Override public void playPodcast() {
    System.out.println("Playing podcast " + " on Android");
  }
}
