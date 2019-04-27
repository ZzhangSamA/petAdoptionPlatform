package com.pet.hpq.vo;

import java.math.BigDecimal;
import java.util.Arrays;

public class ShoppingCarVo {
    private int cartId;
    private int customerId;
    private int parameterId;
    private int orderId;
    private int number;
    private int goodsId;
    private int addressId;
    private int status;
    private BigDecimal price;
    private BigDecimal totalPrice;
    private String[] cartMessage;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String[] getCartMessage() {
        return cartMessage;
    }

    public void setCartMessage(String[] cartMessage) {
        this.cartMessage = cartMessage;
    }

    public int getParameterId() {
        return parameterId;
    }

    public void setParameterId(int parameterId) {
        this.parameterId = parameterId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ShoppingCarVo{" +
                "cartId=" + cartId +
                ", customerId=" + customerId +
                ", parameterId=" + parameterId +
                ", orderId=" + orderId +
                ", number=" + number +
                ", goodsId=" + goodsId +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                ", cartMessage=" + Arrays.toString(cartMessage) +
                '}';
    }
}
