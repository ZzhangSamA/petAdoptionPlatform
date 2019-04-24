package com.pet.hpq.service;

import com.pet.hpq.dto.ReturnDetailDto;
import com.pet.hpq.vo.ReturnMessageVo;

public interface ReturnSale {
    int addReturnSale(ReturnMessageVo returnMessageVo);

    ReturnDetailDto getReturnDetail(ReturnMessageVo returnMessageVo);

    int againRefuse(ReturnMessageVo returnMessageVo);
}
