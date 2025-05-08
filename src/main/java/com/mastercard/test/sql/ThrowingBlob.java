package com.mastercard.test.sql;

import java.sql.Blob;

/**
 * A {@link Blob} decorated to throw an SQLException on command.
 * 
 * @author timp
 * @since 5 Feb 2008
 *
 */
public class ThrowingBlob extends ThrowingBlobJdbc4 implements Blob {


  /**
   * Constructor.
   */
  public ThrowingBlob(Blob b) {
    it = b;
  }


}
