package com.pet.lxw.dto;

import com.pet.rsx.pojo.GoodsParameter;

import java.math.BigDecimal;
import java.util.List;

public class GoodsCollectionDto {

    private Integer collectionId;
    private Integer id;
    private Integer customerId;
    private Boolean status;
    List<GoodsImageDto> goods_img;
    List<GoodsNameDto> goods_info;



    @Override
    public String toString() {
        return "GoodsCollectionDto{" +
                "collectionId="+collectionId+
                ", goods_img=" + goods_img +
                ", goods_info=" + goods_info +

                '}';
    }

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<GoodsImageDto> getGoods_img() {
        return goods_img;
    }

    public void setGoods_img(List<GoodsImageDto> goods_img) {
        this.goods_img = goods_img;
    }

    public List<GoodsNameDto> getGoods_info() {
        return goods_info;
    }

    public void setGoods_info(List<GoodsNameDto> goods_info) {
        this.goods_info = goods_info;
    }

}
