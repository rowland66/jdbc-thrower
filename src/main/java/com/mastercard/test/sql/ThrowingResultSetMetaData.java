package com.mastercard.test.sql;

import java.sql.ResultSetMetaData;


/**
 * A {@link ResultSetMetaData} decorated to throw an SQLException on command.
 */
public class ThrowingResultSetMetaData 
    extends ThrowingResultSetMetaDataJdbc4
    implements ResultSetMetaData {
  
  /**
   * Constructor.
   * @param rsmd to decorate
   */
  public ThrowingResultSetMetaData(ResultSetMetaData rsmd) {
    this.it = rsmd;
  }
  
}
