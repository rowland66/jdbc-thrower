package com.mastercard.test.sql;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * The JDBC3 methods of a {@link ResultSetMetaData}, decorated to throw an {@link SQLException} on command.
 */
public abstract class ThrowingResultSetMetaDataJdbc3
        extends Thrower implements ResultSetMetaData {

  ResultSetMetaData it = null;

  public String getCatalogName(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCatalogName");
    return it.getCatalogName(column);
  }

  public String getColumnClassName(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getColumnClassName");
    return it.getColumnClassName(column);
  }

  public int getColumnCount() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getColumnCount");
    return it.getColumnCount();
  }

  public int getColumnDisplaySize(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getColumnDisplaySize");
    return it.getColumnDisplaySize(column);
  }

  public String getColumnLabel(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getColumnLabel");
    return it.getColumnLabel(column);
  }

  public String getColumnName(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getColumnName");
    return it.getColumnName(column);
  }

  public int getColumnType(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getColumnType");
    return it.getColumnType(column);
  }

  public String getColumnTypeName(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getColumnTypeName");
    return it.getColumnTypeName(column);
 }

  public int getPrecision(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getPrecision");
    return it.getPrecision(column);
  }

  public int getScale(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getScale");
    return it.getScale(column);
  }

  public String getSchemaName(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSchemaName");
    return it.getSchemaName(column);
  }

  public String getTableName(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTableName");
    return it.getTableName(column);
  }

  public boolean isAutoIncrement(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isAutoIncrement");
    return it.isAutoIncrement(column);
  }

  public boolean isCaseSensitive(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isCaseSensitive");
    return it.isCaseSensitive(column);
  }

  public boolean isCurrency(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isCurrency");
    return it.isCurrency(column);
  }

  public boolean isDefinitelyWritable(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isDefinitelyWritable");
    return it.isDefinitelyWritable(column);
  }

  public int isNullable(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isNullable");
    return it.isNullable(column);
  }

  public boolean isReadOnly(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isReadOnly");
    return it.isReadOnly(column);
  }

  public boolean isSearchable(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isSearchable");
    return it.isSearchable(column);
  }

  public boolean isSigned(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isSigned");
    return it.isSigned(column);
  }

  public boolean isWritable(int column) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isWritable");
    return it.isWritable(column);
  }
}
