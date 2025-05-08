package com.mastercard.test.sql;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * The JDBC4 members of a {@link Statement}, decorated to throw SQLException on command.
 */
public abstract class ThrowingStatementJdbc4 extends ThrowingStatementJdbc3 {
  /**
   *  JDBC 4.0
   */
  
    
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
