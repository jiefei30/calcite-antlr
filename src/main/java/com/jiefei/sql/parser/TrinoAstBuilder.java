package com.jiefei.sql.parser;

import com.google.common.collect.Lists;
import com.jiefei.sql.trino.TrinoBaseVisitor;
import com.jiefei.sql.trino.TrinoParser;
import com.jiefei.sql.operator.SqlTryCastFunction;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlBasicTypeNameSpec;
import org.apache.calcite.sql.SqlDataTypeSpec;
import org.apache.calcite.sql.SqlIdentifier;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlTypeNameSpec;
import org.apache.calcite.sql.fun.SqlCastFunction;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.parser.SqlParserPos;
import org.apache.calcite.sql.type.SqlTypeName;

import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;

/**
 * @author jiefei
 * @version : TrinoAstBuilder.java, v 0.1 2023-05-06 14:32 jiefei
 */
public class TrinoAstBuilder extends TrinoBaseVisitor<SqlNode> {

    private final SqlParser.Config config;

    public TrinoAstBuilder(SqlParser.Config config)
    {
        this.config = requireNonNull(config, "parsingOptions is null");
    }

    @Override
    public SqlNode visitSingleStatement(TrinoParser.SingleStatementContext ctx)
    {
        return visit(ctx.statement());
    }

    @Override
    public SqlNode visitStandaloneExpression(TrinoParser.StandaloneExpressionContext ctx)
    {
        return visit(ctx.expression());
    }

    @Override
    public SqlNode visitDereference(TrinoParser.DereferenceContext ctx) {
        return new SqlIdentifier(Lists.newArrayList(caseSensitive(ctx.getText()).split("\\.")), getSqlParserPos(ctx));
    }

    @Override
    public SqlNode visitUnquotedIdentifier(TrinoParser.UnquotedIdentifierContext ctx) {
        return new SqlIdentifier(caseSensitive(ctx.getText()), getSqlParserPos(ctx));
    }

    @Override
    public SqlNode visitGenericType(TrinoParser.GenericTypeContext ctx) {
        SqlTypeNameSpec sqlTypeNameSpec = new SqlBasicTypeNameSpec(SqlTypeName.valueOf(ctx.getText()
                .toUpperCase(Locale.ROOT)), getSqlParserPos(ctx));
        return new SqlDataTypeSpec(sqlTypeNameSpec, getSqlParserPos(ctx));
    }

    public SqlNode visitCast(TrinoParser.CastContext ctx) {
        List<SqlNode> operandList = Lists.newArrayList();
        operandList.add(visitIfPresent(ctx.expression(), SqlNode.class));
        operandList.add(visitIfPresent(ctx.type(), SqlNode.class));
        if (Objects.nonNull(ctx.TRY_CAST())) {
            return new SqlBasicCall(new SqlTryCastFunction(), operandList, getSqlParserPos(ctx));
        }
        return new SqlBasicCall(new SqlCastFunction(), operandList, getSqlParserPos(ctx));
    }

    private <T> T visitIfPresent(ParserRuleContext ctx, Class<T> clazz) {
        if (ctx == null) {
            return null;
        }
        SqlNode visit = visit(ctx);
        return clazz.cast(visit);
    }

    private <T> List<T> visitList(List<? extends ParserRuleContext> ctxs, Class<T> clazz) {
        return ctxs.stream().map(x -> visitIfPresent(x, clazz)).collect(Collectors.toList());
    }

    public SqlParserPos getSqlParserPos(ParserRuleContext ctx) {
        return new SqlParserPos(ctx.getStart().getLine(), ctx.getStart().getStartIndex());
    }

    private String caseSensitive(String text) {
        text = text.replaceAll("\\r", " ").replaceAll("\\n", " ");
        if (config.caseSensitive()) {
            return text;
        }
        return text.toLowerCase(Locale.ROOT);
    }

}
