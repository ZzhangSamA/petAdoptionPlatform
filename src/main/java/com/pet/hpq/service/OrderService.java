package com.pet.hpq.service;

import com.pet.hpq.dto.OrderPageDto;
import com.pet.hpq.pojo.TOrder;
import com.pet.hpq.vo.OrderInfoVo;
import com.pet.yh.pojo.Customer;


import java.util.List;

public interface OrderService {
    OrderPageDto getOrders(OrderInfoVo orderInfoVo);
    TOrder getOrderById(int orderId);
    int getOrderCount(int CustomerId);
    int delivery(TOrder tOrder);
    int refuseOrder(TOrder tOrder);
}
