package com.mastercard.test.sql;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import java.util.Optional;
import java.util.Properties;

/**
 * The JDBC3 members of a {@link Driver}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingDriverJdbc3 
    extends Thrower 
    implements Driver {

  private static class InnerDriverData {
    private String clazzName;
    private String uri;
  }

  private Optional<InnerDriverData> parseUrl(String urlString) {
    try {
      URI uri = new URI(urlString);
      if (!uri.getScheme().equals("jdbc")) {
        return Optional.empty();
      }
      String schemeSpecificPart = uri.getSchemeSpecificPart();
      if (!schemeSpecificPart.startsWith("throwing:")) {
        return Optional.empty();
      }

      URI innerUri = new URI(uri.getRawSchemeSpecificPart());

      String wrappedDriverInfo = innerUri.getRawSchemeSpecificPart();
      String wrappedDriverClazz = null;
      if (!wrappedDriverInfo.startsWith("jdbc:")) {
        wrappedDriverClazz = wrappedDriverInfo.substring(0, wrappedDriverInfo.indexOf('!'));
      }
      String wrappedJdbcUrl = wrappedDriverInfo;
      if (wrappedDriverClazz != null) {
        wrappedJdbcUrl = wrappedDriverInfo.substring(wrappedDriverClazz.length() + 1);
      } else {
        wrappedJdbcUrl = wrappedDriverInfo;
      }
      InnerDriverData rtrn = new InnerDriverData();
      rtrn.clazzName = wrappedDriverClazz;
      rtrn.uri = wrappedJdbcUrl;
      return Optional.of(rtrn);
    } catch (URISyntaxException e) {
      return Optional.empty();
    }
  }
  /**
   * {@inheritDoc}
   * @see java.sql.Driver#acceptsURL(java.lang.String)
   */
  public boolean acceptsURL(String urlString) throws SQLException {
    Optional<InnerDriverData> maybeInnerDriverData = parseUrl(urlString);
    if (!maybeInnerDriverData.isPresent()) {
      return false;
    }
    InnerDriverData innerDriverData = maybeInnerDriverData.get();
    try {
      if (innerDriverData.clazzName != null) {
        Class.forName(innerDriverData.clazzName);
      }
    } catch (ClassNotFoundException e) {
      // Ignore exception and try to locate driver for wrappedJdbcUrl anyway
    }

    return DriverManager.getDriver(innerDriverData.uri) != null;
  }

  /**
   * Return the decorated Connection.
   * {@inheritDoc}
   * @see java.sql.Driver#connect(java.lang.String, java.util.Properties)
   */
  public Connection connect(String url, Properties info) throws SQLException {
    if (!acceptsURL(url)) {
      return null;
    }
    Optional<InnerDriverData> maybeInnerDriverData = parseUrl(url);
    InnerDriverData innerDriverData = maybeInnerDriverData.orElseThrow(() -> new SQLException("Invalid url for throwing jdbc driver"));
    Driver it = DriverManager.getDriver(innerDriverData.uri);
    return new ThrowingConnection(it.connect(innerDriverData.uri, info));
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Driver#getMajorVersion()
   */

  public int getMajorVersion() {
    return 1;
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Driver#getMinorVersion()
   */

  public int getMinorVersion() {
    return 0;
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Driver#jdbcCompliant()
   */

  public boolean jdbcCompliant() {
    return true;
  }

  /** 
   * {@inheritDoc}
   * @see java.sql.Driver#getPropertyInfo(java.lang.String, java.util.Properties)
   */

  public DriverPropertyInfo[] getPropertyInfo(String url, Properties info)
          throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getPropertyInfo");
    Optional<InnerDriverData> maybeInnerDriverData = parseUrl(url);
    InnerDriverData innerDriverData = maybeInnerDriverData.orElseThrow(() -> new SQLException("Invalid url for throwing jdbc driver"));
    Driver it = DriverManager.getDriver(innerDriverData.uri);
    return it.getPropertyInfo(url, info);
  }

  
  
}
