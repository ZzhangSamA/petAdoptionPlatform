package com.pet.hpq.controller;

import com.pet.hpq.dto.ShoppingCarDto;
import com.pet.hpq.service.OrderService;
import com.pet.hpq.service.ShoppingCart;
import com.pet.hpq.vo.OrderInfoVo;
import com.pet.hpq.vo.ShoppingCarVo;
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
        Customer customer = (Customer)httpSession.getAttribute("customer");
        return shoppingCart.getCart(customer.getCustomerId());
    }

    @RequestMapping(value = "removeCart",method = RequestMethod.POST)
    public Object removeCart(@RequestBody ShoppingCarVo shoppingCarVo, HttpSession httpSession){
        Customer customer = (Customer)httpSession.getAttribute("customer");
        shoppingCarVo.setCustomerId(customer.getCustomerId());
        int i = shoppingCart.removeCart(shoppingCarVo);
        return i;
    }

    @RequestMapping(value = "addOrder",method = RequestMethod.POST)
    public Object addOrder(@RequestBody ShoppingCarVo shoppingCarVo, HttpSession httpSession){
        Customer customer = (Customer)httpSession.getAttribute("customer");
        shoppingCarVo.setCustomerId(customer.getCustomerId());
        return shoppingCart.addOrder(shoppingCarVo);
    }


    @RequestMapping(value = "addShoppingCart",method = RequestMethod.POST)
    public Object addShoppingCart(@RequestBody ShoppingCarVo shoppingCarVo, HttpSession httpSession){
        Customer customer = (Customer)httpSession.getAttribute("customer");
        shoppingCarVo.setCustomerId(customer.getCustomerId());
        return shoppingCart.addShoppingCart(shoppingCarVo);
    }

    @RequestMapping(value = "getCartCount",method = RequestMethod.POST)
    public Object getCartCount(HttpSession httpSession){
        Customer customer = (Customer)httpSession.getAttribute("customer");
        return shoppingCart.getCartCount(customer.getCustomerId());
    }
    @RequestMapping(value = "changeNum",method = RequestMethod.POST)
    public Object changeNum(@RequestBody ShoppingCarVo shoppingCarVo,HttpSession httpSession){
        Customer customer = (Customer)httpSession.getAttribute("customer");
        shoppingCarVo.setCustomerId(customer.getCustomerId());
        return shoppingCart.changeNum(shoppingCarVo);
    }
    @RequestMapping(value = "getOneGoods",method = RequestMethod.POST)
    public Object getOneGoods(@RequestBody ShoppingCarVo shoppingCarVo,HttpSession httpSession){

        return shoppingCart.getOneGoods(shoppingCarVo);
    }
}
