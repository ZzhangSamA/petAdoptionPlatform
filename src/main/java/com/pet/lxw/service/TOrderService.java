package com.pet.lxw.service;

import com.pet.lxw.dto.TOrderDto;
import com.pet.lxw.pojo.TOrder;

import java.util.List;

public interface TOrderService {

    List<TOrderDto> selectFromTOrder(String orderNumber);

    boolean updateStatus(TOrder record);
}
