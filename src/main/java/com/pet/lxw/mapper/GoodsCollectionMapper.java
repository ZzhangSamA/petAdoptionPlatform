package com.pet.lxw.mapper;

import com.pet.lxw.pojo.GoodsCollection;
import com.pet.lxw.pojo.ShippingAddress;

import java.util.List;
import java.util.Map;

public interface GoodsCollectionMapper {

    int deleteByPrimaryKey(Integer collectionId);


    int insert(GoodsCollection record);

    int insertSelective(GoodsCollection record);


    GoodsCollection selectByPrimaryKey(Integer collectionId);


    int updateByPrimaryKeySelective(GoodsCollection record);

    int updateByPrimaryKey(GoodsCollection record);

    //全查
    List<GoodsCollection> selectFromCustomerId(int customerId);

    //伪删
    int delWishlist(Integer collectionId);

    //批量
    int delByForeach(Map map);
}