package com.pet.rsx.mapper;

import com.pet.rsx.dto.GoodsInfo;
import com.pet.rsx.vo.GoodsInfoVo;

import java.util.List;

public interface GoodsInfoMapper {
    List<GoodsInfo> getGoodsInfoBy(GoodsInfoVo goodsInfoVo);
    int getGoodsInfoCount(GoodsInfoVo goodsInfoVo);
}