package com.pet.rsx.service.impl;

import com.pet.rsx.mapper.GoodsParameterMapper;
import com.pet.rsx.pojo.GoodsParameter;
import com.pet.rsx.service.GoodsParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsParameterServiceImpl implements GoodsParameterService {

    @Autowired(required = false)
    GoodsParameterMapper goodsParameterMapper;
    public double getPrice(GoodsParameter goodsParameter) {
        return goodsParameterMapper.getPrice(goodsParameter);
    }

    public Integer updateStockById(GoodsParameter goodsParameter) {
        Integer stock = goodsParameterMapper.getStockById(goodsParameter);
        goodsParameter.setStock(stock-goodsParameter.getBuyCount());
        return goodsParameterMapper.updateStockById(goodsParameter);
    }
}
