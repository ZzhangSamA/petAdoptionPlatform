package com.pet.hpq.mapper;

import com.pet.hpq.dto.*;
import com.pet.hpq.pojo.TOrder;
import com.pet.hpq.service.ReturnSale;
import com.pet.hpq.vo.*;


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
     * 根据支付结果，修改订单状态为：待发货
     * @param paymentVo
     * @return
     */
    Integer updateByPayInfo(PaymentVo paymentVo);

    /**
     * 根据订单编号获取TOrder对象
     * @param orderNumber
     * @return
     */
    TOrder getOrderByOrderNumber(String orderNumber);
}