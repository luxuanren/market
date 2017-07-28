package com.study.handlers;

import com.study.enums.UserLevelEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes({ UserLevelEnum.class })
@MappedJdbcTypes({ JdbcType.INTEGER })
public class UserLevelEnumHandler implements TypeHandler<UserLevelEnum> {

    public void setParameter(PreparedStatement ps, int i, UserLevelEnum parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setInt(i, parameter.getValue());
    }

    public UserLevelEnum getResult(ResultSet rs, String columnName) throws SQLException {
        return UserLevelEnum.getUserLevel(rs.getInt(columnName));
    }

    public UserLevelEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
        return UserLevelEnum.getUserLevel(rs.getInt(columnIndex));
    }

    public UserLevelEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return UserLevelEnum.getUserLevel(cs.getInt(columnIndex));
    }
}
