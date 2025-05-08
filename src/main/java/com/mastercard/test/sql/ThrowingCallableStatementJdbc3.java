package com.mastercard.test.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ParameterMetaData;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

/**
 * The JDBC3 members of a {@link CallableStatement}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingCallableStatementJdbc3 
    extends Thrower 
    implements CallableStatement {

  CallableStatement it = null;
  
  public Array getArray(int i) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getArray");
    return new ThrowingArray(it.getArray(i));
  }

  public Array getArray(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getArray");
    return new ThrowingArray(it.getArray(parameterName));
  }

  public BigDecimal getBigDecimal(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBigDecimal");
    return it.getBigDecimal(parameterIndex);
  }

  public BigDecimal getBigDecimal(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBigDecimal");
    return it.getBigDecimal(parameterName);
  }

  @SuppressWarnings("deprecation")
  public BigDecimal getBigDecimal(int parameterIndex, int scale)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBigDecimal");
    return it.getBigDecimal(parameterIndex, scale);
  }

  public Blob getBlob(int i) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBlob");
    return new ThrowingBlob(it.getBlob(i));
  }

  public Blob getBlob(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBlob");
    return new ThrowingBlob(it.getBlob(parameterName));
  }

  public boolean getBoolean(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBoolean");
    return it.getBoolean(parameterIndex);
  }

  public boolean getBoolean(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBoolean");
    return it.getBoolean(parameterName);
  }

  public byte getByte(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getByte");
    return it.getByte(parameterIndex);
  }

  public byte getByte(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getByte");
    return it.getByte(parameterName);
  }

  public byte[] getBytes(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBytes");
    return it.getBytes(parameterIndex);
  }

  public byte[] getBytes(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBytes");
    return it.getBytes(parameterName);
  }

  public Clob getClob(int i) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getClob");
    return new ThrowingClob(it.getClob(i));
  }

  public Clob getClob(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getClob");
    return new ThrowingClob(it.getClob(parameterName));
  }

  public Date getDate(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDate");
    return it.getDate(parameterIndex);
  }

  public Date getDate(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDate");
    return it.getDate(parameterName);
  }

  public Date getDate(int parameterIndex, Calendar cal) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDate");
    return it.getDate(parameterIndex, cal);
  }

  public Date getDate(String parameterName, Calendar cal) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDate");
    return it.getDate(parameterName, cal);
  }

  public double getDouble(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDouble");
    return it.getDouble(parameterIndex);
  }

  public double getDouble(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDouble");
    return it.getDouble(parameterName);
  }

  public float getFloat(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getFloat");
    return it.getFloat(parameterIndex);
  }

  public float getFloat(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getFloat");
    return it.getFloat(parameterName);
  }

  public int getInt(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getInt");
    return it.getInt(parameterIndex);
  }

  public int getInt(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getInt");
    return it.getInt(parameterName);
  }

  public long getLong(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getLong");
    return it.getLong(parameterIndex);
  }

  public long getLong(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getLong");
    return it.getLong(parameterName);
  }

  public Object getObject(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getObject");
    return it.getObject(parameterIndex);
  }

  public Object getObject(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getObject");
    return it.getObject(parameterName);
  }

  public Object getObject(int arg0, Map<String, Class<?>> arg1) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getObject");
    return it.getObject(arg0, arg1);
  }

  public Object getObject(String arg0, Map<String, Class<?>> arg1) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getObject");
    return it.getObject(arg0, arg1);
  }

  public Ref getRef(int i) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getRef");
    return new ThrowingRef(it.getRef(i));
  }

  public Ref getRef(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getRef");
    return new ThrowingRef(it.getRef(parameterName));
  }

  public short getShort(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getShort");
    return it.getShort(parameterIndex);
  }

  public short getShort(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getShort");
    return it.getShort(parameterName);
  }

  public String getString(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getString");
    return it.getString(parameterIndex);
  }

  public String getString(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getString");
    return it.getString(parameterName);
  }

  public Time getTime(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTime");
    return it.getTime(parameterIndex);
  }

  public Time getTime(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTime");
    return it.getTime(parameterName);
  }

  public Time getTime(int parameterIndex, Calendar cal) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTime");
    return it.getTime(parameterIndex, cal);
  }

  public Time getTime(String parameterName, Calendar cal) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTime");
    return it.getTime(parameterName, cal);
  }

  public Timestamp getTimestamp(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTimestamp");
    return it.getTimestamp(parameterIndex);
  }

  public Timestamp getTimestamp(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTimestamp");
    return it.getTimestamp(parameterName);
  }

  public Timestamp getTimestamp(int parameterIndex, Calendar cal)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTimestamp");
    return it.getTimestamp(parameterIndex, cal);
  }

  public Timestamp getTimestamp(String parameterName, Calendar cal)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTimestamp");
    return it.getTimestamp(parameterName, cal);
  }

  public URL getURL(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getURL");
    return it.getURL(parameterIndex);
    
  }
  public URL getURL(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getURL");
    return it.getURL(parameterName);    
  }
  public void registerOutParameter(int parameterIndex, int sqlType, int scale) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "registerOutParameter");
    it.registerOutParameter(parameterIndex, sqlType, scale);
    
  }
  public void registerOutParameter(int paramIndex, int sqlType, String typeName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "registerOutParameter");
    it.registerOutParameter(paramIndex, sqlType, typeName);
    
  }
  public void registerOutParameter(int parameterIndex, int sqlType) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "registerOutParameter");
    it.registerOutParameter(parameterIndex, sqlType);
    
  }
  public void registerOutParameter(String parameterName, int sqlType, int scale) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "registerOutParameter");
    it.registerOutParameter(parameterName, sqlType, scale);
    
  }
  public void registerOutParameter(String parameterName, int sqlType, String typeName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "registerOutParameter");
    it.registerOutParameter(parameterName, sqlType, typeName);
    
  }
  public void registerOutParameter(String parameterName, int sqlType) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "registerOutParameter");
    it.registerOutParameter(parameterName, sqlType);
    
  }
  public void setAsciiStream(String parameterName, InputStream x, int length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setAsciiStream");
    it.setAsciiStream(parameterName, x, length);
    
  }
  public void setBigDecimal(String parameterName, BigDecimal x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBigDecimal");
    it.setBigDecimal(parameterName, x);
    
  }
  public void setBinaryStream(String parameterName, InputStream x, int length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBinaryStream");
    it.setBinaryStream(parameterName, x, length);
  }
  public void setBoolean(String parameterName, boolean x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBoolean");
    it.setBoolean(parameterName, x);
    
  }
  public void setByte(String parameterName, byte x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setByte");
    it.setByte(parameterName, x);
  }
  public void setBytes(String parameterName, byte[] x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBytes");
    it.setBytes(parameterName, x);
  }
  public void setCharacterStream(String parameterName, Reader reader, int length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setCharacterStream");
    it.setCharacterStream(parameterName, reader, length);
  }
  public void setDate(String parameterName, Date x, Calendar cal) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setDate");
    it.setDate(parameterName, x, cal);
  }
  public void setDate(String parameterName, Date x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setDate");
    it.setDate(parameterName, x);
    
  }
  public void setDouble(String parameterName, double x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setDouble");
    it.setDouble(parameterName, x);
  }
  public void setFloat(String parameterName, float x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setFloat");
    it.setFloat(parameterName, x);
  }
  public void setInt(String parameterName, int x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setInt");
    it.setInt(parameterName, x);
  }
  public void setLong(String parameterName, long x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setLong");
    it.setLong(parameterName, x);
  }
  public void setNull(String parameterName, int sqlType, String typeName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNull");
    it.setNull(parameterName, sqlType, typeName);
  }
  public void setNull(String parameterName, int sqlType) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNull");
    it.setNull(parameterName, sqlType);
  }
  public void setObject(String parameterName, Object x, int targetSqlType, int scale) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setObject");
    it.setObject(parameterName, x, targetSqlType, scale);
  }
  public void setObject(String parameterName, Object x, int targetSqlType) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setObject");
    it.setObject(parameterName, x, targetSqlType);
  }
  public void setObject(String parameterName, Object x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setObject");
    it.setObject(parameterName, x);
  }
  public void setShort(String parameterName, short x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setShort");
    it.setShort(parameterName, x);
  }
  public void setString(String parameterName, String x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setString");
    it.setString(parameterName, x);
  }
  public void setTime(String parameterName, Time x, Calendar cal) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setTime");
    it.setTime(parameterName, x, cal);
    
  }
  public void setTime(String parameterName, Time x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setTime");
    it.setTime(parameterName, x);
  }
  public void setTimestamp(String parameterName, Timestamp x, Calendar cal) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setTimestamp");
    it.setTimestamp(parameterName, x, cal);
    
  }
  public void setTimestamp(String parameterName, Timestamp x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setTimestamp");
    it.setTimestamp(parameterName, x);
  }
  public void setURL(String parameterName, URL val) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setURL");
    it.setURL(parameterName, val);
  }
  public boolean wasNull() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "wasNull");
    return it.wasNull();
  }
  public void addBatch() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "addBatch");
    it.addBatch();
  }
  public void clearParameters() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "clearParameters");
    it.clearParameters();
  }
  public boolean execute() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "execute");
    return it.execute();
  }
  public ResultSet executeQuery() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeQuery");
    return it.executeQuery();
  }
  public int executeUpdate() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeUpdate");
    return it.executeUpdate();
  }
  public ResultSetMetaData getMetaData() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMetaData");
    return it.getMetaData();
  }
  public ParameterMetaData getParameterMetaData() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getParameterMetaData");
    return new ThrowingParameterMetaData(it.getParameterMetaData());
  }
  public void setArray(int i, Array x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setArray");
    it.setArray(i, x);
  }
  public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setAsciiStream");
    it.setAsciiStream(parameterIndex, x, length);
  }
  public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBigDecimal");
    it.setBigDecimal(parameterIndex, x);
  }
  public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBinaryStream");
    it.setBinaryStream(parameterIndex, x, length);
  }
  public void setBlob(int i, Blob x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBlob");
    it.setBlob(i, x);
  }
  public void setBoolean(int parameterIndex, boolean x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBoolean");
    it.setBoolean(parameterIndex, x);
  }
  public void setByte(int parameterIndex, byte x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setByte");
    it.setByte(parameterIndex, x);
  }
  public void setBytes(int parameterIndex, byte[] x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBytes");
    it.setBytes(parameterIndex, x);
  }
  public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setCharacterStream");
    it.setCharacterStream(parameterIndex, reader, length);
  }
  public void setClob(int i, Clob x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setClob");
    it.setClob(i, x);
  }
  public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setDate");
    it.setDate(parameterIndex, x, cal);
    
  }
  public void setDate(int parameterIndex, Date x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setDate");
    it.setDate(parameterIndex, x);
  }
  public void setDouble(int parameterIndex, double x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setDouble");
    it.setDouble(parameterIndex, x);
  }
  public void setFloat(int parameterIndex, float x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setFloat");
    it.setFloat(parameterIndex, x);
  }
  public void setInt(int parameterIndex, int x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setInt");
    it.setInt(parameterIndex, x);
  }
  public void setLong(int parameterIndex, long x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setLong");
    it.setLong(parameterIndex, x);
  }
  public void setNull(int paramIndex, int sqlType, String typeName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNull");
    it.setNull(paramIndex, sqlType, typeName);
  }
  public void setNull(int parameterIndex, int sqlType) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNull");
    it.setNull(parameterIndex, sqlType);
  }
  public void setObject(int parameterIndex, Object x, int targetSqlType, int scale) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setObject");
    it.setObject(parameterIndex, x, targetSqlType, scale);
  }
  public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setObject");
    it.setObject(parameterIndex, x, targetSqlType);
  }
  public void setObject(int parameterIndex, Object x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setObject");
    it.setObject(parameterIndex, x);
    
  }
  public void setRef(int i, Ref x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setRef");
    it.setRef(i, x);
  }
  public void setShort(int parameterIndex, short x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setShort");
    it.setShort(parameterIndex, x);
  }
  public void setString(int parameterIndex, String x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setString");
    it.setString(parameterIndex, x);
  }
  public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setTime");
    it.setTime(parameterIndex, x, cal);
  }
  public void setTime(int parameterIndex, Time x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setTime");
    it.setTime(parameterIndex, x);
  }
  public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setTimestamp");
    it.setTimestamp(parameterIndex, x, cal);
  }
  public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setTimestamp");
    it.setTimestamp(parameterIndex, x);
  }
  @SuppressWarnings("deprecation")
  public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setUnicodeStream");
    it.setUnicodeStream(parameterIndex, x, length);
  }
  public void setURL(int parameterIndex, URL x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setURL");
    it.setURL(parameterIndex, x);
  }
  public void addBatch(String sql) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "addBatch");
    it.addBatch(sql);
  }
  public void cancel() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "cancel");
    it.cancel();
  }
  public void clearBatch() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "clearBatch");
    it.clearBatch();
  }
  public void clearWarnings() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "clearWarnings");
    it.clearWarnings();
  }
  public void close() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "close");
    it.close();
  }
  public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "execute");
    return it.execute(sql, autoGeneratedKeys);
  }
  public boolean execute(String sql, int[] columnIndexes) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "execute");
    return it.execute(sql, columnIndexes);
  }
  public boolean execute(String sql, String[] columnNames) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "execute");
    return it.execute(sql, columnNames);
  }
  public boolean execute(String sql) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "execute");
    return it.execute(sql);
  }
  public int[] executeBatch() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeBatch");
    return it.executeBatch();
  }
  public ResultSet executeQuery(String sql) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeQuery");
    return new ThrowingResultSet(it.executeQuery(sql));
  }
  public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeUpdate");
    return it.executeUpdate(sql, autoGeneratedKeys);
  }
  public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeUpdate");
    return it.executeUpdate(sql, columnIndexes);
  }
  public int executeUpdate(String sql, String[] columnNames) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeUpdate");
    return it.executeUpdate(sql, columnNames);
  }
  public int executeUpdate(String sql) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "executeUpdate");
    return it.executeUpdate(sql);
  }

  public Connection getConnection() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getConnection");
    return new ThrowingConnection(it.getConnection());
  }
  public int getFetchDirection() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getFetchDirection");
    return it.getFetchDirection();
  }
  public int getFetchSize() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getFetchSize");
    return it.getFetchSize();
  }
  public ResultSet getGeneratedKeys() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getGeneratedKeys");
    return new ThrowingResultSet(it.getGeneratedKeys());
  }
  public int getMaxFieldSize() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxFieldSize");
    return it.getMaxFieldSize();
  }
  public int getMaxRows() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxRows");
    return it.getMaxRows();
  }
  public boolean getMoreResults() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMoreResults");
    return it.getMoreResults();
  }
  public boolean getMoreResults(int current) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMoreResults");
    return it.getMoreResults(current);
  }
  public int getQueryTimeout() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getQueryTimeout");
    return it.getQueryTimeout();
  }
  public ResultSet getResultSet() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getResultSet");
    return new ThrowingResultSet(it.getResultSet());
  }
  public int getResultSetConcurrency() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getResultSetConcurrency");
    return it.getResultSetConcurrency();
  }
  public int getResultSetHoldability() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getResultSetHoldability");
    return it.getResultSetHoldability();
  }
  public int getResultSetType() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getResultSetType");
    return it.getResultSetType();
  }
  public int getUpdateCount() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getUpdateCount");
    return it.getUpdateCount();
  }
  public SQLWarning getWarnings() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getWarnings");
    return it.getWarnings();
  }
  public void setCursorName(String name) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setCursorName");
    it.setCursorName(name);
  }
  public void setEscapeProcessing(boolean enable) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setEscapeProcessing");
    it.setEscapeProcessing(enable);
  }
  public void setFetchDirection(int direction) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setFetchDirection");
    it.setFetchDirection(direction);
    
  }
  public void setFetchSize(int rows) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setFetchSize");
    it.setFetchSize(rows);
  }
  public void setMaxFieldSize(int max) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setMaxFieldSize");
    it.setMaxFieldSize(max);
  }
  public void setMaxRows(int max) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setMaxRows");
    it.setMaxRows(max);
  }
  public void setQueryTimeout(int seconds) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setQueryTimeout");
    it.setQueryTimeout(seconds);
  }
}
