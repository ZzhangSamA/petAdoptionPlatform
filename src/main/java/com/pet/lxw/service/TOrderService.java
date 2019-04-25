package com.pet.lxw.service;

import com.pet.lxw.dto.TOrderDto;

import java.util.List;

public interface TOrderService {

    List<TOrderDto> selectFromTOrder(String orderNumber);
}
