package com.mastercard.test.sql;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * The JDBC4.1 members of a {@link PreparedStatement}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingPreparedStatementJdbc4_1
    extends ThrowingPreparedStatementJdbc4
    implements PreparedStatement {

 @Override
 public void closeOnCompletion() throws SQLException {
     shouldThrow(this.getClass().getInterfaces()[0], "closeOnCompletion");
 }

 @Override
 public boolean isCloseOnCompletion() throws SQLException {
     shouldThrow(this.getClass().getInterfaces()[0], "isCloseOnCompletion");
     return it.isCloseOnCompletion();
 }

}
