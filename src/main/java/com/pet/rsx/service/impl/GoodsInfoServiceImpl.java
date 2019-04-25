package com.pet.rsx.service.impl;

import com.pet.rsx.dto.GoodsInfo;
import com.pet.rsx.dto.GoodsInfoDto;
import com.pet.rsx.mapper.GoodsInfoMapper;
import com.pet.rsx.service.GoodsInfoService;
import com.pet.rsx.tools.SplitePageBean;
import com.pet.rsx.vo.GoodsInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {
    @Autowired(required = false)
    GoodsInfoMapper goodsInfoMapper;
    public GoodsInfoDto getGoodsInfoBy(GoodsInfoVo goodsInfoVo) {
        List<GoodsInfo> goodsInfos = goodsInfoMapper.getGoodsInfoBy(goodsInfoVo);
        SplitePageBean splitePageBean = goodsInfoVo.getSplitePageBean();
        int count = goodsInfoMapper.getGoodsInfoCount(goodsInfoVo);
        splitePageBean.setDataCount(count);
        GoodsInfoDto goodsInfoDto = new GoodsInfoDto();
        goodsInfoDto.setSplitePageBean(splitePageBean);
        goodsInfoDto.setGoodsInfos(goodsInfos);
        System.out.println(goodsInfoDto);

        return goodsInfoDto;
    }
}
