package com.jiefei.sql.operator;

import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlKind;
import org.apache.calcite.sql.SqlSpecialOperator;
import org.apache.calcite.sql.SqlSyntax;
import org.apache.calcite.sql.SqlWriter;

/**
 * @author jiefei
 * @version : SqlArrayFunction.java, v 0.1 2023-05-06 14:20 jiefei
 */
public class SqlArrayFunction extends SqlSpecialOperator {

    private static final SqlArrayFunction INSTANCE;

    private SqlArrayFunction() {
        super("ARRAY", SqlKind.OTHER, 100, false, null, null, null);
    }

    @Override
    public SqlSyntax getSyntax() {
        return super.getSyntax();
    }

    @Override
    public void unparse(SqlWriter writer, SqlCall call, int leftPrec, int rightPrec) {
        SqlWriter.Frame frame = writer.startList("ARRAY[", "]");

        assert call.getOperandList().size() >= 3;
        for (int i = 0; i < call.operandCount(); i++) {
            call.operand(i).unparse(writer, 0, 0);
        }
        writer.endList(frame);
    }

    static {
        INSTANCE = new SqlArrayFunction();
    }

    public static SqlArrayFunction of() {
        return INSTANCE;
    }

}
