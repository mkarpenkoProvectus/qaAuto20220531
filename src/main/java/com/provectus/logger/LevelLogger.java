package com.provectus.logger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LevelLogger {
  public enum LogLevel {
    DEBUG,
    INFO,
    WARN,
    ERROR;
  }

  private static String RED = "red";
  private static String GREEN = "green";

  public void log(LogLevel level, String message) {
    switch (level) {
      case DEBUG:
        System.out.println(GREEN + message);
        break;

      case ERROR:
        System.out.println(RED + message);
        break;
    }
  }
}
