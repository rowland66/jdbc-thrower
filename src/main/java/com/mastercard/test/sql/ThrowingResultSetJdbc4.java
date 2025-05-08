package com.mastercard.test.sql;

import java.io.InputStream;
import java.io.Reader;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLXML;
import java.sql.SQLException;

/**
 * The JDBC4 methods of a {@link Ref}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingResultSetJdbc4 
    extends ThrowingResultSetJdbc3 
    implements ResultSet {
  
  /**
   *  JDBC 4.0
   */
  

  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#getHoldability()
   */

  public int getHoldability() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getHoldability");
    return it.getHoldability();
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#getNCharacterStream(int)
   */

  public Reader getNCharacterStream(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getNCharacterStream");
    return it.getNCharacterStream(columnIndex);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#getNCharacterStream(java.lang.String)
   */

  public Reader getNCharacterStream(String columnLabel) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getNCharacterStream");
    return it.getNCharacterStream(columnLabel);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#getNClob(int)
   */

  public NClob getNClob(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getNClob");
    return new ThrowingNClob(it.getNClob(columnIndex));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#getNClob(java.lang.String)
   */

  public NClob getNClob(String columnLabel) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getNClob");
    return new ThrowingNClob(it.getNClob(columnLabel));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#getNString(int)
   */

  public String getNString(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getNString");
    return it.getNString(columnIndex);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#getNString(java.lang.String)
   */

  public String getNString(String columnLabel) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getNString");
    return it.getNString(columnLabel);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#getRowId(int)
   */

  public RowId getRowId(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getRowId");
    return new ThrowingRowId(it.getRowId(columnIndex));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#getRowId(java.lang.String)
   */

  public RowId getRowId(String columnLabel) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getRowId");
    return new ThrowingRowId(it.getRowId(columnLabel));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#getSQLXML(int)
   */

  public SQLXML getSQLXML(int columnIndex) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSQLXML");
    return new ThrowingSQLXML(it.getSQLXML(columnIndex));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#getSQLXML(java.lang.String)
   */

  public SQLXML getSQLXML(String columnLabel) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSQLXML");
    return new ThrowingSQLXML(it.getSQLXML(columnLabel));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#isClosed()
   */

  public boolean isClosed() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isClosed");
    return it.isClosed();
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateAsciiStream(int, java.io.InputStream, long)
   */

  public void updateAsciiStream(int columnIndex, InputStream x, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateAsciiStream");
    it.updateAsciiStream(columnIndex, x, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateAsciiStream(int, java.io.InputStream)
   */

  public void updateAsciiStream(int columnIndex, InputStream x)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateAsciiStream");
    it.updateAsciiStream(columnIndex, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateAsciiStream(java.lang.String, java.io.InputStream, long)
   */

  public void updateAsciiStream(String columnLabel, InputStream x, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateAsciiStream");
    it.updateAsciiStream(columnLabel, x, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateAsciiStream(java.lang.String, java.io.InputStream)
   */

  public void updateAsciiStream(String columnLabel, InputStream x)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateAsciiStream");
    it.updateAsciiStream(columnLabel, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBinaryStream(int, java.io.InputStream, long)
   */

  public void updateBinaryStream(int columnIndex, InputStream x, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBinaryStream");
    it.updateBinaryStream(columnIndex, x, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBinaryStream(int, java.io.InputStream)
   */

  public void updateBinaryStream(int columnIndex, InputStream x)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBinaryStream");
    it.updateBinaryStream(columnIndex, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBinaryStream(java.lang.String, java.io.InputStream, long)
   */

  public void updateBinaryStream(String columnLabel, InputStream x, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBinaryStream");
    it.updateBinaryStream(columnLabel, x, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBinaryStream(java.lang.String, java.io.InputStream)
   */

  public void updateBinaryStream(String columnLabel, InputStream x)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBinaryStream");
    it.updateBinaryStream(columnLabel, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBlob(int, java.io.InputStream, long)
   */

  public void updateBlob(int columnIndex, InputStream inputStream, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBlob");
    it.updateBlob(columnIndex, inputStream, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBlob(int, java.io.InputStream)
   */

  public void updateBlob(int columnIndex, InputStream inputStream)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBlob");
    it.updateBlob(columnIndex, inputStream);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBlob(java.lang.String, java.io.InputStream, long)
   */

  public void updateBlob(String columnLabel, InputStream inputStream,
          long length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBlob");
    it.updateBlob(columnLabel, inputStream);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateBlob(java.lang.String, java.io.InputStream)
   */

  public void updateBlob(String columnLabel, InputStream inputStream)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateBlob");
    it.updateBlob(columnLabel, inputStream);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateCharacterStream(int, java.io.Reader, long)
   */

  public void updateCharacterStream(int columnIndex, Reader x, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateCharacterStream");
    it.updateCharacterStream(columnIndex, x, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateCharacterStream(int, java.io.Reader)
   */

  public void updateCharacterStream(int columnIndex, Reader x)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateCharacterStream");
    it.updateCharacterStream(columnIndex, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateCharacterStream(java.lang.String, java.io.Reader, long)
   */

  public void updateCharacterStream(String columnLabel, Reader reader,
          long length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateCharacterStream");
    it.updateCharacterStream(columnLabel, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateCharacterStream(java.lang.String, java.io.Reader)
   */

  public void updateCharacterStream(String columnLabel, Reader reader)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateCharacterStream");
    it.updateCharacterStream(columnLabel, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateClob(int, java.io.Reader, long)
   */

  public void updateClob(int columnIndex, Reader reader, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateClob");
    it.updateClob(columnIndex, reader, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateClob(int, java.io.Reader)
   */

  public void updateClob(int columnIndex, Reader reader) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateClob");
    it.updateClob(columnIndex, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateClob(java.lang.String, java.io.Reader, long)
   */

  public void updateClob(String columnLabel, Reader reader, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateClob");
    it.updateClob(columnLabel, reader, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateClob(java.lang.String, java.io.Reader)
   */

  public void updateClob(String columnLabel, Reader reader) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateClob");
    it.updateClob(columnLabel, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateNCharacterStream(int, java.io.Reader, long)
   */

  public void updateNCharacterStream(int columnIndex, Reader x, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateNCharacterStream");
    it.updateNCharacterStream(columnIndex, x, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateNCharacterStream(int, java.io.Reader)
   */

  public void updateNCharacterStream(int columnIndex, Reader x)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateNCharacterStream");
    it.updateNCharacterStream(columnIndex, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateNCharacterStream(java.lang.String, java.io.Reader, long)
   */

  public void updateNCharacterStream(String columnLabel, Reader reader,
          long length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateNCharacterStream");
    it.updateNCharacterStream(columnLabel, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateNCharacterStream(java.lang.String, java.io.Reader)
   */

  public void updateNCharacterStream(String columnLabel, Reader reader)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateNCharacterStream");
    it.updateNCharacterStream(columnLabel, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateNClob(int, java.sql.NClob)
   */

  public void updateNClob(int columnIndex, NClob clob) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateNClob");
    it.updateNClob(columnIndex, clob);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateNClob(int, java.io.Reader, long)
   */

  public void updateNClob(int columnIndex, Reader reader, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateNClob");
    it.updateNClob(columnIndex, reader, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateNClob(int, java.io.Reader)
   */

  public void updateNClob(int columnIndex, Reader reader) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateNClob");
    it.updateNClob(columnIndex, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateNClob(java.lang.String, java.sql.NClob)
   */

  public void updateNClob(String columnLabel, NClob clob) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateNClob");
    it.updateNClob(columnLabel, clob);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateNClob(java.lang.String, java.io.Reader, long)
   */

  public void updateNClob(String columnLabel, Reader reader, long length)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateNClob");
    it.updateNClob(columnLabel, reader, length);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateNClob(java.lang.String, java.io.Reader)
   */

  public void updateNClob(String columnLabel, Reader reader)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateNClob");
    it.updateNClob(columnLabel, reader);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateNString(int, java.lang.String)
   */

  public void updateNString(int columnIndex, String string) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateNString");
    it.updateNString(columnIndex, string);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateNString(java.lang.String, java.lang.String)
   */

  public void updateNString(String columnLabel, String string)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateNString");
    it.updateNString(columnLabel, string);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateRowId(int, java.sql.RowId)
   */

  public void updateRowId(int columnIndex, RowId x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateRowId");
    it.updateRowId(columnIndex, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateRowId(java.lang.String, java.sql.RowId)
   */

  public void updateRowId(String columnLabel, RowId x) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateRowId");
    it.updateRowId(columnLabel, x);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateSQLXML(int, java.sql.SQLXML)
   */

  public void updateSQLXML(int columnIndex, SQLXML xmlObject)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateSQLXML");
    it.updateSQLXML(columnIndex, xmlObject);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.ResultSet#updateSQLXML(java.lang.String, java.sql.SQLXML)
   */

  public void updateSQLXML(String columnLabel, SQLXML xmlObject)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updateSQLXML");
    it.updateSQLXML(columnLabel, xmlObject);
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

  public <T1> T1 unwrap(Class<T1> iface) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "unwrap");
    return it.unwrap(iface);
  }


}
