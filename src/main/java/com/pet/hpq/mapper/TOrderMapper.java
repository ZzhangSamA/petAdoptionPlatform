package com.pet.hpq.mapper;

import com.pet.hpq.dto.*;
import com.pet.hpq.pojo.TOrder;
import com.pet.hpq.service.ReturnSale;
import com.pet.hpq.vo.ChangeGoodsStatusVo;
import com.pet.hpq.vo.GoodsOrderVo;
import com.pet.hpq.vo.OrderInfoVo;
import com.pet.hpq.vo.ReturnMessageVo;


import java.util.Date;
import java.util.List;

public interface TOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated
     */
    int insert(TOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated
     */
    int insertSelective(TOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated
     */
    TOrder selectByPrimaryKey(Integer orderId);

    List<TOrderDto> getOrdersByCustomId(OrderInfoVo orderInfoVo);

    int delivery(TOrder tOrder);

    int getOrderCount(int customerId);

    int getStatus(String orderNumber);

    int refuseOrder(TOrder tOrder);

    OrderDetail getOrderDetail(TOrder tOrder);

    TOrder getCreatTime(TOrder tOrder);

    GoodsDto getGoodsInfo(GoodsOrderVo goodsOrderVo);

    GoodsDto getRefuseGoods(GoodsOrderVo goodsOrderVo);

    StatusDto checkStatus(ReturnMessageVo returnMessageVo);

    int setStatus(ChangeGoodsStatusVo changeGoodsStatusVo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TOrder record);
}