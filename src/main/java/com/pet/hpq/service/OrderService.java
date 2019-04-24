package com.pet.hpq.service;

import com.pet.hpq.dto.GoodsDto;
import com.pet.hpq.dto.OrderDetail;
import com.pet.hpq.dto.OrderPageDto;
import com.pet.hpq.pojo.TOrder;
import com.pet.hpq.vo.GoodsOrderVo;
import com.pet.hpq.vo.OrderInfoVo;
import com.pet.hpq.vo.ReturnMessageVo;


public interface OrderService {
    OrderPageDto getOrders(OrderInfoVo orderInfoVo);
    TOrder getOrderById(int orderId);
    int getOrderCount(int CustomerId);
    int delivery(TOrder tOrder);
    int refuseOrder(TOrder tOrder);
    OrderDetail getOrderDetail(TOrder tOrder);
    int checkedDeliver(TOrder tOrder);
    GoodsDto getGoodsInfo(GoodsOrderVo goodsOrderVo);
    GoodsDto getRefuseGoods(GoodsOrderVo goodsOrderVo);
    int setStatus(ReturnMessageVo returnMessageVo);
}
