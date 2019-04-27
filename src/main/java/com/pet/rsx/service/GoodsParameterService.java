package com.pet.rsx.service;

import com.pet.rsx.pojo.GoodsParameter;

public interface GoodsParameterService {
    double getPrice(GoodsParameter goodsParameter);
    Integer updateStockById(GoodsParameter goodsParameter);
}
