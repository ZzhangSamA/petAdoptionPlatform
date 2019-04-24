package com.pet.lxw.dto;

public class GoodsImageDto {
    private String goodsImage;

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    @Override
    public String toString() {
        return "GoodsImageDto{" +
                "goodsImage='" + goodsImage + '\'' +
                '}';
    }
}
