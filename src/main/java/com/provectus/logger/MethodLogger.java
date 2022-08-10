package com.provectus.logger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MethodLogger {
  private enum LogLevel {
    DEBUG("green"),
    INFO("cyan"),
    WARN("yellow"),
    ERROR("red");

    private String color;

    LogLevel(String color) {
      this.color = color;
    }

    private String getColor() {
      return color;
    }
  }

  public void info(String message) {
    printMessage(LogLevel.INFO, message);
  }

  public void debug(String message) {
    printMessage(LogLevel.DEBUG, message);
  }

  public void warn(String message) {
    printMessage(LogLevel.WARN, message);
  }

  public void error(String message) {
    printMessage(LogLevel.ERROR, message);
  }

  private void printMessage(LogLevel level, String message) {
    System.out.println(level.getColor() + message);
  }
}
