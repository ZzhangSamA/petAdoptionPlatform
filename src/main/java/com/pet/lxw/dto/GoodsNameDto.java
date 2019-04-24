package com.pet.lxw.dto;

public class GoodsNameDto {
    private String goodsName;
    private String showPrice;

    @Override
    public String toString() {
        return "GoodsNameDto{" +
                "goodsName='" + goodsName + '\'' +
                ", showPrice='" + showPrice + '\'' +
                '}';
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
