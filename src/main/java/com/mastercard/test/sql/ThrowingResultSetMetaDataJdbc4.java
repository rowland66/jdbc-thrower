package com.mastercard.test.sql;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public abstract class ThrowingResultSetMetaDataJdbc4 extends
    ThrowingResultSetMetaDataJdbc3 implements ResultSetMetaData {
  /**
   * JDBC 4.0
   */
  
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
