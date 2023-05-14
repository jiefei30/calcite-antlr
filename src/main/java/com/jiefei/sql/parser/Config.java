package com.jiefei.sql.parser;

import org.apache.calcite.avatica.util.Casing;
import org.apache.calcite.avatica.util.Quoting;
import org.apache.calcite.avatica.util.TimeUnit;
import org.apache.calcite.config.CharLiteralStyle;
import org.apache.calcite.config.Lex;
import org.apache.calcite.sql.SqlDialect;
import org.apache.calcite.sql.dialect.AnsiSqlDialect;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.parser.SqlParserImplFactory;
import org.apache.calcite.sql.validate.SqlConformance;

import java.util.Map;
import java.util.Set;

/**
 * @author jiefei
 * @version : Config.java, v 0.1 2023-05-05 18:00 jiefei
 */
public class Config implements SqlParser.Config {

    private final SqlDialect sqlDialect;

    public Config() {
        this.sqlDialect = AnsiSqlDialect.DEFAULT;
    }

    public Config(SqlDialect sqlDialect) {
        this.sqlDialect = sqlDialect;
    }

    @Override
    public int identifierMaxLength() {
        return SqlParser.Config.super.identifierMaxLength();
    }

    @Override
    public Casing quotedCasing() {
        return SqlParser.Config.super.quotedCasing();
    }

    @Override
    public Casing unquotedCasing() {
        return SqlParser.Config.super.unquotedCasing();
    }

    @Override
    public Quoting quoting() {
        return SqlParser.Config.super.quoting();
    }

    @Override
    public boolean caseSensitive() {
        return SqlParser.Config.super.caseSensitive();
    }

    @Override
    public SqlConformance conformance() {
        return SqlParser.Config.super.conformance();
    }

    @Override
    public boolean allowBangEqual() {
        return SqlParser.Config.super.allowBangEqual();
    }

    @Override
    public Set<CharLiteralStyle> charLiteralStyles() {
        return SqlParser.Config.super.charLiteralStyles();
    }

    @Override
    public Map<String, TimeUnit> timeUnitCodes() {
        return SqlParser.Config.super.timeUnitCodes();
    }

    @Override
    public SqlParserImplFactory parserFactory() {
        return SqlParser.Config.super.parserFactory();
    }

    @Override
    public SqlParser.Config withLex(Lex lex) {
        return SqlParser.Config.super.withLex(lex);
    }

    @Override
    public SqlParser.Config withIdentifierMaxLength(int i) {
        return null;
    }

    @Override
    public SqlParser.Config withQuotedCasing(Casing casing) {
        return null;
    }

    @Override
    public SqlParser.Config withUnquotedCasing(Casing casing) {
        return null;
    }

    @Override
    public SqlParser.Config withQuoting(Quoting quoting) {
        return null;
    }

    @Override
    public SqlParser.Config withCaseSensitive(boolean b) {
        return null;
    }

    @Override
    public SqlParser.Config withConformance(SqlConformance sqlConformance) {
        return null;
    }

    @Override
    public SqlParser.Config withCharLiteralStyles(Iterable<CharLiteralStyle> iterable) {
        return null;
    }

    @Override
    public SqlParser.Config withTimeUnitCodes(Map<String, ? extends TimeUnit> map) {
        return null;
    }

    @Override
    public SqlParser.Config withParserFactory(SqlParserImplFactory sqlParserImplFactory) {
        return null;
    }

    public SqlDialect getSqlDialect() {
        return sqlDialect;
    }
}
