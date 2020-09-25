package com.dongruan.service;

import com.dongruan.bean.Orders;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-17 15:46
 */
public interface Order {

    /**
     * 下单
     * @param orders 订单实体
     * @return
     */
    int order(Orders orders);


    public List<Orders> getAllOreders(String userid);
}
