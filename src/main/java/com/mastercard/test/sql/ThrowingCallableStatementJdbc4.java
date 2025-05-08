package com.mastercard.test.sql;

import java.io.InputStream;
import java.io.Reader;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.NClob;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;

/**
 * The JDBC4 members of a {@link CallableStatement}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingCallableStatementJdbc4 
    extends ThrowingCallableStatementJdbc3 
    implements CallableStatement {

  
  /**
   *  JDBC 4.0
   */
  
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setAsciiStream(int, java.io.InputStream, long)
   */

  public void setAsciiStream(int parameterIndex, InputStream x, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setAsciiStream");
    it.setAsciiStream(parameterIndex, x, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setAsciiStream(int, java.io.InputStream)
   */

  public void setAsciiStream(int parameterIndex, InputStream x)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setAsciiStream");
    it.setAsciiStream(parameterIndex, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setBinaryStream(int, java.io.InputStream, long)
   */

  public void setBinaryStream(int parameterIndex, InputStream x, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBinaryStream");
    it.setBinaryStream(parameterIndex, x, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setBinaryStream(int, java.io.InputStream)
   */

  public void setBinaryStream(int parameterIndex, InputStream x)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBinaryStream");
    it.setBinaryStream(parameterIndex, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setBlob(int, java.io.InputStream, long)
   */

  public void setBlob(int parameterIndex, InputStream inputStream, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBlob");
    it.setBlob(parameterIndex, inputStream, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setBlob(int, java.io.InputStream)
   */

  public void setBlob(int parameterIndex, InputStream inputStream)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBlob");
    it.setBlob(parameterIndex, inputStream);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setCharacterStream(int, java.io.Reader, long)
   */

  public void setCharacterStream(int parameterIndex, Reader reader, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setCharacterStream");
    it.setCharacterStream(parameterIndex, reader, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setCharacterStream(int, java.io.Reader)
   */

  public void setCharacterStream(int parameterIndex, Reader reader)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setCharacterStream");
    it.setCharacterStream(parameterIndex, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setClob(int, java.io.Reader, long)
   */

  public void setClob(int parameterIndex, Reader reader, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setClob");
    it.setClob(parameterIndex, reader, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setClob(int, java.io.Reader)
   */

  public void setClob(int parameterIndex, Reader reader) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setClob");
    it.setClob(parameterIndex, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setNCharacterStream(int, java.io.Reader, long)
   */

  public void setNCharacterStream(int parameterIndex, Reader value, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNCharacterStream");
    it.setNCharacterStream(parameterIndex, value, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setNCharacterStream(int, java.io.Reader)
   */

  public void setNCharacterStream(int parameterIndex, Reader value)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNCharacterStream");
    it.setNCharacterStream(parameterIndex, value);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setNClob(int, java.sql.NClob)
   */

  public void setNClob(int parameterIndex, NClob value) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNClob");
    it.setNClob(parameterIndex, value);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setNClob(int, java.io.Reader, long)
   */

  public void setNClob(int parameterIndex, Reader reader, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNClob");
    it.setNClob(parameterIndex, reader, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setNClob(int, java.io.Reader)
   */

  public void setNClob(int parameterIndex, Reader reader) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNClob");
    it.setNClob(parameterIndex, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setNString(int, java.lang.String)
   */

  public void setNString(int parameterIndex, String value) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNString");
    it.setNString(parameterIndex, value);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setRowId(int, java.sql.RowId)
   */

  public void setRowId(int parameterIndex, RowId x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setRowId");
    it.setRowId(parameterIndex, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.PreparedStatement#setSQLXML(int, java.sql.SQLXML)
   */

  public void setSQLXML(int parameterIndex, SQLXML xmlObject)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setSQLXML");
    it.setSQLXML(parameterIndex, xmlObject);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Statement#isClosed()
   */

  public boolean isClosed() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isClosed");
    return it.isClosed();
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Statement#isPoolable()
   */

  public boolean isPoolable() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isPoolable");
    return it.isPoolable();
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Statement#setPoolable(boolean)
   */

  public void setPoolable(boolean poolable) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setPoolable");
    it.setPoolable(poolable);
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
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#getCharacterStream(int)
   */

  public Reader getCharacterStream(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCharacterStream");
    return it.getCharacterStream(parameterIndex);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#getCharacterStream(java.lang.String)
   */

  public Reader getCharacterStream(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCharacterStream");
    return it.getCharacterStream(parameterName);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#getNCharacterStream(int)
   */

  public Reader getNCharacterStream(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getNCharacterStream");
    return it.getNCharacterStream(parameterIndex);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#getNCharacterStream(java.lang.String)
   */

  public Reader getNCharacterStream(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getNCharacterStream");
    return it.getNCharacterStream(parameterName);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#getNClob(int)
   */

  public NClob getNClob(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getNClob");
    return new ThrowingNClob(it.getNClob(parameterIndex));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#getNClob(java.lang.String)
   */

  public NClob getNClob(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getNClob");
    return new ThrowingNClob(it.getNClob(parameterName));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#getNString(int)
   */

  public String getNString(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getNString");
    return it.getNString(parameterIndex);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#getNString(java.lang.String)
   */

  public String getNString(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getNString");
    return it.getNString(parameterName);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#getRowId(int)
   */

  public RowId getRowId(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getRowId");
    return new ThrowingRowId(it.getRowId(parameterIndex));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#getRowId(java.lang.String)
   */

  public RowId getRowId(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getRowId");
    return new ThrowingRowId(it.getRowId(parameterName));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#getSQLXML(int)
   */

  public SQLXML getSQLXML(int parameterIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSQLXML");
    return new ThrowingSQLXML(it.getSQLXML(parameterIndex));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#getSQLXML(java.lang.String)
   */

  public SQLXML getSQLXML(String parameterName) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSQLXML");
    return  new ThrowingSQLXML(it.getSQLXML(parameterName));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setAsciiStream(java.lang.String, java.io.InputStream, long)
   */

  public void setAsciiStream(String parameterName, InputStream x, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setAsciiStream");
    it.setAsciiStream(parameterName, x, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setAsciiStream(java.lang.String, java.io.InputStream)
   */

  public void setAsciiStream(String parameterName, InputStream x)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setAsciiStream");
    it.setAsciiStream(parameterName, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setBinaryStream(java.lang.String, java.io.InputStream, long)
   */

  public void setBinaryStream(String parameterName, InputStream x, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBinaryStream");
    it.setBinaryStream(parameterName, x, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setBinaryStream(java.lang.String, java.io.InputStream)
   */

  public void setBinaryStream(String parameterName, InputStream x)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBinaryStream");
    it.setBinaryStream(parameterName, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setBlob(java.lang.String, java.sql.Blob)
   */

  public void setBlob(String parameterName, Blob x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBlob");
    it.setBlob(parameterName, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setBlob(java.lang.String, java.io.InputStream, long)
   */

  public void setBlob(String parameterName, InputStream inputStream, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBlob");
    it.setBlob(parameterName, inputStream, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setBlob(java.lang.String, java.io.InputStream)
   */

  public void setBlob(String parameterName, InputStream inputStream)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBlob");
    it.setBlob(parameterName, inputStream);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setCharacterStream(java.lang.String, java.io.Reader, long)
   */

  public void setCharacterStream(String parameterName, Reader reader,
          long length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setCharacterStream");
    it.setCharacterStream(parameterName, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setCharacterStream(java.lang.String, java.io.Reader)
   */

  public void setCharacterStream(String parameterName, Reader reader)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setCharacterStream");
    it.setCharacterStream(parameterName, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setClob(java.lang.String, java.sql.Clob)
   */

  public void setClob(String parameterName, Clob x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setClob");
    it.setClob(parameterName, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setClob(java.lang.String, java.io.Reader, long)
   */

  public void setClob(String parameterName, Reader reader, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setClob");
    it.setClob(parameterName, reader, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setClob(java.lang.String, java.io.Reader)
   */

  public void setClob(String parameterName, Reader reader) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setClob");
    it.setClob(parameterName, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setNCharacterStream(java.lang.String, java.io.Reader, long)
   */

  public void setNCharacterStream(String parameterName, Reader value,
          long length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNCharacterStream");
    it.setNCharacterStream(parameterName, value);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setNCharacterStream(java.lang.String, java.io.Reader)
   */

  public void setNCharacterStream(String parameterName, Reader value)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNCharacterStream");
    it.setNCharacterStream(parameterName, value);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setNClob(java.lang.String, java.sql.NClob)
   */

  public void setNClob(String parameterName, NClob value) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNClob");
    it.setNClob(parameterName, value);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setNClob(java.lang.String, java.io.Reader, long)
   */

  public void setNClob(String parameterName, Reader reader, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNClob");
    it.setNClob(parameterName, reader, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setNClob(java.lang.String, java.io.Reader)
   */

  public void setNClob(String parameterName, Reader reader) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNClob");
    it.setNClob(parameterName, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setNString(java.lang.String, java.lang.String)
   */

  public void setNString(String parameterName, String value)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNString");
    it.setNString(parameterName, value);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setRowId(java.lang.String, java.sql.RowId)
   */

  public void setRowId(String parameterName, RowId x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setRowId");
    it.setRowId(parameterName, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.CallableStatement#setSQLXML(java.lang.String, java.sql.SQLXML)
   */

  public void setSQLXML(String parameterName, SQLXML xmlObject)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setSQLXML");
    it.setSQLXML(parameterName, xmlObject);
  }
  

}
