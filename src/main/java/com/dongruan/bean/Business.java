package com.dongruan.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Business implements Serializable {
    private Integer businessid;

    private String businessname;

    private String businessaddress;

    private String businessexplain;

    private BigDecimal starprice;

    private BigDecimal deliveryprice;

    private String remarks;

    private String businessimg;

    private static final long serialVersionUID = 1L;

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public String getBusinessaddress() {
        return businessaddress;
    }

    public void setBusinessaddress(String businessaddress) {
        this.businessaddress = businessaddress;
    }

    public String getBusinessexplain() {
        return businessexplain;
    }

    public void setBusinessexplain(String businessexplain) {
        this.businessexplain = businessexplain;
    }

    public BigDecimal getStarprice() {
        return starprice;
    }

    public void setStarprice(BigDecimal starprice) {
        this.starprice = starprice;
    }

    public BigDecimal getDeliveryprice() {
        return deliveryprice;
    }

    public void setDeliveryprice(BigDecimal deliveryprice) {
        this.deliveryprice = deliveryprice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getBusinessimg() {
        return businessimg;
    }

    public void setBusinessimg(String businessimg) {
        this.businessimg = businessimg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", businessid=").append(businessid);
        sb.append(", businessname=").append(businessname);
        sb.append(", businessaddress=").append(businessaddress);
        sb.append(", businessexplain=").append(businessexplain);
        sb.append(", starprice=").append(starprice);
        sb.append(", deliveryprice=").append(deliveryprice);
        sb.append(", remarks=").append(remarks);
        sb.append(", businessimg=").append(businessimg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}