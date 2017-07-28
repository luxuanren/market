package com.study.handlers;

import com.study.enums.OrderStatusEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes({OrderStatusEnum.class})
@MappedJdbcTypes({JdbcType.INTEGER})
public class OrderStatusEnumHandler implements TypeHandler<OrderStatusEnum> {

    public void setParameter(PreparedStatement ps, int i, OrderStatusEnum parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setInt(i, parameter.getValue());
    }

    public OrderStatusEnum getResult(ResultSet rs, String columnName) throws SQLException {
        return OrderStatusEnum.getOrderStatusEnum(rs.getInt(columnName));
    }

    public OrderStatusEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
        return OrderStatusEnum.getOrderStatusEnum(rs.getInt(columnIndex));
    }

    public OrderStatusEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return OrderStatusEnum.getOrderStatusEnum(cs.getInt(columnIndex));
    }
}
