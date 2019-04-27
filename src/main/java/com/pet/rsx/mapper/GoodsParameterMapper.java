package com.pet.rsx.mapper;

import com.pet.rsx.pojo.GoodsParameter;

public interface GoodsParameterMapper {
    double getPrice(GoodsParameter goodsParameter);
    Integer getStockById(GoodsParameter goodsParameter);
    Integer updateStockById(GoodsParameter goodsParameter);

}