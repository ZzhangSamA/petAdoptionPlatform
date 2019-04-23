package com.pet.rsx.dto;

import com.pet.rsx.tools.SplitePageBean;

import java.util.List;

public class GoodsInfoDto {
    private List<GoodsInfo> goodsInfos;
    private SplitePageBean splitePageBean;

    public List<GoodsInfo> getGoodsInfos() {
        return goodsInfos;
    }

    public void setGoodsInfos(List<GoodsInfo> goodsInfos) {
        this.goodsInfos = goodsInfos;
    }

    public SplitePageBean getSplitePageBean() {
        return splitePageBean;
    }

    public void setSplitePageBean(SplitePageBean splitePageBean) {
        this.splitePageBean = splitePageBean;
    }

    @Override
    public String toString() {
        return "GoodsInfoDto{" +
                "goodsInfos=" + goodsInfos +
                ", splitePageBean=" + splitePageBean +
                '}';
    }
}
