package com.pet.lxw.controller;

import com.pet.lxw.pojo.OrderGoodsEvaluation;
import com.pet.lxw.service.OrderGoodsEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderGoodsEvaluationController {

    @Autowired
    OrderGoodsEvaluationService orderGoodsEvaluationService;


    @RequestMapping(value = "insertOGE",method = RequestMethod.POST)
    public Object insertOGE(@RequestBody OrderGoodsEvaluation orderGoodsEvaluation){
        System.out.println(orderGoodsEvaluation);
        boolean flag = this.orderGoodsEvaluationService.insertOGE(orderGoodsEvaluation);
        return flag;
    }

    @RequestMapping(value = "selectEC",method = RequestMethod.POST)
    public List<OrderGoodsEvaluation> selectFromAddress(@RequestParam int goodsId){

        System.out.println(this.orderGoodsEvaluationService.selectEC(goodsId));
        return this.orderGoodsEvaluationService.selectEC(goodsId);
    }
}
