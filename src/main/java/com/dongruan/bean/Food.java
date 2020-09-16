package com.dongruan.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Food implements Serializable {
    private Integer foodid;

    private String foodname;

    private String foodexplain;

    private BigDecimal foodprice;

    private Integer businessid;

    private String remarks;

    private String foodimg;

    private static final long serialVersionUID = 1L;

    public Integer getFoodid() {
        return foodid;
    }

    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFoodexplain() {
        return foodexplain;
    }

    public void setFoodexplain(String foodexplain) {
        this.foodexplain = foodexplain;
    }

    public BigDecimal getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(BigDecimal foodprice) {
        this.foodprice = foodprice;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFoodimg() {
        return foodimg;
    }

    public void setFoodimg(String foodimg) {
        this.foodimg = foodimg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", foodid=").append(foodid);
        sb.append(", foodname=").append(foodname);
        sb.append(", foodexplain=").append(foodexplain);
        sb.append(", foodprice=").append(foodprice);
        sb.append(", businessid=").append(businessid);
        sb.append(", remarks=").append(remarks);
        sb.append(", foodimg=").append(foodimg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}