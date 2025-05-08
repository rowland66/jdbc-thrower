package com.mastercard.test.sql;

import java.sql.Array;

/**
 * An {@link Array} decorated to throw an SQLException on command.
 */
public class ThrowingArray  
    extends ThrowingArrayJdbc4
    implements Array {

  /**
   * Constructor.
   */
  public ThrowingArray(Array a) {
    it = a;
  }

}
