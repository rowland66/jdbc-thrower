package com.mastercard.test.sql;

import java.sql.SQLException;
import java.sql.Struct;
import java.util.Map;

/**
 *  A {@link Struct} decorated to throw {@link SQLException} on command.
 */
public class ThrowingStruct 
    extends Thrower 
    implements Struct {


  Struct it = null;
  
  public ThrowingStruct(Struct s) {
    it = s;
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Struct#getAttributes()
   */

  public Object[] getAttributes() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getAttributes");
    return it.getAttributes();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Struct#getAttributes(java.util.Map)
   */

  public Object[] getAttributes(Map<String, Class<?>> map) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getAttributes");
    return it.getAttributes();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Struct#getSQLTypeName()
   */

  public String getSQLTypeName() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSQLTypeName");
    return it.getSQLTypeName();
  }

}
