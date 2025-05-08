package com.mastercard.test.sql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The JDBC3 members of a {@link DatabaseMetaData}, decorated to throw an SQLException on command.
 */
public abstract class ThrowingDatabaseMetaDataJdbc3 
    extends Thrower 
    implements DatabaseMetaData {

  DatabaseMetaData it = null;

  public boolean allProceduresAreCallable() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "allProceduresAreCallable");
    return it.allProceduresAreCallable();
  }

  public boolean allTablesAreSelectable() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "allTablesAreSelectable");
    return it.allTablesAreSelectable();
  }

  public boolean dataDefinitionCausesTransactionCommit() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "dataDefinitionCausesTransactionCommit");
    return it.dataDefinitionCausesTransactionCommit();
  }

  public boolean dataDefinitionIgnoredInTransactions() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "dataDefinitionIgnoredInTransactions");
    return it.dataDefinitionIgnoredInTransactions();
  }

  public boolean deletesAreDetected(int type) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "deletesAreDetected");
    return it.deletesAreDetected(type);
  }

  public boolean doesMaxRowSizeIncludeBlobs() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "doesMaxRowSizeIncludeBlobs");
    return it.doesMaxRowSizeIncludeBlobs();
  }

  public ResultSet getAttributes(String catalog, String schemaPattern, String typeNamePattern, String attributeNamePattern) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getAttributes");
    return new ThrowingResultSet(it.getAttributes(catalog, schemaPattern, typeNamePattern, attributeNamePattern));
  }

  public ResultSet getBestRowIdentifier(String catalog, String schema, String table, int scope, boolean nullable) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getBestRowIdentifier");
    return new ThrowingResultSet(it.getBestRowIdentifier(catalog, schema, table, scope, nullable));
  }

  public String getCatalogSeparator() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCatalogSeparator");
    return it.getCatalogSeparator();
  }

  public String getCatalogTerm() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCatalogTerm");
    return it.getCatalogTerm();
  }

  public ResultSet getCatalogs() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCatalogs");
    return new ThrowingResultSet(it.getCatalogs());
  }

  public ResultSet getColumnPrivileges(String catalog, String schema, String table, String columnNamePattern) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getColumnPrivileges");
    return new ThrowingResultSet(it.getColumnPrivileges(catalog, schema, table, columnNamePattern));
  }

  public ResultSet getColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getColumns");
    return new ThrowingResultSet(it.getColumns(catalog, schemaPattern, tableNamePattern, columnNamePattern));
  }

  public Connection getConnection() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getConnection");
    return new ThrowingConnection(it.getConnection());
  }

  public ResultSet getCrossReference(String primaryCatalog, String primarySchema, String primaryTable, String foreignCatalog, String foreignSchema, String foreignTable) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getCrossReference");
    return new ThrowingResultSet(it.getCrossReference(primaryCatalog, primarySchema, primaryTable, foreignCatalog, foreignSchema, foreignTable));
  }

  public int getDatabaseMajorVersion() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDatabaseMajorVersion");
    return it.getDatabaseMajorVersion();
  }

  public int getDatabaseMinorVersion() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDatabaseMinorVersion");
    return it.getDatabaseMinorVersion();
  }

  public String getDatabaseProductName() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDatabaseProductName");
    return it.getDatabaseProductName();
  }

  public String getDatabaseProductVersion() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDatabaseProductVersion");
    return it.getDatabaseProductVersion();
  }

  public int getDefaultTransactionIsolation() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDefaultTransactionIsolation");
    return it.getDefaultTransactionIsolation();
  }

  public int getDriverMajorVersion() {
    return it.getDriverMajorVersion();
  }

  public int getDriverMinorVersion() {
    return it.getDriverMinorVersion();
  }

  public String getDriverName() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDriverName");
    return it.getDriverName();
  }

  public String getDriverVersion() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getDriverVersion");
    return it.getDriverVersion();
  }

  public ResultSet getExportedKeys(String catalog, String schema, String table) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getExportedKeys");
    return new ThrowingResultSet(it.getExportedKeys(catalog, schema, table));
  }

  public String getExtraNameCharacters() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getExtraNameCharacters");
    return it.getExtraNameCharacters();
  }

  public String getIdentifierQuoteString() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getIdentifierQuoteString");
    return it.getIdentifierQuoteString();
  }

  public ResultSet getImportedKeys(String catalog, String schema, String table) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getImportedKeys");
    return new ThrowingResultSet(it.getImportedKeys(catalog, schema, table));
  }

  public ResultSet getIndexInfo(String catalog, String schema, String table, boolean unique, boolean approximate) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getIndexInfo");
    return new ThrowingResultSet(it.getIndexInfo(catalog, schema, table, unique, approximate));
  }

  public int getJDBCMajorVersion() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getJDBCMajorVersion");
    return it.getJDBCMajorVersion();
  }

  public int getJDBCMinorVersion() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getJDBCMinorVersion");
    return it.getJDBCMinorVersion();
  }

  public int getMaxBinaryLiteralLength() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxBinaryLiteralLength");
    return it.getMaxBinaryLiteralLength();
  }

  public int getMaxCatalogNameLength() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxCatalogNameLength");
    return it.getMaxCatalogNameLength();
  }

  public int getMaxCharLiteralLength() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxCharLiteralLength");
    return it.getMaxCharLiteralLength();
  }

  public int getMaxColumnNameLength() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxColumnNameLength");
    return it.getMaxColumnNameLength();
  }

  public int getMaxColumnsInGroupBy() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxColumnsInGroupBy");
    return it.getMaxColumnsInGroupBy();

  }

  public int getMaxColumnsInIndex() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxColumnsInIndex");
    return it.getMaxColumnsInIndex();
  }

  public int getMaxColumnsInOrderBy() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxColumnsInOrderBy");
    return it.getMaxColumnsInOrderBy();
  }

  public int getMaxColumnsInSelect() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxColumnsInSelect");
    return it.getMaxColumnsInSelect();
  }

  public int getMaxColumnsInTable() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxColumnsInTable");
    return it.getMaxColumnsInTable();
  }

  public int getMaxConnections() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxConnections");
    return it.getMaxConnections();
  }

  public int getMaxCursorNameLength() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxCursorNameLength");
    return it.getMaxCursorNameLength();
  }

  public int getMaxIndexLength() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxIndexLength");
    return it.getMaxIndexLength();
  }

  public int getMaxProcedureNameLength() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxProcedureNameLength");
    return it.getMaxProcedureNameLength();
  }

  public int getMaxRowSize() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxRowSize");
    return it.getMaxRowSize();
  }

  public int getMaxSchemaNameLength() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxSchemaNameLength");
    return it.getMaxSchemaNameLength();
  }

  public int getMaxStatementLength() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxStatementLength");
    return it.getMaxStatementLength();
  }

  public int getMaxStatements() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxStatements");
    return it.getMaxStatements();
  }

  public int getMaxTableNameLength() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxTableNameLength");
    return it.getMaxTableNameLength();
  }

  public int getMaxTablesInSelect() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxTablesInSelect");
    return it.getMaxTablesInSelect();
  }

  public int getMaxUserNameLength() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getMaxUserNameLength");
    return it.getMaxUserNameLength();
  }

  public String getNumericFunctions() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getNumericFunctions");
    return it.getNumericFunctions();
  }

  public ResultSet getPrimaryKeys(String catalog, String schema, String table) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getPrimaryKeys");
    return new ThrowingResultSet(it.getPrimaryKeys(catalog, schema, table));
  }

  public ResultSet getProcedureColumns(String catalog, String schemaPattern, String procedureNamePattern, String columnNamePattern) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getProcedureColumns");
    return new ThrowingResultSet(it.getProcedureColumns(catalog, schemaPattern, procedureNamePattern, columnNamePattern));
  }

  public String getProcedureTerm() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getProcedureTerm");
    return it.getProcedureTerm();
  }

  public ResultSet getProcedures(String catalog, String schemaPattern, String procedureNamePattern) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getProcedures");
    return new ThrowingResultSet(it.getProcedures(catalog, schemaPattern, procedureNamePattern));
  }

  public int getResultSetHoldability() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getResultSetHoldability");
    return it.getResultSetHoldability();
  }

  public String getSQLKeywords() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSQLKeywords");
    return it.getSQLKeywords();
  }

  public int getSQLStateType() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSQLStateType");
    return it.getSQLStateType();
  }

  public String getSchemaTerm() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSchemaTerm");
    return it.getSchemaTerm();
  }

  public ResultSet getSchemas() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSchemas");
    return new ThrowingResultSet(it.getSchemas());
  }

  public String getSearchStringEscape() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSearchStringEscape");
    return it.getSearchStringEscape();
  }

  public String getStringFunctions() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getStringFunctions");
    return it.getStringFunctions();
  }

  public ResultSet getSuperTables(String catalog, String schemaPattern, String tableNamePattern) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSuperTables");
    return new ThrowingResultSet(it.getSuperTables(catalog, schemaPattern, tableNamePattern));
  }

  public ResultSet getSuperTypes(String catalog, String schemaPattern, String typeNamePattern) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSuperTypes");
    return new ThrowingResultSet(it.getSuperTypes(catalog, schemaPattern, typeNamePattern));
  }

  public String getSystemFunctions() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getSystemFunctions");
    return it.getSystemFunctions();
  }

  public ResultSet getTablePrivileges(String catalog, String schemaPattern, String tableNamePattern) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTablePrivileges");
    return new ThrowingResultSet(it.getTablePrivileges(catalog, schemaPattern, tableNamePattern));
  }

  public ResultSet getTableTypes() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTableTypes");
    return new ThrowingResultSet(it.getTableTypes());
  }

  public ResultSet getTables(String catalog, String schemaPattern, String tableNamePattern, String[] types) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTables");
    return new ThrowingResultSet(it.getTables(catalog, schemaPattern, tableNamePattern, types));
  }

  public String getTimeDateFunctions() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTimeDateFunctions");
    return it.getTimeDateFunctions();
  }

  public ResultSet getTypeInfo() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getTypeInfo");
    return new ThrowingResultSet(it.getTypeInfo());
  }

  public ResultSet getUDTs(String catalog, String schemaPattern, String typeNamePattern, int[] types) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getUDTs");
    return new ThrowingResultSet(it.getUDTs(catalog, schemaPattern, typeNamePattern, types));
  }

  public String getURL() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getURL");
    return it.getURL();
  }

  public String getUserName() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getUserName");
    return it.getUserName();
  }

  public ResultSet getVersionColumns(String catalog, String schema, String table) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "getVersionColumns");
    return new ThrowingResultSet(it.getVersionColumns(catalog, schema, table));
  }

  public boolean insertsAreDetected(int type) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "insertsAreDetected");
    return it.insertsAreDetected(type);
  }

  public boolean isCatalogAtStart() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isCatalogAtStart");
    return it.isCatalogAtStart();
  }

  public boolean isReadOnly() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "isReadOnly");
    return it.isReadOnly();
  }

  public boolean locatorsUpdateCopy() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "locatorsUpdateCopy");
    return it.locatorsUpdateCopy();
  }

  public boolean nullPlusNonNullIsNull() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "nullPlusNonNullIsNull");
    return it.nullPlusNonNullIsNull();
  }

  public boolean nullsAreSortedAtEnd() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "nullsAreSortedAtEnd");
    return it.nullsAreSortedAtEnd();
  }

  public boolean nullsAreSortedAtStart() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "nullsAreSortedAtStart");
    return it.nullsAreSortedAtStart();
  }

  public boolean nullsAreSortedHigh() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "nullsAreSortedHigh");
    return it.nullsAreSortedHigh();
  }

  public boolean nullsAreSortedLow() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "nullsAreSortedLow");
    return it.nullsAreSortedLow();
  }

  public boolean othersDeletesAreVisible(int type) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "othersDeletesAreVisible");
    return it.othersDeletesAreVisible(type);
  }

  public boolean othersInsertsAreVisible(int type) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "othersInsertsAreVisible");
    return it.othersInsertsAreVisible(type);
  }

  public boolean othersUpdatesAreVisible(int type) throws SQLException {

    shouldThrow(this.getClass().getInterfaces()[0], "othersUpdatesAreVisible");
    return it.othersUpdatesAreVisible(type);
  }

  public boolean ownDeletesAreVisible(int type) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "ownDeletesAreVisible");
    return it.ownDeletesAreVisible(type);
  }

  public boolean ownInsertsAreVisible(int type) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "ownInsertsAreVisible");
    return it.ownInsertsAreVisible(type);
  }

  public boolean ownUpdatesAreVisible(int type) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "ownUpdatesAreVisible");
    return it.ownUpdatesAreVisible(type);
  }

  public boolean storesLowerCaseIdentifiers() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "storesLowerCaseIdentifiers");
    return it.storesLowerCaseIdentifiers();
  }

  public boolean storesLowerCaseQuotedIdentifiers() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "storesLowerCaseQuotedIdentifiers");
    return it.storesLowerCaseQuotedIdentifiers();
  }

  public boolean storesMixedCaseIdentifiers() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "storesMixedCaseIdentifiers");
    return it.storesMixedCaseIdentifiers();
  }

  public boolean storesMixedCaseQuotedIdentifiers() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "storesMixedCaseQuotedIdentifiers");
    return it.storesMixedCaseQuotedIdentifiers();
  }

  public boolean storesUpperCaseIdentifiers() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "storesUpperCaseIdentifiers");
    return it.storesUpperCaseIdentifiers();
  }

  public boolean storesUpperCaseQuotedIdentifiers() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "storesUpperCaseQuotedIdentifiers");
    return it.storesUpperCaseQuotedIdentifiers();
  }

  public boolean supportsANSI92EntryLevelSQL() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsANSI92EntryLevelSQL");
    return it.supportsANSI92EntryLevelSQL();
  }

  public boolean supportsANSI92FullSQL() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsANSI92FullSQL");
    return it.supportsANSI92FullSQL();
  }

  public boolean supportsANSI92IntermediateSQL() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsANSI92IntermediateSQL");
    return it.supportsANSI92IntermediateSQL();
  }

  public boolean supportsAlterTableWithAddColumn() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsAlterTableWithAddColumn");
    return it.supportsAlterTableWithAddColumn();
  }

  public boolean supportsAlterTableWithDropColumn() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsAlterTableWithDropColumn");
    return it.supportsAlterTableWithDropColumn();
  }

  public boolean supportsBatchUpdates() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsBatchUpdates");
    return it.supportsBatchUpdates();
  }

  public boolean supportsCatalogsInDataManipulation() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsCatalogsInDataManipulation");
    return it.supportsCatalogsInDataManipulation();
  }

  public boolean supportsCatalogsInIndexDefinitions() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsCatalogsInIndexDefinitions");
    return it.supportsCatalogsInIndexDefinitions();
  }

  public boolean supportsCatalogsInPrivilegeDefinitions() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsCatalogsInPrivilegeDefinitions");
    return it.supportsCatalogsInPrivilegeDefinitions();
  }

  public boolean supportsCatalogsInProcedureCalls() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsCatalogsInProcedureCalls");
    return it.supportsCatalogsInProcedureCalls();
  }

  public boolean supportsCatalogsInTableDefinitions() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsCatalogsInTableDefinitions");
    return it.supportsCatalogsInTableDefinitions();
  }

  public boolean supportsColumnAliasing() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsColumnAliasing");
    return it.supportsColumnAliasing();
  }

  public boolean supportsConvert() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsConvert");
    return it.supportsConvert();
  }

  public boolean supportsConvert(int fromType, int toType) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsConvert");
    return it.supportsConvert();
  }

  public boolean supportsCoreSQLGrammar() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsCoreSQLGrammar");
    return it.supportsCoreSQLGrammar();
  }

  public boolean supportsCorrelatedSubqueries() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsCorrelatedSubqueries");
    return it.supportsCorrelatedSubqueries();
  }

  public boolean supportsDataDefinitionAndDataManipulationTransactions() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsDataDefinitionAndDataManipulationTransactions");
    return it.supportsDataDefinitionAndDataManipulationTransactions();
  }

  public boolean supportsDataManipulationTransactionsOnly() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsDataManipulationTransactionsOnly");
    return it.supportsDataManipulationTransactionsOnly();
  }

  public boolean supportsDifferentTableCorrelationNames() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsDifferentTableCorrelationNames");
    return it.supportsDifferentTableCorrelationNames();
  }

  public boolean supportsExpressionsInOrderBy() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsExpressionsInOrderBy");
    return it.supportsExpressionsInOrderBy();
  }

  public boolean supportsExtendedSQLGrammar() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsExtendedSQLGrammar");
    return it.supportsExtendedSQLGrammar();
  }

  public boolean supportsFullOuterJoins() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsFullOuterJoins");
    return it.supportsFullOuterJoins();
  }

  public boolean supportsGetGeneratedKeys() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsGetGeneratedKeys");
    return it.supportsGetGeneratedKeys();
  }

  public boolean supportsGroupBy() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsGroupBy");
    return it.supportsGroupBy();
  }

  public boolean supportsGroupByBeyondSelect() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsGroupByBeyondSelect");
    return it.supportsGroupByBeyondSelect();
  }

  public boolean supportsGroupByUnrelated() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsGroupByUnrelated");
    return it.supportsGroupByUnrelated();
  }

  public boolean supportsIntegrityEnhancementFacility() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsIntegrityEnhancementFacility");
    return it.supportsIntegrityEnhancementFacility();
  }

  public boolean supportsLikeEscapeClause() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsLikeEscapeClause");
    return it.supportsLikeEscapeClause();
  }

  public boolean supportsLimitedOuterJoins() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsLimitedOuterJoins");
    return it.supportsLimitedOuterJoins();
  }

  public boolean supportsMinimumSQLGrammar() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsMinimumSQLGrammar");
    return it.supportsMinimumSQLGrammar();
  }

  public boolean supportsMixedCaseIdentifiers() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsMixedCaseIdentifiers");
    return it.supportsMixedCaseIdentifiers();
  }

  public boolean supportsMixedCaseQuotedIdentifiers() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsMixedCaseQuotedIdentifiers");
    return it.supportsMixedCaseQuotedIdentifiers();
  }

  public boolean supportsMultipleOpenResults() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsMultipleOpenResults");
    return it.supportsMultipleOpenResults();
  }

  public boolean supportsMultipleResultSets() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsMultipleResultSets");
    return it.supportsMultipleResultSets();
  }

  public boolean supportsMultipleTransactions() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsMultipleTransactions");
    return it.supportsMultipleTransactions();
  }

  public boolean supportsNamedParameters() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsNamedParameters");
    return it.supportsNamedParameters();
  }

  public boolean supportsNonNullableColumns() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsNonNullableColumns");
    return it.supportsNonNullableColumns();
  }

  public boolean supportsOpenCursorsAcrossCommit() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsOpenCursorsAcrossCommit");
    return it.supportsOpenCursorsAcrossCommit();
  }

  public boolean supportsOpenCursorsAcrossRollback() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsOpenCursorsAcrossRollback");
    return it.supportsOpenCursorsAcrossRollback();
  }

  public boolean supportsOpenStatementsAcrossCommit() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsOpenStatementsAcrossCommit");
    return it.supportsOpenStatementsAcrossCommit();
  }

  public boolean supportsOpenStatementsAcrossRollback() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsOpenStatementsAcrossRollback");
    return it.supportsOpenStatementsAcrossRollback();
  }

  public boolean supportsOrderByUnrelated() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsOrderByUnrelated");
    return it.supportsOrderByUnrelated();
  }

  public boolean supportsOuterJoins() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsOuterJoins");
    return it.supportsOuterJoins();
  }

  public boolean supportsPositionedDelete() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsPositionedDelete");
    return it.supportsPositionedDelete();
  }

  public boolean supportsPositionedUpdate() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsPositionedUpdate");
    return it.supportsPositionedUpdate();
  }

  public boolean supportsResultSetConcurrency(int type, int concurrency) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsResultSetConcurrency");
    return it.supportsResultSetConcurrency(type, concurrency);
  }

  public boolean supportsResultSetHoldability(int holdability) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsResultSetHoldability");
    return it.supportsResultSetHoldability(holdability);
  }

  public boolean supportsResultSetType(int type) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsResultSetType");
    return it.supportsResultSetType(type);
  }

  public boolean supportsSavepoints() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsSavepoints");
    return it.supportsSavepoints();
  }

  public boolean supportsSchemasInDataManipulation() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsSchemasInDataManipulation");
    return it.supportsSchemasInDataManipulation();
  }

  public boolean supportsSchemasInIndexDefinitions() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsSchemasInIndexDefinitions");
    return it.supportsSchemasInIndexDefinitions();
  }

  public boolean supportsSchemasInPrivilegeDefinitions() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsSchemasInPrivilegeDefinitions");
    return it.supportsSchemasInPrivilegeDefinitions();
  }

  public boolean supportsSchemasInProcedureCalls() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsSchemasInProcedureCalls");
    return it.supportsSchemasInProcedureCalls();
  }

  public boolean supportsSchemasInTableDefinitions() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsSchemasInTableDefinitions");
    return it.supportsSchemasInTableDefinitions();
  }

  public boolean supportsSelectForUpdate() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsSelectForUpdate");
    return it.supportsSelectForUpdate();
  }

  public boolean supportsStatementPooling() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsStatementPooling");
    return it.supportsStatementPooling();
  }

  public boolean supportsStoredProcedures() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsStoredProcedures");
    return it.supportsStoredProcedures();
  }

  public boolean supportsSubqueriesInComparisons() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsSubqueriesInComparisons");
    return it.supportsSubqueriesInComparisons();
  }

  public boolean supportsSubqueriesInExists() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsSubqueriesInExists");
    return it.supportsSubqueriesInExists();
  }

  public boolean supportsSubqueriesInIns() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsSubqueriesInIns");
    return it.supportsSubqueriesInIns();
  }

  public boolean supportsSubqueriesInQuantifieds() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsSubqueriesInQuantifieds");
    return it.supportsSubqueriesInQuantifieds();
  }

  public boolean supportsTableCorrelationNames() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsTableCorrelationNames");
    return it.supportsTableCorrelationNames();
  }

  public boolean supportsTransactionIsolationLevel(int level) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsTransactionIsolationLevel");
    return it.supportsTransactionIsolationLevel(level);
  }

  public boolean supportsTransactions() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsTransactions");
    return it.supportsTransactions();
  }

  public boolean supportsUnion() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsUnion");
    return it.supportsUnion();
  }

  public boolean supportsUnionAll() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "supportsUnionAll");
    return it.supportsUnionAll();
  }

  public boolean updatesAreDetected(int type) throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "updatesAreDetected");
    return it.updatesAreDetected(type);
  }

  public boolean usesLocalFilePerTable() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "usesLocalFilePerTable");
    return it.usesLocalFilePerTable();
  }

  public boolean usesLocalFiles() throws SQLException {
    shouldThrow(this.getClass().getInterfaces()[0], "usesLocalFiles");
    return it.usesLocalFiles();
  }

}
