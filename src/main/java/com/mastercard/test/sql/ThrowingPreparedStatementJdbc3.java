package com.mastercard.test.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

/**
 * The JDBC3 members of a {@link PreparedStatement}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingPreparedStatementJdbc3 
    extends Thrower 
    implements PreparedStatement {

  PreparedStatement it = null;
  String sql;
  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#addBatch()
   */
  public void addBatch() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "addBatch");
    it.addBatch();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#clearParameters()
   */
  public void clearParameters() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "clearParameters");
    it.clearParameters();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#execute()
   */
  public boolean execute() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "execute", new Object[] {sql});
    return it.execute();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#executeQuery()
   */
  public ResultSet executeQuery() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeQuery", new Object[] {sql});
    return new ThrowingResultSet(it.executeQuery());
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#executeUpdate()
   */
  public int executeUpdate() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeUpdate", new Object[] {sql});
    return it.executeUpdate();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#getMetaData()
   */
  public ResultSetMetaData getMetaData() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMetaData");
    return new ThrowingResultSetMetaData(it.getMetaData());
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#getParameterMetaData()
   */
  public ParameterMetaData getParameterMetaData() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getParameterMetaData");
    return new ThrowingParameterMetaData(it.getParameterMetaData());
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setArray(int, java.sql.Array)
   */
  public void setArray(int i, Array x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setArray");
    it.setArray(i, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setAsciiStream(int, java.io.InputStream,
   *      int)
   */
  public void setAsciiStream(int parameterIndex, InputStream x, int length)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setAsciiStream");
    it.setAsciiStream(parameterIndex, x, length);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setBigDecimal(int, java.math.BigDecimal)
   */
  public void setBigDecimal(int parameterIndex, BigDecimal x)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBigDecimal");
    it.setBigDecimal(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setBinaryStream(int, java.io.InputStream,
   *      int)
   */
  public void setBinaryStream(int parameterIndex, InputStream x, int length)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBinaryStream");
    it.setBinaryStream(parameterIndex, x, length);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setBlob(int, java.sql.Blob)
   */
  public void setBlob(int i, Blob x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBlob");
    it.setBlob(i, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setBoolean(int, boolean)
   */
  public void setBoolean(int parameterIndex, boolean x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBoolean");
    it.setBoolean(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setByte(int, byte)
   */
  public void setByte(int parameterIndex, byte x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setByte");
    it.setByte(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setBytes(int, byte[])
   */
  public void setBytes(int parameterIndex, byte[] x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBytes");
    it.setBytes(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setCharacterStream(int, java.io.Reader,
   *      int)
   */
  public void setCharacterStream(int parameterIndex, Reader reader, int length)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setCharacterStream");
    it.setCharacterStream(parameterIndex, reader, length);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setClob(int, java.sql.Clob)
   */
  public void setClob(int i, Clob x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setClob");
    it.setClob(i, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setDate(int, java.sql.Date)
   */
  public void setDate(int parameterIndex, Date x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setDate");
    it.setDate(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setDate(int, java.sql.Date,
   *      java.util.Calendar)
   */
  public void setDate(int parameterIndex, Date x, Calendar cal)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setDate");
    it.setDate(parameterIndex, x, cal);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setDouble(int, double)
   */
  public void setDouble(int parameterIndex, double x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setDouble");
    it.setDouble(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setFloat(int, float)
   */
  public void setFloat(int parameterIndex, float x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setFloat");
    it.setFloat(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setInt(int, int)
   */
  public void setInt(int parameterIndex, int x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setInt");
    it.setInt(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setLong(int, long)
   */
  public void setLong(int parameterIndex, long x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setLong");
    it.setLong(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setNull(int, int)
   */
  public void setNull(int parameterIndex, int sqlType) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNull");
    it.setNull(parameterIndex, sqlType);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setNull(int, int, java.lang.String)
   */
  public void setNull(int paramIndex, int sqlType, String typeName)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNull");
    it.setNull(paramIndex, sqlType, typeName);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setObject(int, java.lang.Object)
   */
  public void setObject(int parameterIndex, Object x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setObject");
    it.setObject(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setObject(int, java.lang.Object, int)
   */
  public void setObject(int parameterIndex, Object x, int targetSqlType)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setObject");
    it.setObject(parameterIndex, x, targetSqlType);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setObject(int, java.lang.Object, int, int)
   */
  public void setObject(int parameterIndex, Object x, int targetSqlType,
      int scale) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setObject");
    it.setObject(parameterIndex, x, targetSqlType, scale);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setRef(int, java.sql.Ref)
   */
  public void setRef(int i, Ref x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setRef");
    it.setRef(i, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setShort(int, short)
   */
  public void setShort(int parameterIndex, short x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setShort");
    it.setShort(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setString(int, java.lang.String)
   */
  public void setString(int parameterIndex, String x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setString");
    it.setString(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setTime(int, java.sql.Time)
   */
  public void setTime(int parameterIndex, Time x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setTime");
    it.setTime(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setTime(int, java.sql.Time,
   *      java.util.Calendar)
   */
  public void setTime(int parameterIndex, Time x, Calendar cal)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setTime");
    it.setTime(parameterIndex, x, cal);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setTimestamp(int, java.sql.Timestamp)
   */
  public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setTimestamp");
    it.setTimestamp(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setTimestamp(int, java.sql.Timestamp,
   *      java.util.Calendar)
   */
  public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setTimestamp");
    it.setTimestamp(parameterIndex, x, cal);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setURL(int, java.net.URL)
   */
  public void setURL(int parameterIndex, URL x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setURL");
    it.setURL(parameterIndex, x);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.PreparedStatement#setUnicodeStream(int, java.io.InputStream,
   *      int)
   */
  @SuppressWarnings("deprecation")
  public void setUnicodeStream(int parameterIndex, InputStream x, int length)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setUnicodeStream");
    it.setUnicodeStream(parameterIndex, x, length);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#addBatch(java.lang.String)
   */
  public void addBatch(String sql) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "addBatch");
    it.addBatch();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#cancel()
   */
  public void cancel() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "cancel");
    it.cancel();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#clearBatch()
   */
  public void clearBatch() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "clearBatch");
    it.clearBatch();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#clearWarnings()
   */
  public void clearWarnings() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "clearWarnings");
    it.clearWarnings();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#close()
   */
  public void close() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "close");
    it.close();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#execute(java.lang.String)
   */
  public boolean execute(String sql) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "execute", new Object[] {sql});

    return it.execute(sql);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#execute(java.lang.String, int)
   */
  public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "execute", new Object[] {sql});

    return it.execute(sql, autoGeneratedKeys);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#execute(java.lang.String, int[])
   */
  public boolean execute(String sql, int[] columnIndexes) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "execute", new Object[] {sql});

    return it.execute(sql, columnIndexes);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#execute(java.lang.String, java.lang.String[])
   */
  public boolean execute(String sql, String[] columnNames) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "execute", new Object[] {sql});

    return it.execute(sql, columnNames);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#executeBatch()
   */
  public int[] executeBatch() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeBatch", new Object[] {sql});

    return it.executeBatch();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#executeQuery(java.lang.String)
   */
  public ResultSet executeQuery(String sql) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeQuery", new Object[] {sql});

    return new ThrowingResultSet(it.executeQuery(sql));
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#executeUpdate(java.lang.String)
   */
  public int executeUpdate(String sql) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeUpdate", new Object[] {sql});

    return it.executeUpdate(sql);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#executeUpdate(java.lang.String, int)
   */
  public int executeUpdate(String sql, int autoGeneratedKeys)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeUpdate", new Object[] {sql});

    return it.executeUpdate(sql, autoGeneratedKeys);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#executeUpdate(java.lang.String, int[])
   */
  public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeUpdate", new Object[] {sql});

    return it.executeUpdate(sql, columnIndexes);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#executeUpdate(java.lang.String, java.lang.String[])
   */
  public int executeUpdate(String sql, String[] columnNames)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeUpdate", new Object[] {sql});

    return it.executeUpdate(sql, columnNames);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getConnection()
   */
  public Connection getConnection() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getConnection");

    return new ThrowingConnection(it.getConnection());
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getFetchDirection()
   */
  public int getFetchDirection() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getFetchDirection");

    return it.getFetchDirection();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getFetchSize()
   */
  public int getFetchSize() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getFetchSize");

    return it.getFetchSize();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getGeneratedKeys()
   */
  public ResultSet getGeneratedKeys() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getGeneratedKeys");

    return new ThrowingResultSet(it.getGeneratedKeys());
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getMaxFieldSize()
   */
  public int getMaxFieldSize() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxFieldSize");

    return it.getMaxFieldSize();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getMaxRows()
   */
  public int getMaxRows() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxRows");

    return it.getMaxRows();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getMoreResults()
   */
  public boolean getMoreResults() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMoreResults");

    return it.getMoreResults();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getMoreResults(int)
   */
  public boolean getMoreResults(int current) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMoreResults");

    return it.getMoreResults(current);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getQueryTimeout()
   */
  public int getQueryTimeout() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getQueryTimeout");

    return it.getQueryTimeout();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getResultSet()
   */
  public ResultSet getResultSet() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getResultSet");

    return new ThrowingResultSet(it.getResultSet());
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getResultSetConcurrency()
   */
  public int getResultSetConcurrency() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getResultSetConcurrency");

    return it.getResultSetConcurrency();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getResultSetHoldability()
   */
  public int getResultSetHoldability() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getResultSetHoldability");

    return it.getResultSetHoldability();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getResultSetType()
   */
  public int getResultSetType() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getResultSetType");

    return it.getResultSetType();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getUpdateCount()
   */
  public int getUpdateCount() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getUpdateCount");

    return it.getUpdateCount();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#getWarnings()
   */
  public SQLWarning getWarnings() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getWarnings");

    return it.getWarnings();
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#setCursorName(java.lang.String)
   */
  public void setCursorName(String name) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setCursorName");
    it.setCursorName(name);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#setEscapeProcessing(boolean)
   */
  public void setEscapeProcessing(boolean enable) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setEscapeProcessing");
    it.setEscapeProcessing(enable);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#setFetchDirection(int)
   */
  public void setFetchDirection(int direction) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setFetchDirection");
    it.setFetchDirection(direction);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#setFetchSize(int)
   */
  public void setFetchSize(int rows) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setFetchSize");
    it.setFetchSize(rows);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#setMaxFieldSize(int)
   */
  public void setMaxFieldSize(int max) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setMaxFieldSize");
    it.setMaxFieldSize(max);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#setMaxRows(int)
   */
  public void setMaxRows(int max) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setMaxRows");
    it.setMaxRows(max);
  }

  /**
   * {@inheritDoc}
   * 
   * @see java.sql.Statement#setQueryTimeout(int)
   */
  public void setQueryTimeout(int seconds) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setQueryTimeout");
    it.setQueryTimeout(seconds);
  }
  

}
