package com.pet.lxw.dto;

public class OrderGoodsDto {
    private Integer ogId;
    private Integer goodsId;

    @Override
    public String toString() {
        return "OrderGoodsDto{" +
                "ogId=" + ogId +
                ", goodsId=" + goodsId +
                '}';
    }

    public Integer getOgId() {
        return ogId;
    }

    public void setOgId(Integer ogId) {
        this.ogId = ogId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}
