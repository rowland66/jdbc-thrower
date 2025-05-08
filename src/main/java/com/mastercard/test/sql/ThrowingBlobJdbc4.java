package com.mastercard.test.sql;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;

/**
 * The JDBC4 members of a {@link Blob}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingBlobJdbc4 
    extends ThrowingBlobJdbc3 
    implements Blob {

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#free()
   */
  public void free() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "free");
    it.free();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#getBinaryStream(long, long)
   */
  public InputStream getBinaryStream(long pos, long length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBinaryStream");
    return it.getBinaryStream();
  }


}
