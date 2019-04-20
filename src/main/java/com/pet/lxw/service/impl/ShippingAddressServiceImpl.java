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

    public ShippingAddress selectOneAddress(int addressId) {
        return this.shippingAddressMapper.selectOneAddress(addressId);
    }

    public int delAddress(Integer addressId) {
        return this.shippingAddressMapper.delAddress(addressId);
    }

    public boolean addAddress(ShippingAddress shippingAddress) {
        boolean flag = false;
        if (this.shippingAddressMapper.addAddress(shippingAddress)>0){
            return true;
        }
        return false;
    }

    public boolean updateAddress(ShippingAddress shippingAddress) {

        boolean flag = false;
        if (this.shippingAddressMapper.updateAddress(shippingAddress)>0){
            return true;
        }
        return false;
    }

    public boolean defaultAddress(ShippingAddress record) {
        boolean flag = false;
        if (this.shippingAddressMapper.defaultAddress(record)>0){
            return true;
        }
        return false;
    }


}

