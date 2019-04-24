package com.pet.lxw.controller;

import com.pet.lxw.pojo.GoodsCollection;
import com.pet.lxw.service.GoodsCollectionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GoodsCollectionController {

    @Autowired
    GoodsCollectionService goodsCollectionService;

    //查
    @RequestMapping(value = "selectFromCustomerId",method = RequestMethod.POST)
    public List<GoodsCollection> selectFromCustomerId(@RequestParam int customerId){
        List<GoodsCollection> list =this.goodsCollectionService.selectFromCustomerId(customerId);
        return list;
    }

    //删
    @RequestMapping(value = "removeCollection",method = RequestMethod.POST)
    public int removeCollection(@Param("collectionId") String collectionId) {
        int id = Integer.parseInt(collectionId);
        int i = this.goodsCollectionService.delWishlist(id);
        return i;
    }

    //批量删
    @RequestMapping(value = "delByForeach",method = RequestMethod.GET)
    public String delByForeach(@RequestParam(value = "ids[]", required = false) Integer[] ids){
        Map<String,Object> map = new HashMap();
        map.put("ids",ids);
        System.out.println(ids);
        Boolean flag = this.goodsCollectionService.delByForeach(map);
        return flag.toString();
    }
}
