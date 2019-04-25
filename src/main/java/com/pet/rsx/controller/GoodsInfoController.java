package com.pet.rsx.controller;

import com.pet.rsx.service.GoodsInfoService;
import com.pet.rsx.vo.GoodsInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsInfoController {
    @Autowired
    GoodsInfoService goodsInfoService;

    /**
     * 根据上传的信息获取集合
     * @param goodsInfoVo
     * @return
     */
    @RequestMapping(value = "getGoodsInfoBy",method = RequestMethod.POST)
    public Object getGoodsInfoBy(@RequestBody(required = false)GoodsInfoVo goodsInfoVo){
        return goodsInfoService.getGoodsInfoBy(goodsInfoVo);
    }
}
