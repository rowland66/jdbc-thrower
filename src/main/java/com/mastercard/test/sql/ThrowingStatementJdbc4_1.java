package com.mastercard.test.sql;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * The JDBC4.1 members of a {@link Statement}, decorated to throw SQLException on command.
 */
public abstract class ThrowingStatementJdbc4_1 
    extends ThrowingStatementJdbc4 {
 
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

}
