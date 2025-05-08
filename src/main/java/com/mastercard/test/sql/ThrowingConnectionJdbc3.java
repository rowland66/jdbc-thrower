package com.mastercard.test.sql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Map;

/**
 * A JDBC3 {@link Connection}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingConnectionJdbc3 
    extends Thrower 
    implements Connection {

  Connection it = null;
  
  
  /**
   * {@inheritDoc}
   * @see java.sql.Connection#clearWarnings()
   */
  public void clearWarnings() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "clearWarnings");
    it.clearWarnings();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#close()
   */
  public void close() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "close");
    it.close();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#commit()
   */
  public void commit() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "commit");
    it.commit();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#createStatement()
   */
  public Statement createStatement() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "createStatement");
    return new ThrowingStatement(it.createStatement());
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#createStatement(int, int)
   */
  public Statement createStatement(int resultSetType, int resultSetConcurrency)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "createStatement");
    return new ThrowingStatement(it.createStatement(resultSetType,resultSetConcurrency));
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#createStatement(int, int, int)
   */
  public Statement createStatement(int resultSetType, int resultSetConcurrency,
      int resultSetHoldability) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "createStatement");
    return new ThrowingStatement(it.createStatement(resultSetType, resultSetConcurrency));
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#getAutoCommit()
   */
  public boolean getAutoCommit() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getAutoCommit");
    return it.getAutoCommit();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#getCatalog()
   */
  public String getCatalog() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCatalog");
    return it.getCatalog();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#getHoldability()
   */
  public int getHoldability() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getHoldability");
    return it.getHoldability();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#getMetaData()
   */
  public DatabaseMetaData getMetaData() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMetaData");
    return new ThrowingDatabaseMetaData(it.getMetaData());
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#getTransactionIsolation()
   */
  public int getTransactionIsolation() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTransactionIsolation");
    return it.getTransactionIsolation();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#getTypeMap()
   */
  public Map<String,Class<?>> getTypeMap() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTypeMap()");
    return it.getTypeMap();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#getWarnings()
   */
  public SQLWarning getWarnings() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getWarnings");
    return it.getWarnings();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#isClosed()
   */
  public boolean isClosed() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isClosed");
    return it.isClosed();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#isReadOnly()
   */
  public boolean isReadOnly() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isReadOnly");
    return it.isReadOnly();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#nativeSQL(java.lang.String)
   */
  public String nativeSQL(String sql) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "nativeSQL");
    return it.nativeSQL(sql);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#prepareCall(java.lang.String)
   */
  public CallableStatement prepareCall(String sql) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "prepareCall");
    return new ThrowingCallableStatement(it.prepareCall(sql));
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#prepareCall(java.lang.String, int, int)
   */
  public CallableStatement prepareCall(String sql, int resultSetType,
      int resultSetConcurrency) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "prepareCall");
    return new ThrowingCallableStatement(it.prepareCall(sql, resultSetType, resultSetConcurrency));
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#prepareCall(java.lang.String, int, int, int)
   */
  public CallableStatement prepareCall(String sql, int resultSetType,
      int resultSetConcurrency, int resultSetHoldability) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "prepareCall");
    return new ThrowingCallableStatement(it.prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability));
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#prepareStatement(java.lang.String)
   */
  public PreparedStatement prepareStatement(String sql) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "prepareStatement");
    return new ThrowingPreparedStatement(it.prepareStatement(sql), sql);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#prepareStatement(java.lang.String, int)
   */
  public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "prepareStatement");
    return new ThrowingPreparedStatement(it.prepareStatement(sql, autoGeneratedKeys), sql);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#prepareStatement(java.lang.String, int[])
   */
  public PreparedStatement prepareStatement(String sql, int[] columnIndexes)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "prepareStatement");
    return new ThrowingPreparedStatement(it.prepareStatement(sql, columnIndexes), sql);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#prepareStatement(java.lang.String, java.lang.String[])
   */
  public PreparedStatement prepareStatement(String sql, String[] columnNames)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "prepareStatement");
    return new ThrowingPreparedStatement(it.prepareStatement(sql, columnNames), sql);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#prepareStatement(java.lang.String, int, int)
   */
  public PreparedStatement prepareStatement(String sql, int resultSetType,
      int resultSetConcurrency) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "prepareStatement");
    return new ThrowingPreparedStatement(it.prepareStatement(sql, resultSetType, resultSetConcurrency), sql);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#prepareStatement(java.lang.String, int, int, int)
   */
  public PreparedStatement prepareStatement(String sql, int resultSetType,
      int resultSetConcurrency, int resultSetHoldability) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "prepareStatement");
    return new ThrowingPreparedStatement(it.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability), sql);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#releaseSavepoint(java.sql.Savepoint)
   */
  public void releaseSavepoint(Savepoint savepoint) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "releaseSavepoint");
    it.releaseSavepoint(savepoint);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#rollback()
   */
  public void rollback() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "rollback");
    it.rollback();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#rollback(java.sql.Savepoint)
   */
  public void rollback(Savepoint savepoint) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "rollback");
    it.rollback(savepoint);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#setAutoCommit(boolean)
   */
  public void setAutoCommit(boolean autoCommit) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setAutoCommit");
    it.setAutoCommit(autoCommit);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#setCatalog(java.lang.String)
   */
  public void setCatalog(String catalog) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setCatalog");
    it.setCatalog(catalog);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#setHoldability(int)
   */
  public void setHoldability(int holdability) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setHoldability");
    it.setHoldability(holdability);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#setReadOnly(boolean)
   */
  public void setReadOnly(boolean readOnly) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setReadOnly");
    it.setReadOnly(readOnly);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#setSavepoint()
   */
  public Savepoint setSavepoint() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setSavepoint");
    return new ThrowingSavepoint(it.setSavepoint());
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#setSavepoint(java.lang.String)
   */
  public Savepoint setSavepoint(String name) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setSavepoint");
    return new ThrowingSavepoint(it.setSavepoint(name));
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#setTransactionIsolation(int)
   */
  public void setTransactionIsolation(int level) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setTransactionIsolation");
    it.setTransactionIsolation(level);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Connection#setTypeMap(java.util.Map)
   */
  public void setTypeMap(Map<String,Class<?>> map) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setTypeMap");
    it.setTypeMap(map);
  }
  
  
}
