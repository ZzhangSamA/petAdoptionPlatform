package com.pet.lxw.service.impl;

import com.pet.lxw.mapper.GoodsCollectionMapper;
import com.pet.lxw.pojo.GoodsCollection;
import com.pet.lxw.service.GoodsCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GoodsCollectionServiceImpl implements GoodsCollectionService{

    @Autowired(required = false)
    GoodsCollectionMapper goodsCollectionMapper;

    //全查
    public List<GoodsCollection> selectFromCustomerId(int customerId) {
        return this.goodsCollectionMapper.selectFromCustomerId(customerId);
    }

    //单删
    public int delWishlist(Integer collectionId) {
        return this.goodsCollectionMapper.delWishlist(collectionId);
    }

    //批量删
    public boolean delByForeach(Map map) {
        if(this.goodsCollectionMapper.delByForeach(map)>0){
            return true;
        }
        return false;
    }
}
