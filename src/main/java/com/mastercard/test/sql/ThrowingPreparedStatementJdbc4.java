package com.mastercard.test.sql;

import java.io.InputStream;
import java.io.Reader;
import java.sql.NClob;
import java.sql.RowId;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLXML;

/**
 * The JDBC4 members of a {@link PreparedStatement}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingPreparedStatementJdbc4 
    extends ThrowingPreparedStatementJdbc3 
    implements PreparedStatement {

  
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
  

  
  
}
