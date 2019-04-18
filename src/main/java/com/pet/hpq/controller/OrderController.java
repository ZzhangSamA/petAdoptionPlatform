package com.pet.hpq.controller;

import com.pet.hpq.pojo.TOrder;
import com.pet.hpq.service.OrderService;
import com.pet.yh.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.List;

@RestController
public class OrderController {

    @Autowired(required = false)
    OrderService orderService;

    @RequestMapping(value = "getOrders",method = RequestMethod.POST)
    public Object getOrders(HttpSession httpSession){
        Customer customer1 = new Customer();
        customer1.setCustomerId(1);
        httpSession.setAttribute("customer",customer1);
        Customer customer = (Customer)httpSession.getAttribute("customer");
        System.out.println(customer);
        return orderService.getOrders(customer);
//       return orderService.getOrderById(1);

    }

}
