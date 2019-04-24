package com.pet.hpq.controller;

import com.pet.hpq.service.OrderService;
import com.pet.hpq.service.ReturnSale;
import com.pet.hpq.vo.OrderInfoVo;
import com.pet.hpq.vo.ReturnMessageVo;
import com.pet.tools.SplitPage;
import com.pet.yh.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LogisticsController {
    @Autowired(required = false)
    ReturnSale returnSale;

    @RequestMapping(value = "getReturnMessage",method = RequestMethod.POST)
    public Object getReturnMessage(@RequestBody(required = false)ReturnMessageVo returnMessageVo, HttpSession httpSession){
        Customer customer1 = new Customer();
        customer1.setCustomerId(2);
        httpSession.setAttribute("customer",customer1);
        Customer customer = (Customer)httpSession.getAttribute("customer");
        returnMessageVo.setCustomerId(customer.getCustomerId());
        int i = returnSale.addReturnSale(returnMessageVo);
        return i;
    }
    @RequestMapping(value = "getReturnDetail",method = RequestMethod.POST)
    public Object getReturnDetail(@RequestBody(required = false)ReturnMessageVo returnMessageVo, HttpSession httpSession){

        return returnSale.getReturnDetail(returnMessageVo);
    }
    @RequestMapping(value = "againRefuse",method = RequestMethod.POST)
    public Object againRefuse(@RequestBody(required = false)ReturnMessageVo returnMessageVo, HttpSession httpSession){

        return returnSale.againRefuse(returnMessageVo);
    }

}
