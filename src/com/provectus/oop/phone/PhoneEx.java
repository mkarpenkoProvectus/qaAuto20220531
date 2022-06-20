package com.provectus.oop.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PhoneEx {
  public static void main(String[] args) {
    Phone phone = new Iphone();

    phone.makeCall("asdasd");
    phone.playPodcast();

    phone = new AndroidPhone();
    phone.makeCall("asdasd");
    phone.playPodcast();

    Audible audible = new Ipod();
    audible.playTrack("track 1111 (new).mp3");

    audible = new Iphone();

  }
}
