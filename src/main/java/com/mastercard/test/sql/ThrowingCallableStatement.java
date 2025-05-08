package com.mastercard.test.sql;

import java.sql.CallableStatement;

/**
 * A {@link CallableStatement} decorated to throw an SQLException on command.
 */
public class ThrowingCallableStatement 
    extends ThrowingCallableStatementJdbc4_1
    implements CallableStatement {


  /**
   * Constructor. 
   * @param callableStatement
   */
  public ThrowingCallableStatement(CallableStatement callableStatement) {
    this.it = callableStatement;
  }
  
}
