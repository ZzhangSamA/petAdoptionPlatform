package com.pet.lxw.service.impl;

import com.pet.lxw.mapper.OrderGoodsEvaluationMapper;
import com.pet.lxw.pojo.OrderGoodsEvaluation;
import com.pet.lxw.service.OrderGoodsEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderGoodsEvaluationServiceImpl implements OrderGoodsEvaluationService{

    @Autowired(required = false)
    OrderGoodsEvaluationMapper orderGoodsEvaluationMapper;

    public boolean insertOGE(OrderGoodsEvaluation orderGoodsEvaluation) {
        boolean flag = false;
        if (this.orderGoodsEvaluationMapper.insertOGE(orderGoodsEvaluation)>0){
            return true;
        }
        return false;
    }

    public List<OrderGoodsEvaluation> selectEC(Integer goodsId) {
        return this.orderGoodsEvaluationMapper.selectEC(goodsId);
    }
}
