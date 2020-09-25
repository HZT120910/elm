package com.dongruan.bean;

/**
 * @author shkstart
 * @create 2020-09-24 10:57
 */
public class OrderDetailsExt {
    private Integer odId;

    private Integer orderId;

    private Integer foodId;

    private Integer quantity;

    private String userId;

    private String foodImg;

    public OrderDetailsExt() {
    }

    public Integer getOdId() {
        return odId;
    }

    public void setOdId(Integer odId) {
        this.odId = odId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFoodImg() {
        return foodImg;
    }

    public void setFoodImg(String foodImg) {
        this.foodImg = foodImg;
    }

    public OrderDetailsExt(Integer odId, Integer orderId, Integer foodId, Integer quantity, String userId, String foodImg) {
        this.odId = odId;
        this.orderId = orderId;
        this.foodId = foodId;
        this.quantity = quantity;
        this.userId = userId;
        this.foodImg = foodImg;
    }

    @Override
    public String toString() {
        return "OrderDetailsExt{" +
                "odId=" + odId +
                ", orderId=" + orderId +
                ", foodId=" + foodId +
                ", quantity=" + quantity +
                ", userId='" + userId + '\'' +
                ", foodImg='" + foodImg + '\'' +
                '}';
    }
}
