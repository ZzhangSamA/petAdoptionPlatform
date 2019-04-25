package com.pet.rsx.controller;

import com.pet.rsx.pojo.GoodsParameter;
import com.pet.rsx.service.GoodsParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsParameterController {
@Autowired
GoodsParameterService goodsParameterService;

    /**
     * 根据id获取价格
     * @param goodsParameter
     * @return
     */
    @RequestMapping(value = "getPrice",method = RequestMethod.POST)
public Object getPrice(@RequestBody(required = false)GoodsParameter goodsParameter){
    return goodsParameterService.getPrice(goodsParameter);
}
}
