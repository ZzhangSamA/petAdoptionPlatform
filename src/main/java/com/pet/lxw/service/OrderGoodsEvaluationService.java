package com.pet.lxw.service;

import com.pet.lxw.pojo.GoodsCollection;
import com.pet.lxw.pojo.OrderGoodsEvaluation;

import java.util.List;

public interface OrderGoodsEvaluationService {

    boolean insertOGE(OrderGoodsEvaluation orderGoodsEvaluation);

//    全查
    List<OrderGoodsEvaluation> selectEC(Integer goodsId);


}
