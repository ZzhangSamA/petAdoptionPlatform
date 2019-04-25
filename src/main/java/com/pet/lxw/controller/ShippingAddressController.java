package com.pet.lxw.controller;


import com.pet.yh.pojo.Customer;
import com.pet.lxw.pojo.ShippingAddress;
import com.pet.lxw.service.ShippingAddressService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class ShippingAddressController {

    @Autowired
    ShippingAddressService shippingAddressService;


    @RequestMapping(value = "selectFromAddress",method = RequestMethod.GET)
    public List<ShippingAddress> selectFromAddress(HttpSession httpSession){
        Customer customer = (Customer) httpSession.getAttribute("customer");
        List<ShippingAddress> list =this.shippingAddressService.selectFromAddress(customer.getCustomerId());
        return list;
    }

    @RequestMapping(value = "selectOneAddress")
    public ShippingAddress selectOneAddress(@RequestParam int addressId){
        return this.shippingAddressService.selectOneAddress(addressId);
    }

    @RequestMapping(value = "remove",method = RequestMethod.POST)
    public int remove(@Param("addressId") String addressId) {
        int id = Integer.parseInt(addressId);
        int i = this.shippingAddressService.delAddress(id);
        return i;
    }

    @RequestMapping(value = "addAddress",method = RequestMethod.POST)
    public Object addAddress(@RequestBody ShippingAddress shippingAddress){
        System.out.println(shippingAddress);
        boolean flag = this.shippingAddressService.addAddress(shippingAddress);
        return flag;
    }

    @RequestMapping(value = "updateAddress",method = RequestMethod.POST)
    public Object updateAddress(@RequestBody ShippingAddress shippingAddress){
        boolean flag = this.shippingAddressService.updateAddress(shippingAddress);
        return flag;
    }

    @RequestMapping(value = "defaultAddress",method = RequestMethod.POST)
    public Object defaultAddress(@RequestBody ShippingAddress shippingAddress,HttpSession httpSession){
        //System.out.println(shippingAddress);
        Customer customer = (Customer) httpSession.getAttribute("customer");

        shippingAddress.setCustomerId(customer.getCustomerId());
        boolean flag = this.shippingAddressService.defaultAddress(shippingAddress);
        return flag;
    }
}
