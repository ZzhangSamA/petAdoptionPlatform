package com.pet.yz.controller;

import com.pet.hpq.pojo.TOrder;
import com.pet.hpq.service.OrderService;
import com.pet.hpq.vo.OrderPayVo;
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
     * @param orderPayVo{
     *                  orderNumber:会员id,
     *                  platformId:支付平台id
     *               }
     * @return
     */
    @RequestMapping(value = "insertSelective",method = RequestMethod.POST)
    public Object insertSelective(@RequestBody(required = false)OrderPayVo orderPayVo) {
        if (orderPayVo == null) {
            return false + "";
        }
        //根据订单编号获取TOrder对象
        TOrder order = orderService.getOrderByOrderNumber(orderPayVo.getOrderNumber());
        System.out.println(order);
        PayInfo payInfo = new PayInfo();
        //设置customerId,orderId
        payInfo.setCustomerId(order.getCustomerId());
        payInfo.setOrderId(order.getOrderId());

        //根据支付平台id随机生成支付流水号
        if (orderPayVo.getPlatformId() == 1) {               //支付宝
            payInfo.setPlatformId(1);
            payInfo.setSerialNumber("zfb" + SerialNumber.getSerialNumber());
        }else if (orderPayVo.getPlatformId() == 2) {         //微信
            payInfo.setPlatformId(2);
            payInfo.setSerialNumber("wx" + SerialNumber.getSerialNumber());
        }

        //获取TOrder对象的totalPrice属性
        BigDecimal totalPrice = order.getTotalPrice();
        //修改payInfo的money属性值为totalPrice值
        payInfo.setMoney(totalPrice);
        //新增支付记录，根据orderId修改order的状态status值及支付时间
        flag = payInfoService.insertSelective(payInfo);
        return flag;
    }
}
