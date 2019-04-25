package com.pet.hpq.vo;

import java.util.Arrays;

public class ShoppingCarVo {
    private int cartId;
    private int customerId;

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

    @Override
    public String toString() {
        return "ShoppingCarVo{" +
                "cartId=" + cartId +
                ", customerId=" + customerId +
                ", cartMessage=" + Arrays.toString(cartMessage) +
                '}';
    }
}
