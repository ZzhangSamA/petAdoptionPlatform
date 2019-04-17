package com.pet.yz.service;

import com.pet.yz.pojo.PayPlatform;

public interface PayPlatformService {
    /**
     * 根据id查询对象
     * @param platformId
     * @return
     */
    PayPlatform selectByPrimaryKey(Integer platformId);

    /**
     * 根据id删除数据记录
     * @param platformId
     * @return
     */
    Integer deleteByPrimaryKey(Integer platformId);

    /**
     * 根据对象新增数据记录
     * @param payPlatform
     * @return
     */
    Integer insert(PayPlatform payPlatform);

    /**
     * 根据对象非空属性新增数据记录
     * @param payPlatform
     * @return
     */
    Integer insertSelective(PayPlatform payPlatform);

    /**
     * 根据所需修改的对象属性更新数据记录
     * @param payPlatform
     * @return
     */
    Integer updateByPrimaryKeySelective(PayPlatform payPlatform);

    /**
     * 根据对象更新数据记录
     * @param payPlatform
     * @return
     */
    Integer updateByPrimaryKey(PayPlatform payPlatform);
}
