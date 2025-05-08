package com.mastercard.test.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.Executor;

/**
 * A JDBC4.1 {@link Connection}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingConnectionJdbc4_1 
    extends ThrowingConnectionJdbc4 
    implements Connection {
 
 @Override
 public void setSchema(String schema) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setSchema");
    it.setSchema(schema);
 }

 @Override
 public String getSchema() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSchema");
    return it.getSchema();
 }

 @Override
 public void abort(Executor executor) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "abort");
    it.abort(executor);
 }

 @Override
 public void setNetworkTimeout(Executor executor, int milliseconds)
   throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "setNetworkTimeout");
    it.setNetworkTimeout(executor, milliseconds);
 }

 @Override
 public int getNetworkTimeout() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getNetworkTimeout");
    return it.getNetworkTimeout();
 }

}
