package com.dongruan.controller;

import com.dongruan.bean.Msg;
import com.dongruan.bean.User;
import com.dongruan.service.Impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author shkstart
 * @create 2020-09-21 9:09
 */
@Api(tags="User相关控制类")
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @ApiOperation("登录, 如果成功则返回用户完整信息, 如果失败则返回失败状态码")
    @GetMapping("/login")
    public @ResponseBody Msg login(@ApiParam("用户名") String username, @ApiParam("密码") String password){
        User user = userService.checkUser(username, password);
        System.out.println(username);
        System.out.println(password);
        System.out.println(user);
        if(user!=null){
            return new Msg().success().add("user", user);
        }else{
            return new Msg().fail();
        }
    }
}
