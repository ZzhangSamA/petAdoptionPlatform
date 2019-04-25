package com.pet.yz.service.impl;

import com.pet.yz.mapper.PayInfoMapper;
import com.pet.yz.pojo.PayInfo;
import com.pet.yz.service.PayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayInfoServiceImpl implements PayInfoService {
    @Autowired
    PayInfoMapper payInfoMapper;

    /**
     * 新增
     * @param payInfo
     * @return
     */
    public Boolean insertSelective(PayInfo payInfo) {
        if (payInfoMapper.insertSelective(payInfo) > 0) {
            return true;
        }else {
            return false;
        }
    }
}
