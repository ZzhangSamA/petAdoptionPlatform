package com.pet.hpq.service;

import com.pet.hpq.dto.ShoppingCarDto;

import java.util.List;

public interface ShoppingCart {

    List<ShoppingCarDto> getCart(int customerId);


}
