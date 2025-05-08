package com.mastercard.test.sql;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * The JDBC 3 members of an {@link Array}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingArrayJdbc3 
    extends Thrower 
    implements Array {

  Array it = null;


  /** 
   * {@inheritDoc}
   * @see java.sql.Array#getArray()
   */
  public Object getArray() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getArray");
    return it.getArray();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Array#getArray(java.util.Map)
   */
  public Object getArray(Map<String, Class<?>> map) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getArray");
    return it.getArray();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Array#getArray(long, int)
   */
  public Object getArray(long index, int count) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getArray");
    return it.getArray();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Array#getArray(long, int, java.util.Map)
   */
  public Object getArray(long index, int count, Map<String, Class<?>> map)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getArray");
    return it.getArray();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Array#getBaseType()
   */
  public int getBaseType() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBaseType");
    return it.getBaseType();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Array#getBaseTypeName()
   */
  public String getBaseTypeName() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBaseTypeName");
    return it.getBaseTypeName();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Array#getResultSet()
   */
  public ResultSet getResultSet() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getResultSet");
    return new ThrowingResultSet(it.getResultSet());
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Array#getResultSet(java.util.Map)
   */
  public ResultSet getResultSet(Map<String, Class<?>> map) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getResultSet");
    return  new ThrowingResultSet(it.getResultSet());
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Array#getResultSet(long, int)
   */
  public ResultSet getResultSet(long index, int count) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getResultSet");
    return  new ThrowingResultSet(it.getResultSet());
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Array#getResultSet(long, int, java.util.Map)
   */
  public ResultSet getResultSet(long index, int count, Map<String, Class<?>> map)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getResultSet");
    return  new ThrowingResultSet(it.getResultSet());
  }

  
}
