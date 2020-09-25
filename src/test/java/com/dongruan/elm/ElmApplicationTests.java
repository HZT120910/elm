package com.dongruan.elm;

import com.dongruan.dao.BusinessMapper;
import com.dongruan.dao.CartMapper;

import com.dongruan.dao.OrderdetailetMapper;
import com.dongruan.service.BusinessServise;
import com.dongruan.service.OrderDetails;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class ElmApplicationTests {
    @Autowired
    DataSource dataSource;

    @Autowired
    BusinessServise businessServise;

    @Autowired
    OrderDetails orderDetails;

    @Autowired
    OrderdetailetMapper orderdetailetMapper;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(orderdetailetMapper.getOrderDetailsExt(1,"12345671111"));


    }

}
