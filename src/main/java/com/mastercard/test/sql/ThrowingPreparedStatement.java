package com.mastercard.test.sql;

import java.sql.PreparedStatement;

/**
 * A {@link PreparedStatement} decorated to throw an SQLException on command.
 */
public class ThrowingPreparedStatement 
    extends ThrowingPreparedStatementJdbc4_1
    implements PreparedStatement {
  

  public ThrowingPreparedStatement(PreparedStatement statement, String sql) {
    this.it = statement;
    this.sql = sql;
  }
}
