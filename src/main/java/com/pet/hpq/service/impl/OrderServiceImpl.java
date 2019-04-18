package com.pet.hpq.service.impl;

import com.pet.hpq.mapper.TOrderMapper;
import com.pet.hpq.pojo.TOrder;
import com.pet.hpq.service.OrderService;
import com.pet.yh.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired(required = false)
    TOrderMapper tOrderMapper;
    public List<TOrder> getOrders(Customer customer) {
        List<TOrder> orders=null;
        if (customer!=null){
            orders = tOrderMapper.getOrdersByCustomId(customer.getCustomerId());
        }
        return orders;
    }

    public TOrder getOrderById(int orderId) {
        return tOrderMapper.selectByPrimaryKey(orderId);
    }
}
