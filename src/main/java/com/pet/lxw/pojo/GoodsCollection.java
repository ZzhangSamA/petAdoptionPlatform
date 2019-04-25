package com.pet.lxw.pojo;

/**
 *
 */
public class GoodsCollection {

    private Integer collectionId;


    private Integer goodsId;


    private Integer customerId;


    private Boolean status;


    @Override
    public String toString() {
        return "GoodsCollection{" +
                "collectionId=" + collectionId +
                ", goodsId=" + goodsId +
                ", customerId=" + customerId +
                ", status=" + status +
                '}';
    }

    public Integer getCollectionId() {
        return collectionId;
    }


    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }


    public Integer getGoodsId() {
        return goodsId;
    }


    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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


}