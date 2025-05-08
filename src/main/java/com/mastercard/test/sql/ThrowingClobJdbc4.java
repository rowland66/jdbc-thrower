package com.mastercard.test.sql;

import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;

/**
 * The JDBC4 members of a {@link Clob}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingClobJdbc4 
    extends ThrowingClobJdbc3 
    implements Clob {
  
  /** 
   * {@inheritDoc}
   * @see java.sql.Clob#free()
   */

  public void free() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "free");
    it.free();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Clob#getCharacterStream(long, long)
   */

  public Reader getCharacterStream(long pos, long length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCharacterStream");
    return it.getCharacterStream(pos, length);
  }


}
