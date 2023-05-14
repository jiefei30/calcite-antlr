
package com.jiefei.sql.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SparkSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SparkSQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(SparkSQLParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(SparkSQLParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableIdentifier(SparkSQLParser.SingleTableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleMultipartIdentifier(SparkSQLParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleFunctionIdentifier(SparkSQLParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#singleDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDataType(SparkSQLParser.SingleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#singleTableSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableSchema(SparkSQLParser.SingleTableSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(SparkSQLParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(SparkSQLParser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(SparkSQLParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code useNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseNamespace(SparkSQLParser.UseNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setCatalog}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCatalog(SparkSQLParser.SetCatalogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateNamespace(SparkSQLParser.CreateNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNamespaceProperties(SparkSQLParser.SetNamespacePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNamespaceLocation(SparkSQLParser.SetNamespaceLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropNamespace(SparkSQLParser.DropNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowNamespaces(SparkSQLParser.ShowNamespacesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(SparkSQLParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLike(SparkSQLParser.CreateTableLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceTable(SparkSQLParser.ReplaceTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(SparkSQLParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyzeTables}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeTables(SparkSQLParser.AnalyzeTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTableColumns(SparkSQLParser.AddTableColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTableColumn(SparkSQLParser.RenameTableColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableColumns(SparkSQLParser.DropTableColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(SparkSQLParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableProperties(SparkSQLParser.SetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsetTableProperties(SparkSQLParser.UnsetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableAlterColumn(SparkSQLParser.AlterTableAlterColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHiveChangeColumn(SparkSQLParser.HiveChangeColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hiveReplaceColumns}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHiveReplaceColumns(SparkSQLParser.HiveReplaceColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableSerDe(SparkSQLParser.SetTableSerDeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTablePartition(SparkSQLParser.AddTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTablePartition(SparkSQLParser.RenameTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablePartitions(SparkSQLParser.DropTablePartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableLocation(SparkSQLParser.SetTableLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecoverPartitions(SparkSQLParser.RecoverPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(SparkSQLParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(SparkSQLParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(SparkSQLParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTempViewUsing(SparkSQLParser.CreateTempViewUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewQuery(SparkSQLParser.AlterViewQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(SparkSQLParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(SparkSQLParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(SparkSQLParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(SparkSQLParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTableExtended}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTableExtended(SparkSQLParser.ShowTableExtendedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTblProperties(SparkSQLParser.ShowTblPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(SparkSQLParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowViews(SparkSQLParser.ShowViewsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPartitions(SparkSQLParser.ShowPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(SparkSQLParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(SparkSQLParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCurrentNamespace(SparkSQLParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCatalogs}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCatalogs(SparkSQLParser.ShowCatalogsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFunction(SparkSQLParser.DescribeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeNamespace(SparkSQLParser.DescribeNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeRelation(SparkSQLParser.DescribeRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeQuery(SparkSQLParser.DescribeQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentNamespace(SparkSQLParser.CommentNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentTable(SparkSQLParser.CommentTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTable(SparkSQLParser.RefreshTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshFunction}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshFunction(SparkSQLParser.RefreshFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshResource(SparkSQLParser.RefreshResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheTable(SparkSQLParser.CacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncacheTable(SparkSQLParser.UncacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearCache(SparkSQLParser.ClearCacheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadData(SparkSQLParser.LoadDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(SparkSQLParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairTable(SparkSQLParser.RepairTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManageResource(SparkSQLParser.ManageResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailNativeCommand(SparkSQLParser.FailNativeCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTimeZone}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTimeZone(SparkSQLParser.SetTimeZoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setQuotedConfiguration}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuotedConfiguration(SparkSQLParser.SetQuotedConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConfiguration(SparkSQLParser.SetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetQuotedConfiguration}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetQuotedConfiguration(SparkSQLParser.ResetQuotedConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetConfiguration(SparkSQLParser.ResetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createIndex}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(SparkSQLParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropIndex}
	 * labeled alternative in {@link SparkSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(SparkSQLParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#timezone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimezone(SparkSQLParser.TimezoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#configKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigKey(SparkSQLParser.ConfigKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#configValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigValue(SparkSQLParser.ConfigValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsupportedHiveNativeCommands(SparkSQLParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(SparkSQLParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceTableHeader(SparkSQLParser.ReplaceTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#bucketSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucketSpec(SparkSQLParser.BucketSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#skewSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkewSpec(SparkSQLParser.SkewSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#locationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationSpec(SparkSQLParser.LocationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#commentSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentSpec(SparkSQLParser.CommentSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SparkSQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link SparkSQLParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIntoTable(SparkSQLParser.InsertIntoTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertIntoReplaceWhere}
	 * labeled alternative in {@link SparkSQLParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIntoReplaceWhere(SparkSQLParser.InsertIntoReplaceWhereContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link SparkSQLParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteHiveDir(SparkSQLParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link SparkSQLParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteDir(SparkSQLParser.InsertOverwriteDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpecLocation(SparkSQLParser.PartitionSpecLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(SparkSQLParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#partitionVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionVal(SparkSQLParser.PartitionValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(SparkSQLParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#namespaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaces(SparkSQLParser.NamespacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#describeFuncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFuncName(SparkSQLParser.DescribeFuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#describeColName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeColName(SparkSQLParser.DescribeColNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(SparkSQLParser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(SparkSQLParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#tableProvider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProvider(SparkSQLParser.TableProviderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#createTableClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableClauses(SparkSQLParser.CreateTableClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#createViewClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateViewClauses(SparkSQLParser.CreateViewClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#propertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyList(SparkSQLParser.PropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(SparkSQLParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#propertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyKey(SparkSQLParser.PropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyValue(SparkSQLParser.PropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(SparkSQLParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#nestedConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedConstantList(SparkSQLParser.NestedConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#createFileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFileFormat(SparkSQLParser.CreateFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFileFormat(SparkSQLParser.TableFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFileFormat(SparkSQLParser.GenericFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#storageHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageHandler(SparkSQLParser.StorageHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(SparkSQLParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInsertQuery(SparkSQLParser.SingleInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQuery(SparkSQLParser.MultiInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteFromTable(SparkSQLParser.DeleteFromTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateTable(SparkSQLParser.UpdateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link SparkSQLParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeIntoTable(SparkSQLParser.MergeIntoTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#queryOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrganization(SparkSQLParser.QueryOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SparkSQLParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#sortItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItems(SparkSQLParser.SortItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#clusterByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusterByClause(SparkSQLParser.ClusterByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#distributeByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistributeByClause(SparkSQLParser.DistributeByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#sortByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortByClause(SparkSQLParser.SortByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(SparkSQLParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#offsetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetClause(SparkSQLParser.OffsetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQueryBody(SparkSQLParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkSQLParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(SparkSQLParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkSQLParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(SparkSQLParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unionRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionRelation(SparkSQLParser.UnionRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(SparkSQLParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromStmt(SparkSQLParser.FromStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(SparkSQLParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault1(SparkSQLParser.InlineTableDefault1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SparkSQLParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(SparkSQLParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#fromStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromStatement(SparkSQLParser.FromStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#fromStatementBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromStatementBody(SparkSQLParser.FromStatementBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link SparkSQLParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformQuerySpecification(SparkSQLParser.TransformQuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link SparkSQLParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularQuerySpecification(SparkSQLParser.RegularQuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#transformClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformClause(SparkSQLParser.TransformClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(SparkSQLParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#setClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetClause(SparkSQLParser.SetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#matchedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchedClause(SparkSQLParser.MatchedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#notMatchedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotMatchedClause(SparkSQLParser.NotMatchedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#notMatchedBySourceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotMatchedBySourceClause(SparkSQLParser.NotMatchedBySourceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#matchedAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchedAction(SparkSQLParser.MatchedActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#notMatchedAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotMatchedAction(SparkSQLParser.NotMatchedActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#notMatchedBySourceAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotMatchedBySourceAction(SparkSQLParser.NotMatchedBySourceActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(SparkSQLParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SparkSQLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SparkSQLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(SparkSQLParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHint(SparkSQLParser.HintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#hintStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHintStatement(SparkSQLParser.HintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SparkSQLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#temporalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporalClause(SparkSQLParser.TemporalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#aggregationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationClause(SparkSQLParser.AggregationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#aggregationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationExpression(SparkSQLParser.AggregationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(SparkSQLParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#groupingAnalytics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingAnalytics(SparkSQLParser.GroupingAnalyticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingElement(SparkSQLParser.GroupingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(SparkSQLParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#pivotClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotClause(SparkSQLParser.PivotClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#pivotColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotColumn(SparkSQLParser.PivotColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#pivotValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotValue(SparkSQLParser.PivotValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unpivotClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotClause(SparkSQLParser.UnpivotClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unpivotNullClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotNullClause(SparkSQLParser.UnpivotNullClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unpivotOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotOperator(SparkSQLParser.UnpivotOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unpivotSingleValueColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotSingleValueColumnClause(SparkSQLParser.UnpivotSingleValueColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unpivotMultiValueColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotMultiValueColumnClause(SparkSQLParser.UnpivotMultiValueColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unpivotColumnSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotColumnSet(SparkSQLParser.UnpivotColumnSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unpivotValueColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotValueColumn(SparkSQLParser.UnpivotValueColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unpivotNameColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotNameColumn(SparkSQLParser.UnpivotNameColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unpivotColumnAndAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotColumnAndAlias(SparkSQLParser.UnpivotColumnAndAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unpivotColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotColumn(SparkSQLParser.UnpivotColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unpivotAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotAlias(SparkSQLParser.UnpivotAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#lateralView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateralView(SparkSQLParser.LateralViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(SparkSQLParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(SparkSQLParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#relationExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExtension(SparkSQLParser.RelationExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#joinRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(SparkSQLParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#crossJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossJoinType(SparkSQLParser.CrossJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(SparkSQLParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(SparkSQLParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(SparkSQLParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link SparkSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByPercentile(SparkSQLParser.SampleByPercentileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link SparkSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByRows(SparkSQLParser.SampleByRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link SparkSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByBucket(SparkSQLParser.SampleByBucketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link SparkSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByBytes(SparkSQLParser.SampleByBytesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(SparkSQLParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(SparkSQLParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifierList(SparkSQLParser.OrderedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifier(SparkSQLParser.OrderedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#identifierCommentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCommentList(SparkSQLParser.IdentifierCommentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#identifierComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierComment(SparkSQLParser.IdentifierCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SparkSQLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(SparkSQLParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(SparkSQLParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault2(SparkSQLParser.InlineTableDefault2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SparkSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableValuedFunction(SparkSQLParser.TableValuedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(SparkSQLParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#functionTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTable(SparkSQLParser.FunctionTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(SparkSQLParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkSQLParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatSerde(SparkSQLParser.RowFormatSerdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkSQLParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatDelimited(SparkSQLParser.RowFormatDelimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifierList(SparkSQLParser.MultipartIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifier(SparkSQLParser.MultipartIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#multipartIdentifierPropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifierPropertyList(SparkSQLParser.MultipartIdentifierPropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#multipartIdentifierProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifierProperty(SparkSQLParser.MultipartIdentifierPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(SparkSQLParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(SparkSQLParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(SparkSQLParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(SparkSQLParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#partitionFieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFieldList(SparkSQLParser.PartitionFieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#partitionField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionField(SparkSQLParser.PartitionFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link SparkSQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityTransform(SparkSQLParser.IdentityTransformContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link SparkSQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyTransform(SparkSQLParser.ApplyTransformContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#transformArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformArgument(SparkSQLParser.TransformArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SparkSQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#expressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSeq(SparkSQLParser.ExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(SparkSQLParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SparkSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(SparkSQLParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(SparkSQLParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(SparkSQLParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code between}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(SparkSQLParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inList}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInList(SparkSQLParser.InListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInSubquery(SparkSQLParser.InSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rlike}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRlike(SparkSQLParser.RlikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code likeQuantifier}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeQuantifier(SparkSQLParser.LikeQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code like}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(SparkSQLParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isPredicate}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsPredicate(SparkSQLParser.IsPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code distinctFrom}
	 * labeled alternative in {@link SparkSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctFrom(SparkSQLParser.DistinctFromContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(SparkSQLParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(SparkSQLParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(SparkSQLParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(SparkSQLParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#datetimeUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeUnit(SparkSQLParser.DatetimeUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(SparkSQLParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(SparkSQLParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timestampadd}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampadd(SparkSQLParser.TimestampaddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstring(SparkSQLParser.SubstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(SparkSQLParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(SparkSQLParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(SparkSQLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code any_value}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_value(SparkSQLParser.Any_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim(SparkSQLParser.TrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(SparkSQLParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentLike}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentLike(SparkSQLParser.CurrentLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(SparkSQLParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(SparkSQLParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code last}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast(SparkSQLParser.LastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(SparkSQLParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlay(SparkSQLParser.OverlayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(SparkSQLParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timestampdiff}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampdiff(SparkSQLParser.TimestampdiffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(SparkSQLParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(SparkSQLParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract(SparkSQLParser.ExtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code percentile}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentile(SparkSQLParser.PercentileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SparkSQLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(SparkSQLParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code position}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(SparkSQLParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code first}
	 * labeled alternative in {@link SparkSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(SparkSQLParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(SparkSQLParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameterLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterLiteral(SparkSQLParser.ParameterLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(SparkSQLParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(SparkSQLParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(SparkSQLParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(SparkSQLParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SparkSQLParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SparkSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(SparkSQLParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#predicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOperator(SparkSQLParser.PredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(SparkSQLParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(SparkSQLParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingMultiUnitsInterval(SparkSQLParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiUnitsInterval(SparkSQLParser.MultiUnitsIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingUnitToUnitInterval(SparkSQLParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitToUnitInterval(SparkSQLParser.UnitToUnitIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(SparkSQLParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unitInMultiUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitInMultiUnits(SparkSQLParser.UnitInMultiUnitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#unitInUnitToUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitInUnitToUnit(SparkSQLParser.UnitInUnitToUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#colPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColPosition(SparkSQLParser.ColPositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataType(SparkSQLParser.ComplexDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code yearMonthIntervalDataType}
	 * labeled alternative in {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearMonthIntervalDataType(SparkSQLParser.YearMonthIntervalDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dayTimeIntervalDataType}
	 * labeled alternative in {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDayTimeIntervalDataType(SparkSQLParser.DayTimeIntervalDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(SparkSQLParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedColTypeWithPositionList(SparkSQLParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedColTypeWithPosition(SparkSQLParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#colDefinitionDescriptorWithPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColDefinitionDescriptorWithPosition(SparkSQLParser.ColDefinitionDescriptorWithPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#defaultExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultExpression(SparkSQLParser.DefaultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(SparkSQLParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(SparkSQLParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#createOrReplaceTableColTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOrReplaceTableColTypeList(SparkSQLParser.CreateOrReplaceTableColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#createOrReplaceTableColType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOrReplaceTableColType(SparkSQLParser.CreateOrReplaceTableColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#colDefinitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColDefinitionOption(SparkSQLParser.ColDefinitionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#generationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerationExpression(SparkSQLParser.GenerationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#complexColTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColTypeList(SparkSQLParser.ComplexColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#complexColType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColType(SparkSQLParser.ComplexColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(SparkSQLParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(SparkSQLParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#namedWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindow(SparkSQLParser.NamedWindowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkSQLParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowRef(SparkSQLParser.WindowRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkSQLParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDef(SparkSQLParser.WindowDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(SparkSQLParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(SparkSQLParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(SparkSQLParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(SparkSQLParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(SparkSQLParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingIdentifier(SparkSQLParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link SparkSQLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorIdent(SparkSQLParser.ErrorIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link SparkSQLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealIdent(SparkSQLParser.RealIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SparkSQLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkSQLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(SparkSQLParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkSQLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(SparkSQLParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(SparkSQLParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#backQuotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackQuotedIdentifier(SparkSQLParser.BackQuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentLiteral(SparkSQLParser.ExponentLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(SparkSQLParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegacyDecimalLiteral(SparkSQLParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SparkSQLParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(SparkSQLParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(SparkSQLParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(SparkSQLParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(SparkSQLParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(SparkSQLParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SparkSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigDecimalLiteral(SparkSQLParser.BigDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#alterColumnAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnAction(SparkSQLParser.AlterColumnActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#stringLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLit(SparkSQLParser.StringLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(SparkSQLParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(SparkSQLParser.VersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnsiNonReserved(SparkSQLParser.AnsiNonReservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#strictNonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictNonReserved(SparkSQLParser.StrictNonReservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(SparkSQLParser.NonReservedContext ctx);
}