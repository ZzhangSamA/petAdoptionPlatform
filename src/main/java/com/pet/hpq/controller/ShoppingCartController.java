package com.pet.hpq.controller;

import com.pet.hpq.service.OrderService;
import com.pet.hpq.service.ShoppingCart;
import com.pet.hpq.vo.OrderInfoVo;
import com.pet.tools.SplitPage;
import com.pet.yh.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class ShoppingCartController {
    @Autowired(required = false)
    ShoppingCart shoppingCart;

    @RequestMapping(value = "getCart",method = RequestMethod.POST)
    public Object getOrders(HttpSession httpSession){
        Customer customer1 = new Customer();
        customer1.setCustomerId(2);
        httpSession.setAttribute("customer",customer1);
        Customer customer = (Customer)httpSession.getAttribute("customer");

        return shoppingCart.getCart(customer.getCustomerId());
    }

}
