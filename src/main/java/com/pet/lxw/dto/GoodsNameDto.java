package com.pet.lxw.dto;

public class GoodsNameDto {
    private Integer goodsId;
    private String goodsName;
    private String showPrice;



    @Override
    public String toString() {
        return "GoodsNameDto{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", showPrice='" + showPrice + '\'' +
                '}';
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(String showPrice) {
        this.showPrice = showPrice;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}
