package com.pet.lxw.mapper;

import com.pet.lxw.dto.TOrderDto;


import java.util.List;

public interface TOrderMapperLu {
    List<TOrderDto> selectFromTOrder(String orderNumber);
}
