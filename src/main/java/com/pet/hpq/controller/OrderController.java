package com.pet.hpq.controller;

import com.pet.hpq.dto.GoodsDto;
import com.pet.hpq.dto.GoodsInfoDto;
import com.pet.hpq.dto.OrderDetail;
import com.pet.hpq.pojo.TOrder;
import com.pet.hpq.service.OrderService;
import com.pet.hpq.vo.GoodsOrderVo;
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

    @RequestMapping(value = "refuseOrder",method = RequestMethod.POST)
    public Object refuseOrder(@RequestBody(required = false)TOrder tOrder){
        int refuseOrder = orderService.refuseOrder(tOrder);
        return refuseOrder;
    }
    @RequestMapping(value = "getOrderDetail",method = RequestMethod.POST)
    public Object getOrderDetail(@RequestBody(required = false)TOrder tOrder,HttpSession httpSession){
        Customer customer1 = new Customer();
        customer1.setCustomerId(2);
        httpSession.setAttribute("customer",customer1);
        Customer customer = (Customer)httpSession.getAttribute("customer");
        Integer customerId = customer.getCustomerId();
        tOrder.setCustomerId(customerId);
        OrderDetail orderDetail = orderService.getOrderDetail(tOrder);
        return orderDetail;
    }

    @RequestMapping(value = "checkedDeliver",method = RequestMethod.POST)
    public Object checkedDeliver(@RequestBody(required = false)TOrder tOrder,HttpSession httpSession){
        int i = orderService.checkedDeliver(tOrder);
        return i;
    }
    @RequestMapping(value = "getGoodsInfo",method = RequestMethod.POST)
    public Object getGoodsInfo(@RequestBody(required = false)GoodsOrderVo goodsOrderVo, HttpSession httpSession){
        GoodsDto goodsInfoDto = orderService.getGoodsInfo(goodsOrderVo);
        return goodsInfoDto;
    }
    @RequestMapping(value = "getRefuseGoods",method = RequestMethod.POST)
    public Object getRefuseGoods(@RequestBody(required = false)GoodsOrderVo goodsOrderVo, HttpSession httpSession){
        GoodsDto refuseGoods = orderService.getRefuseGoods(goodsOrderVo);
        return refuseGoods;
    }

}
