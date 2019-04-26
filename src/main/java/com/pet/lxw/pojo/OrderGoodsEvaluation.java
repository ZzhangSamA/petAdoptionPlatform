package com.pet.lxw.pojo;

import java.util.Date;

public class OrderGoodsEvaluation {

    private Integer evaluationId;
    private Integer ogId;
    private Integer customerId;
    private Integer goodsId;
    private String evaluationContent;
    private Date createTime;
    private Boolean status;
    private Integer fatherId;
    private Integer userId;
    private Boolean type;

    @Override
    public String toString() {
        return "OrderGoodsEvaluation{" +
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
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
}