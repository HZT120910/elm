package com.dongruan.service.Impl;

import com.dongruan.bean.Orders;
import com.dongruan.dao.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.OrderComparator;
import org.springframework.stereotype.Service;

/**
 * @author: 代伟
 * @create: 2020-09-23 15:07
 */
@Service
public class OrderSreviceImpl {
    @Autowired
    OrdersMapper ordersMapper;

    public void addOrder(Orders orders){
        ordersMapper.insert(orders);
    }
}
