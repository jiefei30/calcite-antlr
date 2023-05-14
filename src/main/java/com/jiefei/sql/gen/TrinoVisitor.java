
package com.jiefei.sql.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TrinoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TrinoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TrinoParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(TrinoParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#standaloneExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneExpression(TrinoParser.StandaloneExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#standalonePathSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalonePathSpecification(TrinoParser.StandalonePathSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#standaloneType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneType(TrinoParser.StandaloneTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#standaloneRowPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneRowPattern(TrinoParser.StandaloneRowPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(TrinoParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(TrinoParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createCatalog}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCatalog(TrinoParser.CreateCatalogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropCatalog}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropCatalog(TrinoParser.DropCatalogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createSchema}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSchema(TrinoParser.CreateSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropSchema}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropSchema(TrinoParser.DropSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameSchema}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameSchema(TrinoParser.RenameSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setSchemaAuthorization}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSchemaAuthorization(TrinoParser.SetSchemaAuthorizationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableAsSelect}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableAsSelect(TrinoParser.CreateTableAsSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(TrinoParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(TrinoParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(TrinoParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delete}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(TrinoParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(TrinoParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentTable(TrinoParser.CommentTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentView(TrinoParser.CommentViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentColumn}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentColumn(TrinoParser.CommentColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(TrinoParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumn(TrinoParser.AddColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameColumn(TrinoParser.RenameColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropColumn}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumn(TrinoParser.DropColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setColumnType}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetColumnType(TrinoParser.SetColumnTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableAuthorization}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableAuthorization(TrinoParser.SetTableAuthorizationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableProperties(TrinoParser.SetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableExecute}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExecute(TrinoParser.TableExecuteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(TrinoParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateMaterializedView(TrinoParser.CreateMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(TrinoParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshMaterializedView(TrinoParser.RefreshMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropMaterializedView(TrinoParser.DropMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameMaterializedView(TrinoParser.RenameMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setMaterializedViewProperties}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetMaterializedViewProperties(TrinoParser.SetMaterializedViewPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(TrinoParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameView(TrinoParser.RenameViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setViewAuthorization}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetViewAuthorization(TrinoParser.SetViewAuthorizationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(TrinoParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createRole}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRole(TrinoParser.CreateRoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropRole}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRole(TrinoParser.DropRoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantRoles}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantRoles(TrinoParser.GrantRolesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revokeRoles}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeRoles(TrinoParser.RevokeRolesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setRole}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetRole(TrinoParser.SetRoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grant}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant(TrinoParser.GrantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deny}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeny(TrinoParser.DenyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revoke}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke(TrinoParser.RevokeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGrants(TrinoParser.ShowGrantsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(TrinoParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explainAnalyze}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainAnalyze(TrinoParser.ExplainAnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(TrinoParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateSchema}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateSchema(TrinoParser.ShowCreateSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateView(TrinoParser.ShowCreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateMaterializedView(TrinoParser.ShowCreateMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(TrinoParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showSchemas}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSchemas(TrinoParser.ShowSchemasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCatalogs}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCatalogs(TrinoParser.ShowCatalogsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(TrinoParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showStats}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStats(TrinoParser.ShowStatsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showStatsForQuery}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStatsForQuery(TrinoParser.ShowStatsForQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showRoles}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRoles(TrinoParser.ShowRolesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showRoleGrants}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRoleGrants(TrinoParser.ShowRoleGrantsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(TrinoParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showSession}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSession(TrinoParser.ShowSessionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setSession}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSession(TrinoParser.SetSessionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetSession}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetSession(TrinoParser.ResetSessionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code startTransaction}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTransaction(TrinoParser.StartTransactionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commit}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(TrinoParser.CommitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rollback}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback(TrinoParser.RollbackContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prepare}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepare(TrinoParser.PrepareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deallocate}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocate(TrinoParser.DeallocateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execute}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(TrinoParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeInput}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeInput(TrinoParser.DescribeInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeOutput}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeOutput(TrinoParser.DescribeOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setPath}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPath(TrinoParser.SetPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTimeZone}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTimeZone(TrinoParser.SetTimeZoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code update}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(TrinoParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code merge}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge(TrinoParser.MergeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(TrinoParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith(TrinoParser.WithContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#tableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(TrinoParser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(TrinoParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#likeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeClause(TrinoParser.LikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(TrinoParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#propertyAssignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignments(TrinoParser.PropertyAssignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(TrinoParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultPropertyValue}
	 * labeled alternative in {@link TrinoParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultPropertyValue(TrinoParser.DefaultPropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonDefaultPropertyValue}
	 * labeled alternative in {@link TrinoParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDefaultPropertyValue(TrinoParser.NonDefaultPropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryNoWith(TrinoParser.QueryNoWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#limitRowCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitRowCount(TrinoParser.LimitRowCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#rowCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowCount(TrinoParser.RowCountContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link TrinoParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(TrinoParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link TrinoParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(TrinoParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link TrinoParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(TrinoParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link TrinoParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(TrinoParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTable}
	 * labeled alternative in {@link TrinoParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(TrinoParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link TrinoParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(TrinoParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(TrinoParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(TrinoParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#groupBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupBy(TrinoParser.GroupByContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleGroupingSet}
	 * labeled alternative in {@link TrinoParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleGroupingSet(TrinoParser.SingleGroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rollup}
	 * labeled alternative in {@link TrinoParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollup(TrinoParser.RollupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cube}
	 * labeled alternative in {@link TrinoParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCube(TrinoParser.CubeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleGroupingSets}
	 * labeled alternative in {@link TrinoParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleGroupingSets(TrinoParser.MultipleGroupingSetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(TrinoParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#windowDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDefinition(TrinoParser.WindowDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#windowSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowSpecification(TrinoParser.WindowSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(TrinoParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(TrinoParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link TrinoParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSingle(TrinoParser.SelectSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link TrinoParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAll(TrinoParser.SelectAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link TrinoParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationDefault(TrinoParser.RelationDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link TrinoParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(TrinoParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(TrinoParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(TrinoParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#sampledRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampledRelation(TrinoParser.SampledRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#sampleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleType(TrinoParser.SampleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#trimsSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimsSpecification(TrinoParser.TrimsSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#listAggOverflowBehavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAggOverflowBehavior(TrinoParser.ListAggOverflowBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#listaggCountIndication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaggCountIndication(TrinoParser.ListaggCountIndicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#patternRecognition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternRecognition(TrinoParser.PatternRecognitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#measureDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasureDefinition(TrinoParser.MeasureDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#rowsPerMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsPerMatch(TrinoParser.RowsPerMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#emptyMatchHandling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyMatchHandling(TrinoParser.EmptyMatchHandlingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#skipTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipTo(TrinoParser.SkipToContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#subsetDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsetDefinition(TrinoParser.SubsetDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(TrinoParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#aliasedRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(TrinoParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#columnAliases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAliases(TrinoParser.ColumnAliasesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(TrinoParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryRelation}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryRelation(TrinoParser.SubqueryRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unnest}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnest(TrinoParser.UnnestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lateral}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateral(TrinoParser.LateralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFunctionInvocation}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFunctionInvocation(TrinoParser.TableFunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedRelation}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedRelation(TrinoParser.ParenthesizedRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#tableFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFunctionCall(TrinoParser.TableFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#tableFunctionArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFunctionArgument(TrinoParser.TableFunctionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#tableArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableArgument(TrinoParser.TableArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableArgumentTable}
	 * labeled alternative in {@link TrinoParser#tableArgumentRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableArgumentTable(TrinoParser.TableArgumentTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableArgumentQuery}
	 * labeled alternative in {@link TrinoParser#tableArgumentRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableArgumentQuery(TrinoParser.TableArgumentQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#descriptorArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptorArgument(TrinoParser.DescriptorArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#descriptorField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptorField(TrinoParser.DescriptorFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#copartitionTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopartitionTables(TrinoParser.CopartitionTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TrinoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link TrinoParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(TrinoParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link TrinoParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(TrinoParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link TrinoParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(TrinoParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link TrinoParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(TrinoParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(TrinoParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quantifiedComparison}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiedComparison(TrinoParser.QuantifiedComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code between}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(TrinoParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inList}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInList(TrinoParser.InListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInSubquery(TrinoParser.InSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code like}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(TrinoParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullPredicate}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullPredicate(TrinoParser.NullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code distinctFrom}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctFrom(TrinoParser.DistinctFromContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(TrinoParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatenation}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(TrinoParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(TrinoParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(TrinoParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atTimeZone}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtTimeZone(TrinoParser.AtTimeZoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(TrinoParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(TrinoParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonValue}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValue(TrinoParser.JsonValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialDateTimeFunction}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialDateTimeFunction(TrinoParser.SpecialDateTimeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstring(TrinoParser.SubstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(TrinoParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(TrinoParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(TrinoParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim(TrinoParser.TrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameter}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(TrinoParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalize}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalize(TrinoParser.NormalizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonObject}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(TrinoParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(TrinoParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(TrinoParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(TrinoParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonArray}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArray(TrinoParser.JsonArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(TrinoParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(TrinoParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(TrinoParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(TrinoParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(TrinoParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonExists}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonExists(TrinoParser.JsonExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentPath}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentPath(TrinoParser.CurrentPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(TrinoParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLiteral(TrinoParser.BinaryLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentUser}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentUser(TrinoParser.CurrentUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonQuery}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonQuery(TrinoParser.JsonQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code measure}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasure(TrinoParser.MeasureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract(TrinoParser.ExtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(TrinoParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayConstructor(TrinoParser.ArrayConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(TrinoParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentSchema}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentSchema(TrinoParser.CurrentSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(TrinoParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code position}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(TrinoParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listagg}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListagg(TrinoParser.ListaggContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(TrinoParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentCatalog}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentCatalog(TrinoParser.CurrentCatalogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupingOperation}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingOperation(TrinoParser.GroupingOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#jsonPathInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonPathInvocation(TrinoParser.JsonPathInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#jsonValueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValueExpression(TrinoParser.JsonValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#jsonRepresentation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonRepresentation(TrinoParser.JsonRepresentationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#jsonArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArgument(TrinoParser.JsonArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#jsonExistsErrorBehavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonExistsErrorBehavior(TrinoParser.JsonExistsErrorBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#jsonValueBehavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValueBehavior(TrinoParser.JsonValueBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#jsonQueryWrapperBehavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonQueryWrapperBehavior(TrinoParser.JsonQueryWrapperBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#jsonQueryBehavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonQueryBehavior(TrinoParser.JsonQueryBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#jsonObjectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObjectMember(TrinoParser.JsonObjectMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#processingMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcessingMode(TrinoParser.ProcessingModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#nullTreatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullTreatment(TrinoParser.NullTreatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicStringLiteral}
	 * labeled alternative in {@link TrinoParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicStringLiteral(TrinoParser.BasicStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unicodeStringLiteral}
	 * labeled alternative in {@link TrinoParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicodeStringLiteral(TrinoParser.UnicodeStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timeZoneInterval}
	 * labeled alternative in {@link TrinoParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeZoneInterval(TrinoParser.TimeZoneIntervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timeZoneString}
	 * labeled alternative in {@link TrinoParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeZoneString(TrinoParser.TimeZoneStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(TrinoParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#comparisonQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonQuantifier(TrinoParser.ComparisonQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(TrinoParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(TrinoParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#intervalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalField(TrinoParser.IntervalFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#normalForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalForm(TrinoParser.NormalFormContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowType(TrinoParser.RowTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalType(TrinoParser.IntervalTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(TrinoParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doublePrecisionType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoublePrecisionType(TrinoParser.DoublePrecisionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code legacyArrayType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegacyArrayType(TrinoParser.LegacyArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(TrinoParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dateTimeType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTimeType(TrinoParser.DateTimeTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code legacyMapType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegacyMapType(TrinoParser.LegacyMapTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#rowField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowField(TrinoParser.RowFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(TrinoParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(TrinoParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(TrinoParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeUpdate}
	 * labeled alternative in {@link TrinoParser#mergeCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeUpdate(TrinoParser.MergeUpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeDelete}
	 * labeled alternative in {@link TrinoParser#mergeCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeDelete(TrinoParser.MergeDeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeInsert}
	 * labeled alternative in {@link TrinoParser#mergeCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeInsert(TrinoParser.MergeInsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#over}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver(TrinoParser.OverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(TrinoParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#frameExtent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameExtent(TrinoParser.FrameExtentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unboundedFrame}
	 * labeled alternative in {@link TrinoParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnboundedFrame(TrinoParser.UnboundedFrameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentRowBound}
	 * labeled alternative in {@link TrinoParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentRowBound(TrinoParser.CurrentRowBoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boundedFrame}
	 * labeled alternative in {@link TrinoParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundedFrame(TrinoParser.BoundedFrameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quantifiedPrimary}
	 * labeled alternative in {@link TrinoParser#rowPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiedPrimary(TrinoParser.QuantifiedPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code patternConcatenation}
	 * labeled alternative in {@link TrinoParser#rowPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternConcatenation(TrinoParser.PatternConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code patternAlternation}
	 * labeled alternative in {@link TrinoParser#rowPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternAlternation(TrinoParser.PatternAlternationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code patternVariable}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternVariable(TrinoParser.PatternVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyPattern}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyPattern(TrinoParser.EmptyPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code patternPermutation}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternPermutation(TrinoParser.PatternPermutationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupedPattern}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupedPattern(TrinoParser.GroupedPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionStartAnchor}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionStartAnchor(TrinoParser.PartitionStartAnchorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionEndAnchor}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionEndAnchor(TrinoParser.PartitionEndAnchorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code excludedPattern}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcludedPattern(TrinoParser.ExcludedPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zeroOrMoreQuantifier}
	 * labeled alternative in {@link TrinoParser#patternQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroOrMoreQuantifier(TrinoParser.ZeroOrMoreQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oneOrMoreQuantifier}
	 * labeled alternative in {@link TrinoParser#patternQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneOrMoreQuantifier(TrinoParser.OneOrMoreQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zeroOrOneQuantifier}
	 * labeled alternative in {@link TrinoParser#patternQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroOrOneQuantifier(TrinoParser.ZeroOrOneQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeQuantifier}
	 * labeled alternative in {@link TrinoParser#patternQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeQuantifier(TrinoParser.RangeQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#updateAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateAssignment(TrinoParser.UpdateAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explainFormat}
	 * labeled alternative in {@link TrinoParser#explainOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainFormat(TrinoParser.ExplainFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explainType}
	 * labeled alternative in {@link TrinoParser#explainOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainType(TrinoParser.ExplainTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isolationLevel}
	 * labeled alternative in {@link TrinoParser#transactionMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationLevel(TrinoParser.IsolationLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transactionAccessMode}
	 * labeled alternative in {@link TrinoParser#transactionMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionAccessMode(TrinoParser.TransactionAccessModeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readUncommitted}
	 * labeled alternative in {@link TrinoParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadUncommitted(TrinoParser.ReadUncommittedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readCommitted}
	 * labeled alternative in {@link TrinoParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadCommitted(TrinoParser.ReadCommittedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeatableRead}
	 * labeled alternative in {@link TrinoParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatableRead(TrinoParser.RepeatableReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code serializable}
	 * labeled alternative in {@link TrinoParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializable(TrinoParser.SerializableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positionalArgument}
	 * labeled alternative in {@link TrinoParser#callArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArgument(TrinoParser.PositionalArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedArgument}
	 * labeled alternative in {@link TrinoParser#callArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(TrinoParser.NamedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualifiedArgument}
	 * labeled alternative in {@link TrinoParser#pathElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedArgument(TrinoParser.QualifiedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unqualifiedArgument}
	 * labeled alternative in {@link TrinoParser#pathElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedArgument(TrinoParser.UnqualifiedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#pathSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathSpecification(TrinoParser.PathSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege(TrinoParser.PrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(TrinoParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#queryPeriod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPeriod(TrinoParser.QueryPeriodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#rangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeType(TrinoParser.RangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specifiedPrincipal}
	 * labeled alternative in {@link TrinoParser#grantor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifiedPrincipal(TrinoParser.SpecifiedPrincipalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentUserGrantor}
	 * labeled alternative in {@link TrinoParser#grantor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentUserGrantor(TrinoParser.CurrentUserGrantorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentRoleGrantor}
	 * labeled alternative in {@link TrinoParser#grantor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentRoleGrantor(TrinoParser.CurrentRoleGrantorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unspecifiedPrincipal}
	 * labeled alternative in {@link TrinoParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnspecifiedPrincipal(TrinoParser.UnspecifiedPrincipalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userPrincipal}
	 * labeled alternative in {@link TrinoParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserPrincipal(TrinoParser.UserPrincipalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rolePrincipal}
	 * labeled alternative in {@link TrinoParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRolePrincipal(TrinoParser.RolePrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#roles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoles(TrinoParser.RolesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link TrinoParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(TrinoParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifier}
	 * labeled alternative in {@link TrinoParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(TrinoParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link TrinoParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackQuotedIdentifier(TrinoParser.BackQuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digitIdentifier}
	 * labeled alternative in {@link TrinoParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitIdentifier(TrinoParser.DigitIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link TrinoParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(TrinoParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link TrinoParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(TrinoParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link TrinoParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(TrinoParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrinoParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(TrinoParser.NonReservedContext ctx);
}