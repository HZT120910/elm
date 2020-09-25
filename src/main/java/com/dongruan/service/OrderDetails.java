package com.dongruan.service;

import com.dongruan.bean.OrderDetailsExt;
import com.dongruan.bean.Orderdetailet;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-24 10:46
 */
public interface OrderDetails {

    //获取指定用户的指定订单详情
    public List<OrderDetailsExt> getonesOrderdetailet(Integer oderid, String userid);
}
