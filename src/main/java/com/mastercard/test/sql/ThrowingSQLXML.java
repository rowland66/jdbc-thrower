package com.mastercard.test.sql;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.sql.SQLException;
import java.sql.SQLXML;

import javax.xml.transform.Result;
import javax.xml.transform.Source;

public class ThrowingSQLXML extends Thrower implements SQLXML {
  
  SQLXML it = null;
  

  /**
   * Constructor.
   */
  public ThrowingSQLXML(SQLXML sx) {
    it = sx;
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.SQLXML#free()
   */

  public void free() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "free");
    it.free();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.SQLXML#getBinaryStream()
   */

  public InputStream getBinaryStream() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBinaryStream");
    return it.getBinaryStream();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.SQLXML#getCharacterStream()
   */

  public Reader getCharacterStream() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCharacterStream");
    return it.getCharacterStream();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.SQLXML#getSource(java.lang.Class)
   */

  public <T extends Source> T getSource(Class<T> sourceClass)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSource");
    return it.getSource(sourceClass);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.SQLXML#getString()
   */

  public String getString() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getString");
    return it.getString();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.SQLXML#setBinaryStream()
   */

  public OutputStream setBinaryStream() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setBinaryStream");
    return it.setBinaryStream();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.SQLXML#setCharacterStream()
   */

  public Writer setCharacterStream() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setCharacterStream");
    return it.setCharacterStream();
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.SQLXML#setResult(java.lang.Class)
   */

  public <T extends Result> T setResult(Class<T> resultClass)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setResult");
    return it.setResult(resultClass);
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.SQLXML#setString(java.lang.String)
   */

  public void setString(String value) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setString");
    it.setString(value);
  }

}
