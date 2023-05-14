
package com.jiefei.sql.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrinoParser}.
 */
public interface TrinoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrinoParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(TrinoParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(TrinoParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#standaloneExpression}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneExpression(TrinoParser.StandaloneExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#standaloneExpression}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneExpression(TrinoParser.StandaloneExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#standalonePathSpecification}.
	 * @param ctx the parse tree
	 */
	void enterStandalonePathSpecification(TrinoParser.StandalonePathSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#standalonePathSpecification}.
	 * @param ctx the parse tree
	 */
	void exitStandalonePathSpecification(TrinoParser.StandalonePathSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#standaloneType}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneType(TrinoParser.StandaloneTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#standaloneType}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneType(TrinoParser.StandaloneTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#standaloneRowPattern}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneRowPattern(TrinoParser.StandaloneRowPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#standaloneRowPattern}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneRowPattern(TrinoParser.StandaloneRowPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(TrinoParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(TrinoParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(TrinoParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(TrinoParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createCatalog}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateCatalog(TrinoParser.CreateCatalogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createCatalog}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateCatalog(TrinoParser.CreateCatalogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropCatalog}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropCatalog(TrinoParser.DropCatalogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropCatalog}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropCatalog(TrinoParser.DropCatalogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createSchema}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateSchema(TrinoParser.CreateSchemaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createSchema}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateSchema(TrinoParser.CreateSchemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropSchema}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropSchema(TrinoParser.DropSchemaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropSchema}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropSchema(TrinoParser.DropSchemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameSchema}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameSchema(TrinoParser.RenameSchemaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameSchema}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameSchema(TrinoParser.RenameSchemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setSchemaAuthorization}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetSchemaAuthorization(TrinoParser.SetSchemaAuthorizationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setSchemaAuthorization}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetSchemaAuthorization(TrinoParser.SetSchemaAuthorizationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableAsSelect}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableAsSelect(TrinoParser.CreateTableAsSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableAsSelect}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableAsSelect(TrinoParser.CreateTableAsSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(TrinoParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(TrinoParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(TrinoParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(TrinoParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInsertInto(TrinoParser.InsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInsertInto(TrinoParser.InsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code delete}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete(TrinoParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code delete}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete(TrinoParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(TrinoParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(TrinoParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentTable(TrinoParser.CommentTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentTable(TrinoParser.CommentTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentView(TrinoParser.CommentViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentView(TrinoParser.CommentViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentColumn}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentColumn(TrinoParser.CommentColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentColumn}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentColumn(TrinoParser.CommentColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(TrinoParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(TrinoParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddColumn(TrinoParser.AddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddColumn(TrinoParser.AddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameColumn(TrinoParser.RenameColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameColumn(TrinoParser.RenameColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropColumn}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropColumn(TrinoParser.DropColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropColumn}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropColumn(TrinoParser.DropColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setColumnType}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetColumnType(TrinoParser.SetColumnTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setColumnType}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetColumnType(TrinoParser.SetColumnTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableAuthorization}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableAuthorization(TrinoParser.SetTableAuthorizationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableAuthorization}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableAuthorization(TrinoParser.SetTableAuthorizationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(TrinoParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(TrinoParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableExecute}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTableExecute(TrinoParser.TableExecuteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableExecute}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTableExecute(TrinoParser.TableExecuteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(TrinoParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(TrinoParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateMaterializedView(TrinoParser.CreateMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateMaterializedView(TrinoParser.CreateMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(TrinoParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(TrinoParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshMaterializedView(TrinoParser.RefreshMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshMaterializedView(TrinoParser.RefreshMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropMaterializedView(TrinoParser.DropMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropMaterializedView(TrinoParser.DropMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameMaterializedView(TrinoParser.RenameMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameMaterializedView(TrinoParser.RenameMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setMaterializedViewProperties}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetMaterializedViewProperties(TrinoParser.SetMaterializedViewPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setMaterializedViewProperties}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetMaterializedViewProperties(TrinoParser.SetMaterializedViewPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropView(TrinoParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropView(TrinoParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameView(TrinoParser.RenameViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameView(TrinoParser.RenameViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setViewAuthorization}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetViewAuthorization(TrinoParser.SetViewAuthorizationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setViewAuthorization}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetViewAuthorization(TrinoParser.SetViewAuthorizationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCall(TrinoParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCall(TrinoParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createRole}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateRole(TrinoParser.CreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createRole}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateRole(TrinoParser.CreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropRole}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropRole(TrinoParser.DropRoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropRole}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropRole(TrinoParser.DropRoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grantRoles}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterGrantRoles(TrinoParser.GrantRolesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grantRoles}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitGrantRoles(TrinoParser.GrantRolesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code revokeRoles}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRevokeRoles(TrinoParser.RevokeRolesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code revokeRoles}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRevokeRoles(TrinoParser.RevokeRolesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setRole}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetRole(TrinoParser.SetRoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setRole}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetRole(TrinoParser.SetRoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grant}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant(TrinoParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grant}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant(TrinoParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deny}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeny(TrinoParser.DenyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deny}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeny(TrinoParser.DenyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code revoke}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(TrinoParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code revoke}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(TrinoParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowGrants(TrinoParser.ShowGrantsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowGrants(TrinoParser.ShowGrantsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(TrinoParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(TrinoParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explainAnalyze}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplainAnalyze(TrinoParser.ExplainAnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explainAnalyze}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplainAnalyze(TrinoParser.ExplainAnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(TrinoParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(TrinoParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateSchema}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateSchema(TrinoParser.ShowCreateSchemaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateSchema}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateSchema(TrinoParser.ShowCreateSchemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateView(TrinoParser.ShowCreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateView(TrinoParser.ShowCreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateMaterializedView(TrinoParser.ShowCreateMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateMaterializedView}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateMaterializedView(TrinoParser.ShowCreateMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(TrinoParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(TrinoParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showSchemas}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowSchemas(TrinoParser.ShowSchemasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSchemas}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowSchemas(TrinoParser.ShowSchemasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCatalogs}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCatalogs(TrinoParser.ShowCatalogsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCatalogs}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCatalogs(TrinoParser.ShowCatalogsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(TrinoParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(TrinoParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showStats}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowStats(TrinoParser.ShowStatsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showStats}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowStats(TrinoParser.ShowStatsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showStatsForQuery}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowStatsForQuery(TrinoParser.ShowStatsForQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showStatsForQuery}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowStatsForQuery(TrinoParser.ShowStatsForQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showRoles}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowRoles(TrinoParser.ShowRolesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showRoles}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowRoles(TrinoParser.ShowRolesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showRoleGrants}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowRoleGrants(TrinoParser.ShowRoleGrantsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showRoleGrants}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowRoleGrants(TrinoParser.ShowRoleGrantsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(TrinoParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(TrinoParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showSession}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowSession(TrinoParser.ShowSessionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSession}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowSession(TrinoParser.ShowSessionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setSession}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetSession(TrinoParser.SetSessionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setSession}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetSession(TrinoParser.SetSessionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetSession}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetSession(TrinoParser.ResetSessionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetSession}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetSession(TrinoParser.ResetSessionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code startTransaction}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStartTransaction(TrinoParser.StartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code startTransaction}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStartTransaction(TrinoParser.StartTransactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commit}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommit(TrinoParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commit}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommit(TrinoParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rollback}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRollback(TrinoParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rollback}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRollback(TrinoParser.RollbackContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prepare}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrepare(TrinoParser.PrepareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prepare}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrepare(TrinoParser.PrepareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deallocate}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeallocate(TrinoParser.DeallocateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deallocate}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeallocate(TrinoParser.DeallocateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execute}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute(TrinoParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execute}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute(TrinoParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeInput}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeInput(TrinoParser.DescribeInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeInput}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeInput(TrinoParser.DescribeInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeOutput}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeOutput(TrinoParser.DescribeOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeOutput}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeOutput(TrinoParser.DescribeOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setPath}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetPath(TrinoParser.SetPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setPath}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetPath(TrinoParser.SetPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTimeZone}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTimeZone(TrinoParser.SetTimeZoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTimeZone}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTimeZone(TrinoParser.SetTimeZoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code update}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(TrinoParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code update}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(TrinoParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code merge}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge(TrinoParser.MergeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code merge}
	 * labeled alternative in {@link TrinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge(TrinoParser.MergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(TrinoParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(TrinoParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#with}.
	 * @param ctx the parse tree
	 */
	void enterWith(TrinoParser.WithContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#with}.
	 * @param ctx the parse tree
	 */
	void exitWith(TrinoParser.WithContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(TrinoParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(TrinoParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(TrinoParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(TrinoParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#likeClause}.
	 * @param ctx the parse tree
	 */
	void enterLikeClause(TrinoParser.LikeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#likeClause}.
	 * @param ctx the parse tree
	 */
	void exitLikeClause(TrinoParser.LikeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(TrinoParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(TrinoParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#propertyAssignments}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignments(TrinoParser.PropertyAssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#propertyAssignments}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignments(TrinoParser.PropertyAssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(TrinoParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(TrinoParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultPropertyValue}
	 * labeled alternative in {@link TrinoParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultPropertyValue(TrinoParser.DefaultPropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultPropertyValue}
	 * labeled alternative in {@link TrinoParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultPropertyValue(TrinoParser.DefaultPropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonDefaultPropertyValue}
	 * labeled alternative in {@link TrinoParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterNonDefaultPropertyValue(TrinoParser.NonDefaultPropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonDefaultPropertyValue}
	 * labeled alternative in {@link TrinoParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitNonDefaultPropertyValue(TrinoParser.NonDefaultPropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterQueryNoWith(TrinoParser.QueryNoWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitQueryNoWith(TrinoParser.QueryNoWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCount(TrinoParser.LimitRowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCount(TrinoParser.LimitRowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#rowCount}.
	 * @param ctx the parse tree
	 */
	void enterRowCount(TrinoParser.RowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#rowCount}.
	 * @param ctx the parse tree
	 */
	void exitRowCount(TrinoParser.RowCountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link TrinoParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(TrinoParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link TrinoParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(TrinoParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link TrinoParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(TrinoParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link TrinoParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(TrinoParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link TrinoParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(TrinoParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link TrinoParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(TrinoParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link TrinoParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(TrinoParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link TrinoParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(TrinoParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTable}
	 * labeled alternative in {@link TrinoParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(TrinoParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTable}
	 * labeled alternative in {@link TrinoParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(TrinoParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link TrinoParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(TrinoParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link TrinoParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(TrinoParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(TrinoParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(TrinoParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(TrinoParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(TrinoParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#groupBy}.
	 * @param ctx the parse tree
	 */
	void enterGroupBy(TrinoParser.GroupByContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#groupBy}.
	 * @param ctx the parse tree
	 */
	void exitGroupBy(TrinoParser.GroupByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleGroupingSet}
	 * labeled alternative in {@link TrinoParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterSingleGroupingSet(TrinoParser.SingleGroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleGroupingSet}
	 * labeled alternative in {@link TrinoParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitSingleGroupingSet(TrinoParser.SingleGroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rollup}
	 * labeled alternative in {@link TrinoParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterRollup(TrinoParser.RollupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rollup}
	 * labeled alternative in {@link TrinoParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitRollup(TrinoParser.RollupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cube}
	 * labeled alternative in {@link TrinoParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterCube(TrinoParser.CubeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cube}
	 * labeled alternative in {@link TrinoParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitCube(TrinoParser.CubeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleGroupingSets}
	 * labeled alternative in {@link TrinoParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleGroupingSets(TrinoParser.MultipleGroupingSetsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleGroupingSets}
	 * labeled alternative in {@link TrinoParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleGroupingSets(TrinoParser.MultipleGroupingSetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(TrinoParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(TrinoParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#windowDefinition}.
	 * @param ctx the parse tree
	 */
	void enterWindowDefinition(TrinoParser.WindowDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#windowDefinition}.
	 * @param ctx the parse tree
	 */
	void exitWindowDefinition(TrinoParser.WindowDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpecification(TrinoParser.WindowSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpecification(TrinoParser.WindowSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(TrinoParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(TrinoParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(TrinoParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(TrinoParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link TrinoParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectSingle(TrinoParser.SelectSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link TrinoParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectSingle(TrinoParser.SelectSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link TrinoParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectAll(TrinoParser.SelectAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link TrinoParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectAll(TrinoParser.SelectAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link TrinoParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelationDefault(TrinoParser.RelationDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link TrinoParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelationDefault(TrinoParser.RelationDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link TrinoParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(TrinoParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link TrinoParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(TrinoParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(TrinoParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(TrinoParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(TrinoParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(TrinoParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#sampledRelation}.
	 * @param ctx the parse tree
	 */
	void enterSampledRelation(TrinoParser.SampledRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#sampledRelation}.
	 * @param ctx the parse tree
	 */
	void exitSampledRelation(TrinoParser.SampledRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#sampleType}.
	 * @param ctx the parse tree
	 */
	void enterSampleType(TrinoParser.SampleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#sampleType}.
	 * @param ctx the parse tree
	 */
	void exitSampleType(TrinoParser.SampleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#trimsSpecification}.
	 * @param ctx the parse tree
	 */
	void enterTrimsSpecification(TrinoParser.TrimsSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#trimsSpecification}.
	 * @param ctx the parse tree
	 */
	void exitTrimsSpecification(TrinoParser.TrimsSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#listAggOverflowBehavior}.
	 * @param ctx the parse tree
	 */
	void enterListAggOverflowBehavior(TrinoParser.ListAggOverflowBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#listAggOverflowBehavior}.
	 * @param ctx the parse tree
	 */
	void exitListAggOverflowBehavior(TrinoParser.ListAggOverflowBehaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#listaggCountIndication}.
	 * @param ctx the parse tree
	 */
	void enterListaggCountIndication(TrinoParser.ListaggCountIndicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#listaggCountIndication}.
	 * @param ctx the parse tree
	 */
	void exitListaggCountIndication(TrinoParser.ListaggCountIndicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#patternRecognition}.
	 * @param ctx the parse tree
	 */
	void enterPatternRecognition(TrinoParser.PatternRecognitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#patternRecognition}.
	 * @param ctx the parse tree
	 */
	void exitPatternRecognition(TrinoParser.PatternRecognitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#measureDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMeasureDefinition(TrinoParser.MeasureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#measureDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMeasureDefinition(TrinoParser.MeasureDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#rowsPerMatch}.
	 * @param ctx the parse tree
	 */
	void enterRowsPerMatch(TrinoParser.RowsPerMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#rowsPerMatch}.
	 * @param ctx the parse tree
	 */
	void exitRowsPerMatch(TrinoParser.RowsPerMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#emptyMatchHandling}.
	 * @param ctx the parse tree
	 */
	void enterEmptyMatchHandling(TrinoParser.EmptyMatchHandlingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#emptyMatchHandling}.
	 * @param ctx the parse tree
	 */
	void exitEmptyMatchHandling(TrinoParser.EmptyMatchHandlingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#skipTo}.
	 * @param ctx the parse tree
	 */
	void enterSkipTo(TrinoParser.SkipToContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#skipTo}.
	 * @param ctx the parse tree
	 */
	void exitSkipTo(TrinoParser.SkipToContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#subsetDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubsetDefinition(TrinoParser.SubsetDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#subsetDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubsetDefinition(TrinoParser.SubsetDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(TrinoParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(TrinoParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#aliasedRelation}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(TrinoParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#aliasedRelation}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(TrinoParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#columnAliases}.
	 * @param ctx the parse tree
	 */
	void enterColumnAliases(TrinoParser.ColumnAliasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#columnAliases}.
	 * @param ctx the parse tree
	 */
	void exitColumnAliases(TrinoParser.ColumnAliasesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(TrinoParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(TrinoParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryRelation}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryRelation(TrinoParser.SubqueryRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryRelation}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryRelation(TrinoParser.SubqueryRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unnest}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterUnnest(TrinoParser.UnnestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unnest}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitUnnest(TrinoParser.UnnestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lateral}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterLateral(TrinoParser.LateralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lateral}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitLateral(TrinoParser.LateralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFunctionInvocation}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableFunctionInvocation(TrinoParser.TableFunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFunctionInvocation}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableFunctionInvocation(TrinoParser.TableFunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedRelation}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedRelation(TrinoParser.ParenthesizedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedRelation}
	 * labeled alternative in {@link TrinoParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedRelation(TrinoParser.ParenthesizedRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#tableFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterTableFunctionCall(TrinoParser.TableFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#tableFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitTableFunctionCall(TrinoParser.TableFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#tableFunctionArgument}.
	 * @param ctx the parse tree
	 */
	void enterTableFunctionArgument(TrinoParser.TableFunctionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#tableFunctionArgument}.
	 * @param ctx the parse tree
	 */
	void exitTableFunctionArgument(TrinoParser.TableFunctionArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#tableArgument}.
	 * @param ctx the parse tree
	 */
	void enterTableArgument(TrinoParser.TableArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#tableArgument}.
	 * @param ctx the parse tree
	 */
	void exitTableArgument(TrinoParser.TableArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableArgumentTable}
	 * labeled alternative in {@link TrinoParser#tableArgumentRelation}.
	 * @param ctx the parse tree
	 */
	void enterTableArgumentTable(TrinoParser.TableArgumentTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableArgumentTable}
	 * labeled alternative in {@link TrinoParser#tableArgumentRelation}.
	 * @param ctx the parse tree
	 */
	void exitTableArgumentTable(TrinoParser.TableArgumentTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableArgumentQuery}
	 * labeled alternative in {@link TrinoParser#tableArgumentRelation}.
	 * @param ctx the parse tree
	 */
	void enterTableArgumentQuery(TrinoParser.TableArgumentQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableArgumentQuery}
	 * labeled alternative in {@link TrinoParser#tableArgumentRelation}.
	 * @param ctx the parse tree
	 */
	void exitTableArgumentQuery(TrinoParser.TableArgumentQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#descriptorArgument}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorArgument(TrinoParser.DescriptorArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#descriptorArgument}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorArgument(TrinoParser.DescriptorArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#descriptorField}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorField(TrinoParser.DescriptorFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#descriptorField}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorField(TrinoParser.DescriptorFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#copartitionTables}.
	 * @param ctx the parse tree
	 */
	void enterCopartitionTables(TrinoParser.CopartitionTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#copartitionTables}.
	 * @param ctx the parse tree
	 */
	void exitCopartitionTables(TrinoParser.CopartitionTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TrinoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TrinoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link TrinoParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(TrinoParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link TrinoParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(TrinoParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link TrinoParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(TrinoParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link TrinoParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(TrinoParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link TrinoParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterOr(TrinoParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link TrinoParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitOr(TrinoParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link TrinoParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(TrinoParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link TrinoParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(TrinoParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterComparison(TrinoParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitComparison(TrinoParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quantifiedComparison}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiedComparison(TrinoParser.QuantifiedComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quantifiedComparison}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiedComparison(TrinoParser.QuantifiedComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code between}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetween(TrinoParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code between}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetween(TrinoParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inList}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInList(TrinoParser.InListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inList}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInList(TrinoParser.InListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInSubquery(TrinoParser.InSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInSubquery(TrinoParser.InSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code like}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLike(TrinoParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code like}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLike(TrinoParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullPredicate}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterNullPredicate(TrinoParser.NullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullPredicate}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitNullPredicate(TrinoParser.NullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code distinctFrom}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterDistinctFrom(TrinoParser.DistinctFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code distinctFrom}
	 * labeled alternative in {@link TrinoParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitDistinctFrom(TrinoParser.DistinctFromContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(TrinoParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(TrinoParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatenation}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(TrinoParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenation}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(TrinoParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(TrinoParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(TrinoParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(TrinoParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(TrinoParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atTimeZone}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtTimeZone(TrinoParser.AtTimeZoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atTimeZone}
	 * labeled alternative in {@link TrinoParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtTimeZone(TrinoParser.AtTimeZoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(TrinoParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(TrinoParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(TrinoParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(TrinoParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonValue}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterJsonValue(TrinoParser.JsonValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonValue}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitJsonValue(TrinoParser.JsonValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialDateTimeFunction}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSpecialDateTimeFunction(TrinoParser.SpecialDateTimeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialDateTimeFunction}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSpecialDateTimeFunction(TrinoParser.SpecialDateTimeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substring}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubstring(TrinoParser.SubstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubstring(TrinoParser.SubstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(TrinoParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(TrinoParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambda(TrinoParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambda(TrinoParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(TrinoParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(TrinoParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trim}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrim(TrinoParser.TrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrim(TrinoParser.TrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameter}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParameter(TrinoParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameter}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParameter(TrinoParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalize}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNormalize(TrinoParser.NormalizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalize}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNormalize(TrinoParser.NormalizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonObject}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterJsonObject(TrinoParser.JsonObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonObject}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitJsonObject(TrinoParser.JsonObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(TrinoParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(TrinoParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(TrinoParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(TrinoParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(TrinoParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(TrinoParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonArray}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterJsonArray(TrinoParser.JsonArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonArray}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitJsonArray(TrinoParser.JsonArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(TrinoParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(TrinoParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(TrinoParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(TrinoParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(TrinoParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(TrinoParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(TrinoParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(TrinoParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(TrinoParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(TrinoParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonExists}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterJsonExists(TrinoParser.JsonExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonExists}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitJsonExists(TrinoParser.JsonExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentPath}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentPath(TrinoParser.CurrentPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentPath}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentPath(TrinoParser.CurrentPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(TrinoParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(TrinoParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLiteral(TrinoParser.BinaryLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLiteral(TrinoParser.BinaryLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentUser}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentUser(TrinoParser.CurrentUserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentUser}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentUser(TrinoParser.CurrentUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonQuery}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterJsonQuery(TrinoParser.JsonQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonQuery}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitJsonQuery(TrinoParser.JsonQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code measure}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterMeasure(TrinoParser.MeasureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code measure}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitMeasure(TrinoParser.MeasureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtract(TrinoParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtract(TrinoParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(TrinoParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(TrinoParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstructor(TrinoParser.ArrayConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstructor(TrinoParser.ArrayConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(TrinoParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(TrinoParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentSchema}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentSchema(TrinoParser.CurrentSchemaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentSchema}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentSchema(TrinoParser.CurrentSchemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(TrinoParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(TrinoParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(TrinoParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(TrinoParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listagg}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterListagg(TrinoParser.ListaggContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listagg}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitListagg(TrinoParser.ListaggContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(TrinoParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(TrinoParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentCatalog}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentCatalog(TrinoParser.CurrentCatalogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentCatalog}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentCatalog(TrinoParser.CurrentCatalogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code groupingOperation}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterGroupingOperation(TrinoParser.GroupingOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code groupingOperation}
	 * labeled alternative in {@link TrinoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitGroupingOperation(TrinoParser.GroupingOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#jsonPathInvocation}.
	 * @param ctx the parse tree
	 */
	void enterJsonPathInvocation(TrinoParser.JsonPathInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#jsonPathInvocation}.
	 * @param ctx the parse tree
	 */
	void exitJsonPathInvocation(TrinoParser.JsonPathInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#jsonValueExpression}.
	 * @param ctx the parse tree
	 */
	void enterJsonValueExpression(TrinoParser.JsonValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#jsonValueExpression}.
	 * @param ctx the parse tree
	 */
	void exitJsonValueExpression(TrinoParser.JsonValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#jsonRepresentation}.
	 * @param ctx the parse tree
	 */
	void enterJsonRepresentation(TrinoParser.JsonRepresentationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#jsonRepresentation}.
	 * @param ctx the parse tree
	 */
	void exitJsonRepresentation(TrinoParser.JsonRepresentationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#jsonArgument}.
	 * @param ctx the parse tree
	 */
	void enterJsonArgument(TrinoParser.JsonArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#jsonArgument}.
	 * @param ctx the parse tree
	 */
	void exitJsonArgument(TrinoParser.JsonArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#jsonExistsErrorBehavior}.
	 * @param ctx the parse tree
	 */
	void enterJsonExistsErrorBehavior(TrinoParser.JsonExistsErrorBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#jsonExistsErrorBehavior}.
	 * @param ctx the parse tree
	 */
	void exitJsonExistsErrorBehavior(TrinoParser.JsonExistsErrorBehaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#jsonValueBehavior}.
	 * @param ctx the parse tree
	 */
	void enterJsonValueBehavior(TrinoParser.JsonValueBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#jsonValueBehavior}.
	 * @param ctx the parse tree
	 */
	void exitJsonValueBehavior(TrinoParser.JsonValueBehaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#jsonQueryWrapperBehavior}.
	 * @param ctx the parse tree
	 */
	void enterJsonQueryWrapperBehavior(TrinoParser.JsonQueryWrapperBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#jsonQueryWrapperBehavior}.
	 * @param ctx the parse tree
	 */
	void exitJsonQueryWrapperBehavior(TrinoParser.JsonQueryWrapperBehaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#jsonQueryBehavior}.
	 * @param ctx the parse tree
	 */
	void enterJsonQueryBehavior(TrinoParser.JsonQueryBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#jsonQueryBehavior}.
	 * @param ctx the parse tree
	 */
	void exitJsonQueryBehavior(TrinoParser.JsonQueryBehaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#jsonObjectMember}.
	 * @param ctx the parse tree
	 */
	void enterJsonObjectMember(TrinoParser.JsonObjectMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#jsonObjectMember}.
	 * @param ctx the parse tree
	 */
	void exitJsonObjectMember(TrinoParser.JsonObjectMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#processingMode}.
	 * @param ctx the parse tree
	 */
	void enterProcessingMode(TrinoParser.ProcessingModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#processingMode}.
	 * @param ctx the parse tree
	 */
	void exitProcessingMode(TrinoParser.ProcessingModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void enterNullTreatment(TrinoParser.NullTreatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void exitNullTreatment(TrinoParser.NullTreatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basicStringLiteral}
	 * labeled alternative in {@link TrinoParser#string}.
	 * @param ctx the parse tree
	 */
	void enterBasicStringLiteral(TrinoParser.BasicStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basicStringLiteral}
	 * labeled alternative in {@link TrinoParser#string}.
	 * @param ctx the parse tree
	 */
	void exitBasicStringLiteral(TrinoParser.BasicStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unicodeStringLiteral}
	 * labeled alternative in {@link TrinoParser#string}.
	 * @param ctx the parse tree
	 */
	void enterUnicodeStringLiteral(TrinoParser.UnicodeStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unicodeStringLiteral}
	 * labeled alternative in {@link TrinoParser#string}.
	 * @param ctx the parse tree
	 */
	void exitUnicodeStringLiteral(TrinoParser.UnicodeStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeZoneInterval}
	 * labeled alternative in {@link TrinoParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneInterval(TrinoParser.TimeZoneIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeZoneInterval}
	 * labeled alternative in {@link TrinoParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneInterval(TrinoParser.TimeZoneIntervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeZoneString}
	 * labeled alternative in {@link TrinoParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneString(TrinoParser.TimeZoneStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeZoneString}
	 * labeled alternative in {@link TrinoParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneString(TrinoParser.TimeZoneStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(TrinoParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(TrinoParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#comparisonQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterComparisonQuantifier(TrinoParser.ComparisonQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#comparisonQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitComparisonQuantifier(TrinoParser.ComparisonQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(TrinoParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(TrinoParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(TrinoParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(TrinoParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(TrinoParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(TrinoParser.IntervalFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#normalForm}.
	 * @param ctx the parse tree
	 */
	void enterNormalForm(TrinoParser.NormalFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#normalForm}.
	 * @param ctx the parse tree
	 */
	void exitNormalForm(TrinoParser.NormalFormContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterRowType(TrinoParser.RowTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitRowType(TrinoParser.RowTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntervalType(TrinoParser.IntervalTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntervalType(TrinoParser.IntervalTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(TrinoParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(TrinoParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doublePrecisionType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoublePrecisionType(TrinoParser.DoublePrecisionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doublePrecisionType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoublePrecisionType(TrinoParser.DoublePrecisionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code legacyArrayType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterLegacyArrayType(TrinoParser.LegacyArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code legacyArrayType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitLegacyArrayType(TrinoParser.LegacyArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(TrinoParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(TrinoParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dateTimeType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeType(TrinoParser.DateTimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dateTimeType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeType(TrinoParser.DateTimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code legacyMapType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterLegacyMapType(TrinoParser.LegacyMapTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code legacyMapType}
	 * labeled alternative in {@link TrinoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitLegacyMapType(TrinoParser.LegacyMapTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#rowField}.
	 * @param ctx the parse tree
	 */
	void enterRowField(TrinoParser.RowFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#rowField}.
	 * @param ctx the parse tree
	 */
	void exitRowField(TrinoParser.RowFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(TrinoParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(TrinoParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(TrinoParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(TrinoParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(TrinoParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(TrinoParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeUpdate}
	 * labeled alternative in {@link TrinoParser#mergeCase}.
	 * @param ctx the parse tree
	 */
	void enterMergeUpdate(TrinoParser.MergeUpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeUpdate}
	 * labeled alternative in {@link TrinoParser#mergeCase}.
	 * @param ctx the parse tree
	 */
	void exitMergeUpdate(TrinoParser.MergeUpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeDelete}
	 * labeled alternative in {@link TrinoParser#mergeCase}.
	 * @param ctx the parse tree
	 */
	void enterMergeDelete(TrinoParser.MergeDeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeDelete}
	 * labeled alternative in {@link TrinoParser#mergeCase}.
	 * @param ctx the parse tree
	 */
	void exitMergeDelete(TrinoParser.MergeDeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeInsert}
	 * labeled alternative in {@link TrinoParser#mergeCase}.
	 * @param ctx the parse tree
	 */
	void enterMergeInsert(TrinoParser.MergeInsertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeInsert}
	 * labeled alternative in {@link TrinoParser#mergeCase}.
	 * @param ctx the parse tree
	 */
	void exitMergeInsert(TrinoParser.MergeInsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#over}.
	 * @param ctx the parse tree
	 */
	void enterOver(TrinoParser.OverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#over}.
	 * @param ctx the parse tree
	 */
	void exitOver(TrinoParser.OverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(TrinoParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(TrinoParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#frameExtent}.
	 * @param ctx the parse tree
	 */
	void enterFrameExtent(TrinoParser.FrameExtentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#frameExtent}.
	 * @param ctx the parse tree
	 */
	void exitFrameExtent(TrinoParser.FrameExtentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unboundedFrame}
	 * labeled alternative in {@link TrinoParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterUnboundedFrame(TrinoParser.UnboundedFrameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unboundedFrame}
	 * labeled alternative in {@link TrinoParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitUnboundedFrame(TrinoParser.UnboundedFrameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentRowBound}
	 * labeled alternative in {@link TrinoParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterCurrentRowBound(TrinoParser.CurrentRowBoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentRowBound}
	 * labeled alternative in {@link TrinoParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitCurrentRowBound(TrinoParser.CurrentRowBoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boundedFrame}
	 * labeled alternative in {@link TrinoParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterBoundedFrame(TrinoParser.BoundedFrameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boundedFrame}
	 * labeled alternative in {@link TrinoParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitBoundedFrame(TrinoParser.BoundedFrameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quantifiedPrimary}
	 * labeled alternative in {@link TrinoParser#rowPattern}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiedPrimary(TrinoParser.QuantifiedPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quantifiedPrimary}
	 * labeled alternative in {@link TrinoParser#rowPattern}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiedPrimary(TrinoParser.QuantifiedPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code patternConcatenation}
	 * labeled alternative in {@link TrinoParser#rowPattern}.
	 * @param ctx the parse tree
	 */
	void enterPatternConcatenation(TrinoParser.PatternConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code patternConcatenation}
	 * labeled alternative in {@link TrinoParser#rowPattern}.
	 * @param ctx the parse tree
	 */
	void exitPatternConcatenation(TrinoParser.PatternConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code patternAlternation}
	 * labeled alternative in {@link TrinoParser#rowPattern}.
	 * @param ctx the parse tree
	 */
	void enterPatternAlternation(TrinoParser.PatternAlternationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code patternAlternation}
	 * labeled alternative in {@link TrinoParser#rowPattern}.
	 * @param ctx the parse tree
	 */
	void exitPatternAlternation(TrinoParser.PatternAlternationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code patternVariable}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void enterPatternVariable(TrinoParser.PatternVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code patternVariable}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void exitPatternVariable(TrinoParser.PatternVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyPattern}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void enterEmptyPattern(TrinoParser.EmptyPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyPattern}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void exitEmptyPattern(TrinoParser.EmptyPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code patternPermutation}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void enterPatternPermutation(TrinoParser.PatternPermutationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code patternPermutation}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void exitPatternPermutation(TrinoParser.PatternPermutationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code groupedPattern}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void enterGroupedPattern(TrinoParser.GroupedPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code groupedPattern}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void exitGroupedPattern(TrinoParser.GroupedPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionStartAnchor}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void enterPartitionStartAnchor(TrinoParser.PartitionStartAnchorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionStartAnchor}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void exitPartitionStartAnchor(TrinoParser.PartitionStartAnchorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionEndAnchor}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void enterPartitionEndAnchor(TrinoParser.PartitionEndAnchorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionEndAnchor}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void exitPartitionEndAnchor(TrinoParser.PartitionEndAnchorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code excludedPattern}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void enterExcludedPattern(TrinoParser.ExcludedPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code excludedPattern}
	 * labeled alternative in {@link TrinoParser#patternPrimary}.
	 * @param ctx the parse tree
	 */
	void exitExcludedPattern(TrinoParser.ExcludedPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zeroOrMoreQuantifier}
	 * labeled alternative in {@link TrinoParser#patternQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterZeroOrMoreQuantifier(TrinoParser.ZeroOrMoreQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zeroOrMoreQuantifier}
	 * labeled alternative in {@link TrinoParser#patternQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitZeroOrMoreQuantifier(TrinoParser.ZeroOrMoreQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oneOrMoreQuantifier}
	 * labeled alternative in {@link TrinoParser#patternQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterOneOrMoreQuantifier(TrinoParser.OneOrMoreQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oneOrMoreQuantifier}
	 * labeled alternative in {@link TrinoParser#patternQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitOneOrMoreQuantifier(TrinoParser.OneOrMoreQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zeroOrOneQuantifier}
	 * labeled alternative in {@link TrinoParser#patternQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterZeroOrOneQuantifier(TrinoParser.ZeroOrOneQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zeroOrOneQuantifier}
	 * labeled alternative in {@link TrinoParser#patternQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitZeroOrOneQuantifier(TrinoParser.ZeroOrOneQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeQuantifier}
	 * labeled alternative in {@link TrinoParser#patternQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterRangeQuantifier(TrinoParser.RangeQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeQuantifier}
	 * labeled alternative in {@link TrinoParser#patternQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitRangeQuantifier(TrinoParser.RangeQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#updateAssignment}.
	 * @param ctx the parse tree
	 */
	void enterUpdateAssignment(TrinoParser.UpdateAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#updateAssignment}.
	 * @param ctx the parse tree
	 */
	void exitUpdateAssignment(TrinoParser.UpdateAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explainFormat}
	 * labeled alternative in {@link TrinoParser#explainOption}.
	 * @param ctx the parse tree
	 */
	void enterExplainFormat(TrinoParser.ExplainFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explainFormat}
	 * labeled alternative in {@link TrinoParser#explainOption}.
	 * @param ctx the parse tree
	 */
	void exitExplainFormat(TrinoParser.ExplainFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explainType}
	 * labeled alternative in {@link TrinoParser#explainOption}.
	 * @param ctx the parse tree
	 */
	void enterExplainType(TrinoParser.ExplainTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explainType}
	 * labeled alternative in {@link TrinoParser#explainOption}.
	 * @param ctx the parse tree
	 */
	void exitExplainType(TrinoParser.ExplainTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isolationLevel}
	 * labeled alternative in {@link TrinoParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void enterIsolationLevel(TrinoParser.IsolationLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isolationLevel}
	 * labeled alternative in {@link TrinoParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void exitIsolationLevel(TrinoParser.IsolationLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transactionAccessMode}
	 * labeled alternative in {@link TrinoParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionAccessMode(TrinoParser.TransactionAccessModeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transactionAccessMode}
	 * labeled alternative in {@link TrinoParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionAccessMode(TrinoParser.TransactionAccessModeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readUncommitted}
	 * labeled alternative in {@link TrinoParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 */
	void enterReadUncommitted(TrinoParser.ReadUncommittedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readUncommitted}
	 * labeled alternative in {@link TrinoParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 */
	void exitReadUncommitted(TrinoParser.ReadUncommittedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readCommitted}
	 * labeled alternative in {@link TrinoParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 */
	void enterReadCommitted(TrinoParser.ReadCommittedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readCommitted}
	 * labeled alternative in {@link TrinoParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 */
	void exitReadCommitted(TrinoParser.ReadCommittedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeatableRead}
	 * labeled alternative in {@link TrinoParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 */
	void enterRepeatableRead(TrinoParser.RepeatableReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeatableRead}
	 * labeled alternative in {@link TrinoParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 */
	void exitRepeatableRead(TrinoParser.RepeatableReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code serializable}
	 * labeled alternative in {@link TrinoParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 */
	void enterSerializable(TrinoParser.SerializableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code serializable}
	 * labeled alternative in {@link TrinoParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 */
	void exitSerializable(TrinoParser.SerializableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positionalArgument}
	 * labeled alternative in {@link TrinoParser#callArgument}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArgument(TrinoParser.PositionalArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positionalArgument}
	 * labeled alternative in {@link TrinoParser#callArgument}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArgument(TrinoParser.PositionalArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedArgument}
	 * labeled alternative in {@link TrinoParser#callArgument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(TrinoParser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedArgument}
	 * labeled alternative in {@link TrinoParser#callArgument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(TrinoParser.NamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualifiedArgument}
	 * labeled alternative in {@link TrinoParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedArgument(TrinoParser.QualifiedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualifiedArgument}
	 * labeled alternative in {@link TrinoParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedArgument(TrinoParser.QualifiedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unqualifiedArgument}
	 * labeled alternative in {@link TrinoParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedArgument(TrinoParser.UnqualifiedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unqualifiedArgument}
	 * labeled alternative in {@link TrinoParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedArgument(TrinoParser.UnqualifiedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#pathSpecification}.
	 * @param ctx the parse tree
	 */
	void enterPathSpecification(TrinoParser.PathSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#pathSpecification}.
	 * @param ctx the parse tree
	 */
	void exitPathSpecification(TrinoParser.PathSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#privilege}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege(TrinoParser.PrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#privilege}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege(TrinoParser.PrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(TrinoParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(TrinoParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#queryPeriod}.
	 * @param ctx the parse tree
	 */
	void enterQueryPeriod(TrinoParser.QueryPeriodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#queryPeriod}.
	 * @param ctx the parse tree
	 */
	void exitQueryPeriod(TrinoParser.QueryPeriodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void enterRangeType(TrinoParser.RangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void exitRangeType(TrinoParser.RangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specifiedPrincipal}
	 * labeled alternative in {@link TrinoParser#grantor}.
	 * @param ctx the parse tree
	 */
	void enterSpecifiedPrincipal(TrinoParser.SpecifiedPrincipalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specifiedPrincipal}
	 * labeled alternative in {@link TrinoParser#grantor}.
	 * @param ctx the parse tree
	 */
	void exitSpecifiedPrincipal(TrinoParser.SpecifiedPrincipalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentUserGrantor}
	 * labeled alternative in {@link TrinoParser#grantor}.
	 * @param ctx the parse tree
	 */
	void enterCurrentUserGrantor(TrinoParser.CurrentUserGrantorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentUserGrantor}
	 * labeled alternative in {@link TrinoParser#grantor}.
	 * @param ctx the parse tree
	 */
	void exitCurrentUserGrantor(TrinoParser.CurrentUserGrantorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentRoleGrantor}
	 * labeled alternative in {@link TrinoParser#grantor}.
	 * @param ctx the parse tree
	 */
	void enterCurrentRoleGrantor(TrinoParser.CurrentRoleGrantorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentRoleGrantor}
	 * labeled alternative in {@link TrinoParser#grantor}.
	 * @param ctx the parse tree
	 */
	void exitCurrentRoleGrantor(TrinoParser.CurrentRoleGrantorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unspecifiedPrincipal}
	 * labeled alternative in {@link TrinoParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterUnspecifiedPrincipal(TrinoParser.UnspecifiedPrincipalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unspecifiedPrincipal}
	 * labeled alternative in {@link TrinoParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitUnspecifiedPrincipal(TrinoParser.UnspecifiedPrincipalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code userPrincipal}
	 * labeled alternative in {@link TrinoParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterUserPrincipal(TrinoParser.UserPrincipalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code userPrincipal}
	 * labeled alternative in {@link TrinoParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitUserPrincipal(TrinoParser.UserPrincipalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rolePrincipal}
	 * labeled alternative in {@link TrinoParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterRolePrincipal(TrinoParser.RolePrincipalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rolePrincipal}
	 * labeled alternative in {@link TrinoParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitRolePrincipal(TrinoParser.RolePrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#roles}.
	 * @param ctx the parse tree
	 */
	void enterRoles(TrinoParser.RolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#roles}.
	 * @param ctx the parse tree
	 */
	void exitRoles(TrinoParser.RolesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link TrinoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(TrinoParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link TrinoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(TrinoParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifier}
	 * labeled alternative in {@link TrinoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(TrinoParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifier}
	 * labeled alternative in {@link TrinoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(TrinoParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link TrinoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterBackQuotedIdentifier(TrinoParser.BackQuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link TrinoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitBackQuotedIdentifier(TrinoParser.BackQuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digitIdentifier}
	 * labeled alternative in {@link TrinoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterDigitIdentifier(TrinoParser.DigitIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digitIdentifier}
	 * labeled alternative in {@link TrinoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitDigitIdentifier(TrinoParser.DigitIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link TrinoParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(TrinoParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link TrinoParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(TrinoParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link TrinoParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(TrinoParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link TrinoParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(TrinoParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link TrinoParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(TrinoParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link TrinoParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(TrinoParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrinoParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(TrinoParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrinoParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(TrinoParser.NonReservedContext ctx);
}