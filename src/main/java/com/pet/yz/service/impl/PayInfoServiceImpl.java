package com.pet.yz.service.impl;

import com.pet.hpq.mapper.TOrderMapper;
import com.pet.hpq.vo.PaymentVo;
import com.pet.yz.mapper.PayInfoMapper;
import com.pet.yz.pojo.PayInfo;
import com.pet.yz.service.PayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class PayInfoServiceImpl implements PayInfoService {
    @Autowired
    PayInfoMapper payInfoMapper;

    @Autowired
    TOrderMapper tOrderMapper;

    /**
     * 新增支付记录，并修改订单状态为：待发货
     * @param payInfo
     * @return
     */
    @Transactional
    public Boolean insertSelective(PayInfo payInfo) {
        PaymentVo paymentVo = new PaymentVo();
        paymentVo.setOrderId(payInfo.getOrderId());
        Date date = new Date();
        paymentVo.setPaymentTime(date);
        Integer x = payInfoMapper.insertSelective(payInfo);
        Integer y = tOrderMapper.updateByPayInfo(paymentVo);
        if (x > 0 && y > 0) {
            return true;
        }else {
            return false;
        }
    }
}
