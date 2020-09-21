package com.dongruan.service;

import com.dongruan.bean.Business;
import com.dongruan.bean.Food;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商家业务层
 * @author shkstart
 * @create 2020-09-17 10:46
 */

public interface BusinessServise {

    /**
     * 展示所有商家
     * @return 商家实体的list集合
     */
    List<Business> showAllBusniess();


    /**
     * 展示某个分类里面的商家
     * 列如：汉堡套餐   拌饭套餐。。。。
     * @param businessExplain
     * @return
     */
    List<Business> showBusinessbyBusinessExplain(String businessExplain);

    /**
     * 修改商家信息
     * @param business 传入Business的对象
     * @return
     */
    int updataBusiness(Business business);

    /**
     * 删除指定的商家信息
     * @param businessid 商家id
     * @return
     */
    int deleteBusiness(Integer businessid);

    /**
     * 添加一个商家
     * @param business 传入Business对象
     * @return
     */
    int addBusiness(Business business);

    /**
     * id查询商家
     * @param businessid
     * @return
     */
    Business getBusinessById(Integer businessid);




}
