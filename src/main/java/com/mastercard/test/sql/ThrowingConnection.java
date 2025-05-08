package com.mastercard.test.sql;

import java.sql.Connection;


/**
 * A {@link Connection} decorated to throw an SQLException on command.
 */
public class ThrowingConnection 
    extends ThrowingConnectionJdbc4_1
    implements Connection {

  
  /**
   * @param c  a connection.
   * 
   */
  public ThrowingConnection(Connection c) {
    this.it = c;
  }

}
