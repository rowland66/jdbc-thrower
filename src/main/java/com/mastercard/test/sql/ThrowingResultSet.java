package com.mastercard.test.sql;

import java.sql.ResultSet;

/**
 * A {@link ResultSet} decorated to throw an SQLException on command.
 */
public class ThrowingResultSet 
    extends ThrowingResultSetJdbc4_1
    implements ResultSet {

  
  /**
   * Constructor. 
   */
  public ThrowingResultSet(ResultSet r) {
    this.it = r;
  }
}
