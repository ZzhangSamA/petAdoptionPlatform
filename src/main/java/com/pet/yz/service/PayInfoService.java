package com.pet.yz.service;

import com.pet.yz.pojo.PayInfo;

import java.util.List;

public interface PayInfoService {

    /**
     * 新增
     * @param payInfo
     * @return
     */
    Boolean insertSelective(PayInfo payInfo);

}
