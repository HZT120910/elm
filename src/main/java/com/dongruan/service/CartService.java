package com.dongruan.service;

import com.dongruan.bean.Cart;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-17 15:36
 */
public interface CartService {

    /**
     * 添加到购物车
     * @param carts 购物车里的每一项构成的cart集合
     * @return  插入的记录数
     */
    int addToCart(List<Cart> carts);


    /**
     * 删除指定用户的购物车(这个是用户下单之后使用，下单后对应的购物车清空)
     * @param userid  传入用户的id
     * @return  返回删除的记录数
     */
    int deleteOnesCart(Integer userid);
}
