package com.pet.lxw.service.impl;

import com.pet.lxw.dto.TOrderDto;
import com.pet.lxw.mapper.TOrderMapperLu;
import com.pet.lxw.service.TOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TOrderServiceImpl implements TOrderService {

    @Autowired(required = false)
    TOrderMapperLu tOrderMapper;

    public List<TOrderDto> selectFromTOrder(String orderNumber) {
        return this.tOrderMapper.selectFromTOrder(orderNumber);
    }
}
