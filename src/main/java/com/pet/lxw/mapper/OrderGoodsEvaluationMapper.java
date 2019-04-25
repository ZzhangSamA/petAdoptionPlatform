package com.pet.lxw.mapper;

import com.pet.lxw.pojo.OrderGoodsEvaluation;

import java.util.List;


public interface OrderGoodsEvaluationMapper {

    int deleteByPrimaryKey(Integer evaluationId);

    int insert(OrderGoodsEvaluation record);

    int insertOGE(OrderGoodsEvaluation record);

    List<OrderGoodsEvaluation> selectEC(Integer goodsId);

    int updateByPrimaryKeySelective(OrderGoodsEvaluation record);

    int updateByPrimaryKey(OrderGoodsEvaluation orderGoodsEvaluation);


}