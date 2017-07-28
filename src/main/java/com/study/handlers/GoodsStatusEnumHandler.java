package com.study.handlers;

import com.study.enums.GoodsStatusEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes({GoodsStatusEnum.class})
@MappedJdbcTypes({JdbcType.INTEGER})
public class GoodsStatusEnumHandler implements TypeHandler<GoodsStatusEnum> {

    public void setParameter(PreparedStatement ps, int i, GoodsStatusEnum parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setInt(i, parameter.getValue());
    }

    public GoodsStatusEnum getResult(ResultSet rs, String columnName) throws SQLException {
        return GoodsStatusEnum.getGoodsStatus(rs.getInt(columnName));
    }

    public GoodsStatusEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
        return GoodsStatusEnum.getGoodsStatus(rs.getInt(columnIndex));
    }

    public GoodsStatusEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return GoodsStatusEnum.getGoodsStatus(cs.getInt(columnIndex));
    }
}
