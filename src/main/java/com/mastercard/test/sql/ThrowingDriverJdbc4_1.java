package com.mastercard.test.sql;

import java.sql.Driver;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * The JDBC4.1 members of a {@link Driver}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingDriverJdbc4_1 
    extends ThrowingDriverJdbc4 
    implements Driver {

  public Logger getParentLogger() throws SQLFeatureNotSupportedException {
    throw new SQLFeatureNotSupportedException("Throwing Driver has no parent logger");
  }

}
