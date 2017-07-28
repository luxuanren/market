package com.study.handlers;

import com.study.enums.EvaluationStatusEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EvaluationStatusEnumHandler implements TypeHandler<EvaluationStatusEnum> {

    public void setParameter(PreparedStatement ps, int i, EvaluationStatusEnum parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setInt(i, parameter.getValue());
    }

    public EvaluationStatusEnum getResult(ResultSet rs, String columnName) throws SQLException {
        return EvaluationStatusEnum.getEvaluationStatus(rs.getInt(columnName));
    }

    public EvaluationStatusEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
        return EvaluationStatusEnum.getEvaluationStatus(rs.getInt(columnIndex));
    }

    public EvaluationStatusEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return EvaluationStatusEnum.getEvaluationStatus(cs.getInt(columnIndex));

    }
}
