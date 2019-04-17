package com.pet.lxw.service.impl;

import com.pet.lxw.mapper.ShippingAddressMapper;
import com.pet.lxw.pojo.ShippingAddress;
import com.pet.lxw.service.ShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingAddressServiceImpl implements ShippingAddressService{

    @Autowired(required = false)
    ShippingAddressMapper shippingAddressMapper;

    public List<ShippingAddress> selectFromAddress(int customerId) {
        return this.shippingAddressMapper.selectFromAddress(customerId);
    }
}

