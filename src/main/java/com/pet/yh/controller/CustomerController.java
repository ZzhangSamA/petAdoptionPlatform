package com.pet.yh.controller;

import com.pet.yh.pojo.Customer;
import com.pet.yh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "loginCheck",method = RequestMethod.POST)
    public Object loginCheck(@RequestBody Customer customer, HttpSession httpSession){
        Boolean flag=false;
        System.out.println("customerName="+customer.getCustomerName()+",password="+customer.getPassword());
        //登录成功以后将用户名和密码保存到session中
        flag = customerService.loginCheck(customer);
        if(flag){
            //登录成功,保存
            httpSession.setAttribute("customer",customer);
        }
        return flag.toString();
    }
}
