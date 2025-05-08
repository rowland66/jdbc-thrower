package com.mastercard.test.sql;

import java.sql.Array;
import java.sql.SQLException;

/**
 * The JDBC 4 members of an {@link Array}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingArrayJdbc4 
    extends ThrowingArrayJdbc3 
    implements Array {

  /** 
   * {@inheritDoc}
   * @see java.sql.Array#free()
   */
  public void free() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "free");
    it.free();
  }

}
