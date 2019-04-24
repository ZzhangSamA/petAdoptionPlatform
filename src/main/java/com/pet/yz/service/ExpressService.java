package com.pet.yz.service;

import com.pet.yz.vo.ExpressVo;

import java.io.UnsupportedEncodingException;

public interface ExpressService {
    String getExpressInformation(ExpressVo expressVo) throws Exception;
}
