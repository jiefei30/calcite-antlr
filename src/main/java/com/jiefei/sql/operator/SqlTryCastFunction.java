package com.jiefei.sql.operator;

import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlFunction;
import org.apache.calcite.sql.SqlFunctionCategory;
import org.apache.calcite.sql.SqlIntervalQualifier;
import org.apache.calcite.sql.SqlKind;
import org.apache.calcite.sql.SqlSyntax;
import org.apache.calcite.sql.SqlWriter;

/**
 * @author jiefei
 * @version : SqlTryCastFunction.java, v 0.1 2023-05-06 14:59 jiefei
 */
public class SqlTryCastFunction extends SqlFunction {

    public SqlTryCastFunction() {
        super("TRY_CAST", SqlKind.OTHER_FUNCTION, null, null, null,SqlFunctionCategory.USER_DEFINED_FUNCTION);
    }

    @Override
    public SqlSyntax getSyntax() {
        return SqlSyntax.SPECIAL;
    }

    @Override
    public SqlFunctionCategory getFunctionType() {
        return SqlFunctionCategory.USER_DEFINED_FUNCTION;
    }

    @Override
    public void unparse(SqlWriter writer, SqlCall call, int leftPrec, int rightPrec) {
        assert call.operandCount() == 2;
        SqlWriter.Frame frame = writer.startFunCall(this.getName());
        call.operand(0).unparse(writer, 0, 0);
        writer.sep("AS");
        if (call.operand(1) instanceof SqlIntervalQualifier) {
            writer.sep("INTERVAL");
        }
        call.operand(1).unparse(writer, 0, 0);
        writer.endFunCall(frame);
    }

}
