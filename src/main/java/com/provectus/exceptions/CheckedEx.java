package com.provectus.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CheckedEx {
  //throws InterruptedException, FileNotFoundException
  public void getFileContent()  {
//    File file = new File("file.txt");
//    FileReader reader = new FileReader(file);


//    Thread.sleep(1000);
  }

  public String getValueFromArray(int index) throws ArrayIndexOutOfBoundsException {
    String[] array = {"s1", "s2", "s3"};
    return array[index];
  }

  public void getDbValue() {

    Connection connection = null;
    try {
      connection = DriverManager.getConnection("sql");
    } catch (SQLException sqlException) {
      sqlException.printStackTrace();
    } finally {
      if (connection != null) {
        try {connection.close();
        } catch (SQLException sqlException) {
          sqlException.printStackTrace();
        }
      }
    }
  }

  public void getDbValueNew() {

    try(Connection connection = DriverManager.getConnection("asda")) {
      connection.createStatement();
    } catch (SQLException sqlException) {
      sqlException.printStackTrace();
    }
  }
}
