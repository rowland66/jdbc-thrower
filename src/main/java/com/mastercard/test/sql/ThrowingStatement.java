package com.mastercard.test.sql;

import java.sql.Statement;


/**
 *  A {@link Statement} decorated to throw SQLException on command.
 */
public class ThrowingStatement 
    extends ThrowingStatementJdbc4_1
    implements Statement {
  
  /**
   * Constructor.
   * @param s to decorate
   */
  public ThrowingStatement(Statement s) {
    this.it = s;
  }


}
