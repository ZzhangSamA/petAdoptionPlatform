package com.pet.lxw.dto;

import java.util.Date;
import java.util.List;

public class TOrderDto {

    private Integer orderId;
    private Integer customerId;
    private Integer addressId;
    private String orderNumber;
    private Integer status;
    private Date createTime;
    private Date updateTime;
    private Date paymentTime;
    private Date consignTime;
    private Integer payId;
    private String shippingNumber;
    private String orderRemarks;

    private Integer id;

    List<GoodsImageDto> goods_img;
    List<GoodsNameDto> goods_info;
    List<OrderGoodsDto> order_goods;
    List<CustomerDto> customer;
    @Override
    public String toString() {
        return "TOrderDto{" +
                "status"+status+
                "customer"+customer+
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", orderNumber='" + orderNumber + '\'' +
                ", createTime=" + createTime +
                ", goods_img=" + goods_img +
                ", goods_info=" + goods_info +
                ", order_goods=" + order_goods +
                '}';
    }

    public List<CustomerDto> getCustomer() {
        return customer;
    }

    public void setCustomer(List<CustomerDto> customer) {
        this.customer = customer;
    }

    public List<OrderGoodsDto> getOrder_goods() {
        return order_goods;
    }

    public void setOrder_goods(List<OrderGoodsDto> order_goods) {
        this.order_goods = order_goods;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public String getShippingNumber() {
        return shippingNumber;
    }

    public void setShippingNumber(String shippingNumber) {
        this.shippingNumber = shippingNumber;
    }

    public String getOrderRemarks() {
        return orderRemarks;
    }

    public void setOrderRemarks(String orderRemarks) {
        this.orderRemarks = orderRemarks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
