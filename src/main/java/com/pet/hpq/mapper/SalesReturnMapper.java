package com.pet.hpq.mapper;

import com.pet.hpq.dto.ReturnDetailDto;
import com.pet.hpq.pojo.SalesReturn;
import com.pet.hpq.vo.ReturnMessageVo;

public interface SalesReturnMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_return
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer returnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_return
     *
     * @mbggenerated
     */
    int insert(SalesReturn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_return
     *
     * @mbggenerated
     */
    int insertSelective(ReturnMessageVo returnMessageVo);


    ReturnDetailDto getReturnDetail(ReturnMessageVo returnMessageVo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_return
     *
     * @mbggenerated
     */
    SalesReturn selectByPrimaryKey(Integer returnId);


    int checkCount(ReturnMessageVo returnMessageVo);

   int checkStatus(ReturnMessageVo returnMessageVo);

   int changeStatus(ReturnMessageVo returnMessageVo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_return
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SalesReturn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_return
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SalesReturn record);
}