package com.pet.lxw.mapper;

import com.pet.lxw.dto.TOrderDto;
import com.pet.lxw.pojo.ShippingAddress;
import com.pet.lxw.pojo.TOrder;


import java.util.List;

public interface TOrderMapperLu {
    List<TOrderDto> selectFromTOrder(String orderNumber);

    int updateStatus(TOrder record);
}
