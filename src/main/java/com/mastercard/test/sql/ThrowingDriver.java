package com.mastercard.test.sql;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * A {@link Driver} decorated to throw an SQLException on command.
 */
public class ThrowingDriver 
    extends ThrowingDriverJdbc4_1
    implements Driver {

  static {
    try {
      ThrowingDriver driver = new ThrowingDriver();
      DriverManager.registerDriver(driver);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public ThrowingDriver() {
  }
}
