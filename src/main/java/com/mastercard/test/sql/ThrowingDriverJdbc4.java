package com.mastercard.test.sql;

import java.sql.Driver;

/**
 * The JDBC4 members of a {@link Driver}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingDriverJdbc4 
    extends ThrowingDriverJdbc3 
    implements Driver {


}
