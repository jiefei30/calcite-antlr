package com.jiefei.sql;

import com.jiefei.sql.parser.Config;
import com.jiefei.sql.parser.SqlExtendParser;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlWriterConfig;
import org.apache.calcite.sql.dialect.MysqlSqlDialect;
import org.apache.calcite.sql.dialect.PrestoSqlDialect;
import org.apache.calcite.sql.parser.SqlParseException;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.parser.ddl.SqlDdlParserImpl;
import org.apache.calcite.sql.pretty.SqlPrettyWriter;
import org.junit.jupiter.api.Test;

/**
 * @author jiefei
 * @version : TestSparkSQL.java, v 0.1 2023-05-06 11:34 jiefei
 */
public class TestSparkSQL {

    public SqlParser.Config initConfig() {
        return SqlParser.Config.DEFAULT.withParserFactory(SqlDdlParserImpl.FACTORY);
    }

    @Test
    public void testCalcite() throws SqlParseException {
        final String sql = "CREATE TABLE T1 AS SELECT C1, C2 FROM T2";
        final SqlNode node = SqlParser.create(sql, initConfig()).parseStmt();
        System.out.println(formatNode(node));
    }

    @Test
    public void testOverlayFunction1() throws SqlParseException {
        final String expression = "OVERLAY(\"C1\" PLACING \"C2\" FROM \"C3\")";
        final SqlNode node = SqlParser.create(expression, initConfig()).parseExpression();
        System.out.println(formatNode(node));
    }

    @Test
    public void testOverlayFunction2() {
        final String expression = "OVERLAY(C1 PLACING C2 FROM C3)";
        final SqlNode node = new SqlExtendParser().parseExpression(expression);
        // print "OVERLAY("C1", "C2", "C3")" if you haven't overwrite unparse()
        System.out.println(formatNode(node));
    }

    @Test
    public void testArray1() throws SqlParseException {
        final String expression = "c1+c2 > 1 and c1*c2 < 3";
        final SqlNode node = SqlParser.create(expression, initConfig()).parseExpression();
        System.out.println(formatNode(node));
    }

//    @Test
//    public void testArray2() {
//        final String expression = "ARRAY[c1, c2, c3]";
//        final SqlNode node = new SqlExtendParser().parseExpression(expression, new Config(PrestoSqlDialect.DEFAULT));
//        System.out.println(formatNode(node));
//    }

    /**
     * This test is failed, cause calcite does not support Try_cast for now.
     */
    @Test
    public void testTryCast1() {
        final String expression = "TRY_CAST(C1 AS DATE)";
        try {
            final SqlNode node = SqlParser.create(expression, initConfig()).parseExpression();
        } catch (SqlParseException e) {
            System.err.println("This test is failed, cause calcite does not support Try_cast for now");
        }
    }

    @Test
    public void testTryCast2() {
        final String expression = "TRY_CAST(C1 AS DATE)";
        final SqlNode node = new SqlExtendParser().parseExpression(expression, new Config(PrestoSqlDialect.DEFAULT));
        System.out.println(formatNode(node));
    }

    private String formatNode(SqlNode node) {
        final SqlWriterConfig config = SqlPrettyWriter.config()
                .withLineFolding(SqlWriterConfig.LineFolding.STEP)
                .withSelectFolding(SqlWriterConfig.LineFolding.TALL)
                .withFromFolding(SqlWriterConfig.LineFolding.TALL)
                .withWhereFolding(SqlWriterConfig.LineFolding.TALL)
                .withHavingFolding(SqlWriterConfig.LineFolding.TALL)
                .withIndentation(4)
                .withDialect(MysqlSqlDialect.DEFAULT)
                .withClauseEndsLine(true);
        return new SqlPrettyWriter(config).format(node);
    }

}
