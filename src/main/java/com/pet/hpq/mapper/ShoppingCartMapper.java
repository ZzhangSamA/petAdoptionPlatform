package com.pet.hpq.mapper;

import com.pet.hpq.dto.ShoppingCarDto;
import com.pet.hpq.pojo.ShoppingCart;

import java.util.List;

public interface ShoppingCartMapper {
    int deleteByPrimaryKey(Integer cartId);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);

    List<ShoppingCarDto> getCart(int customerId);
}