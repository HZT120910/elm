package com.dongruan.service.Impl;

import com.dongruan.bean.Food;
import com.dongruan.bean.FoodExample;
import com.dongruan.dao.FoodMapper;
import com.dongruan.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 代伟
 * @create: 2020-09-23 14:01
 */
@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    FoodMapper foodMapper;

    @Override
    public List<Food> showfoodInOneBusiness(Integer businessid) {
        return foodMapper.findFoodsByBusinessId(businessid);
    }

    @Override
    public int updataFood(Food food) {
        foodMapper.updateByPrimaryKey(food);
        return 0;
    }

    @Override
    public int deleteFood(Integer foodid) {
        foodMapper.deleteByPrimaryKey(foodid);
        return 0;
    }

    @Override
    public int addFood(Food food) {
        foodMapper.insert(food);
        return 0;
    }
}
