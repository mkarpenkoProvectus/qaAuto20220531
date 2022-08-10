package com.provectus.oop.phone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public interface Filming {
  void takePhoto();

  void makeClip();

  default String showCameraInfo() {
    return "Camera info";
  }
}
