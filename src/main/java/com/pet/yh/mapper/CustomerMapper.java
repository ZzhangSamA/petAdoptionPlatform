package com.pet.yh.mapper;

import com.pet.yh.pojo.Customer;
import com.pet.yh.vo.CustomerVo;

import java.util.List;

public interface CustomerMapper {
    /**
     * 登录验证
     * @param customer
     * @return
     */
    Customer loginCheck(Customer customer);

    /**
     * 注册
     * @param customer
     * @return
     */
    int register(Customer customer);

    /**
     * 注册时重名校验
     * @param customerVo
     * @return
     */
    int registerCustomerCheck(CustomerVo customerVo);

    /**
     * 忘记密码
     * @param customerVo
     * @return
     */
    Integer ForgotPassword(CustomerVo customerVo);

    /**
     * 修改前信息回显
     * @param customerId
     * @return
     */
    Customer getCustomerInfo(Integer customerId);

    /**
     * 修改
     * @param customer
     * @return
     */
    Integer updateCustomer(Customer customer);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer customerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated
     */
    int insert(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated
     */
    int insertSelective(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated
     */
    Customer selectByPrimaryKey(Integer customerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Customer record);
}