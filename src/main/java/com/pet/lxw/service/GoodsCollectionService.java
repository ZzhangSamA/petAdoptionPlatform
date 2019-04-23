package com.pet.lxw.service;

import com.pet.lxw.pojo.GoodsCollection;

import java.util.List;
import java.util.Map;

public interface GoodsCollectionService {

    List<GoodsCollection> selectFromCustomerId(int customerId);

    int delWishlist(Integer collectionId);

    boolean delByForeach(Map map);
}
