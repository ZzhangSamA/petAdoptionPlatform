package com.pet.lxw.service;

import com.pet.lxw.pojo.ShippingAddress;

import java.util.List;

public interface ShippingAddressService{

    List<ShippingAddress> selectFromAddress(int customerId);

    int delAddress(Integer addressId);

    boolean addAddress(ShippingAddress shippingAddress);

    boolean updateAddress(ShippingAddress shippingAddress);
}
