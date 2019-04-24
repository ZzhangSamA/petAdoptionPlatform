package com.pet.rsx.controller;

import com.pet.rsx.pojo.GoodsImg;
import com.pet.rsx.service.GoodsImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsImageController {
    @Autowired
    GoodsImageService goodsImageService;

    @RequestMapping(value = "getImageById",method = RequestMethod.POST)
    public Object getImageById(@RequestBody(required = false)GoodsImg goodsImg){
        return goodsImageService.getImageById(goodsImg);
    }
}
