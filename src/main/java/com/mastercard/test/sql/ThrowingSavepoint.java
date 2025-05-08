package com.mastercard.test.sql;

import java.sql.SQLException;
import java.sql.Savepoint;

/**
 * A {@link Savepoint} decorated to throw an {@link SQLException} on command.
 */
public class ThrowingSavepoint 
    extends Thrower 
    implements Savepoint {
  
  Savepoint it = null;
  
  /**
   * Constructor.
   * @param savepoint to decorate
   */
  public ThrowingSavepoint(Savepoint savepoint) {
    this.it = savepoint;
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Savepoint#getSavepointId()
   */
  public int getSavepointId() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSavepointId");
    return it.getSavepointId();
  }

  /**
   * {@inheritDoc}
   * @see java.sql.Savepoint#getSavepointName()
   */
  public String getSavepointName() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSavepointName");
    return it.getSavepointName();
  }

}
