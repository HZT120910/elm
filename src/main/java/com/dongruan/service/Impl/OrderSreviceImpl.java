package com.dongruan.service.Impl;

import com.dongruan.bean.Orders;
import com.dongruan.bean.OrdersExample;
import com.dongruan.dao.OrdersMapper;
import com.dongruan.service.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 代伟
 * @create: 2020-09-23 15:07
 */
@Service
public class OrderSreviceImpl implements Order{
    @Autowired
    OrdersMapper ordersMapper;



    @Override
    public int order(Orders orders) {
        return ordersMapper.insert(orders);
    }

    @Override
    public List<Orders> getAllOreders(String userid) {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        return ordersMapper.selectByExample(ordersExample);
    }
}
