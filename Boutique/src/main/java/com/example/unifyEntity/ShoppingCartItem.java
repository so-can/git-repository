package com.example.unifyEntity;

import java.math.BigDecimal;
import java.util.Date;

public class ShoppingCartItem {
    private int shoppingCartItemId;
    private int productId;
    private int shoppingCartId;
    private int productSpecificationId;
    private long number;
    private Date enterTime;
    private int state;   //1：有货  0：无货
    private BigDecimal finalPrice;
    private BigDecimal totalPrice;

    public int getShoppingCartItemId() {
        return shoppingCartItemId;
    }

    public void setShoppingCartItemId(int shoppingCartItemId) {
        this.shoppingCartItemId = shoppingCartItemId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(int shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    public int getProductSpecificationId() {
        return productSpecificationId;
    }

    public void setProductSpecificationId(int productSpecificationId) {
        this.productSpecificationId = productSpecificationId;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public BigDecimal getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(BigDecimal finalPrice) {
        this.finalPrice = finalPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "ShoppingCartItem{" +
                "shoppingCartItemId=" + shoppingCartItemId +
                ", productId=" + productId +
                ", shoppingCartId=" + shoppingCartId +
                ", productSpecificationId=" + productSpecificationId +
                ", number=" + number +
                ", enterTime=" + enterTime +
                ", state=" + state +
                ", finalPrice=" + finalPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
