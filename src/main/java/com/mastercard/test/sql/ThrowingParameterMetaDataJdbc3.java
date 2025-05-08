package com.mastercard.test.sql;

import java.sql.ParameterMetaData;
import java.sql.SQLException;

/**
 * The JDBC3 members of a {@link ParameterMetaData}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingParameterMetaDataJdbc3 extends Thrower
    implements ParameterMetaData {

  ParameterMetaData it = null;


  public String getParameterClassName(int param) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getParameterClassName");
    return it.getParameterClassName(param);
  }

  public int getParameterCount() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getParameterCount");
    return it.getParameterCount();
  }

  public int getParameterMode(int param) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getParameterMode");
    return it.getParameterMode(param);
  }

  public int getParameterType(int param) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getParameterType");
    return it.getParameterType(param);
  }

  public String getParameterTypeName(int param) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getParameterTypeName");
    return it.getParameterTypeName(param);
  }

  public int getPrecision(int param) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getPrecision");
    return it.getPrecision(param);
  }

  public int getScale(int param) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getScale");
    return it.getScale(param);
  }

  public int isNullable(int param) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isNullable");
    return it.isNullable(param);
  }

  public boolean isSigned(int param) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isSigned");
    return it.isSigned(param);
  }
    
}
