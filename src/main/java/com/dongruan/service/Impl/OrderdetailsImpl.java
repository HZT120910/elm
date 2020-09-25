package com.dongruan.service.Impl;

import com.dongruan.bean.OrderDetailsExt;
import com.dongruan.bean.Orderdetailet;
import com.dongruan.dao.OrderdetailetMapper;
import com.dongruan.service.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-24 10:49
 */
@Service
public class OrderdetailsImpl implements OrderDetails {
    @Autowired
    OrderdetailetMapper orderdetailetMapper;
    @Override
    public List<OrderDetailsExt> getonesOrderdetailet(Integer oderid, String userid) {
        List<OrderDetailsExt> orderDetailsExt = orderdetailetMapper.getOrderDetailsExt(oderid,userid);
        return orderDetailsExt;
    }
}
