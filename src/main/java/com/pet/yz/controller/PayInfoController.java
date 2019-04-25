package com.pet.yz.controller;

import com.pet.hpq.pojo.TOrder;
import com.pet.hpq.service.OrderService;
import com.pet.tools.SerialNumber;
import com.pet.yxy.pojo.Page;
import com.pet.yz.pojo.PayInfo;
import com.pet.yz.service.PayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class PayInfoController {
    Boolean flag;
    @Autowired
    PayInfoService payInfoService;

    @Autowired
    OrderService orderService;

    /**
     * 新增支付记录
     * @param payInfo{
     *                  customerId:会员id,
     *                  orderId:订单id,
     *                  platformId:支付平台id
     *               }
     * @return
     */
    @RequestMapping(value = "insertSelective",method = RequestMethod.POST)
    public Object insertSelective(@RequestBody(required = false)PayInfo payInfo) {
        if (payInfo == null) {
            return false + "";
        }

        //根据支付平台id随机生成支付流水号
        if (payInfo.getPlatformId() == 1) {               //支付宝
            payInfo.setSerialNumber("zfb" + SerialNumber.getSerialNumber());
        }else if (payInfo.getPlatformId() == 2) {         //微信
            payInfo.setSerialNumber("wx" + SerialNumber.getSerialNumber());
        }
        //根据orderId获取TOrder对象
        TOrder order = orderService.selectByPrimaryKey(payInfo.getOrderId());
        //获取TOrder对象的totalPrice属性
        BigDecimal totalPrice = order.getTotalPrice();
        //修改payInfo的money属性值为totalPrice值
        payInfo.setMoney(totalPrice);
        //新增支付记录，根据orderId修改order的状态status值
        flag = payInfoService.insertSelective(payInfo);
        return flag;
    }
}
