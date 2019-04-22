package com.pet.hpq.controller;

import com.pet.hpq.pojo.TOrder;
import com.pet.hpq.service.OrderService;
import com.pet.hpq.vo.OrderInfoVo;
import com.pet.tools.SplitPage;
import com.pet.yh.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class OrderController {

    @Autowired(required = false)
    OrderService orderService;

    @RequestMapping(value = "getOrders",method = RequestMethod.POST)
    public Object getOrders(@RequestBody(required = false)SplitPage splitPage, HttpSession httpSession){
        OrderInfoVo orderInfoVo = new OrderInfoVo();
        Customer customer1 = new Customer();
        customer1.setCustomerId(2);
        httpSession.setAttribute("customer",customer1);
        Customer customer = (Customer)httpSession.getAttribute("customer");
        orderInfoVo.setCustomer(customer);
        orderInfoVo.setSplitPage(splitPage);
        return orderService.getOrders(orderInfoVo);

    }
    @RequestMapping(value = "delivery",method = RequestMethod.POST)
    public Object delivery(@RequestBody(required = false)TOrder tOrder){
        int delivery = orderService.delivery(tOrder);
        return delivery;
    }


}
