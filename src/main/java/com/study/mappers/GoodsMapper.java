package com.study.mappers;

import com.study.model.Goods;

public interface GoodsMapper {


    Goods selectByGoodsId(Integer id);

    int saveGoods(Goods record);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}
