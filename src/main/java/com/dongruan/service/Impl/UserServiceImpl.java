package com.dongruan.service.Impl;

import com.dongruan.bean.Msg;
import com.dongruan.bean.User;
import com.dongruan.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import javax.crypto.MacSpi;
import java.util.List;

/**
 * @author: 代伟
 * @create: 2020-09-23 14:44
 */
@Service
public class UserServiceImpl {
    @Autowired
    UserMapper userMapper;

    public User checkUser(String username, String password){
        List<User> user = userMapper.findUserByUseranme(username);
        if(user.isEmpty()){
            return null;
        }else{
            if(user.get(0).getPassword().equals(password)){
                return user.get(0);
            }else{
                return null;
            }
        }
    }
}
