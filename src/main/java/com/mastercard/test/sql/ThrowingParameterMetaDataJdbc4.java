package com.mastercard.test.sql;

import java.sql.ParameterMetaData;
import java.sql.SQLException;


/**
 * The JDBC4 members of a {@link ParameterMetaData}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingParameterMetaDataJdbc4 
    extends ThrowingParameterMetaDataJdbc3 
    implements ParameterMetaData {


  /**
   *  JDBC 4.0
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
