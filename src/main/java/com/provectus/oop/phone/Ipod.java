package com.provectus.oop.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Ipod implements Audible {
  @Override
  public void playTrack(String track) {
    System.out.println("Playing track " + track + " on Ipod");
  }

  @Override
  public void playPodcast() {
    System.out.println("Playing podcast " + " on Ipod");
  }
}
