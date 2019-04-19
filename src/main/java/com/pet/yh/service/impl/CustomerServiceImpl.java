package com.pet.yh.service.impl;

import com.pet.yh.mapper.CustomerMapper;
import com.pet.yh.pojo.Customer;
import com.pet.yh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired(required = false)
    CustomerMapper customerMapper;
    public boolean loginCheck(Customer customer) {
        if(customerMapper.loginCheck(customer)!=null){
            return true;
        }
        return false;
    }
}
