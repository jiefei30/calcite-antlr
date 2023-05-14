package com.jiefei.sql.operator;

import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlFunction;
import org.apache.calcite.sql.SqlFunctionCategory;
import org.apache.calcite.sql.SqlKind;
import org.apache.calcite.sql.SqlSyntax;
import org.apache.calcite.sql.SqlWriter;

/**
 * @author jiefei
 * @version : SqlOverlayFunction.java, v 0.1 2023-05-05 20:03 jiefei
 */
public class SqlOverlayFunction extends SqlFunction {

    private static final SqlOverlayFunction INSTANCE;

    private SqlOverlayFunction(String name, SqlKind kind) {
        super(name, kind, null, null, null, SqlFunctionCategory.USER_DEFINED_FUNCTION);
    }

    @Override
    public SqlSyntax getSyntax() {
        return super.getSyntax();
    }

    @Override
    public SqlFunctionCategory getFunctionType() {
        return SqlFunctionCategory.USER_DEFINED_FUNCTION;
    }

    @Override
    public void unparse(SqlWriter writer, SqlCall call, int leftPrec, int rightPrec) {
        SqlWriter.Frame frame = writer.startFunCall(this.getName());

        assert call.getOperandList().size() >= 3;

        call.operand(0).unparse(writer, leftPrec, rightPrec);
        writer.sep("PLACING");
        call.operand(1).unparse(writer, leftPrec, rightPrec);
        writer.sep("FROM");
        call.operand(2).unparse(writer, leftPrec, rightPrec);
        if (call.getOperandList().size() == 4) {
            writer.sep("FOR");
            call.operand(3).unparse(writer, leftPrec, rightPrec);
        }
        writer.endFunCall(frame);
    }

    static {
        INSTANCE = new SqlOverlayFunction("OVERLAY", SqlKind.OTHER_FUNCTION);
    }

    public static SqlOverlayFunction of() {
        return INSTANCE;
    }
}
