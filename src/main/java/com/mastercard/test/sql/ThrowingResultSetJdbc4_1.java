package com.mastercard.test.sql;

import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The JDBC4.1 methods of a {@link Ref}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingResultSetJdbc4_1 
    extends ThrowingResultSetJdbc4 
    implements ResultSet {
  
 @Override
 public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
   shouldThrow(this.getClass().getInterfaces()[0], "getObject");
   return it.getObject(columnIndex, type);
 }

 @Override
 public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
   shouldThrow(this.getClass().getInterfaces()[0], "getObject");
   return it.getObject(columnLabel, type);
 }
}
