package com.pet.hpq.service;

import com.pet.hpq.dto.ShoppingCarDto;
import com.pet.hpq.vo.ShoppingCarVo;

import java.util.List;

public interface ShoppingCart {

    List<ShoppingCarDto> getCart(int customerId);

    int removeCart(ShoppingCarVo shoppingCarVo);

    int addOrder(ShoppingCarVo shoppingCarVo);

    int addShoppingCart(ShoppingCarVo shoppingCarVo);


    int getCartCount(Integer customerId);



    int changeNum(ShoppingCarVo shoppingCarVo);

    ShoppingCarDto getOneGoods(ShoppingCarVo shoppingCarVo);
}
