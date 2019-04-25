package com.pet.hpq.service.impl;

import com.pet.hpq.dto.ShoppingCarDto;
import com.pet.hpq.mapper.ShoppingCartMapper;
import com.pet.hpq.service.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartImpl implements ShoppingCart {

    @Autowired(required = false)
    ShoppingCartMapper shoppingCartMapper;

    public List<ShoppingCarDto> getCart(int customerId) {
        return shoppingCartMapper.getCart(customerId);
    }
}
