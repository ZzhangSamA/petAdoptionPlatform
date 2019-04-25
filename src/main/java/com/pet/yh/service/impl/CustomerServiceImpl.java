package com.pet.yh.service.impl;

import com.pet.yh.mapper.CustomerMapper;
import com.pet.yh.pojo.Customer;
import com.pet.yh.service.CustomerService;
import com.pet.yh.vo.CustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired(required = false)
    CustomerMapper customerMapper;

    /**
     * 登录校验
     * @param customer
     * @return
     */
    public Customer loginCheck(Customer customer) {

        return customerMapper.loginCheck(customer);
    }

    /**
     * 注册
     * @param customer
     * @return
     */
    public boolean register(Customer customer) {
        int register = this.customerMapper.register(customer);

        if(register>0){
            return true;
        }
        return false;
    }

    /**
     * 注册重名校验
     * @param customerVo
     * @return
     */
    public int registerCustomerCheck(CustomerVo customerVo) {
        if(customerVo.getCustomerName()!=null&&customerVo.getCustomerName().contains("@")){
            customerVo.setEmail(customerVo.getCustomerName());
        }
        return this.customerMapper.registerCustomerCheck(customerVo);
    }

    /**
     * 忘记密码
     * @param customerVo
     * @return
     */
    public Integer ForgotPassword(CustomerVo customerVo) {
//        System.out.println(customerVo.getEmail());
//        System.out.println(customerVo.getPassword());
        return this.customerMapper.ForgotPassword(customerVo);
    }

    /**
     * 修改前信息回显
     * @param customerId
     * @return
     */
    public Customer getCustomerInfo(Integer customerId) {
//        System.out.println(customerId);
        return this.customerMapper.getCustomerInfo(customerId);

    }

    /**
     * 修改
     * @param customer
     * @return
     */
    public boolean updateCustomer(Customer customer) {
        boolean flag=false;
        if(this.customerMapper.updateCustomer(customer)>0){
            flag=true;
        }
        return flag;
    }
}
