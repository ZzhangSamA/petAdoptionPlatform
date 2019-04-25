package com.pet.lxw.controller;

import com.pet.lxw.dto.TOrderDto;

import com.pet.lxw.service.TOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TOrderController {

    @Autowired
    TOrderService tOrderService;

    //查
    @RequestMapping(value = "selectFromTOrder",method = RequestMethod.GET)
    public List<TOrderDto> selectFromTOrder(@RequestParam String orderNumber){

        List<TOrderDto> list =this.tOrderService.selectFromTOrder(orderNumber);
        System.out.println(orderNumber);
        return list;
    }
}
