package com.pet.hpq.mapper;

import com.pet.hpq.pojo.OrderGoods;

public interface OrderGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer ogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbggenerated
     */
    int insert(OrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbggenerated
     */
    int insertSelective(OrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbggenerated
     */
    OrderGoods selectByPrimaryKey(Integer ogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OrderGoods record);
}