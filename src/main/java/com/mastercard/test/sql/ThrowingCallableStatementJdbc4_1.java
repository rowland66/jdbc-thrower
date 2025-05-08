package com.mastercard.test.sql;

import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 * The JDBC4 members of a {@link CallableStatement}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingCallableStatementJdbc4_1 
    extends ThrowingCallableStatementJdbc4 
    implements CallableStatement {

  
 @Override
 public void closeOnCompletion() throws SQLException {
   shouldThrow(this.getClass().getInterfaces()[0], "closeOnCompletion");
   it.closeOnCompletion();
 }

 @Override
 public boolean isCloseOnCompletion() throws SQLException {
   shouldThrow(this.getClass().getInterfaces()[0], "isCloseOnCompletion");
   return it.isCloseOnCompletion();
 }

 @Override
 public <T> T getObject(int parameterIndex, Class<T> type) throws SQLException {
   shouldThrow(this.getClass().getInterfaces()[0], "getObject");
   return it.getObject(parameterIndex, type);
 }

 @Override
 public <T> T getObject(String parameterName, Class<T> type) throws SQLException {
   shouldThrow(this.getClass().getInterfaces()[0], "getObject");
   return it.getObject(parameterName, type);
 }
   

}
