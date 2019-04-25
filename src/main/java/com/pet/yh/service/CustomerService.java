package com.pet.yh.service;

import com.pet.yh.pojo.Customer;
import com.pet.yh.vo.CustomerVo;

import java.util.List;

public interface CustomerService {
    /**
     * 登陆校验
     * @param customer
     * @return
     */
    Customer loginCheck(Customer customer);

    /**
     * 注册
     * @param customer
     * @return
     */
    boolean register(Customer customer);

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
    boolean updateCustomer(Customer customer);
}
