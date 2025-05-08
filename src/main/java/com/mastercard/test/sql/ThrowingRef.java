package com.mastercard.test.sql;

import java.sql.Ref;

/**
 * A {@link Ref} decorated to throw an SQLException on command.
 */
public class ThrowingRef extends ThrowingRefJdbc3 implements Ref {

  /**
   * Constructor.
   */
  public ThrowingRef(Ref r) {
    it = r;
  }
}
