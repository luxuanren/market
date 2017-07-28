package com.study.handlers;

import com.study.enums.SexEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@MappedTypes({SexEnum.class})
@MappedJdbcTypes({JdbcType.INTEGER})
public class SexEnumHandler implements TypeHandler<SexEnum>{

	public void setParameter(PreparedStatement ps, int i, SexEnum parameter, JdbcType jdbcType) throws SQLException {
		ps.setInt(i, parameter.getId());
	}

	public SexEnum getResult(ResultSet rs, String columnName) throws SQLException {
		return SexEnum.getSex(rs.getInt(columnName));
	}

	public SexEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
		return SexEnum.getSex(rs.getInt(columnIndex));
	}

	public SexEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
		return SexEnum.getSex(cs.getInt(columnIndex));
	}

}
