package com.dongruan.service;

import com.dongruan.bean.Food;

import java.util.List;

/**
 * 菜品业务层
 * @author shkstart
 * @create 2020-09-17 15:31
 */
public interface FoodService {

    /**
     * 展示某家商店里面的所有菜品
     * @param businessid 商家id
     * @return 指定商家的菜品集合
     */
    List<Food> showfoodInOneBusiness(Integer businessid);

    /**
     * 修改菜品信息
     * @param food 传入Food的对象
     * @return
     */
    int updataFood(Food food);

    /**
     * 删除指定的菜品信息
     * @param foodid 食品id
     * @return
     */
    int deleteFood(Integer foodid);

    /**
     * 添加一个菜品
     * @param food 传入Food对象
     * @return
     */
    int addFood(Food food);
}
