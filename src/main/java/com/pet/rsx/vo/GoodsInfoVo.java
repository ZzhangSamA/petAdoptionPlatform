package com.pet.rsx.vo;

import com.pet.rsx.pojo.GoodsType;
import com.pet.rsx.tools.SplitePageBean;

public class GoodsInfoVo {
    private Integer goodsTypeId;
    private String search;
    private Integer brandId;
    private Integer goodsId;
    private SplitePageBean splitePageBean;
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }



    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public SplitePageBean getSplitePageBean() {
        return splitePageBean;
    }

    public void setSplitePageBean(SplitePageBean splitePageBean) {
        this.splitePageBean = splitePageBean;
    }

    @Override
    public String toString() {
        return "GoodsInfoVo{" +
                "goodsTypeId=" + goodsTypeId +
                ", search='" + search + '\'' +
                ", brandId=" + brandId +
                ", goodsId=" + goodsId +
                ", splitePageBean=" + splitePageBean +
                '}';
    }
}
