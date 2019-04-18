package com.pet.hpq.service;

import com.pet.hpq.pojo.TOrder;
import com.pet.yh.pojo.Customer;


import java.util.List;

public interface OrderService {
    List<TOrder> getOrders(Customer customer);
    TOrder getOrderById(int orderId);
}
