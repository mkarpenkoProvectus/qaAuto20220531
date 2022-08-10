package com.provectus.oop.phone.driver;

public interface WebDriver {
  void open();

  void navigate(String url);

  void close();
}
