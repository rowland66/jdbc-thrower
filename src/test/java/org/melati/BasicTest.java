package org.melati;

import com.mastercard.test.sql.ThrowingDriver;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import com.mastercard.test.sql.Thrower;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.UUID;
import java.util.regex.Pattern;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BasicTest {
  String testDatabaseName;

  @BeforeAll
  public void setupDatabase() {
    testDatabaseName = UUID.randomUUID().toString();
    testDatabaseName = "_"+testDatabaseName.substring(0, 30);
    testDatabaseName = testDatabaseName.replace('-', '_');

    try {
      Class.forName("org.postgresql.Driver");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

    try {
      Connection conn = DriverManager.getConnection(
          "jdbc:postgresql://localhost:5432/postgres",
          "postgres",
          "mysecretpassword");
      Statement stmt = conn.createStatement();
      stmt.execute("CREATE DATABASE "+ testDatabaseName);
      stmt.close();
      conn.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    String testJdbcUrl =  "jdbc:postgresql://localhost:5432/" + testDatabaseName;

    try {
      try (final InputStream sqlStream = this.getClass().getClassLoader().getResourceAsStream("migrations/001_createdb.sql")) {
        if (sqlStream == null) {
          throw new RuntimeException("Unable to load resource 'migrations/001_createdb.sql");
        }

        try {
          try (Connection conn =
                   DriverManager.getConnection(
                       testJdbcUrl,
                       "postgres",
                    "mysecretpassword")) {
            ScriptRunner scriptRunner = new ScriptRunner(conn);
            scriptRunner.setSendFullScript(false);
            scriptRunner.setLogWriter(null);
            scriptRunner.setStopOnError(true);
            scriptRunner.runScript(new java.io.InputStreamReader(sqlStream));
          }
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }
  @Test
  public void jdbcTest() {
    try {
      Class.forName(org.postgresql.Driver.class.getName());
      DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+testDatabaseName, "postgres", "mysecretpassword");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Test
  public void jdbcThrowingStatementTest() {
    try {
      Class.forName(ThrowingDriver.class.getName());
      Connection conn =
          DriverManager.getConnection(
              "jdbc:throwing:org.postgresql.Driver!jdbc:postgresql://localhost:5432/"+testDatabaseName,
              "postgres",
              "mysecretpassword");
      Thrower.startThrowing(Statement.class, "executeQuery", new Object[] {Pattern.compile("select \\* from restaurant.*$")});
      Statement stmt = conn.createStatement();
      Assertions.assertThrows(SQLException.class, () -> stmt.executeQuery("SELECT * FROM restaurant WHERE name = 'Foo'"));
    } catch (ClassNotFoundException | SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Test
  public void jdbcThrowingPreparedStatementTest() {
    try {
      Class.forName(ThrowingDriver.class.getName());
      Connection conn =
          DriverManager.getConnection(
              "jdbc:throwing:org.postgresql.Driver!jdbc:postgresql://localhost:5432/"+testDatabaseName,
              "postgres",
              "mysecretpassword");
      Thrower.startThrowing(PreparedStatement.class, "executeQuery", new Object[] {Pattern.compile("select \\* from restaurant.*$")});
      PreparedStatement stmt = conn.prepareStatement("SELECT * FROM restaurant WHERE name = ?");
      stmt.setString(1, "Foo");
      Assertions.assertThrows(SQLException.class, stmt::executeQuery);
    } catch (ClassNotFoundException | SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Test
  public void jdbcThrowingBatchPreparedStatementTest() {
    try {
      Class.forName(ThrowingDriver.class.getName());
      Connection conn =
          DriverManager.getConnection(
              "jdbc:throwing:org.postgresql.Driver!jdbc:postgresql://localhost:5432/"+testDatabaseName,
              "postgres",
              "mysecretpassword");
      Thrower.startThrowing(PreparedStatement.class, "executeQuery", new Object[] {Pattern.compile("select \\* from restaurant.*$")});
      PreparedStatement stmt = conn.prepareStatement("SELECT * FROM restaurant WHERE name = ?");
      stmt.setString(1, "Foo");
      Assertions.assertThrows(SQLException.class, stmt::executeQuery);
    } catch (ClassNotFoundException | SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Test
  public void jdbcThrowingBatchPreparedStatementAfter3Test() {
    try {
      Class.forName(ThrowingDriver.class.getName());
      Connection conn =
          DriverManager.getConnection(
              "jdbc:throwing:org.postgresql.Driver!jdbc:postgresql://localhost:5432/"+testDatabaseName,
              "postgres",
              "mysecretpassword");
      Thrower.startThrowingAfter(PreparedStatement.class, "executeQuery", 2, new Object[] {Pattern.compile("select \\* from restaurant.*$")});
      PreparedStatement stmt = conn.prepareStatement("SELECT * FROM restaurant WHERE name = ?");
      stmt.setString(1, "Foo");
      stmt.executeQuery();
      stmt.setString(1, "Bar");
      stmt.executeQuery();
      stmt.setString(1, "Baz");
      Assertions.assertThrows(SQLException.class, stmt::executeQuery);
    } catch (ClassNotFoundException | SQLException e) {
      throw new RuntimeException(e);
    }
  }

}
