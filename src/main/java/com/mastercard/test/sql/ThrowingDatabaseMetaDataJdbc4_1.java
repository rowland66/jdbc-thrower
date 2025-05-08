package com.mastercard.test.sql;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The JDBC4.1 members of a {@link DatabaseMetaData}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingDatabaseMetaDataJdbc4_1 
    extends ThrowingDatabaseMetaDataJdbc4 
    implements DatabaseMetaData {
  
  @Override
  public ResultSet getPseudoColumns(String catalog, String schemaPattern,
      String tableNamePattern, String columnNamePattern) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getPseudoColumns");
    return it.getPseudoColumns(catalog, schemaPattern, tableNamePattern, columnNamePattern);
  }

  @Override
  public boolean generatedKeyAlwaysReturned() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "generatedKeyAlwaysReturned");
    return it.generatedKeyAlwaysReturned();
  }


}
