package com.mastercard.test.sql;

import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.NClob;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Struct;
import java.util.Properties;

/**
 * A JDBC4 {@link Connection}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingConnectionJdbc4 
    extends ThrowingConnectionJdbc3 
    implements Connection {
  /**
   *  JDBC 4.0
   */
  
  
  /** 
   * {@inheritDoc}
   * @see java.sql.Connection#createArrayOf(java.lang.String, java.lang.Object[])
   */

  public Array createArrayOf(String typeName, Object[] elements)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "createArrayOf");
    return new ThrowingArray(it.createArrayOf(typeName, elements));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Connection#createBlob()
   */

  public Blob createBlob() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "createBlob");
    return new ThrowingBlob(it.createBlob());
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Connection#createClob()
   */

  public Clob createClob() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "createClob");
    return new ThrowingClob(it.createClob());
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Connection#createNClob()
   */

  public NClob createNClob() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "createNClob");
    return  new ThrowingNClob(it.createNClob());
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Connection#createSQLXML()
   */

  public SQLXML createSQLXML() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "createSQLXML");
    return new ThrowingSQLXML(it.createSQLXML());
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Connection#createStruct(java.lang.String, java.lang.Object[])
   */

  public Struct createStruct(String typeName, Object[] attributes)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "createStruct");
    return new ThrowingStruct(it.createStruct(typeName, attributes));
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Connection#getClientInfo()
   */

  public Properties getClientInfo() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getClientInfo");
    return it.getClientInfo();
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Connection#getClientInfo(java.lang.String)
   */

  public String getClientInfo(String name) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getClientInfo");
    return it.getClientInfo(name);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Connection#isValid(int)
   */

  public boolean isValid(int timeout) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isValid");
    return it.isValid(timeout);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Connection#setClientInfo(java.util.Properties)
   */

  public void setClientInfo(Properties properties)
          throws SQLClientInfoException {
    it.setClientInfo(properties);
  }
  /** 
   * {@inheritDoc}
   * @see java.sql.Connection#setClientInfo(java.lang.String, java.lang.String)
   */

  public void setClientInfo(String name, String value)
          throws SQLClientInfoException {
    it.setClientInfo(name, value);
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
