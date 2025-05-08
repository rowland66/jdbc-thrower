package com.mastercard.test.sql;

import java.sql.DatabaseMetaData;


/**
 * A {@link DatabaseMetaData} decorated to throw an SQLException on command.
 */
public class ThrowingDatabaseMetaData 
    extends ThrowingDatabaseMetaDataJdbc4_1
    implements DatabaseMetaData {
  

  /**
   * Decorator constructor. 
   * @param d base object to decorate. 
   */
  public ThrowingDatabaseMetaData(DatabaseMetaData d) {
    this.it = d;
  }



}
