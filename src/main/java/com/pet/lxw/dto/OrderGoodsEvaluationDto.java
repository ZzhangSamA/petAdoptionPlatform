package com.pet.lxw.dto;

import java.util.Date;
import java.util.List;

public class OrderGoodsEvaluationDto {

    private Integer evaluationId;
    private Integer ogId;
    private Integer customerId;
    private Integer goodsId;
    private String evaluationContent;
    private String createTime;
    private Boolean status;
    private Integer fatherId;
    private Integer userId;
    private Boolean type;

    List<CustomerDto> customer;


    @Override
    public String toString() {
        return "OrderGoodsEvaluationDto{" +
                "evaluationId=" + evaluationId +
                ", ogId=" + ogId +
                ", customerId=" + customerId +
                ", goodsId=" + goodsId +
                ", evaluationContent='" + evaluationContent + '\'' +
                ", createTime=" + createTime +
                ", status=" + status +
                ", fatherId=" + fatherId +
                ", userId=" + userId +
                ", type=" + type +
                ", customer=" + customer +
                '}';
    }

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getOgId() {
        return ogId;
    }

    public void setOgId(Integer ogId) {
        this.ogId = ogId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getEvaluationContent() {
        return evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public List<CustomerDto> getCustomer() {
        return customer;
    }

    public void setCustomer(List<CustomerDto> customer) {
        this.customer = customer;
    }
}
