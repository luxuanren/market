package com.study.mappers;

import com.study.model.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MarkMapper {
    List<Goods> getMarkListByUserId(Integer userId);
    void deleteMarkByPrimaryKey(@Param("userId") Integer userId, @Param("goodsId")Integer goodsId);
    void saveUserMark(@Param("userId")Integer userId, @Param("goodsId")Integer goodsId);
}
