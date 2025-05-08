package com.mastercard.test.sql;

import java.sql.Ref;
import java.sql.SQLException;
import java.util.Map;

/**
 * The JDBC3 methods of a {@link Ref}, decorated to throw an SQLException on command.
 */
public class ThrowingRefJdbc3 
    extends Thrower 
    implements Ref {

  Ref it = null;

  /** 
   * {@inheritDoc}
   * @see java.sql.Ref#getBaseTypeName()
   */

  public String getBaseTypeName() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBaseTypeName");
    return it.getBaseTypeName();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Ref#getObject()
   */

  public Object getObject() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getObject");
    return it.getObject();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Ref#getObject(java.util.Map)
   */

  public Object getObject(Map<String, Class<?>> map) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getObject");
    return it.getObject();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Ref#setObject(java.lang.Object)
   */

  public void setObject(Object value) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setObject");
    it.setObject(value);
  }


}
