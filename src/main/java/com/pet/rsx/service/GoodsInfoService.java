package com.pet.rsx.service;

import com.pet.rsx.dto.GoodsInfo;
import com.pet.rsx.dto.GoodsInfoDto;
import com.pet.rsx.vo.GoodsInfoVo;

import java.util.List;

public interface GoodsInfoService {
    GoodsInfoDto getGoodsInfoBy(GoodsInfoVo goodsInfoVo);
}
