package com.pet.lxw.controller;

import com.pet.yh.pojo.Customer;
import com.pet.lxw.pojo.GoodsCollection;
import com.pet.lxw.service.GoodsCollectionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GoodsCollectionController {

    @Autowired
    GoodsCollectionService goodsCollectionService;


    /**
     * 查收藏
     * @param httpSession{customerId}
     * @return
     */
    @RequestMapping(value = "selectFromCustomerId",method = RequestMethod.GET)
    public List<GoodsCollection> selectFromCustomerId(HttpSession httpSession){
        Customer customer = (Customer) httpSession.getAttribute("customer");
        List<GoodsCollection> list =this.goodsCollectionService.selectFromCustomerId(customer.getCustomerId());
        return list;
    }

    //删

    /**
     *
     * @param collectionId
     * @return
     */
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

    //增加收藏
    @RequestMapping(value = "insertC",method = RequestMethod.POST)
    public Object insertC(@RequestBody GoodsCollection goodsCollection,HttpSession httpSession){

        Customer customer = (Customer) httpSession.getAttribute("customer");

        goodsCollection.setCustomerId(customer.getCustomerId());
        boolean flag = this.goodsCollectionService.insertC(goodsCollection);
        return flag;
    }
    //单查
    @RequestMapping(value = "selectC",method = RequestMethod.POST)
    public GoodsCollection selectC(@RequestBody GoodsCollection goodsCollection,HttpSession httpSession){
        Customer customer = (Customer) httpSession.getAttribute("customer");
        goodsCollection.setCustomerId(customer.getCustomerId());
        return this.goodsCollectionService.selectC(goodsCollection);
    }

    //改
    @RequestMapping(value = "changedFromHeart",method = RequestMethod.POST)
    public int changedFromHeart(@RequestBody GoodsCollection goodsCollection,HttpSession httpSession){
        Customer customer = (Customer) httpSession.getAttribute("customer");
        goodsCollection.setCustomerId(customer.getCustomerId());
        return this.goodsCollectionService.changedFromHeart(goodsCollection);
    }

}
