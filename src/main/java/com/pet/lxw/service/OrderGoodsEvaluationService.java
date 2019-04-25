package com.pet.lxw.service;

import com.pet.lxw.pojo.OrderGoodsEvaluation;

import java.util.List;

public interface OrderGoodsEvaluationService {

    boolean insertOGE(OrderGoodsEvaluation orderGoodsEvaluation);

    List<OrderGoodsEvaluation> selectEC(Integer goodsId);
}
