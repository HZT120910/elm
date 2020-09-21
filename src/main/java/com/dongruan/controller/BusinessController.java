package com.dongruan.controller;

import com.dongruan.bean.Business;
import com.dongruan.dao.BusinessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author shkstart
 * @create 2020-09-16 14:35
 */
@RestController
@RequestMapping("business")
public class BusinessController {
    @Autowired
    private BusinessMapper businessMapper;

    @GetMapping("getbusiness")
    public Business test(){
        Business business = businessMapper.selectByPrimaryKey(10001);
        System.out.println(business);
        return business;
    }


    @GetMapping("/test")
    public String ttt(){
        return "ok";
    }
}
