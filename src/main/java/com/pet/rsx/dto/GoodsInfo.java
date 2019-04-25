package com.pet.rsx.dto;

import com.pet.rsx.pojo.GoodsParameter;

import java.math.BigDecimal;
import java.util.List;

public class GoodsInfo {
    private Integer goodsId;
    private Integer brandId;
    private Integer goodsTypeId;
    private String goodsName;
    private String goodsTitle;
    private String goodsDetails;
    private String goodsImage;
    private String goodsTypeName;
    private BigDecimal showPrice;
    private List<GoodsParameter> goodsParameters;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public String getGoodsDetails() {
        return goodsDetails;
    }

    public void setGoodsDetails(String goodsDetails) {
        this.goodsDetails = goodsDetails;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public BigDecimal getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(BigDecimal showPrice) {
        this.showPrice = showPrice;
    }

    public List<GoodsParameter> getGoodsParameters() {
        return goodsParameters;
    }
    public void setGoodsParameters(List<GoodsParameter> goodsParameters) {
        this.goodsParameters = goodsParameters;

    }

    @Override
    public String toString() {
        return "GoodsInfoDto{" +
                "goodsId=" + goodsId +
                ", brandId=" + brandId +
                ", goodsTypeId=" + goodsTypeId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsTitle='" + goodsTitle + '\'' +
                ", goodsDetails='" + goodsDetails + '\'' +
                ", goodsImage='" + goodsImage + '\'' +
                ", goodsTypeName='" + goodsTypeName + '\'' +
                ", showPrice=" + showPrice +
                ", goodsParameters=" + goodsParameters +
                '}';
    }
}
