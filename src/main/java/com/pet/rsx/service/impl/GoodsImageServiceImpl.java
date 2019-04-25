package com.pet.rsx.service.impl;


import com.pet.rsx.dto.GoodsInfoDto;
import com.pet.rsx.mapper.GoodsImgMapper;
import com.pet.rsx.pojo.GoodsImg;
import com.pet.rsx.service.GoodsImageService;
import com.pet.rsx.service.GoodsInfoService;
import com.pet.rsx.vo.GoodsInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsImageServiceImpl implements GoodsImageService {
    @Autowired(required = false)
    GoodsImgMapper goodsImgMapper;


    public List<GoodsImg> getImageById(GoodsImg goodsImg) {
        return goodsImgMapper.getImageById(goodsImg);
    }
}
