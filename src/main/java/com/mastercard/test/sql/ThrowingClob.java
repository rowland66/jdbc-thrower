package com.mastercard.test.sql;

import java.sql.Clob;

/**
 * A {@link Clob} decorated to throw an SQLException on command.
 */
public class ThrowingClob 
    extends ThrowingClobJdbc4
    implements Clob {


  /**
   * Constructor.
   */
  public ThrowingClob(Clob c) {
    it = c;
  }


}
