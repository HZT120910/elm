package com.dongruan.controller;

import com.dongruan.bean.Msg;
import com.dongruan.bean.Orders;
import com.dongruan.service.Impl.OrderSreviceImpl;
import com.dongruan.service.Order;
import com.sun.org.apache.xpath.internal.operations.Or;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping()
    public Msg addOrder(Orders orders){
        System.out.println(orders);
        orderSrevice.order(orders);
        return new Msg().success();
    }


    @ApiOperation("获取所有订单")
    @GetMapping("{userid}")
    public Msg getallOrders(@ApiParam("用户id") @PathVariable String userid){
        List<Orders> allOreders = orderSrevice.getAllOreders(userid);
        return Msg.success().add("Orders" , allOreders);
    }


}
