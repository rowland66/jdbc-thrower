package com.mastercard.test.sql;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;

/**
 * The JDBC3 members of a {@link Blob}, decorated to throw an SQLException on command.
 *
 */
public abstract class ThrowingBlobJdbc3 
    extends Thrower 
    implements Blob {

  Blob it = null;
  
  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#getBinaryStream()
   */
  public InputStream getBinaryStream() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBinaryStream");
    return it.getBinaryStream();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#getBytes(long, int)
   */
  public byte[] getBytes(long pos, int length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBytes");
    return it.getBytes(pos, length);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#length()
   */
  public long length() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "length");
    return it.length();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#position(byte[], long)
   */
  public long position(byte[] pattern, long start) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "position");
    return it.position(pattern, start);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#position(java.sql.Blob, long)
   */
  public long position(Blob pattern, long start) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "position");
    return it.position(pattern, start);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#setBinaryStream(long)
   */
  public OutputStream setBinaryStream(long pos) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBinaryStream");
    return it.setBinaryStream(pos);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#setBytes(long, byte[])
   */
  public int setBytes(long pos, byte[] bytes) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBytes");
    return it.setBytes(pos, bytes);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#setBytes(long, byte[], int, int)
   */
  public int setBytes(long pos, byte[] bytes, int offset, int len)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBytes");
    return it.setBytes(pos, bytes, offset, len);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Blob#truncate(long)
   */
  public void truncate(long len) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "truncate");
    it.truncate(len);
  }

}
