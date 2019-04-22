package com.pet.lxw.mapper;

import com.pet.lxw.pojo.ShippingAddress;

import java.util.List;

public interface ShippingAddressMapper {

    //伪删
    int delAddress(Integer addressId);

    //增加
    int addAddress(ShippingAddress shippingAddress);

    int insertSelective(ShippingAddress record);

    //全查
    List<ShippingAddress> selectFromAddress(int customerId);

    //单查
    ShippingAddress selectOneAddress(int addressId);

    //更改
    int updateAddress(ShippingAddress record);

    //默认
    int defaultAddress(ShippingAddress record);

    int updateByPrimaryKey(ShippingAddress record);
}