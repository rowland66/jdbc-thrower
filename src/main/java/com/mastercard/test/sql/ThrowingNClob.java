package com.mastercard.test.sql;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.sql.Clob;
import java.sql.NClob;
import java.sql.SQLException;

public class ThrowingNClob extends Thrower implements NClob {
  
  NClob it = null;

  /**
   * Constructor.
   */
  public ThrowingNClob(NClob nc) {
    it = nc;
  }

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
   * @see java.sql.Clob#getAsciiStream()
   */

  public InputStream getAsciiStream() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getAsciiStream");
    return it.getAsciiStream();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Clob#getCharacterStream()
   */

  public Reader getCharacterStream() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCharacterStream");
    return it.getCharacterStream();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Clob#getCharacterStream(long, long)
   */

  public Reader getCharacterStream(long pos, long length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCharacterStream");
    return it.getCharacterStream(pos, length);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Clob#getSubString(long, int)
   */

  public String getSubString(long pos, int length) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSubString");
    return it.getSubString(pos, length);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Clob#length()
   */

  public long length() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "length");
    return it.length();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Clob#position(java.lang.String, long)
   */

  public long position(String searchstr, long start) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "position");
    return it.position(searchstr, start);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Clob#position(java.sql.Clob, long)
   */

  public long position(Clob searchstr, long start) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "position");
    return it.position(searchstr, start);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Clob#setAsciiStream(long)
   */

  public OutputStream setAsciiStream(long pos) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setAsciiStream");
    return it.setAsciiStream(pos);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Clob#setCharacterStream(long)
   */

  public Writer setCharacterStream(long pos) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setCharacterStream");
    return it.setCharacterStream(pos);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Clob#setString(long, java.lang.String)
   */

  public int setString(long pos, String str) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setString");
    return it.setString(pos, str);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Clob#setString(long, java.lang.String, int, int)
   */

  public int setString(long pos, String str, int offset, int len)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setString");
    return it.setString(pos, str, offset, len);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Clob#truncate(long)
   */

  public void truncate(long len) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "truncate");
    it.truncate(len);
  }

}
