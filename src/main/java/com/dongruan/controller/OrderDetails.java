package com.dongruan.controller;

import com.dongruan.bean.Msg;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2020-09-24 11:41
 */
@Api(tags="Orderdetail相关控制类")
@RestController
@RequestMapping("/orderdetail")
public class OrderDetails {

    @Autowired
    OrderDetails orderDetails;

    @ApiOperation("获取订单详情")
    @GetMapping("{orderid}/{userid}")
    public Msg getonesOrderdetails(@ApiParam("订单号") @PathVariable("orderid") Integer orderid, @ApiParam("用户名")@PathVariable("userid") String userid){
        return Msg.success().add("orderdetails",orderDetails.getonesOrderdetails(orderid, userid));

    }
}
