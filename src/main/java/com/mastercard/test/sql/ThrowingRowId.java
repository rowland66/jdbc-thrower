package com.mastercard.test.sql;

import java.sql.RowId;

public class ThrowingRowId extends Thrower implements RowId {
  

  RowId it = null;

  /**
   * 
   */
  public ThrowingRowId(RowId rid) {
    this.it = rid;
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.RowId#getBytes()
   */

  public byte[] getBytes() {
    return it.getBytes();
  }

}
