package com.dongruan.controller;

import com.dongruan.bean.Msg;
import com.dongruan.bean.Orders;
import com.dongruan.service.Impl.OrderSreviceImpl;
import com.dongruan.service.Order;
import com.sun.org.apache.xpath.internal.operations.Or;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2020-09-21 9:08
 */
@Api(tags="Order相关控制类")
@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    OrderSreviceImpl orderSrevice;

    @ApiOperation("生成订单")
    @PostMapping()
    public Msg addOrder(Orders orders){
        orderSrevice.addOrder(orders);
        return new Msg().success();
    }
}
