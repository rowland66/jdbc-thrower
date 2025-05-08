package com.mastercard.test.sql;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.RowIdLifetime;
import java.sql.SQLException;

/**
 * The JDBC4 members of a {@link DatabaseMetaData}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingDatabaseMetaDataJdbc4 
    extends ThrowingDatabaseMetaDataJdbc3 
    implements DatabaseMetaData {
  
  /**
   *  JDBC 4.0
   */
  
 
  /** 
   * {@inheritDoc}
   * @see java.sql.DatabaseMetaData#autoCommitFailureClosesAllResultSets()
   */
  public boolean autoCommitFailureClosesAllResultSets() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "autoCommitFailureClosesAllResultSets");
    return it.autoCommitFailureClosesAllResultSets();
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.DatabaseMetaData#getClientInfoProperties()
   */
  public ResultSet getClientInfoProperties() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getClientInfoProperties");
    return new ThrowingResultSet(it.getClientInfoProperties());
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.DatabaseMetaData#getFunctionColumns(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
   */
  public ResultSet getFunctionColumns(String catalog, String schemaPattern,
          String functionNamePattern, String columnNamePattern)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getFunctionColumns");
    return  new ThrowingResultSet(it.getFunctionColumns(catalog, schemaPattern, functionNamePattern, catalog));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.DatabaseMetaData#getFunctions(java.lang.String, java.lang.String, java.lang.String)
   */
  public ResultSet getFunctions(String catalog, String schemaPattern,
          String functionNamePattern) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getFunctions");
    return  new ThrowingResultSet(it.getFunctions(catalog, schemaPattern, functionNamePattern));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.DatabaseMetaData#getRowIdLifetime()
   */
  public RowIdLifetime getRowIdLifetime() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getRowIdLifetime");
    return it.getRowIdLifetime();
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.DatabaseMetaData#getSchemas(java.lang.String, java.lang.String)
   */
  public ResultSet getSchemas(String catalog, String schemaPattern)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSchemas");
    return  new ThrowingResultSet(it.getSchemas());
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.DatabaseMetaData#supportsStoredFunctionsUsingCallSyntax()
   */
  public boolean supportsStoredFunctionsUsingCallSyntax() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsStoredFunctionsUsingCallSyntax");
    return it.supportsStoredFunctionsUsingCallSyntax();
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Wrapper#isWrapperFor(java.lang.Class)
   */
  public boolean isWrapperFor(Class<?> iface) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isWrapperFor");
    return it.isWrapperFor(iface);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Wrapper#unwrap(java.lang.Class)
   */
  public <T> T unwrap(Class<T> iface) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "unwrap");
    return it.unwrap(iface);
  }
  


}
