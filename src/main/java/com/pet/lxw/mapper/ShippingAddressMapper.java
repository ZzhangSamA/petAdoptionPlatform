package com.pet.lxw.mapper;

import com.pet.lxw.pojo.ShippingAddress;

import java.util.List;

public interface ShippingAddressMapper {

    int delAddress(Integer addressId);

    int addAddress(ShippingAddress shippingAddress);

    int insertSelective(ShippingAddress record);

    List<ShippingAddress> selectFromAddress(int customerId);

    int updateAddress(ShippingAddress record);

    int defaultAddress(ShippingAddress record);

    int updateByPrimaryKey(ShippingAddress record);
}