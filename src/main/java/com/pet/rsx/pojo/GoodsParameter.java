package com.pet.rsx.pojo;

import java.math.BigDecimal;

public class GoodsParameter {
    private Integer parameterId;

    private Integer goodsId;

    private String parameterName;

    private String parameterIcon;

    private BigDecimal parameterPrice;

    private Integer stock;

    private BigDecimal preferentialPrice;

    private Boolean status;

    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName == null ? null : parameterName.trim();
    }

    public String getParameterIcon() {
        return parameterIcon;
    }

    public void setParameterIcon(String parameterIcon) {
        this.parameterIcon = parameterIcon == null ? null : parameterIcon.trim();
    }

    public BigDecimal getParameterPrice() {
        return parameterPrice;
    }

    public void setParameterPrice(BigDecimal parameterPrice) {
        this.parameterPrice = parameterPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setPreferentialPrice(BigDecimal preferentialPrice) {
        this.preferentialPrice = preferentialPrice;
    }

    public BigDecimal getPreferentialPrice() {
        return preferentialPrice;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}