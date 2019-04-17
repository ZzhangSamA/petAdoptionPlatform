package com.pet.lxw.controller;

import com.pet.lxw.pojo.ShippingAddress;
import com.pet.lxw.service.ShippingAddressService;
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
}
