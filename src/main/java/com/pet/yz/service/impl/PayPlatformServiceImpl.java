package com.pet.yz.service.impl;

import com.pet.yz.mapper.PayPlatformMapper;
import com.pet.yz.pojo.PayPlatform;
import com.pet.yz.service.PayPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayPlatformServiceImpl implements PayPlatformService {

    @Autowired(required = false)
    PayPlatformMapper payPlatformMapper;

    public PayPlatform selectByPrimaryKey(Integer platformId) {
        return payPlatformMapper.selectByPrimaryKey(platformId);
    }

    public Integer deleteByPrimaryKey(Integer platformId) {
        return payPlatformMapper.deleteByPrimaryKey(platformId);
    }

    public Integer insert(PayPlatform payPlatform) {
        return payPlatformMapper.insert(payPlatform);
    }

    public Integer insertSelective(PayPlatform payPlatform) {
        return payPlatformMapper.insertSelective(payPlatform);
    }

    public Integer updateByPrimaryKeySelective(PayPlatform payPlatform) {
        return payPlatformMapper.updateByPrimaryKeySelective(payPlatform);
    }

    public Integer updateByPrimaryKey(PayPlatform payPlatform) {
        return payPlatformMapper.updateByPrimaryKey(payPlatform);
    }
}
