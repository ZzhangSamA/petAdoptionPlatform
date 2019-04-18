package com.pet.lxw.controller;

import com.pet.lxw.pojo.ShippingAddress;
import com.pet.lxw.service.ShippingAddressService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShippingAddressController {

    @Autowired
    ShippingAddressService shippingAddressService;


    @RequestMapping(value = "selectFromAddress",method = RequestMethod.POST)
    public List<ShippingAddress> selectFromAddress(@RequestParam int customerId){
        return this.shippingAddressService.selectFromAddress(customerId);
    }

    @RequestMapping(value = "remove",method = RequestMethod.POST)
    public int remove(@Param("addressId") String addressId) {
        int id = Integer.parseInt(addressId);
        int i = this.shippingAddressService.delAddress(id);
        return i;
    }

    @RequestMapping(value = "addAddress",method = RequestMethod.POST)
    public Object addAddress(@RequestBody ShippingAddress shippingAddress){
        //System.out.println(shippingAddress);
        boolean flag = this.shippingAddressService.addAddress(shippingAddress);
        return flag;
    }

    @RequestMapping(value = "updateAddress",method = RequestMethod.POST)
    public Object updateAddress(@RequestBody ShippingAddress shippingAddress){
        //System.out.println(shippingAddress);
        boolean flag = this.shippingAddressService.updateAddress(shippingAddress);
        return flag;
    }
}
