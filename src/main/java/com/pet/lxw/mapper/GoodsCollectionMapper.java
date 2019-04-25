package com.pet.lxw.mapper;

import com.pet.lxw.pojo.GoodsCollection;
import com.pet.lxw.pojo.ShippingAddress;

import java.util.List;
import java.util.Map;

public interface GoodsCollectionMapper {

    int deleteByPrimaryKey(Integer collectionId);


    int insertSelective(GoodsCollection record);


    GoodsCollection selectByPrimaryKey(Integer collectionId);


    int updateByPrimaryKeySelective(GoodsCollection record);

    int updateByPrimaryKey(GoodsCollection record);

    //全查
    List<GoodsCollection> selectFromCustomerId(int customerId);

    //伪删
    int delWishlist(Integer collectionId);

    //已有数据的情况下，按红心取消或者添加收藏
    int changedFromHeart(GoodsCollection goodsCollection);

    //批量
    int delByForeach(Map map);

    //增加
    int insertC(GoodsCollection goodsCollection);

    //单查
    GoodsCollection selectC (GoodsCollection goodsCollection);
}