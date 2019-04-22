package com.pet.hpq.service.impl;

import com.pet.hpq.dto.GoodsInfoDto;
import com.pet.hpq.dto.OrderPageDto;
import com.pet.hpq.dto.TOrderDto;
import com.pet.hpq.mapper.TOrderMapper;
import com.pet.hpq.pojo.TOrder;
import com.pet.hpq.service.OrderService;
import com.pet.hpq.vo.OrderInfoVo;
import com.pet.tools.SplitPage;
import com.pet.yh.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired(required = false)
    TOrderMapper tOrderMapper;
    public OrderPageDto getOrders(OrderInfoVo orderInfoVo) {
        List<TOrderDto> orders=null;
        if (orderInfoVo.getCustomer()!=null){
             orders = tOrderMapper.getOrdersByCustomId(orderInfoVo);
        }
        OrderPageDto orderPageDto = new OrderPageDto();
        SplitPage splitPage = orderInfoVo.getSplitPage();
        splitPage.setTotalLine(this.getOrderCount(orderInfoVo.getCustomer().getCustomerId()));
        orderPageDto.setSplitPage(splitPage);
        orderPageDto.setOrderDto(orders);
        return orderPageDto;
    }

    public TOrder getOrderById(int orderId) {
        return tOrderMapper.selectByPrimaryKey(orderId);
    }

    public int getOrderCount(int customerId) {
        return tOrderMapper.getOrderCount(customerId);
    }

    public int delivery(TOrder tOrder) {
        int status = tOrderMapper.getStatus(tOrder.getOrderNumber());
        if (status==3) {
            return tOrderMapper.delivery(tOrder);
        }
        return 0;
    }
}
