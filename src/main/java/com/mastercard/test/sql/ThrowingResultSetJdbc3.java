package com.mastercard.test.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

/**
 * The JDBC3 methods of a {@link ResultSet}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingResultSetJdbc3 
    extends Thrower 
    implements ResultSet {

  ResultSet it = null;


  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#absolute(int)
   */
  public boolean absolute(int row) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "absolute");
     return it.absolute(row);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#afterLast()
   */
  public void afterLast() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "afterLast");
    it.afterLast();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#beforeFirst()
   */
  public void beforeFirst() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "beforeFirst");
    it.beforeFirst();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#cancelRowUpdates()
   */
  public void cancelRowUpdates() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "cancelRowUpdates");
    it.cancelRowUpdates();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#clearWarnings()
   */
  public void clearWarnings() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "clearWarnings");
    it.clearWarnings();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#close()
   */
  public void close() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "close");
    it.close();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#deleteRow()
   */
  public void deleteRow() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "deleteRow");
    it.deleteRow();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#findColumn(java.lang.String)
   */
  public int findColumn(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "findColumn");
    return it.findColumn(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#first()
   */
  public boolean first() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "first");
    return it.first();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getArray(int)
   */
  public Array getArray(int i) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getArray");
    return new ThrowingArray(it.getArray(i));
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getArray(java.lang.String)
   */
  public Array getArray(String colName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getArray");
    return new ThrowingArray(it.getArray(colName));
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getAsciiStream(int)
   */
  public InputStream getAsciiStream(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getAsciiStream");
    return it.getAsciiStream(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getAsciiStream(java.lang.String)
   */
  public InputStream getAsciiStream(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getAsciiStream");
    return it.getAsciiStream(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getBigDecimal(int)
   */
  public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBigDecimal");
    return it.getBigDecimal(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getBigDecimal(java.lang.String)
   */
  public BigDecimal getBigDecimal(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBigDecimal");
    return it.getBigDecimal(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getBigDecimal(int, int)
   */
  @SuppressWarnings("deprecation")
  public BigDecimal getBigDecimal(int columnIndex, int scale)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBigDecimal");
    return it.getBigDecimal(columnIndex, scale);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getBigDecimal(java.lang.String, int)
   */
  @SuppressWarnings("deprecation")
  public BigDecimal getBigDecimal(String columnName, int scale)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBigDecimal");
    return it.getBigDecimal(columnName, scale);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getBinaryStream(int)
   */
  public InputStream getBinaryStream(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBinaryStream");
    return it.getBinaryStream(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getBinaryStream(java.lang.String)
   */
  public InputStream getBinaryStream(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBinaryStream");
    return it.getBinaryStream(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getBlob(int)
   */
  public Blob getBlob(int i) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBlob");
    return new ThrowingBlob(it.getBlob(i));
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getBlob(java.lang.String)
   */
  public Blob getBlob(String colName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBlob");
    return new ThrowingBlob(it.getBlob(colName));
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getBoolean(int)
   */
  public boolean getBoolean(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBoolean");
    return it.getBoolean(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getBoolean(java.lang.String)
   */
  public boolean getBoolean(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBoolean");
    return it.getBoolean(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getByte(int)
   */
  public byte getByte(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getByte");
    return it.getByte(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getByte(java.lang.String)
   */
  public byte getByte(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getByte");
    return it.getByte(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getBytes(int)
   */
  public byte[] getBytes(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBytes");
    return it.getBytes(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getBytes(java.lang.String)
   */
  public byte[] getBytes(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBytes");
    return it.getBytes(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getCharacterStream(int)
   */
  public Reader getCharacterStream(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCharacterStream");
    return it.getCharacterStream(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getCharacterStream(java.lang.String)
   */
  public Reader getCharacterStream(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCharacterStream");
    return it.getCharacterStream(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getClob(int)
   */
  public Clob getClob(int i) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getClob");
    return new ThrowingClob(it.getClob(i));
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getClob(java.lang.String)
   */
  public Clob getClob(String colName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getClob");
    return new ThrowingClob(it.getClob(colName));
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getConcurrency()
   */
  public int getConcurrency() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getConcurrency");
    return it.getConcurrency();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getCursorName()
   */
  public String getCursorName() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCursorName");
    return it.getCursorName();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getDate(int)
   */
  public Date getDate(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDate");
    return it.getDate(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getDate(java.lang.String)
   */
  public Date getDate(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDate");
    return it.getDate(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getDate(int, java.util.Calendar)
   */
  public Date getDate(int columnIndex, Calendar cal) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDate");
    return it.getDate(columnIndex, cal);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getDate(java.lang.String, java.util.Calendar)
   */
  public Date getDate(String columnName, Calendar cal) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDate");
    return it.getDate(columnName, cal);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getDouble(int)
   */
  public double getDouble(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDouble");
    return it.getDouble(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getDouble(java.lang.String)
   */
  public double getDouble(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDouble");
    return it.getDouble(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getFetchDirection()
   */
  public int getFetchDirection() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getFetchDirection");
    return it.getFetchDirection();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getFetchSize()
   */
  public int getFetchSize() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getFetchSize");
    return it.getFetchSize();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getFloat(int)
   */
  public float getFloat(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getFloat");
    return it.getFloat(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getFloat(java.lang.String)
   */
  public float getFloat(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getFloat");
    return it.getFloat(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getInt(int)
   */
  public int getInt(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getInt");
    return it.getInt(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getInt(java.lang.String)
   */
  public int getInt(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getInt");
    return it.getInt(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getLong(int)
   */
  public long getLong(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getLong");
    return it.getLong(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getLong(java.lang.String)
   */
  public long getLong(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getLong");
    return it.getLong(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getMetaData()
   */
  public ResultSetMetaData getMetaData() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMetaData");
    return new ThrowingResultSetMetaData(it.getMetaData());
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getObject(int)
   */
  public Object getObject(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getObject");
    return it.getObject(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getObject(java.lang.String)
   */
  public Object getObject(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getObject");
    return it.getObject(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getObject(int, java.util.Map)
   */
  public Object getObject(int i, Map<String, Class<?>>map) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getObject");

    return it.getObject(i, map);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getObject(java.lang.String, java.util.Map)
   */
  public Object getObject(String colName, Map<String, Class<?>> map) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getObject");
    return it.getObject(colName, map);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getRef(int)
   */
  public Ref getRef(int i) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getRef");
    return new ThrowingRef(it.getRef(i));
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getRef(java.lang.String)
   */
  public Ref getRef(String colName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getRef");
    return new ThrowingRef(it.getRef(colName));
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getRow()
   */
  public int getRow() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getRow");
    return it.getRow();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getShort(int)
   */
  public short getShort(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getShort");
    return it.getShort(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getShort(java.lang.String)
   */
  public short getShort(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getShort");
    return it.getShort(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getStatement()
   */
  public Statement getStatement() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getStatement");
    return new ThrowingStatement(it.getStatement());
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getString(int)
   */
  public String getString(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getString");
    return it.getString(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getString(java.lang.String)
   */
  public String getString(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getString");
    return it.getString(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getTime(int)
   */
  public Time getTime(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTime");
    return it.getTime(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getTime(java.lang.String)
   */
  public Time getTime(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTime");
    return it.getTime(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getTime(int, java.util.Calendar)
   */
  public Time getTime(int columnIndex, Calendar cal) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTime");
    return it.getTime(columnIndex, cal);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getTime(java.lang.String, java.util.Calendar)
   */
  public Time getTime(String columnName, Calendar cal) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTime");
    return it.getTime(columnName, cal);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getTimestamp(int)
   */
  public Timestamp getTimestamp(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTimestamp");
    return it.getTimestamp(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getTimestamp(java.lang.String)
   */
  public Timestamp getTimestamp(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTimestamp");
    return it.getTimestamp(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getTimestamp(int, java.util.Calendar)
   */
  public Timestamp getTimestamp(int columnIndex, Calendar cal)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTimestamp");
    return it.getTimestamp(columnIndex, cal);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getTimestamp(java.lang.String, java.util.Calendar)
   */
  public Timestamp getTimestamp(String columnName, Calendar cal)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTimestamp");
    return it.getTimestamp(columnName, cal);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getType()
   */
  public int getType() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getType");
    return it.getType();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getURL(int)
   */
  public URL getURL(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getURL");
    return it.getURL(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getURL(java.lang.String)
   */
  public URL getURL(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getURL");

    return it.getURL(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getUnicodeStream(int)
   */
  @SuppressWarnings("deprecation")
  public InputStream getUnicodeStream(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getUnicodeStream");
    return it.getUnicodeStream(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getUnicodeStream(java.lang.String)
   */
  @SuppressWarnings("deprecation")
  public InputStream getUnicodeStream(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getUnicodeStream");
    return it.getUnicodeStream(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#getWarnings()
   */
  public SQLWarning getWarnings() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getWarnings");
    return it.getWarnings();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#insertRow()
   */
  public void insertRow() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "insertRow");
    it.insertRow();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#isAfterLast()
   */
  public boolean isAfterLast() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isAfterLast");
    return it.isAfterLast();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#isBeforeFirst()
   */
  public boolean isBeforeFirst() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isBeforeFirst");
    return it.isBeforeFirst();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#isFirst()
   */
  public boolean isFirst() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isFirst");
    return it.isFirst();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#isLast()
   */
  public boolean isLast() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isLast");
    return it.isLast();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#last()
   */
  public boolean last() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "last");
    return it.last();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#moveToCurrentRow()
   */
  public void moveToCurrentRow() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "moveToCurrentRow");
    it.moveToCurrentRow();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#moveToInsertRow()
   */
  public void moveToInsertRow() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "moveToInsertRow");
    it.moveToInsertRow();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#next()
   */
  public boolean next() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "next");

    return it.next();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#previous()
   */
  public boolean previous() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "previous");
    return it.previous();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#refreshRow()
   */
  public void refreshRow() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "refreshRow");
    it.refreshRow();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#relative(int)
   */
  public boolean relative(int rows) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "relative");
    return it.relative(rows);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#rowDeleted()
   */
  public boolean rowDeleted() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "rowDeleted");
    return it.rowDeleted();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#rowInserted()
   */
  public boolean rowInserted() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "rowInserted");
    return it.rowInserted();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#rowUpdated()
   */
  public boolean rowUpdated() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "rowUpdated");
    return it.rowUpdated();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#setFetchDirection(int)
   */
  public void setFetchDirection(int direction) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setFetchDirection");
    it.setFetchDirection(direction);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#setFetchSize(int)
   */
  public void setFetchSize(int rows) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setFetchSize");
    it.setFetchSize(rows);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateArray(int, java.sql.Array)
   */
  public void updateArray(int columnIndex, Array x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateArray");
    it.updateArray(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateArray(java.lang.String, java.sql.Array)
   */
  public void updateArray(String columnName, Array x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateArray");
    it.updateArray(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateAsciiStream(int, java.io.InputStream, int)
   */
  public void updateAsciiStream(int columnIndex, InputStream x, int length)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateAsciiStream");
    it.updateAsciiStream(columnIndex, x, length);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateAsciiStream(java.lang.String, java.io.InputStream, int)
   */
  public void updateAsciiStream(String columnName, InputStream x, int length)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateAsciiStream");
    it.updateAsciiStream(columnName, x, length);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBigDecimal(int, java.math.BigDecimal)
   */
  public void updateBigDecimal(int columnIndex, BigDecimal x)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBigDecimal");
    it.updateBigDecimal(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBigDecimal(java.lang.String, java.math.BigDecimal)
   */
  public void updateBigDecimal(String columnName, BigDecimal x)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBigDecimal");
    it.updateBigDecimal(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBinaryStream(int, java.io.InputStream, int)
   */
  public void updateBinaryStream(int columnIndex, InputStream x, int length)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBinaryStream");
    it.updateBinaryStream(columnIndex, x, length);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBinaryStream(java.lang.String, java.io.InputStream, int)
   */
  public void updateBinaryStream(String columnName, InputStream x, int length)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBinaryStream");
    it.updateBinaryStream(columnName, x, length);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBlob(int, java.sql.Blob)
   */
  public void updateBlob(int columnIndex, Blob x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBlob");
    it.updateBlob(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBlob(java.lang.String, java.sql.Blob)
   */
  public void updateBlob(String columnName, Blob x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBlob");
    it.updateBlob(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBoolean(int, boolean)
   */
  public void updateBoolean(int columnIndex, boolean x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBoolean");
    it.updateBoolean(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBoolean(java.lang.String, boolean)
   */
  public void updateBoolean(String columnName, boolean x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBoolean");
    it.updateBoolean(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateByte(int, byte)
   */
  public void updateByte(int columnIndex, byte x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateByte");
    it.updateByte(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateByte(java.lang.String, byte)
   */
  public void updateByte(String columnName, byte x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateByte");
    it.updateByte(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBytes(int, byte[])
   */
  public void updateBytes(int columnIndex, byte[] x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBytes");
    it.updateBytes(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBytes(java.lang.String, byte[])
   */
  public void updateBytes(String columnName, byte[] x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBytes");
    it.updateBytes(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateCharacterStream(int, java.io.Reader, int)
   */
  public void updateCharacterStream(int columnIndex, Reader x, int length)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateCharacterStream");
    it.updateCharacterStream(columnIndex, x, length);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateCharacterStream(java.lang.String, java.io.Reader, int)
   */
  public void updateCharacterStream(String columnName, Reader reader, int length)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateCharacterStream");
    it.updateCharacterStream(columnName, reader, length);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateClob(int, java.sql.Clob)
   */
  public void updateClob(int columnIndex, Clob x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateClob");
    it.updateClob(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateClob(java.lang.String, java.sql.Clob)
   */
  public void updateClob(String columnName, Clob x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateClob");
    it.updateClob(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateDate(int, java.sql.Date)
   */
  public void updateDate(int columnIndex, Date x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateDate");
    it.updateDate(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateDate(java.lang.String, java.sql.Date)
   */
  public void updateDate(String columnName, Date x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateDate");
    it.updateDate(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateDouble(int, double)
   */
  public void updateDouble(int columnIndex, double x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateDouble");
    it.updateDouble(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateDouble(java.lang.String, double)
   */
  public void updateDouble(String columnName, double x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateDouble");
    it.updateDouble(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateFloat(int, float)
   */
  public void updateFloat(int columnIndex, float x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateFloat");
    it.updateFloat(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateFloat(java.lang.String, float)
   */
  public void updateFloat(String columnName, float x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateFloat");
    it.updateFloat(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateInt(int, int)
   */
  public void updateInt(int columnIndex, int x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateInt");
    it.updateInt(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateInt(java.lang.String, int)
   */
  public void updateInt(String columnName, int x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateInt");
    it.updateInt(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateLong(int, long)
   */
  public void updateLong(int columnIndex, long x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateLong");
    it.updateLong(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateLong(java.lang.String, long)
   */
  public void updateLong(String columnName, long x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateLong");
    it.updateLong(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateNull(int)
   */
  public void updateNull(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateNull");
    it.updateNull(columnIndex);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateNull(java.lang.String)
   */
  public void updateNull(String columnName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateNull");
    it.updateNull(columnName);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateObject(int, java.lang.Object)
   */
  public void updateObject(int columnIndex, Object x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateObject");
    it.updateObject(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateObject(java.lang.String, java.lang.Object)
   */
  public void updateObject(String columnName, Object x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateObject");
    it.updateObject(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateObject(int, java.lang.Object, int)
   */
  public void updateObject(int columnIndex, Object x, int scale)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateObject");
    it.updateObject(columnIndex, x, scale);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateObject(java.lang.String, java.lang.Object, int)
   */
  public void updateObject(String columnName, Object x, int scale)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateObject");
    it.updateObject(columnName, x, scale);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateRef(int, java.sql.Ref)
   */
  public void updateRef(int columnIndex, Ref x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateRef");
    it.updateRef(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateRef(java.lang.String, java.sql.Ref)
   */
  public void updateRef(String columnName, Ref x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateRef");
    it.updateRef(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateRow()
   */
  public void updateRow() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateRow");
    it.updateRow();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateShort(int, short)
   */
  public void updateShort(int columnIndex, short x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateShort");
    it.updateShort(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateShort(java.lang.String, short)
   */
  public void updateShort(String columnName, short x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateShort");
    it.updateShort(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateString(int, java.lang.String)
   */
  public void updateString(int columnIndex, String x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateString");
    it.updateString(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateString(java.lang.String, java.lang.String)
   */
  public void updateString(String columnName, String x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateString");
    it.updateString(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateTime(int, java.sql.Time)
   */
  public void updateTime(int columnIndex, Time x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateTime");
    it.updateTime(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateTime(java.lang.String, java.sql.Time)
   */
  public void updateTime(String columnName, Time x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateTime");
    it.updateTime(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateTimestamp(int, java.sql.Timestamp)
   */
  public void updateTimestamp(int columnIndex, Timestamp x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateTimestamp");
    it.updateTimestamp(columnIndex, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateTimestamp(java.lang.String, java.sql.Timestamp)
   */
  public void updateTimestamp(String columnName, Timestamp x)
      throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateTimestamp");
    it.updateTimestamp(columnName, x);
  }

  /**
   * {@inheritDoc}
   * @see java.sql.ResultSet#wasNull()
   */
  public boolean wasNull() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "wasNull");
    return it.wasNull();
  }


  
}
