
package com.jiefei.sql.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SparkSQLParser}.
 */
public interface SparkSQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(SparkSQLParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(SparkSQLParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(SparkSQLParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(SparkSQLParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableIdentifier(SparkSQLParser.SingleTableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableIdentifier(SparkSQLParser.SingleTableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleMultipartIdentifier(SparkSQLParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleMultipartIdentifier(SparkSQLParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleFunctionIdentifier(SparkSQLParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleFunctionIdentifier(SparkSQLParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void enterSingleDataType(SparkSQLParser.SingleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void exitSingleDataType(SparkSQLParser.SingleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableSchema(SparkSQLParser.SingleTableSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableSchema(SparkSQLParser.SingleTableSchemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(SparkSQLParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(SparkSQLParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(SparkSQLParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(SparkSQLParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(SparkSQLParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(SparkSQLParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code useNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUseNamespace(SparkSQLParser.UseNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code useNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUseNamespace(SparkSQLParser.UseNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setCatalog}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetCatalog(SparkSQLParser.SetCatalogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setCatalog}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetCatalog(SparkSQLParser.SetCatalogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateNamespace(SparkSQLParser.CreateNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateNamespace(SparkSQLParser.CreateNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetNamespaceProperties(SparkSQLParser.SetNamespacePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetNamespaceProperties(SparkSQLParser.SetNamespacePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetNamespaceLocation(SparkSQLParser.SetNamespaceLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetNamespaceLocation(SparkSQLParser.SetNamespaceLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropNamespace(SparkSQLParser.DropNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropNamespace(SparkSQLParser.DropNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowNamespaces(SparkSQLParser.ShowNamespacesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowNamespaces(SparkSQLParser.ShowNamespacesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SparkSQLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SparkSQLParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(SparkSQLParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(SparkSQLParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReplaceTable(SparkSQLParser.ReplaceTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReplaceTable(SparkSQLParser.ReplaceTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(SparkSQLParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(SparkSQLParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyzeTables}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeTables(SparkSQLParser.AnalyzeTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyzeTables}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeTables(SparkSQLParser.AnalyzeTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTableColumns(SparkSQLParser.AddTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTableColumns(SparkSQLParser.AddTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableColumn(SparkSQLParser.RenameTableColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableColumn(SparkSQLParser.RenameTableColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTableColumns(SparkSQLParser.DropTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTableColumns(SparkSQLParser.DropTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(SparkSQLParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(SparkSQLParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(SparkSQLParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(SparkSQLParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(SparkSQLParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(SparkSQLParser.UnsetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAlterColumn(SparkSQLParser.AlterTableAlterColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAlterColumn(SparkSQLParser.AlterTableAlterColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHiveChangeColumn(SparkSQLParser.HiveChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHiveChangeColumn(SparkSQLParser.HiveChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hiveReplaceColumns}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHiveReplaceColumns(SparkSQLParser.HiveReplaceColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hiveReplaceColumns}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHiveReplaceColumns(SparkSQLParser.HiveReplaceColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(SparkSQLParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(SparkSQLParser.SetTableSerDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(SparkSQLParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(SparkSQLParser.AddTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(SparkSQLParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(SparkSQLParser.RenameTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(SparkSQLParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(SparkSQLParser.DropTablePartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(SparkSQLParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(SparkSQLParser.SetTableLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRecoverPartitions(SparkSQLParser.RecoverPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRecoverPartitions(SparkSQLParser.RecoverPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SparkSQLParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SparkSQLParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropView(SparkSQLParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropView(SparkSQLParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(SparkSQLParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(SparkSQLParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(SparkSQLParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(SparkSQLParser.CreateTempViewUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(SparkSQLParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(SparkSQLParser.AlterViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(SparkSQLParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(SparkSQLParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(SparkSQLParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(SparkSQLParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(SparkSQLParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(SparkSQLParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(SparkSQLParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(SparkSQLParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTableExtended}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTableExtended(SparkSQLParser.ShowTableExtendedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTableExtended}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTableExtended(SparkSQLParser.ShowTableExtendedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(SparkSQLParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(SparkSQLParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(SparkSQLParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(SparkSQLParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowViews(SparkSQLParser.ShowViewsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowViews(SparkSQLParser.ShowViewsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(SparkSQLParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(SparkSQLParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(SparkSQLParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(SparkSQLParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(SparkSQLParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(SparkSQLParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCurrentNamespace(SparkSQLParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCurrentNamespace(SparkSQLParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCatalogs}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCatalogs(SparkSQLParser.ShowCatalogsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCatalogs}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCatalogs(SparkSQLParser.ShowCatalogsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(SparkSQLParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(SparkSQLParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeNamespace(SparkSQLParser.DescribeNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeNamespace(SparkSQLParser.DescribeNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeRelation(SparkSQLParser.DescribeRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeRelation(SparkSQLParser.DescribeRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeQuery(SparkSQLParser.DescribeQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeQuery(SparkSQLParser.DescribeQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentNamespace(SparkSQLParser.CommentNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentNamespace(SparkSQLParser.CommentNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentTable(SparkSQLParser.CommentTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentTable(SparkSQLParser.CommentTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(SparkSQLParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(SparkSQLParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshFunction}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshFunction(SparkSQLParser.RefreshFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshFunction}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshFunction(SparkSQLParser.RefreshFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(SparkSQLParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(SparkSQLParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(SparkSQLParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(SparkSQLParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(SparkSQLParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(SparkSQLParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(SparkSQLParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(SparkSQLParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(SparkSQLParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(SparkSQLParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(SparkSQLParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(SparkSQLParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(SparkSQLParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(SparkSQLParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(SparkSQLParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(SparkSQLParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(SparkSQLParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(SparkSQLParser.FailNativeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTimeZone}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTimeZone(SparkSQLParser.SetTimeZoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTimeZone}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTimeZone(SparkSQLParser.SetTimeZoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setQuotedConfiguration}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetQuotedConfiguration(SparkSQLParser.SetQuotedConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setQuotedConfiguration}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetQuotedConfiguration(SparkSQLParser.SetQuotedConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(SparkSQLParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(SparkSQLParser.SetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetQuotedConfiguration}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetQuotedConfiguration(SparkSQLParser.ResetQuotedConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetQuotedConfiguration}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetQuotedConfiguration(SparkSQLParser.ResetQuotedConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(SparkSQLParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(SparkSQLParser.ResetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createIndex}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(SparkSQLParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createIndex}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(SparkSQLParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropIndex}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(SparkSQLParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropIndex}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(SparkSQLParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#timezone}.
	 * @param ctx the parse tree
	 */
	void enterTimezone(SparkSQLParser.TimezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#timezone}.
	 * @param ctx the parse tree
	 */
	void exitTimezone(SparkSQLParser.TimezoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#configKey}.
	 * @param ctx the parse tree
	 */
	void enterConfigKey(SparkSQLParser.ConfigKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#configKey}.
	 * @param ctx the parse tree
	 */
	void exitConfigKey(SparkSQLParser.ConfigKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#configValue}.
	 * @param ctx the parse tree
	 */
	void enterConfigValue(SparkSQLParser.ConfigValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#configValue}.
	 * @param ctx the parse tree
	 */
	void exitConfigValue(SparkSQLParser.ConfigValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(SparkSQLParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(SparkSQLParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(SparkSQLParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(SparkSQLParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterReplaceTableHeader(SparkSQLParser.ReplaceTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitReplaceTableHeader(SparkSQLParser.ReplaceTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(SparkSQLParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(SparkSQLParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(SparkSQLParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(SparkSQLParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(SparkSQLParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(SparkSQLParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void enterCommentSpec(SparkSQLParser.CommentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void exitCommentSpec(SparkSQLParser.CommentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SparkSQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SparkSQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link SparkSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoTable(SparkSQLParser.InsertIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link SparkSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoTable(SparkSQLParser.InsertIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoReplaceWhere}
	 * labeled alternative in {@link SparkSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoReplaceWhere(SparkSQLParser.InsertIntoReplaceWhereContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoReplaceWhere}
	 * labeled alternative in {@link SparkSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoReplaceWhere(SparkSQLParser.InsertIntoReplaceWhereContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link SparkSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteHiveDir(SparkSQLParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link SparkSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteHiveDir(SparkSQLParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link SparkSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteDir(SparkSQLParser.InsertOverwriteDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link SparkSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteDir(SparkSQLParser.InsertOverwriteDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(SparkSQLParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(SparkSQLParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(SparkSQLParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(SparkSQLParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(SparkSQLParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(SparkSQLParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(SparkSQLParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(SparkSQLParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#namespaces}.
	 * @param ctx the parse tree
	 */
	void enterNamespaces(SparkSQLParser.NamespacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#namespaces}.
	 * @param ctx the parse tree
	 */
	void exitNamespaces(SparkSQLParser.NamespacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(SparkSQLParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(SparkSQLParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(SparkSQLParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(SparkSQLParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(SparkSQLParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(SparkSQLParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(SparkSQLParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(SparkSQLParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(SparkSQLParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(SparkSQLParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableClauses(SparkSQLParser.CreateTableClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableClauses(SparkSQLParser.CreateTableClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#createViewClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateViewClauses(SparkSQLParser.CreateViewClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#createViewClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateViewClauses(SparkSQLParser.CreateViewClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(SparkSQLParser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(SparkSQLParser.PropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(SparkSQLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(SparkSQLParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#propertyKey}.
	 * @param ctx the parse tree
	 */
	void enterPropertyKey(SparkSQLParser.PropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#propertyKey}.
	 * @param ctx the parse tree
	 */
	void exitPropertyKey(SparkSQLParser.PropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValue(SparkSQLParser.PropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValue(SparkSQLParser.PropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(SparkSQLParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(SparkSQLParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(SparkSQLParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(SparkSQLParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(SparkSQLParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(SparkSQLParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(SparkSQLParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(SparkSQLParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(SparkSQLParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(SparkSQLParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(SparkSQLParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(SparkSQLParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(SparkSQLParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(SparkSQLParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(SparkSQLParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(SparkSQLParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(SparkSQLParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(SparkSQLParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterDeleteFromTable(SparkSQLParser.DeleteFromTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitDeleteFromTable(SparkSQLParser.DeleteFromTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterUpdateTable(SparkSQLParser.UpdateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitUpdateTable(SparkSQLParser.UpdateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMergeIntoTable(SparkSQLParser.MergeIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMergeIntoTable(SparkSQLParser.MergeIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(SparkSQLParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(SparkSQLParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SparkSQLParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SparkSQLParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#sortItems}.
	 * @param ctx the parse tree
	 */
	void enterSortItems(SparkSQLParser.SortItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#sortItems}.
	 * @param ctx the parse tree
	 */
	void exitSortItems(SparkSQLParser.SortItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#clusterByClause}.
	 * @param ctx the parse tree
	 */
	void enterClusterByClause(SparkSQLParser.ClusterByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#clusterByClause}.
	 * @param ctx the parse tree
	 */
	void exitClusterByClause(SparkSQLParser.ClusterByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#distributeByClause}.
	 * @param ctx the parse tree
	 */
	void enterDistributeByClause(SparkSQLParser.DistributeByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#distributeByClause}.
	 * @param ctx the parse tree
	 */
	void exitDistributeByClause(SparkSQLParser.DistributeByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#sortByClause}.
	 * @param ctx the parse tree
	 */
	void enterSortByClause(SparkSQLParser.SortByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#sortByClause}.
	 * @param ctx the parse tree
	 */
	void exitSortByClause(SparkSQLParser.SortByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SparkSQLParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SparkSQLParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void enterOffsetClause(SparkSQLParser.OffsetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void exitOffsetClause(SparkSQLParser.OffsetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(SparkSQLParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(SparkSQLParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkSQLParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(SparkSQLParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkSQLParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(SparkSQLParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkSQLParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(SparkSQLParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkSQLParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(SparkSQLParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unionRelation}.
	 * @param ctx the parse tree
	 */
	void enterUnionRelation(SparkSQLParser.UnionRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unionRelation}.
	 * @param ctx the parse tree
	 */
	void exitUnionRelation(SparkSQLParser.UnionRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(SparkSQLParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(SparkSQLParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterFromStmt(SparkSQLParser.FromStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitFromStmt(SparkSQLParser.FromStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(SparkSQLParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(SparkSQLParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(SparkSQLParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(SparkSQLParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SparkSQLParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SparkSQLParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(SparkSQLParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(SparkSQLParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void enterFromStatement(SparkSQLParser.FromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void exitFromStatement(SparkSQLParser.FromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void enterFromStatementBody(SparkSQLParser.FromStatementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void exitFromStatementBody(SparkSQLParser.FromStatementBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link SparkSQLParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterTransformQuerySpecification(SparkSQLParser.TransformQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link SparkSQLParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitTransformQuerySpecification(SparkSQLParser.TransformQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link SparkSQLParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterRegularQuerySpecification(SparkSQLParser.RegularQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link SparkSQLParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitRegularQuerySpecification(SparkSQLParser.RegularQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#transformClause}.
	 * @param ctx the parse tree
	 */
	void enterTransformClause(SparkSQLParser.TransformClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#transformClause}.
	 * @param ctx the parse tree
	 */
	void exitTransformClause(SparkSQLParser.TransformClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SparkSQLParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SparkSQLParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#setClause}.
	 * @param ctx the parse tree
	 */
	void enterSetClause(SparkSQLParser.SetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#setClause}.
	 * @param ctx the parse tree
	 */
	void exitSetClause(SparkSQLParser.SetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#matchedClause}.
	 * @param ctx the parse tree
	 */
	void enterMatchedClause(SparkSQLParser.MatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#matchedClause}.
	 * @param ctx the parse tree
	 */
	void exitMatchedClause(SparkSQLParser.MatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedClause(SparkSQLParser.NotMatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedClause(SparkSQLParser.NotMatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#notMatchedBySourceClause}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedBySourceClause(SparkSQLParser.NotMatchedBySourceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#notMatchedBySourceClause}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedBySourceClause(SparkSQLParser.NotMatchedBySourceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#matchedAction}.
	 * @param ctx the parse tree
	 */
	void enterMatchedAction(SparkSQLParser.MatchedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#matchedAction}.
	 * @param ctx the parse tree
	 */
	void exitMatchedAction(SparkSQLParser.MatchedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#notMatchedAction}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedAction(SparkSQLParser.NotMatchedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#notMatchedAction}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedAction(SparkSQLParser.NotMatchedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#notMatchedBySourceAction}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedBySourceAction(SparkSQLParser.NotMatchedBySourceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#notMatchedBySourceAction}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedBySourceAction(SparkSQLParser.NotMatchedBySourceActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(SparkSQLParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(SparkSQLParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SparkSQLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SparkSQLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SparkSQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SparkSQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SparkSQLParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SparkSQLParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(SparkSQLParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(SparkSQLParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void enterHintStatement(SparkSQLParser.HintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void exitHintStatement(SparkSQLParser.HintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SparkSQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SparkSQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#temporalClause}.
	 * @param ctx the parse tree
	 */
	void enterTemporalClause(SparkSQLParser.TemporalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#temporalClause}.
	 * @param ctx the parse tree
	 */
	void exitTemporalClause(SparkSQLParser.TemporalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregationClause(SparkSQLParser.AggregationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregationClause(SparkSQLParser.AggregationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#aggregationExpression}.
	 * @param ctx the parse tree
	 */
	void enterAggregationExpression(SparkSQLParser.AggregationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#aggregationExpression}.
	 * @param ctx the parse tree
	 */
	void exitAggregationExpression(SparkSQLParser.AggregationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SparkSQLParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SparkSQLParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#groupingAnalytics}.
	 * @param ctx the parse tree
	 */
	void enterGroupingAnalytics(SparkSQLParser.GroupingAnalyticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#groupingAnalytics}.
	 * @param ctx the parse tree
	 */
	void exitGroupingAnalytics(SparkSQLParser.GroupingAnalyticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterGroupingElement(SparkSQLParser.GroupingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitGroupingElement(SparkSQLParser.GroupingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(SparkSQLParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(SparkSQLParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void enterPivotClause(SparkSQLParser.PivotClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void exitPivotClause(SparkSQLParser.PivotClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void enterPivotColumn(SparkSQLParser.PivotColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void exitPivotColumn(SparkSQLParser.PivotColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void enterPivotValue(SparkSQLParser.PivotValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void exitPivotValue(SparkSQLParser.PivotValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unpivotClause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotClause(SparkSQLParser.UnpivotClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unpivotClause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotClause(SparkSQLParser.UnpivotClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unpivotNullClause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotNullClause(SparkSQLParser.UnpivotNullClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unpivotNullClause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotNullClause(SparkSQLParser.UnpivotNullClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unpivotOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotOperator(SparkSQLParser.UnpivotOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unpivotOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotOperator(SparkSQLParser.UnpivotOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unpivotSingleValueColumnClause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotSingleValueColumnClause(SparkSQLParser.UnpivotSingleValueColumnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unpivotSingleValueColumnClause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotSingleValueColumnClause(SparkSQLParser.UnpivotSingleValueColumnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unpivotMultiValueColumnClause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotMultiValueColumnClause(SparkSQLParser.UnpivotMultiValueColumnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unpivotMultiValueColumnClause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotMultiValueColumnClause(SparkSQLParser.UnpivotMultiValueColumnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unpivotColumnSet}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotColumnSet(SparkSQLParser.UnpivotColumnSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unpivotColumnSet}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotColumnSet(SparkSQLParser.UnpivotColumnSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unpivotValueColumn}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotValueColumn(SparkSQLParser.UnpivotValueColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unpivotValueColumn}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotValueColumn(SparkSQLParser.UnpivotValueColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unpivotNameColumn}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotNameColumn(SparkSQLParser.UnpivotNameColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unpivotNameColumn}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotNameColumn(SparkSQLParser.UnpivotNameColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unpivotColumnAndAlias}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotColumnAndAlias(SparkSQLParser.UnpivotColumnAndAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unpivotColumnAndAlias}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotColumnAndAlias(SparkSQLParser.UnpivotColumnAndAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unpivotColumn}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotColumn(SparkSQLParser.UnpivotColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unpivotColumn}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotColumn(SparkSQLParser.UnpivotColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unpivotAlias}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotAlias(SparkSQLParser.UnpivotAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unpivotAlias}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotAlias(SparkSQLParser.UnpivotAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(SparkSQLParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(SparkSQLParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(SparkSQLParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(SparkSQLParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(SparkSQLParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(SparkSQLParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#relationExtension}.
	 * @param ctx the parse tree
	 */
	void enterRelationExtension(SparkSQLParser.RelationExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#relationExtension}.
	 * @param ctx the parse tree
	 */
	void exitRelationExtension(SparkSQLParser.RelationExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(SparkSQLParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(SparkSQLParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#crossJoinType}.
	 * @param ctx the parse tree
	 */
	void enterCrossJoinType(SparkSQLParser.CrossJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#crossJoinType}.
	 * @param ctx the parse tree
	 */
	void exitCrossJoinType(SparkSQLParser.CrossJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(SparkSQLParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(SparkSQLParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(SparkSQLParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(SparkSQLParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(SparkSQLParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(SparkSQLParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link SparkSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByPercentile(SparkSQLParser.SampleByPercentileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link SparkSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByPercentile(SparkSQLParser.SampleByPercentileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link SparkSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByRows(SparkSQLParser.SampleByRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link SparkSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByRows(SparkSQLParser.SampleByRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link SparkSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBucket(SparkSQLParser.SampleByBucketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link SparkSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBucket(SparkSQLParser.SampleByBucketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link SparkSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBytes(SparkSQLParser.SampleByBytesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link SparkSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBytes(SparkSQLParser.SampleByBytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SparkSQLParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SparkSQLParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(SparkSQLParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(SparkSQLParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(SparkSQLParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(SparkSQLParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(SparkSQLParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(SparkSQLParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(SparkSQLParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(SparkSQLParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(SparkSQLParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(SparkSQLParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SparkSQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SparkSQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(SparkSQLParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(SparkSQLParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(SparkSQLParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(SparkSQLParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(SparkSQLParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(SparkSQLParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableValuedFunction(SparkSQLParser.TableValuedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableValuedFunction(SparkSQLParser.TableValuedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(SparkSQLParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(SparkSQLParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTable(SparkSQLParser.FunctionTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTable(SparkSQLParser.FunctionTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(SparkSQLParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(SparkSQLParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkSQLParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(SparkSQLParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkSQLParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(SparkSQLParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkSQLParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(SparkSQLParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkSQLParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(SparkSQLParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifierList(SparkSQLParser.MultipartIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifierList(SparkSQLParser.MultipartIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifier(SparkSQLParser.MultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifier(SparkSQLParser.MultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#multipartIdentifierPropertyList}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifierPropertyList(SparkSQLParser.MultipartIdentifierPropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#multipartIdentifierPropertyList}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifierPropertyList(SparkSQLParser.MultipartIdentifierPropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#multipartIdentifierProperty}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifierProperty(SparkSQLParser.MultipartIdentifierPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#multipartIdentifierProperty}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifierProperty(SparkSQLParser.MultipartIdentifierPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(SparkSQLParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(SparkSQLParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(SparkSQLParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(SparkSQLParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(SparkSQLParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(SparkSQLParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(SparkSQLParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(SparkSQLParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#partitionFieldList}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFieldList(SparkSQLParser.PartitionFieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#partitionFieldList}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFieldList(SparkSQLParser.PartitionFieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void enterPartitionField(SparkSQLParser.PartitionFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void exitPartitionField(SparkSQLParser.PartitionFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link SparkSQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterIdentityTransform(SparkSQLParser.IdentityTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link SparkSQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitIdentityTransform(SparkSQLParser.IdentityTransformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link SparkSQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterApplyTransform(SparkSQLParser.ApplyTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link SparkSQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitApplyTransform(SparkSQLParser.ApplyTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void enterTransformArgument(SparkSQLParser.TransformArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void exitTransformArgument(SparkSQLParser.TransformArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SparkSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SparkSQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#expressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSeq(SparkSQLParser.ExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#expressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSeq(SparkSQLParser.ExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(SparkSQLParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(SparkSQLParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SparkSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(SparkSQLParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SparkSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(SparkSQLParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(SparkSQLParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(SparkSQLParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(SparkSQLParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(SparkSQLParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code between}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetween(SparkSQLParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code between}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetween(SparkSQLParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inList}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInList(SparkSQLParser.InListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inList}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInList(SparkSQLParser.InListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInSubquery(SparkSQLParser.InSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInSubquery(SparkSQLParser.InSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rlike}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterRlike(SparkSQLParser.RlikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rlike}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitRlike(SparkSQLParser.RlikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code likeQuantifier}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLikeQuantifier(SparkSQLParser.LikeQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likeQuantifier}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLikeQuantifier(SparkSQLParser.LikeQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code like}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLike(SparkSQLParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code like}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLike(SparkSQLParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isPredicate}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterIsPredicate(SparkSQLParser.IsPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isPredicate}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitIsPredicate(SparkSQLParser.IsPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code distinctFrom}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterDistinctFrom(SparkSQLParser.DistinctFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code distinctFrom}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitDistinctFrom(SparkSQLParser.DistinctFromContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(SparkSQLParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(SparkSQLParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SparkSQLParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SparkSQLParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(SparkSQLParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(SparkSQLParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(SparkSQLParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(SparkSQLParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#datetimeUnit}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeUnit(SparkSQLParser.DatetimeUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#datetimeUnit}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeUnit(SparkSQLParser.DatetimeUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStruct(SparkSQLParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStruct(SparkSQLParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(SparkSQLParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(SparkSQLParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timestampadd}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimestampadd(SparkSQLParser.TimestampaddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timestampadd}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimestampadd(SparkSQLParser.TimestampaddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substring}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubstring(SparkSQLParser.SubstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubstring(SparkSQLParser.SubstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(SparkSQLParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(SparkSQLParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambda(SparkSQLParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambda(SparkSQLParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SparkSQLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SparkSQLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code any_value}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterAny_value(SparkSQLParser.Any_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code any_value}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitAny_value(SparkSQLParser.Any_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trim}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrim(SparkSQLParser.TrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrim(SparkSQLParser.TrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(SparkSQLParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(SparkSQLParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentLike}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentLike(SparkSQLParser.CurrentLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentLike}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentLike(SparkSQLParser.CurrentLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(SparkSQLParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(SparkSQLParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(SparkSQLParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(SparkSQLParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(SparkSQLParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(SparkSQLParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(SparkSQLParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(SparkSQLParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterOverlay(SparkSQLParser.OverlayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitOverlay(SparkSQLParser.OverlayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(SparkSQLParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(SparkSQLParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timestampdiff}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimestampdiff(SparkSQLParser.TimestampdiffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timestampdiff}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimestampdiff(SparkSQLParser.TimestampdiffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(SparkSQLParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(SparkSQLParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(SparkSQLParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(SparkSQLParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtract(SparkSQLParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtract(SparkSQLParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code percentile}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPercentile(SparkSQLParser.PercentileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code percentile}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPercentile(SparkSQLParser.PercentileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SparkSQLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SparkSQLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(SparkSQLParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(SparkSQLParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(SparkSQLParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(SparkSQLParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(SparkSQLParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(SparkSQLParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(SparkSQLParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(SparkSQLParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterParameterLiteral(SparkSQLParser.ParameterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitParameterLiteral(SparkSQLParser.ParameterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(SparkSQLParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(SparkSQLParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(SparkSQLParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(SparkSQLParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(SparkSQLParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(SparkSQLParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SparkSQLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SparkSQLParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SparkSQLParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SparkSQLParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SparkSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SparkSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(SparkSQLParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(SparkSQLParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(SparkSQLParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(SparkSQLParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(SparkSQLParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(SparkSQLParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(SparkSQLParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(SparkSQLParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingMultiUnitsInterval(SparkSQLParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingMultiUnitsInterval(SparkSQLParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterMultiUnitsInterval(SparkSQLParser.MultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitMultiUnitsInterval(SparkSQLParser.MultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingUnitToUnitInterval(SparkSQLParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingUnitToUnitInterval(SparkSQLParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterUnitToUnitInterval(SparkSQLParser.UnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitUnitToUnitInterval(SparkSQLParser.UnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(SparkSQLParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(SparkSQLParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unitInMultiUnits}.
	 * @param ctx the parse tree
	 */
	void enterUnitInMultiUnits(SparkSQLParser.UnitInMultiUnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unitInMultiUnits}.
	 * @param ctx the parse tree
	 */
	void exitUnitInMultiUnits(SparkSQLParser.UnitInMultiUnitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#unitInUnitToUnit}.
	 * @param ctx the parse tree
	 */
	void enterUnitInUnitToUnit(SparkSQLParser.UnitInUnitToUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#unitInUnitToUnit}.
	 * @param ctx the parse tree
	 */
	void exitUnitInUnitToUnit(SparkSQLParser.UnitInUnitToUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void enterColPosition(SparkSQLParser.ColPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void exitColPosition(SparkSQLParser.ColPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(SparkSQLParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(SparkSQLParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yearMonthIntervalDataType}
	 * labeled alternative in {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterYearMonthIntervalDataType(SparkSQLParser.YearMonthIntervalDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yearMonthIntervalDataType}
	 * labeled alternative in {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitYearMonthIntervalDataType(SparkSQLParser.YearMonthIntervalDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dayTimeIntervalDataType}
	 * labeled alternative in {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDayTimeIntervalDataType(SparkSQLParser.DayTimeIntervalDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dayTimeIntervalDataType}
	 * labeled alternative in {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDayTimeIntervalDataType(SparkSQLParser.DayTimeIntervalDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(SparkSQLParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(SparkSQLParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColTypeWithPositionList(SparkSQLParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColTypeWithPositionList(SparkSQLParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColTypeWithPosition(SparkSQLParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColTypeWithPosition(SparkSQLParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#colDefinitionDescriptorWithPosition}.
	 * @param ctx the parse tree
	 */
	void enterColDefinitionDescriptorWithPosition(SparkSQLParser.ColDefinitionDescriptorWithPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#colDefinitionDescriptorWithPosition}.
	 * @param ctx the parse tree
	 */
	void exitColDefinitionDescriptorWithPosition(SparkSQLParser.ColDefinitionDescriptorWithPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#defaultExpression}.
	 * @param ctx the parse tree
	 */
	void enterDefaultExpression(SparkSQLParser.DefaultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#defaultExpression}.
	 * @param ctx the parse tree
	 */
	void exitDefaultExpression(SparkSQLParser.DefaultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(SparkSQLParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(SparkSQLParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(SparkSQLParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(SparkSQLParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#createOrReplaceTableColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterCreateOrReplaceTableColTypeList(SparkSQLParser.CreateOrReplaceTableColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#createOrReplaceTableColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitCreateOrReplaceTableColTypeList(SparkSQLParser.CreateOrReplaceTableColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#createOrReplaceTableColType}.
	 * @param ctx the parse tree
	 */
	void enterCreateOrReplaceTableColType(SparkSQLParser.CreateOrReplaceTableColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#createOrReplaceTableColType}.
	 * @param ctx the parse tree
	 */
	void exitCreateOrReplaceTableColType(SparkSQLParser.CreateOrReplaceTableColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#colDefinitionOption}.
	 * @param ctx the parse tree
	 */
	void enterColDefinitionOption(SparkSQLParser.ColDefinitionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#colDefinitionOption}.
	 * @param ctx the parse tree
	 */
	void exitColDefinitionOption(SparkSQLParser.ColDefinitionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#generationExpression}.
	 * @param ctx the parse tree
	 */
	void enterGenerationExpression(SparkSQLParser.GenerationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#generationExpression}.
	 * @param ctx the parse tree
	 */
	void exitGenerationExpression(SparkSQLParser.GenerationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterComplexColTypeList(SparkSQLParser.ComplexColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitComplexColTypeList(SparkSQLParser.ComplexColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void enterComplexColType(SparkSQLParser.ComplexColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void exitComplexColType(SparkSQLParser.ComplexColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(SparkSQLParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(SparkSQLParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(SparkSQLParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(SparkSQLParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(SparkSQLParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(SparkSQLParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkSQLParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(SparkSQLParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkSQLParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(SparkSQLParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkSQLParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(SparkSQLParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkSQLParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(SparkSQLParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(SparkSQLParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(SparkSQLParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(SparkSQLParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(SparkSQLParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(SparkSQLParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(SparkSQLParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(SparkSQLParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(SparkSQLParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(SparkSQLParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(SparkSQLParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingIdentifier(SparkSQLParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingIdentifier(SparkSQLParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link SparkSQLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterErrorIdent(SparkSQLParser.ErrorIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link SparkSQLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitErrorIdent(SparkSQLParser.ErrorIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link SparkSQLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterRealIdent(SparkSQLParser.RealIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link SparkSQLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitRealIdent(SparkSQLParser.RealIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SparkSQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SparkSQLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkSQLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(SparkSQLParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkSQLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(SparkSQLParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkSQLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(SparkSQLParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkSQLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(SparkSQLParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(SparkSQLParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(SparkSQLParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#backQuotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterBackQuotedIdentifier(SparkSQLParser.BackQuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#backQuotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitBackQuotedIdentifier(SparkSQLParser.BackQuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterExponentLiteral(SparkSQLParser.ExponentLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitExponentLiteral(SparkSQLParser.ExponentLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SparkSQLParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SparkSQLParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterLegacyDecimalLiteral(SparkSQLParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitLegacyDecimalLiteral(SparkSQLParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SparkSQLParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SparkSQLParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(SparkSQLParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(SparkSQLParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(SparkSQLParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(SparkSQLParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(SparkSQLParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(SparkSQLParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(SparkSQLParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(SparkSQLParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(SparkSQLParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(SparkSQLParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(SparkSQLParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(SparkSQLParser.BigDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#alterColumnAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnAction(SparkSQLParser.AlterColumnActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#alterColumnAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnAction(SparkSQLParser.AlterColumnActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#stringLit}.
	 * @param ctx the parse tree
	 */
	void enterStringLit(SparkSQLParser.StringLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#stringLit}.
	 * @param ctx the parse tree
	 */
	void exitStringLit(SparkSQLParser.StringLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(SparkSQLParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(SparkSQLParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(SparkSQLParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(SparkSQLParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterAnsiNonReserved(SparkSQLParser.AnsiNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitAnsiNonReserved(SparkSQLParser.AnsiNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterStrictNonReserved(SparkSQLParser.StrictNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitStrictNonReserved(SparkSQLParser.StrictNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(SparkSQLParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(SparkSQLParser.NonReservedContext ctx);
}