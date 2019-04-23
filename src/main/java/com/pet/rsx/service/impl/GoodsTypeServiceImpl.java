package com.pet.rsx.service.impl;

import com.pet.rsx.dto.GoodsTypeDto;
import com.pet.rsx.mapper.GoodsTypeMapper;
import com.pet.rsx.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Autowired(required = false)
    GoodsTypeMapper goodsTypeMapper;
    public List<GoodsTypeDto> getAllGoodsType() {
        return goodsTypeMapper.getAllGoodsType();
    }
}
