package com.pet.yz.controller;

import com.pet.hpq.pojo.TOrder;
import com.pet.hpq.service.OrderService;
import com.pet.yz.service.ExpressService;
import com.pet.yz.vo.ExpressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 快递鸟测试
 */
@Controller
public class ExpressController {

    @Autowired
    ExpressService expressService;

    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping(value = "getExpressInformation",method = RequestMethod.POST)
    public void getExpressInformation(@RequestBody(required = false) ExpressVo expressVo) throws Exception {
        String expressInformation = expressService.getExpressInformation(expressVo);
        System.out.println(expressInformation);
    }

    @ResponseBody
    @RequestMapping(value = "getOrderForExpress",method = RequestMethod.POST)
    public Object getOrderForExpress(@RequestBody(required = false)TOrder tOrder) {
        TOrder order = orderService.getOrderByOrderNumber(tOrder.getOrderNumber());
        if (order == null) {
            return false + "";
        }
        return order;
    }

}
