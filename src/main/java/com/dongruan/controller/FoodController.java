package com.dongruan.controller;

import com.dongruan.bean.Food;
import com.dongruan.bean.Msg;
import com.dongruan.service.Impl.FoodServiceImpl;
import com.dongruan.util.BaseUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @author shkstart
 * @create 2020-09-21 9:08
 */
@Api(tags="Food相关控制类")
@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    FoodServiceImpl foodService;

    @ApiOperation("根据businessId查询所有的食物")
    @GetMapping("/{businessId}")
    public Msg findFoodsByBusinessId(@ApiParam("商家ID") @PathVariable("businessId") Integer businessId){
        List<Food> foods = foodService.showfoodInOneBusiness(businessId);
        System.out.println(foods);
        return new Msg().success().add("foods", foods);
    }

    @ApiOperation("添加食物")
    @PostMapping()
    public Msg addFood(@ApiParam("Food对象") Food food, @ApiParam("食物图片") MultipartFile multipartFile) throws IOException {
        String uuid = UUID.randomUUID().toString();
        multipartFile.transferTo(new File("E:\\图片资源\\"+uuid));
        String base64String = BaseUtils.getBase64String(new File("E:\\图片资源\\"+uuid));
        food.setFoodimg(base64String);
        foodService.addFood(food);
        return new Msg().success();
    }

    @ApiOperation("删除食物")
    @DeleteMapping()
    public Msg deleteFood(@ApiParam("食物Id") Integer foodId){
        foodService.deleteFood(foodId);
        return new Msg().success();
    }

}
